> Contributed by : Chitrakshi Chhabra || Date : 20th October 2022

## Schema Integration in DBMS


Definition: Schema integration is used to merge two or more database schemas into a single schema that can store data from both the original databases. For large databases with many expected users and applications, the integration approach of designing individual schema and then merging them can be used. Because the individual views can be kept relatively small and simple. Schema Integration is divided into the following subtask. 

### 1. Identifying correspondences and conflicts among the schema: 
As the schemas are designed individually it is necessary to specify constructs in the schemas that represent the same real-world concept. We must identify these correspondences before proceeding with the integration. During this process, several types of conflicts may occur such as: 
 

#### Naming conflict – 
Naming conflicts are of two types synonyms and homonyms. A synonym occurs when two schemas use different names to describe the same concept, for example, an entity type CUSTOMER in one schema may describe an entity type CLIENT in another schema. A homonym occurs when two schemas use the same name to describe different concepts. For example, an entity type Classes may represent TRAIN classes in one schema and AEROPLANE classes in another schema. 
 
#### Type conflicts – 
A similar concept may be represented in two schemas by different modeling constructs. For example, DEPARTMENT may be an entity type in one schema and an attribute in another. 
 
#### Domain conflicts – 
A single attribute may have different domains in different schemas. For example, we may declare Ssn as an integer in one schema and a character string in another. A conflict of the unit of measure could occur if one schema represented weight in pounds and the other used kgs. 
 
#### Conflicts among constraints – 
Two schemas may impose different constraints, for example, the KEY of an entity type may be different in each schema. 
 
### 2. Modifying views to conform to one another: 
Some schemas are modified so that they conform to other schemas more closely. Some of the conflicts that may occur during the first steps are resolved in this step. 

### 3. Merging of Views and Restructuring: 
The global schemas are created by merging the individual schemas. Corresponding concepts are represented only once in the global schema and mapping between the views and the global schemas are specified. This is the hardest step to achieve in real-world databases which involve hundreds of entities and relations. It involves a considerable amount of human intervention and negotiation to resolve conflicts and to settle on the most reasonable and acceptable solution for a global schema. Restructuring As a final optional step the global schemas may be analyzed and restructured to remove any redundancies or unnecessary complexity.



> Source: [GFG](https://www.geeksforgeeks.org/schema-integration-in-dbms/)
