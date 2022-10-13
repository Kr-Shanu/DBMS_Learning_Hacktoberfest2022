>Contributed by - **Priyam Shankar**
>Date - 13/10/22

# Introduction of Relational Model and Codd Rules in DBMS
## Terminology 

### Relational Model: 
It was proposed by Dr. E.F.Codd. 
It uses the concept of relations to represent each and every file. 
Relations are Two-Dimensional Tables. 
> It is easy to implement and easy to simplification in the operations to 
manipulating the data. 
> This is most popular data model.
> It is simple to implement.
It uses the primary key and secondary key to connect any two files.
Normalization Theory is used to design the object based data model.
Relational algebra and relational calculus are used to process the 
relations manually.
Many of the database languages are oriented handling relational data 
model.
> A RDM consists of relations with to connect them by key fields. A 
relation has some attributes. They are
The relation is represented in rows and columns.
> Each column of the relation is called as attribute.
Each row in the relation is called as tuple.
Each relation can have one unique columns i.e. primary key.
> Each relation can have n-columns and n-tuple.
Each relation is preceded by the name of that relation. The fields of the 
relations are separated by commas and placed within the parentheses of the 
relation.
STUDENT (StudNo, Sname, Special)
ENROLLMENT (StudNo, Subcode, marks)
SUBJECT (Subcode, Subname, Maxmarks, Faccode)
FACULTY (Faccode, Fname, Dept)

Relational model represents data in the form of relations or tables. 
*Relational Schemas:* Schema represents structure of a relation. e.g.; Relational Schema of STUDENT relation can be represented as: STUDENT (STUD_NO, STUD_NAME, STUD_PHONE, STUD_STATE, STUD_COUNTRY, STUD_AGE) Relational Instance: The set of values present in a relation at a particular instance of time is known as relational instance as shown in Table 1 and Table 2. Attribute: Each relation is defined in terms of some properties, each of which is known as attribute. For Example, STUD_NO, STUD_NAME etc. are attributes of relation STUDENT. 
*Domain of an attribute:* The possible values an attribute can take in a relation is called its domain. For Example, domain of STUD_AGE can be from 18 to 40. Tuple: Each row of a relation is known as tuple. e.g.; STUDENT relation given below has 4 tuples. NULL values: Values of some attribute for some tuples may be unknown, missing or undefined which are represented by NULL. Two NULL values in a relation are considered different from each other. Table 1 and Table 2 represent relational model having two relations STUDENT and STUDENT_COURSE. 

![studentTable](https://media.geeksforgeeks.org/wp-content/uploads/image7.png)

#### RDBMS Vendors:-
There are many different vendors that produce relational database 
management systems (RDBMS).
DBMS Vendors DBMS Product Product.

 

#### RELATIONAL ALGEBRA:- 
*It is a procedural Language.
* It consists of a set of operators that can be performed on relations. 
* It forms the basis for many other high level data sub-languages like 
SQL, QBE. 
* The relational algebra has mainly 9 types of operators. These are

*UNION
* INTERSECT
* MINUS
*TIMES
* SELECTION
* PROJECTION
*JOIN
* DIVISION
*RENAME
##### 1. UNION (U):- 
* A and B are two relations. It displays total values (Attributes) in both 
relations. 
*It avoids the duplicate values in both relations.
* U symbol can be used
Syntax:- A UNION B (or) A U B
example:- A = { clerk, manager, salesman}
B = { president, clerk, manager}
A UNION B = {clerk, manager, salesman, president}
##### 2. INTERSECTION (∩):-
*A and B are two relations. It displays common elements in both 
relations. 
* “∩” symbol can be used
Syntax:- A INTERSECT B (or) A ∩ B
Example:- A = { clerk, manager, salesman}
B = { president, clerk, manager}
A INTERSECT B = { clerk, manager}
##### 3. DIFFERENCE (─) :- 
 A and B are two relations. It displays elements in relation A not in 
relation B. 
Syntax:- A MINUS B (OR) A ─ B
Example:- A = { clerk, manager, salesman} B = { president, clerk, manager}
A MINUS B = { salesman} 

 

##### 4. CARTESIAN PRODUCT(X):- 
A and B are two relations. It has a new relation consisting of all pair 
wises combinations of all elements in A and B. 
The relation A has “m” elements and relation B has “n” elements, then 
the resultant relation will be “ m * n “. 
 Syntax:- A TIMES B (OR) A X B
Example:- A = { clerk, manager, salesman}
B = { president, clerk, manager}
A TIMES B = { (clerk, president), (clerk, clerk), (clerk, manager), (manager, 
president), (manger, clerk), (manger, manger), (salesman, president), 
(salesman, clerk), (salesman, manager) }
##### 5. SELECTION:-
It displays all the attributes or columns of all the rows in a relation.
 operator can be used to select the attributes in a relation.
Notation – σcondition(relation name) 

 

##### 6. PROJECTION (π) :- 
 It displays some specified columns in a relation.
“π” operator can be used to select some specified columns in a 
relation. Syntax:- π(col1,col2…) Relation Name
 It displays some specified columns by using some condition
Example:- π(sno,sname,total) MARKS

 

It selects tuples that satisfy the given predicate from a relation. 

##### 7. JOIN ( ):-
*It combines two or more relations. 
* Symbol can be used.
* It can be mainly divided into mainly 4 types. These are mainly
o Inner Join
o Outer Join
o Left Outer Join
o Right Outer Join 

##### 8. DIVIDE (÷): 
*It divides the tuple from one relation to another relation
Syntax:- A DIVIDE B (OR) A ÷ B
Example:- A = { clerk, manager, salesman} B = { clerk, manager}
A DIVIDE B = {salesman} 

##### 9. RENAME(ρ):-
* It gives another name to relation.
Syntax:- ρ(OLD RELATION, NEW RELATION)
Eg:- ρ(STUDENT, MARKS)
It changes the “student” relation to “Marks” relation.
* It also renames the specified column.
* It changes the old-column name to new-column name.
Syntax:- ρ(STUDNAME TO SNAME) RELATION NAME 

Advantages of Relational Algebra
*The relational algebra has solid mathematical background.
* The mathematical background of relational algebra is the basis of
many interesting developments and theorems.
* If we have two expressions for the same operation and if the
expressions are proved to be equivalent, then a query optimizer can
automatically substitute the more efficient form.
Disadvantages of Relational Algebra
* The Relational algebra cannot run it on database server.
*Relational algebra cannot do arithmetic. 
For example the price of petrol is 50/-, by increasing 10% price, which 
cannot be done using relational algebra.
*It cannot sort or print results in various formats.
*It cannot perform aggregate operations. 

### Codd Rules
Codd rules were proposed by E.F. Codd which should be satisfied by relational model.

> Foundation Rule: For any system that is advertised as, or claimed to be, a relational data base management system, that system must be able to manage data bases entirely through its relational capabilities.
Information Rule: Data stored in Relational model must be a value of some cell of a table.
Guaranteed Access Rule: Every data element must be accessible by table name, its primary key and name of attribute whose value is to be determined.
Systematic Treatment of NULL values: NULL value in database must only correspond to missing, unknown or not applicable values.
Active Online Catalog: Structure of database must be stored in an online catalog which can be queried by authorized users.
Comprehensive Data Sub-language Rule: A database should be accessible by a language supported for definition, manipulation and transaction management operation.
View Updating Rule: Different views created for various purposes should be automatically updatable by the system.
High level insert, update and delete rule: Relational Model should support insert, delete, update etc. operations at each level of relations. Also, set operations like Union, Intersection and minus should be supported.
Physical data independence: Any modification in the physical location of a table should not enforce modification at application level.
Logical data independence: Any modification in logical or conceptual schema of a table should not enforce modification at application level. For example, merging of two tables into one should not affect application accessing it which is difficult to achieve.
Integrity Independence: Integrity constraints modified at database level should not enforce modification at application level.
Distribution Independence: Distribution of data over various locations should not be visible to end-users.
Non-Subversion Rule: Low level access to data should not be able to bypass integrity rule to change data.