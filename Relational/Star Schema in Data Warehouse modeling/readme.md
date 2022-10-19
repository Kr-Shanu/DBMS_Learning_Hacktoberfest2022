> Contributor: Bhanu Pratap || Date : 19th October 2022

## Star Schema in Data Warehouse modeling


### Prerequisite – Introduction to Big Data, Benefits of Big data 

* Star schema is the fundamental schema among the data mart schema and it is simplest. 
* This schema is widely used to develop or build a data warehouse and dimensional data marts. 
* It includes one or more fact tables indexing any number of dimensional tables. 
* The star schema is a necessary cause of the snowflake schema. It is also efficient for handling basic queries. 

It is said to be star as its physical model resembles to the star shape having a fact table at its center and the dimension
tables at its peripheral representing the star’s points. Below is an example to demonstrate the Star Schema: 

 
![Diagram](https://media.geeksforgeeks.org/wp-content/uploads/Untitled-drawing-3-2.png)

In the above demonstration, SALES is a fact table having attributes 
i.e. (Product ID, Order ID, Customer ID, Employer ID, Total, Quantity, Discount) 
which references to the dimension tables. 
Employee dimension table contains the attributes: Emp ID, Emp Name, Title, Department and Region. 
Product dimension table contains the attributes: Product ID, Product Name, Product Category, Unit Price. 
Customer dimension table contains the attributes: Customer ID, Customer Name, Address, City, Zip. 
Time dimension table contains the attributes: Order ID, Order Date, Year, Quarter, Month. 

### Model of Star Schema : 
In Star Schema, Business process data, that holds the quantitative data about a business is distributed in fact tables, and dimensions which are descriptive characteristics related to fact data. Sales price, sale quantity, distant, speed, weight, and weight measurements are few examples of fact data in star schema. 
Often, A Star Schema having multiple dimensions is termed as Centipede Schema. It is easy to handle a star schema which have dimensions of few attributes. 

### Advantages of Star Schema : 

## Simpler Queries –
* Join logic of star schema is quite cinch in comparison to other join logic which are needed to fetch data from a transactional schema that is highly normalized.
## Simplified Business Reporting Logic – 
* In comparison to a transactional schema that is highly normalized, the star schema makes simpler common business reporting logic, such as of reporting and period-over-period.
### Feeding Cubes – 
* Star schema is widely used by all OLAP systems to design OLAP cubes efficiently. In fact, major OLAP systems deliver a ROLAP mode of operation which can use a star schema as a source without designing a cube structure.


### Disadvantages of Star Schema – 

* Data integrity is not enforced well since in a highly de-normalized schema state.
* Not flexible in terms if analytical needs as a normalized data model.
* Star schemas don’t reinforce many-to-many relationships within business entities – at least not frequently.


> Source : [GFG](https://www.geeksforgeeks.org/star-schema-in-data-warehouse-modeling/)

