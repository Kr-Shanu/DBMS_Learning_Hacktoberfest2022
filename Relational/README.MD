>Contributed by - **Priyam Shankar**
>Date - 13/10/22

# Relational Model in DBMS
> Relational Model was proposed by E.F. Codd to model data in the form of relations or tables. After designing the conceptual model of Database using ER diagram, we need to convert the conceptual model in the relational model which can be implemented using any RDBMS languages like Oracle SQL, MySQL etc. So we will see what Relational Model is.

## What is a Relational Model.
Relational Model represents how data is stored in Relational Databases.  A relational database stores data in the form of relations (tables). Consider a relation STUDENT with attributes ROLL_NO, NAME, ADDRESS, PHONE and AGE shown in Table 1. 

| Roll_No | NAME | ADDERESS | Phone | AGE |
| ------- | ---- | -------- | ----- | --- |
| 1 | Ram | Delhi | 9455123451 | 18 |
| 2 | priyam | bihar | 9334361116 | 20 |
| 3 | sooraj | mumbai |93343711723 | 23 |

### Important terminologies.
**Attribute:** Attributes are the properties that define a relation. e.g.; ROLL_NO, NAME
**Relation Schema:** A relation schema represents name of the relation with its attributes. e.g.; STUDENT (ROLL_NO, NAME, ADDRESS, PHONE and AGE) is relation schema for STUDENT. If a schema has more than 1 relation, it is called Relational Schema.
**Tuple:** Each row in the relation is known as tuple. The above relation contains 4 tuples, one of which is shown as:

| 1 | Ram | Delhi | 9455123451 | 18 |

**Relation Instance:** The set of tuples of a relation at a particular instance of time is called as relation instance. Table 1 shows the relation instance of STUDENT at a particular time. It can change whenever there is insertion, deletion or updation in the database.
**Degree:** The number of attributes in the relation is known as degree of the relation. The STUDENT relation defined above has degree 5.
**Cardinality:** The number of tuples in a relation is known as cardinality. The STUDENT relation defined above has cardinality 4.
**Column:** Column represents the set of values for a particular attribute. The column ROLL_NO is extracted from relation STUDENT.

> NULL Values: The value which is not known or unavailable is called NULL value. It is represented by blank space. e.g.; PHONE of STUDENT having ROLL_NO 4 is NULL. 
 

## Constraints in Relational Model

While designing Relational Model, we define some conditions which must hold for data present in database are called Constraints. These constraints are checked before performing any operation (insertion, deletion and updation) in database. If there is a violation in any of constrains, operation will fail. 

Domain Constraints: These are attribute level constraints. An attribute can only take values which lie inside the domain range. e.g,; If a constrains AGE>0 is applied on STUDENT relation, inserting negative value of AGE will result in failure. 

Key Integrity: Every relation in the database should have atleast one set of attributes which defines a tuple uniquely. Those set of attributes is called key. e.g.; ROLL_NO in STUDENT is a key. No two students can have same roll number. So a key has two properties: 

    It should be unique for all tuples.
    It can’t have NULL values.

Referential Integrity: When one attribute of a relation can only take values from other attribute of same relation or any other relation, it is called referential integrity. 


## ANOMALIES
>An anomaly is an irregularity, or something which deviates from the expected or normal state. When designing databases, we identify three types of anomalies: Insert, Update and Delete. 

#### Insertion Anomaly in Referencing Relation: 
We can’t insert a row in REFERENCING RELATION if referencing attribute’s value is not present in referenced attribute value. e.g.; Insertion of a student with BRANCH_CODE ‘ME’ in STUDENT relation will result in error because ‘ME’ is not present in BRANCH_CODE of BRANCH. 

#### Deletion/ Updation Anomaly in Referenced Relation: 
We can’t delete or update a row from REFERENCED RELATION if value of REFERENCED ATTRIBUTE is used in value of REFERENCING ATTRIBUTE. e.g; if we try to delete tuple from BRANCH having BRANCH_CODE ‘CS’, it will result in error because ‘CS’ is referenced by BRANCH_CODE of STUDENT, but if we try to delete the row from BRANCH with BRANCH_CODE CV, it will be deleted as the value is not been used by referencing relation. It can be handled by following method: 

**ON DELETE CASCADE:** It will delete the tuples from REFERENCING RELATION if  value used by REFERENCING ATTRIBUTE is deleted from REFERENCED RELATION. e.g;, if we delete a row from BRANCH with BRANCH_CODE ‘CS’, the rows in STUDENT relation with BRANCH_CODE CS (ROLL_NO 1 and 2 in this case) will be deleted. 

**ON UPDATE CASCADE:** It will update the REFERENCING ATTRIBUTE in REFERENCING RELATION if attribute value used by REFERENCING ATTRIBUTE is updated in REFERENCED RELATION. e.g;, if we update a row from BRANCH with BRANCH_CODE ‘CS’ to ‘CSE’, the rows in STUDENT relation with BRANCH_CODE CS (ROLL_NO 1 and 2 in this case) will be updated with BRANCH_CODE ‘CSE’. 

**SUPER KEYS:** 
Any set of attributes that allows us to identify unique rows (tuples) in a given relation are known as super keys. Out of these super keys we can always choose a proper subset among these which can be used as a primary key. Such keys are known as Candidate keys. If there is a combination of two or more attributes which is being used as the primary key then we call it as a Composite key. 