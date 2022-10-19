Contributed by - **Rishabh Raghwendra**
Date - 18/10/22

# ER Model: Generalization, Specialization and Aggregation

**Prerequisite –** [Introduction of ER Model ](../README.md)

Generalization, Specialization and Aggregation in ER model are used for data abstraction in which abstraction mechanism is used to hide details of a set of objects. 

## Generalization – 
Generalization is the process of extracting common properties from a set of entities and create a generalized entity from it. It is a bottom-up approach in which two or more entities can be generalized to a higher level entity if they have some attributes in common. For Example, STUDENT and FACULTY can be generalized to a higher level entity called PERSON as shown in Figure 1. In this case, common attributes like P_NAME, P_ADD become part of higher entity (PERSON) and specialized attributes like S_FEE become part of specialized entity (STUDENT). 

![Generalization](https://media.geeksforgeeks.org/wp-content/uploads/generalization.png)

## Specialization – 
In specialization, an entity is divided into sub-entities based on their characteristics. It is a top-down approach where higher level entity is specialized into two or more lower level entities. For Example, EMPLOYEE entity in an Employee management system can be specialized into DEVELOPER, TESTER etc. as shown in Figure 2. In this case, common attributes like E_NAME, E_SAL etc. become part of higher entity (EMPLOYEE) and specialized attributes like TES_TYPE become part of specialized entity (TESTER). 

![Specialization](https://media.geeksforgeeks.org/wp-content/uploads/specialization.png)

## Aggregation – 
An ER diagram is not capable of representing relationship between an entity and a relationship which may be required in some scenarios. In those cases, a relationship with its corresponding entities is aggregated into a higher level entity. Aggregation is an abstraction through which we can represent relationships as higher level entity sets.

For Example, Employee working for a project may require some machinery. So, REQUIRE relationship is needed between relationship WORKS_FOR and entity MACHINERY. Using aggregation, WORKS_FOR relationship with its entities EMPLOYEE and PROJECT is aggregated into single entity and relationship REQUIRE is created between aggregated entity and MACHINERY. 

![Aggregation](https://media.geeksforgeeks.org/wp-content/uploads/aggregation.png)

### Representing aggregation via schema –
To represent aggregation, create a schema containing:
1. primary key of the aggregated relationship
2. primary key of the associated entity set
3. descriptive attribute, if exists.

Source: [geeksforgeeks.org](https://www.geeksforgeeks.org/generalization-specialization-and-aggregation-in-er-model/)