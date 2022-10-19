> Contributor: Bhanu Pratap || Date: 19th october 2022

## Snowflake Schema in Data Warehouse Model

### Introduction: 
The snowflake schema is a variant of the star schema. 
Here, the centralized fact table is connected to multiple dimensions. 
In the snowflake schema, dimensions are present in a normalized form in multiple related tables. 
The snowflake structure materialized when the dimensions of a star schema are detailed and highly structured,
having several levels of relationship, and the child tables have multiple parent tables. 
The snowflake effect affects only the dimension tables and does not affect the fact tables. 

Example: 

![Example](https://media.geeksforgeeks.org/wp-content/uploads/Capture-163.png)
 

* The Employee dimension table now contains the attributes: EmployeeID, EmployeeName, DepartmentID, Region, Territory. 
* The DepartmentID attribute links with the Employee table with the Department dimension table. 
* The Department dimension is used to provide detail about each department, such as the Name and Location of the department. 
* The Customer dimension table now contains the attributes: CustomerID, CustomerName, Address, CityID. 
* The CityID attributes link the Customer dimension table with the City dimension table. 
* The City dimension table has details about each city such as CityName, Zipcode, State, and Country. 


The main difference between star schema and snowflake schema is that the dimension table of the snowflake schema is maintained in the normalized form to reduce redundancy. 
The advantage here is that such tables (normalized) are easy to maintain and save storage space. However, it also means that more joins will be needed to execute the query. This will adversely impact system performance. 

### What is snowflaking? 
The snowflake design is the result of further expansion and normalized of the dimension table. In other words, a dimension table is said to be snowflaked if the low-cardinality attribute of the dimensions has been divided into separate normalized tables. These tables are then joined to the original dimension table with referential constraints (foreign key constrain). 
Generally, snowflaking is not recommended in the dimension table, as it hampers the understandability and performance of the dimension model as more tables would be required to be joined to satisfy the queries. 

### Characteristics of snowflake schema: The dimension model of a snowflake under the following conditions: 

* The snowflake schema uses small disk space.
* It is easy to implement dimension that is added to the schema.
* There are multiple tables, so performance is reduced.
* The dimension table consists of two or more sets of attributes that define information at different grains.
* The sets of attributes of the same dimension table are being populated by different source systems.
* Advantages: There are two main advantages of snowflake schema given below: 

* It provides structured data which reduces the problem of data integrity.
* It uses small disk space because data are highly structured.

## Disadvantages: 

Snowflaking reduces space consumed by dimension tables but compared with the entire data warehouse the saving is usually insignificant.
Avoid snowflaking or normalization of a dimension table, unless required and appropriate.
Do not snowflake hierarchies of one dimension table into separate tables. Hierarchies should belong to the dimension table only and should never be snowflakes.
Multiple hierarchies that can belong to the same dimension have been designed at the lowest possible detail.

> Source: [GFG](https://www.geeksforgeeks.org/snowflake-schema-in-data-warehouse-model/)
