# Impedance Mismatch
Impedance mismatch is the term used to refer to the problems that occurs due to differences between the database model and the programming language model. The practical relational model has 3 components these are:

1. Attributes and their data types
2. Tuples
3. Tables

## Problems:
Following problems may occur due to the impedance mismatch:

1. The first problem that may occur is that is data type mismatch means the programming language attribute data type may differ from the attribute data type in the data model.
    Hence it is quite necessary to have a binding for each host programming language that specifies for each attribute type the compatible programming language types. It is necessary to have different data types, for example, we have different data types available in different programming languages such as data types in C are different from Java and both differ from SQL data types.

2. The second problem that may occur is because the results of most queries are sets or multisets of tuples and each tuple is formed of a sequence of attribute values. In the program, it is necessary to access the individual data values within individual tuples for printing or processing. 
    Hence there is a need for binding to map the query result data structure which is a table to an appropriate data structure in the programming language. A mechanism is needed to loop over the tuples in a query result in order to access a single tuple at a time and to extract individual values from the tuple. The extracted values are typically copied to appropriate program variables for further processing by the program.