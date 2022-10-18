Contributed by - **Rishabh Raghwendra**
Date - 18/10/22

# Enhanced ER Model
**Prerequisite** - [Introduction To ER Model](../README.md)

Today the complexity of the data is increasing so it becomes more and more difficult to use the traditional ER model for database modeling. To reduce this complexity of modeling we have to make improvements or enhancements to the existing ER model to make it able to handle the complex application in a better way. 
Enhanced entity-relationship diagrams are advanced database diagrams very similar to regular ER diagrams which represent requirements and complexities of complex databases. 
It is a diagrammatic technique for displaying the Sub Class and Super Class; Specialization and Generalization; Union or Category; Aggregation etc. 

## Generalization and Specialization – 
These are very common relationships found in real entities. However, this kind of relationship was added later as an enhanced extension to the classical ER model. Specialized classes are often called subclass while a generalized class is called a superclass, probably inspired by object-oriented programming. A sub-class is best understood by “IS-A analysis”. Following statements hopefully makes some sense to your mind “Technician IS-A Employee”, “Laptop IS-A Computer”. 

An entity is a specialized type/class of another entity. For example, a Technician is a special Employee in a university system Faculty is a special class of Employees. We call this phenomenon generalization/specialization. In the example here Employee is a generalized entity class while the Technician and Faculty are specialized classes of Employee. 

**Example** – This example instance of “sub-class” relationships. Here we have four sets of employees: Secretary, Technician, and Engineer. The employee is super-class of the rest three sets of individual sub-class is a subset of Employee set. 

![Enhanced-ER-Model-Digram](https://media.geeksforgeeks.org/wp-content/uploads/Enhanced-ER-Model-Diagram.png)

- An entity belonging to a sub-class is related to some super-class entity. For instance emp, no 1001 is a secretary, and his typing speed is 68. Emp no 1009 is an engineer (sub-class) and her trade is “Electrical”, so forth.
- Sub-class entity “inherits” all attributes of super-class; for example, employee 1001 will have attributes eno, name, salary, and typing speed.

**Enhanced ER model of above example –**
![Enhanced-ER-Model-Diagram](https://media.geeksforgeeks.org/wp-content/uploads/Enhanced-ER-Model-Diagram-1.png)
**Constraints –** There are two types of constraints on the “Sub-class” relationship. 

1. **Total or Partial –** A sub-classing relationship is total if every super-class entity is to be associated with some sub-class entity, otherwise partial. Sub-class “job type based employee category” is partial sub-classing – not necessary every employee is one of (secretary, engineer, and technician), i.e. union of these three types is a proper subset of all employees. Whereas other sub-classing “Salaried Employee AND Hourly Employee” is total; the union of entities from sub-classes is equal to the total employee set, i.e. every employee necessarily has to be one of them.
2. **Overlapped or Disjoint –** If an entity from super-set can be related (can occur) in multiple sub-class sets, then it is overlapped sub-classing, otherwise disjoint. Both the examples: job-type based and salaries/hourly employee sub-classing are disjoint.

**Note –** These constraints are independent of each other: can be “overlapped and total or partial” or “disjoint and total or partial”. Also, sub-classing has transitive properties. 

**Multiple Inheritance (sub-class of multiple superclasses) –**

An entity can be a sub-class of multiple entity types; such entities are sub-class of multiple entities and have multiple super-classes; Teaching Assistant can subclass of Employee and Student both. A faculty in a university system can be a subclass of Employee and Alumnus. In multiple inheritances, attributes of sub-class are the union of attributes of all super-classes. 

**Union –** 
1. Set of Library Members is UNION of Faculty, Student, and Staff. A union relationship indicates either type; for example, a library member is either Faculty or Staff or Student.
2. Below are two examples that show how UNION can be depicted in ERD – Vehicle Owner is UNION of PERSON and Company, and RTO Registered Vehicle is UNION of Car and Truck.

![Enhanced-ER-Model-Diagram](https://media.geeksforgeeks.org/wp-content/uploads/Enhanced-ER-Model-Diagram-2.png)

You might see some confusion in Sub-class and UNION; consider an example in above figure Vehicle is super-class of CAR and Truck; this is very much the correct example of the subclass as well but here use it differently we are saying RTO Registered vehicle is UNION of Car and Vehicle, they do not inherit any attribute of Vehicle, attributes of car and truck are altogether independent set, where is in sub-classing situation car and truck would be inheriting the attribute of vehicle class. 

 Source: geeksforgeeks.org