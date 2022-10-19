> Posted by: Bhanu Pratap                 ||        Date : 19th October 2022



## Types of Keys in Relational Model (Candidate, Super, Primary, Alternate and Foreign)


 
## DBMS | Relational Model Introduction and Codd Rules 

Different Types of Keys in Relational Model 

### Candidate Key: 
The minimal set of attributes that can uniquely identify a tuple is known as a candidate key. For Example, STUD_NO in STUDENT relation. 

* It is a minimal super key.
* It is a super key with no repeated data is called a candidate key.
* The minimal set of attributes that can uniquely identify a record.
* It must contain unique values.
* It can contain NULL values.
* Every table must have at least a single candidate key.
A table can have multiple candidate keys but only one primary key (the primary key cannot have a NULL value, so the candidate key with NULL value can’t be the primary key).
Eg: Studid, Roll No, and email are candidate keys.


The value of the Candidate Key is unique and may be null for tuple.
There can be more than one candidate key in a relation. For Example, STUD_NO is the candidate key for relation STUDENT.
The candidate key can be simple (having only one attribute) or composite as well. For Example, {STUD_NO, COURSE_NO} is a composite candidate key for relation STUDENT_COURSE.
No, of candidate keys in a Relation are nC(floor(n/2)),for example if a Relation have 5 attributes i.e. R(A,B,C,D,E) then total no of candidate keys are 5C(floor(5/2))=10.
Note: In SQL Server a unique constraint that has a nullable column, allows the value ‘null‘ in that column only once. That’s why the STUD_PHONE attribute is a candidate here, but can not be ‘null’ value in the primary key attribute. 

### Super Key: 
The set of attributes that can uniquely identify a tuple is known as Super Key. For Example, STUD_NO, (STUD_NO, STUD_NAME), etc. 
Or  A super key is a group of single or multiple keys that identifies rows in a table. It supports NULL values. Example: SNO+PHONE is a super key.

Adding zero or more attributes to the candidate key generates the super key.
A candidate key is a super key but vice versa is not true.
Primary Key: There can be more than one candidate key in relation out of which one can be chosen as the primary key. For Example, STUD_NO, as well as STUD_PHONE, are candidate keys for relation STUDENT but STUD_NO can be chosen as the primary key (only one out of many candidate keys).  

### Primary Key:

* It is a unique key.
* It can identify only one tuple (a record) at a time.
* It has no duplicate values, it has unique values.
* It cannot be NULL.
* Primary keys are not necessarily to be a single column; more than one 
the column can also be a primary key for a table.
Eg:- STUDENT table SNO is a primary key
SNO SNAME ADDRESS PHONE 
Alternate Key: The candidate key other than the primary key is called an alternate key. For Example, STUD_NO, as well as STUD_PHONE both, are candidate keys for relation STUDENT but STUD_PHONE will be an alternate key (only one out of many candidate keys). It is a secondary key

All the keys which are not primary keys are called alternate keys.
It contains two or more fields to identify two or more records.
These values are repeated.
Eg:- SNAME, ADDRESS is Alternate keys 
Foreign Key: If an attribute can only take the values which are present as values of some other attribute, it will be a foreign key to the attribute to which it refers. The relation which is being referenced is called referenced relation and the corresponding attribute is called referenced attribute and the relation which refers to the referenced relation is called referencing relation and the corresponding attribute is called referencing attribute. The referenced attribute of the referenced relation should be the primary key to it. For Example, STUD_NO in STUDENT_COURSE is a foreign key to STUD_NO in STUDENT relation.  

It is a key it acts as a primary key in one table and it acts as 
secondary key in another table.
It combines two or more relations (table) at a time.
They act as a cross-reference between the tables.
For example, DNO is a primary key in the DEPT table and a non-key in EMP
It may be worth noting that unlike the Primary Key of any given relation, Foreign Key can be NULL as well as may contain duplicate tuples i.e. it need not follow uniqueness constraint. For Example, STUD_NO in STUDENT_COURSE relation is not unique. It has been repeated for the first and third tuples. However, the STUD_NO in STUDENT relation is a primary key and it needs to be always unique, and it cannot be null. 

### Composite Key: 
Sometimes, a table might not have a single column/attribute that uniquely identifies all the records of a table. In order to uniquely identify rows of a table, combination of two or more columns/attributes can be used. For example, FULLNAME + DOB can be combined together to access the details of a student. It still can give duplicate values in rare cases. So , we need to find the optimal set of attributes that can uniquely identify rows in a table.

It acts as a primary key if there is no primary key in a table
Two or more attributes are used to together to make a composite key.
Different combinations of attributes may give different accuracy in terms of identifying the rows uniquely.


> Source : [GFG](https://www.geeksforgeeks.org/types-of-keys-in-relational-model-candidate-super-primary-alternate-and-foreign/)
