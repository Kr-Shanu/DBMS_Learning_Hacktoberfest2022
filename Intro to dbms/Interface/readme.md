>Contributed by Nilesh Srivastava 23.10.22

A database management system (DBMS) interface is a user interface that allows for the ability to input queries to a database without using the query language itself. 

User-friendly interfaces provided by DBMS may include the following: 

## Menu-Based Interfaces for Web Clients or Browsing – 
These interfaces present the user with lists of options (called menus) that lead the user through the formation of a request. Basic advantage of using menus is that they removes the tension of remembering specific commands and syntax of any query language. The query is basically composed step by step by collecting or picking options from a menu that is shown by the system. Pull-down menus are a very popular technique in Web based interfaces. They are also often used in browsing interface which allow a user to look through the contents of a database in an exploratory and unstructured manner. 
 

## Forms-Based Interfaces 
A forms-based interface displays a form to each user. Users can fill out all of the form entries to insert new data, or they can fill out only certain entries, in which case the DBMS will redeem same type of data for other remaining entries. These types of forms are usually designed or created and programmed for the users that have no expertise in operating system. Many DBMSs have forms specification languages which are special languages that help specify such forms. 
Example: SQL* Forms is a form-based language that specifies queries using a form designed in conjunction with the relational database schema.
 

## Graphical User Interface  
A GUI typically displays a schema to the user in diagrammatic form.The user then can specify a query by manipulating the diagram. In many cases, GUIs utilize both menus and forms. Most GUIs use a pointing device such as mouse, to pick a certain part of the displayed schema diagram. 
 

## Natural language Interfaces  
These interfaces accept request written in English or some other language and attempt to understand them. A Natural language interface has its own schema, which is similar to the database conceptual schema as well as a dictionary of important words. 
The natural language interface refers to the words in its schema as well as to the set of standard words in a dictionary to interpret the request.If the interpretation is successful, the interface generates a high-level query corresponding to the natural language and submits it to the DBMS for processing, otherwise a dialogue is started with the user to clarify any provided condition or request. The main disadvantage with this is that the capabilities of this type of interfaces are not that much advance. 

 

## Speech Input and Output 
There is limited use of speech be it for a query or an answer to a question or being a result of a request it is becoming commonplace. Applications with limited vocabularies such as inquiries for telephone directory, flight arrival/departure, and bank account information are allowed speech for input and output to enable ordinary folks to access this information. 
The Speech input is detected using predefined words and used to set up the parameters that are supplied to the queries. For output, a similar conversion from text or numbers into speech takes place. 

 

## Interfaces for DBA 
Most database system contains privileged commands that can be used only by the DBA’s staff. These include commands for creating accounts, setting system parameters, granting account authorization, changing a schema, reorganizing the storage structures of a databases.

Source [GFG](https://www.geeksforgeeks.org/interfaces-in-dbms/)
