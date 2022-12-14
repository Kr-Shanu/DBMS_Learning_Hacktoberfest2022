> Contributed By Nilesh Srivastava Date 22.10.22
 
# Mapping ER Model to Relational Model

ER Model, when conceptualized into diagrams, gives a good overview of entity-relationship, which is easier to understand. ER diagrams can be mapped to relational schema, that is, it is possible to create relational schema using ER diagram. We cannot import all the ER constraints into relational model, but an approximate schema can be generated.

There are several processes and algorithms available to convert ER Diagrams into Relational Schema. Some of them are automated and some of them are manual. We may focus here on the mapping diagram contents to relational basics.

## Mapping Entity
An entity is a real-world object with some attributes.

![image1](https://www.tutorialspoint.com/dbms/images/mapping_entities.png)

## Mapping Process (Algorithm)
- Create table for each entity.
- Entity's attributes should become fields of tables with their respective data types.
- Declare primary key.

## Mapping Relationship
A relationship is an association among entities.
![image2](https://www.tutorialspoint.com/dbms/images/mapping_relationship.png)

## Mapping Process
- Create table for a relationship.
- Add the primary keys of all participating Entities as fields of table with their respective data types.
- If relationship has any attribute, add each attribute as field of table.
- Declare a primary key composing all the primary keys of participating entities.
- Declare all foreign key constraints.

## Mapping Weak Entity Sets
A weak entity set is one which does not have any primary key associated with it.
![image3](https://www.tutorialspoint.com/dbms/images/mapping_weak_entity_sets.png)

## Mapping Process
- Create table for weak entity set.
- Add all its attributes to table as field.
- Add the primary key of identifying entity set.
- Declare all foreign key constraints.

## Mapping Hierarchical Entities
ER specialization or generalization comes in the form of hierarchical entity sets.

![image4](https://www.tutorialspoint.com/dbms/images/inheritance.png)

## Mapping Process
- Create tables for all higher-level entities.
- Create tables for lower-level entities.
- Add primary keys of higher-level entities in the table of lower-level entities.
- In lower-level tables, add all other attributes of lower-level entities.
- Declare primary key of higher-level table and the primary key for lower-level table.
- Declare foreign key constraints.

Source-[Tutorial Point](https://www.tutorialspoint.com/dbms/er_model_to_relational_model.htm#:~:text=Mapping%20Process,-Create%20table%20for&text=Add%20the%20primary%20keys%20of,Declare%20all%20foreign%20key%20constraints.)
