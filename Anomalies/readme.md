>Name Bhanu Pratap
>Date 15 oct 2022


##Anomalies
There are different types of anomalies which can occur in referencing and referenced relation which can be discussed as:

![image](https://media.geeksforgeeks.org/wp-content/uploads/image7.png)

###Insertion anomaly: 

If a tuple is inserted in referencing relation and referencing attribute value is not present in referenced attribute,
it will not allow inserting in referencing relation. For Example,
If we try to insert a record in STUDENT_COURSE with STUD_NO =7,
it will not allow.


###Deletion and Updation anomaly:
If a tuple is deleted or updated from referenced relation and referenced attribute value is used by referencing attribute in referencing relation,
it will not allow deleting the tuple from referenced relation.
For Example, If we try to delete a record from STUDENT with STUD_NO =1,
it will not allow. To avoid this, following can be used in query:

###ON DELETE/UPDATE SET NULL: 
If a tuple is deleted or updated from referenced relation and referenced attribute value is used by referencing attribute in referencing relation, 
it will delete/update the tuple from referenced relation and set the value of referencing attribute to NULL.

###ON DELETE/UPDATE CASCADE:
If a tuple is deleted or updated from referenced relation and referenced attribute value is used by referencing attribute in referencing relation, 
it will delete/update the tuple from referenced relation and referencing relation as well.

![Source](https://www.geeksforgeeks.org/anomalies-in-relational-model/)
