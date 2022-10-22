> Contributed by : Utkarsh Kumar Sinha || Date: 22nd October 2022

## Use of DBMS

Here we are going to discuss about how a user interacts with a DBMS, and how the DBMS is related to system software. Using a general-purpose programming language, user can write a source program in the normal way. However, instead of writing I/O statements of the form provided by the programming language, the programmer writes commands in a data manipulation language (DML) defined for use with the DBMS. 

Processor may be used to convert the DML commands into programming language statements that call DBMS routines.

Using the programming language itself some DMLs are defined as a set of CALL statements. Here given are the two principal methods for user interaction with a DBMS.

![Interaction with DBMS using DML](https://media.geeksforgeeks.org/wp-content/uploads/122-3.png)


Figure 1 (a): Interaction with a DBMS using a data manipulation language
Interaction with a DBMS using a query language is the another approach to DBMS.There is no need for the user to write the programs for accessing a database rather user only needs to enter the commands in a special query language defined by DBMS. These commands are processed by a query-language interpreter, which calls DBMS routines to perform the requested operations.


Each and every approach that leads to user interactivity with a DBMS has its own advantages. Results can be obtain much faster with a help of query language, because there is no need to write and debug programs, which becomes very beneficial for the non-programmers to used it efficiently. Allowing the programmer to use all the flexibility and power of a general-purpose programming language is the big advantage of DML however much effort from the user is required by this approach. Most modern database management systems provide both a query language and a DML so that a user can choose the form of interaction that best meets his or her needs.

![Interaction with DBMS using Query language](https://media.geeksforgeeks.org/wp-content/uploads/122-2-1.png)

Figure 1 (b): Interaction with a DBMS using a query language
Here are some steps to show how a typical sequence of actions is being performed by a DBMS:

* Step-1: The sequence of events begins when the DBMS is entered with the help of a call from application program A. We assume this call is a request to read data from the database. There are similar sequences of events for other types of database operations.

* Step-2: The request from program A is stated in terms of the subschema being used by A. To process a request which is being requested from program A and is stated in terms of the subschema which is being used by A, the DBMS must first examine the subschema definition.

* Step-3: Relationship between the subschema and the schema must be considered by the DBMS to interpret the request in terms of the overall logical database structure.

* Step-4: The DBMS examines the data mapping description, after determining the logical database records that must be read in terms of schema. The information regarding the need of locating the required records in the files of the database is given by this operation.

* Step-5: At this point, a logical request for a subschema record has been converted into physical requests by DBMS to read data from one or more files. These requests for file I/O are passed to the operating system using the types of service calls.

* Step-6: The operating system then issues channel and device commands to perform the necessary physical I/O operations. These I/O operations read the required records from the database into a DBMS buffer area.

* Step-7: All the data requested by the application program is present in central memory after the physical I/O operations have been completed. The DBMS accomplishes this conversion by again comparing the schema and the subschema.

Finally, the DBMS returns control to the application program and makes available to the program a variety of status information, including any possible error indications.
For clear understanding, here is the diagram given:

![Typical sequence of actions performed by DBMS](https://media.geeksforgeeks.org/wp-content/uploads/122-3-1.png)

Figure 2: Typical sequence of actions performed by a DBMS
> Source : [GFG](https://www.geeksforgeeks.org/use-of-dbms-in-system-software/)