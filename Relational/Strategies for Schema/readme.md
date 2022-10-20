> Contributed by : Chitrakshi Chhabra || Date : 20th October 2022

## Strategies for Schema

There are various strategies that are considered while designing a schema. Most of these strategies follow an incremental approach that is, they must start with some schema constructs derived from the requirements and then they incrementally modify, refine or build on them. Let’s discuss some of these strategies: 


### Top-down strategy – 
In this strategy, we basically start with a schema that contains a high level of abstraction and then apply successive top-down refinement. Let’s try to understand this with an example, we may specify only a few level entity types and then we specify their attributes split them into lower-level entity types and relationships. The process of specialization to refine an entity type into subclass is also an example of this strategy. 
 

### Bottom-up strategy – 
In this type of strategy, we basically start with basic abstraction and then go on adding to this abstraction. For example, we may start with attributes and group these into entity types and relationships. We can also add a new relationship among entity types as the design goes ahead. The basic example is the process of generalizing entity types into the higher-level generalized superclass. 
 

### Inside-Out Strategy – 
This is a special case of a bottom-up strategy when attention is basically focused on a central set of concepts that are most evident. Modeling then basically spreads outward by considering new concepts in the vicinity of existing ones. We could specify a few clearly evident entity types in the schema and continue by adding other entity types and relationships that are related to each other. 
 

## Mixed Strategy – 
Instead of using any particular strategy throughout the design, the requirements are partitioned according to a top-down strategy, and part of the schema is designed for each partition according to a bottom-up strategy after that various schema are combined.


> Source: [GFG](https://www.geeksforgeeks.org/strategies-for-schema-design-in-dbms/)