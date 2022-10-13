>Contributed by - **Priyam Shankar**
>Date - 13/10/22

# Introduction of Relational Algebra in DBMS
> Relational Algebra is procedural query language, which takes Relation as input and generate relation as output. Relational algebra mainly provides theoretical foundation for relational databases and SQL.

## Operators in Relational Algebra
### Projection (π)
Projection is used to project required column data from a relation.

**Example:**

	   R 
	  (A  B  C)    
	  ----------
	   1  2  4
	   2  2  3
	   3  2  3
	   4  3  4
	
	   π (BC) 
	   B  C
	   -----
	   2  4
	   2  3
	   3  4

### Selection (σ)
Selection is used to select required tuples of the relations.

for the above relation
σ (c>3)R
will select the tuples which have c more than 3.

Note: selection operator only selects the required tuples but does not display them. For displaying, data projection operator is used.

For the above selected tuples, to display we need to use projection also.

 	
	π (σ (c>3)R ) will show following tuples.

	   A  B  C
	   -------
	   1  2  4
	   4  3  4

### Union (U)
Union operation in relational algebra is same as union operation in set theory, only constraint is for union of two relation both relation must have same set of Attributes.

### Set Difference (-)
Set Difference in relational algebra is same set difference operation as in set theory with the constraint that both relation should have same set of attributes.

 

### Rename (ρ)
Rename is a unary operation used for renaming attributes of a relation.
ρ (a/b)R will rename the attribute ‘b’ of relation by ‘a’.

 

### Cross Product (X)

Cross product between two relations let say A and B, so cross product between A X B will results all the attributes of A followed by each attribute of B. Each record of A will pairs with every record of B.
	
below is this example:

	   A                                  B
	    (Name   Age  Sex )                (Id   Course)  
	    ------------------                -------------
	    Ram    14   M                      1     DS
	    Sona   15   F                      2     DBMS
	    kim    20   M

	     A X B
	  Name   Age   Sex   Id   Course
	---------------------------------
	  Ram    14    M      1    DS
	  Ram    14    M      2    DBMS
	  Sona   15    F      1    DS
	  Sona   15    F      2    DBMS
	  Kim    20    M      1    DS
  	  Kim    20    M      2    DBMS


Note: if A has ‘n’ tuples and B has ‘m’ tuples then A X B will have ‘n*m’ tuples.

 

### Natural Join (⋈)
Natural join is a binary operator. Natural join between two or more relations will result set of all combination of tuples where they have equal common attribute.

Let us see below example:

 
	           Emp                              Dep
	   (Name   Id   Dept_name )          (Dept_name   Manager)
	   ------------------------          ---------------------    
	     A     120    IT                    Sale     Y
	     B     125    HR                    Prod     Z
	     C     110    Sale                  IT       A
	     D     111    IT                      
	
	
	Emp ⋈ Dep
	
	Name   Id   Dept_name   Manager
	-------------------------------
	A     120   IT          A 
	C     110   Sale        Y
	D     111   IT          A


### Conditional Join

Conditional join works similar to natural join. In natural join, by default condition is equal between common attribute while in conditional join we can specify the any condition such as greater than, less than, not equal

Let us see below example

	         R                           S
	  (ID   Sex   Marks)          (ID   Sex   Marks)
	  ------------------          -------------------- 
	   1   F   45                   10   M   20
	   2   F   55                   11   M   22
	   3   F   60                   12   M   59
	 
	Join between R And S with condition  R.marks >= S.marks
	
	R.ID   R.Sex   R.Marks   S.ID   S.Sex   S.Marks
	-----------------------------------------------
	1       F       45        10     M        20
	1       F       45        11     M        22
	2       F       55        10     M        20
	2       F       55        11     M        22
	3       F       60        10     M        20
	3       F       60        11     M        22
	3       F       60        12     M        59
	

	source: geeksforgeeks.org
