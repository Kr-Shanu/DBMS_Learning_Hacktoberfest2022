> Contributed by : Utkarsh Kumar Sinha || Date: 22nd October 2022

## Need of DBMS

Need of DBMS

DBMS is useful in the following ways:

* 1.    Ease of Accessing Data

In the file system, different files are created for each user containing which data they can access. Also, in the file system, for the user to extract data, there is a need for code or application. DBMS removes redundancy by granting access to users and decides which and how many parts of data is accessible to them from the database. Users can get easy access to data and can also specify the type of data they want to extract. In DBMS, users through queries can get easy access to data.

 

* 2.    Storage and Management of Data

Data cannot be stored in the form of objects in the file system. The data in the practical world is generally stored in the form of objects and not files. So, an application is required to map the data into objects for further usage. In DBMS, the data can be directly stored in the form of objects. In DBMS, user can query the database whereas in file system level code is written for handling, saving, and scanning of data.

 

* 3.    Easy and Efficient File Management

In the file system, the entire database runs for every query operation as files are indexed. It takes a lot of time compared to DBMS, where objects are indexed based on the attribute of data. The complex management of memory becomes easy to handle. With this, retrieval of data is faster than the traditional file system.

 

* 4.    Avoiding duplicates and Redundancy

Redundancy means repetition of the same data. In the file system, the storage of data might take place multiple times. Like, if a student is pursuing two courses in the same institution say English and Science, then his general information might get stored in both the English dept as well as Science dept. It results in prolonged hours of accessing and storing data. It further results in the inconsistency of data in both departments. Data normalization is used in DBMS to avoid duplicate data.

 

* 5.    Concurrent Data Accessing

Users can access data simultaneously through different applications. In the file system, this simultaneous access leads to inconsistency. Let’s take a simple example of depositing money in a bank account. Suppose two depositions of A and B of amounts 100 and 200 are made in an account X which initially contains 1000. Now since these depositions are taking place simultaneously, different depositions update account differently. A reads 1000, credits 100, updates the account to 1100. B also reads 1000, credits 200, and updates the account to 1200. Both cases have wrong information regarding the amount in account X. The result is data inconsistency. In DBMS, users can access data concurrently, and a mechanism is provided to deal with this kind of inconsistency. DBMS uses the ACID approach. ACID stands for atomicity, durability, isolation, and consistency, which ensure efficient transactions without any corruption of data.

 

* 6.    Database Integrity

Any data stored in the database needs to satisfy integrity constraints. For example, a database contains designations of various employees at a company say HR, account specialist, engineer, analyst, project manager, etc. Then we have a schema of employees working under these designations. A database management system ensures that the employee comes under only one out of the listed job profiles in the database. It helps in the preservation of database integrity.

These were the main features of a database management system. It has various other advantages, including:

* The time taken for developing any application gets reduced.
* Users can change the database schema.
* It also improves the security of data as all the users can’t access all the data. Security permissions are needed to use some restricted data.
* It has multiple user interfaces.
* In DBMS, if the user changes the schema of the database, all the schemas get updated accordingly.

Therefore, using DBMS is not only efficient and consistent but also saves a lot of time and energy otherwise spent on the file system. It also provides easy accessibility to each user of data they require and restricts the confidential data with security codes and permissions. Also, DBMS saves using of applications for carrying out mapping of data into objects which the file system uses.

Content Protection by DMCA.com
Please Share
> Source : [W3schools](https://www.w3schools.blog/need-of-dbms#:~:text=Need%20of%20DBMS%201%201.%20Ease%20of%20Accessing,Data%20Accessing%20...%206%206.%20Database%20Integrity%20)