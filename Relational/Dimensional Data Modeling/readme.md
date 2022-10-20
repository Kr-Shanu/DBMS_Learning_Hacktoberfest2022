> Contributed by : Chitrakshi Chhabra || Date : 20th October 2022

## Dimensional Data Modeling

### Popular Schema – Star Schema, Snow Flake Schema 


* Dimensional Data Modelling is one of the data modelling techniques used in data warehouse design. 

### Goal: Improve the data retrieval.
The concept of Dimensional Modelling was developed by Ralph Kimball which is comprised of facts and dimension tables. Since the main goal of this modelling is to improve the data retrieval so it is optimized for SELECT OPERATION. The advantage of using this model is that we can store data in such a way that it is easier to store and retrieve the data once stored in a data warehouse. Dimensional model is the data model used by many OLAP systems. 

Figure – ![Steps for Dimensional Model](https://media.geeksforgeeks.org/wp-content/uploads/222-11.png) 

## Steps to Create Dimensional Data Modelling: 

### Step-1: Identifying the business objective – 
The first step is to identify the business objective. Sales, HR, Marketing, etc. are some examples as per the need of the organization. Since it is the most important step of Data Modelling the selection of business objective also depends on the quality of data available for that process. 
 
### Step-2: Identifying Granularity – 
Granularity is the lowest level of information stored in the table. The level of detail for business problem and its solution is described by Grain. 
 
### Step-3: Identifying Dimensions and its Attributes – 
Dimensions are objects or things. Dimensions categorize and describe data warehouse facts and measures in a way that supports meaningful answers to business questions. A data warehouse organizes descriptive attributes as columns in dimension tables. For Example, the data dimension may contain data like a year, month and weekday. 
 
### Step-4: Identifying the Fact – 
The measurable data is held by the fact table. Most of the fact table rows are numerical values like price or cost per unit, etc. 
 
### Step-5: Building of Schema – 
We implement the Dimension Model in this step. A schema is a database structure. There are two popular schemes: Star Schema and Snowflake Schema. 

> Source: [GFG](https://www.geeksforgeeks.org/dimensional-data-modeling/)