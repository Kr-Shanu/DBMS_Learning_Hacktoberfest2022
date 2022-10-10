package dbconnect;

import java.sql.*;
import java.util.*;

public class Assignment {
	
	public static void main(String[] args)
			throws ClassNotFoundException,SQLException{
		
		Scanner sc = new Scanner(System.in);  
		
		String LOAD_DRIVER = "com.mysql.jdbc.Driver";
		String DB_CONNECTION = "jdbc:mysql://localhost:3306/erp";
		String DB_USER = "root";
		String DB_PWD = "java";
		
		
		Class.forName(LOAD_DRIVER);
		
		Connection CONN = DriverManager.getConnection(DB_CONNECTION,DB_USER, DB_PWD);
		
		
		Statement ST = CONN.createStatement();
		
		System.out.println("Enter 1 to perform a Query");
		System.out.println("Enter 2 to perform a CURD operation");
		System.out.println("Enter your choice:");
		
		int choice= sc.nextInt();
		
		if(choice==1) {
			System.out.println("Enter 1 to get ProjID");
			System.out.println("Enter 2 to get City");
			System.out.println("Enter 3 to get Name");
			System.out.println("Enter your choice:");
			
			int ch = sc.nextInt();
			
			if (ch==1) {
				System.out.println("Enter EmpID:");
				String str = sc.next();
				String SQL_QUERY = "SELECT ProjID FROM emp WHERE EmpID = "+"'"+str+"'" ;
				ResultSet RS = ST.executeQuery(SQL_QUERY);
				while(RS.next()) {
					String col = RS.getString(1);
					System.out.println("ProjID ::" + col);
				}
			}
			else if (ch==2) {
				
				System.out.println("Enter EmpID:");
				String str = sc.next();
				String SQL_QUERY = "SELECT City FROM emp WHERE EmpID = "+"'"+str+"'" ;
				ResultSet RS = ST.executeQuery(SQL_QUERY);
				while(RS.next()) {
					String col = RS.getString(1);
					System.out.println("City ::" + col);
				}
			}
			else if (ch==3) {
				
				System.out.println("Enter ProjID:");
				String str = sc.next();
				String SQL_QUERY = "SELECT FName, LName FROM emp WHERE ProjID = "+"'"+str+"'" ;
				ResultSet RS = ST.executeQuery(SQL_QUERY);
				while(RS.next()) {
					String col1 = RS.getString(1);
					String col2 = RS.getString(2);
					System.out.println("Name :: " + col1+" "+ col2);
				}
				
			}
			else {
				System.out.println("Sorry ! No Such Choice Exist :( ");
			}
		}
		
		else if (choice==2) {
			
			System.out.println("Enter 1 to Insert Data");
			System.out.println("Enter 2 to Update Data");
			System.out.println("Enter 3 to Read Data");
			System.out.println("Enter 4 to Delete Data");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			
			if (ch==1) {
				
				System.out.println("Enter EmpID ");
				int EmpID = sc.nextInt();
				System.out.println("Enter FName ");
				String FName = sc.next();
				System.out.println("Enter LName ");
				String LName = sc.next();
				System.out.println("Enter City ");
				String City = sc.next();
				System.out.println("Enter ProjID ");
				String ProjID = sc.next();
				String SQL_QUERY="INSERT INTO emp " + 
						"VALUES("+""+EmpID+",'"+FName+"','"+LName+"','"+City+"','"+ProjID+"')";
				int counter = ST.executeUpdate(SQL_QUERY);
				if (counter != 0) {
					
					System.out.println("DATA INSERTED::" + counter);
				}
				
			}
			
			else if (ch==2) {
				
				System.out.println("Enter EmpID ");
				int EmpID = sc.nextInt();
				System.out.println("Enter FName ");
				String FName = sc.next();
				System.out.println("Enter LName ");
				String LName = sc.next();
				System.out.println("Enter City ");
				String City = sc.next();
				System.out.println("Enter ProjID ");
				String ProjID = sc.next();
				String SQL_QUERY="UPDATE emp " + 
						"SET"+" FName ="+"'"+FName+"',LName ="+"'"+LName+"',City ="+"'"+City+"',ProjID ="+"'"+ProjID+"'"+
						" WHERE EmpID = "+EmpID ;
				int counter = ST.executeUpdate(SQL_QUERY);
				if (counter != 0) {
					
					System.out.println("DATA UPDATED::" + counter);
				}
				
			}
			else if (ch==3) {
				String SQL_QUERY = "SELECT * FROM emp";
				ResultSet RS = ST.executeQuery(SQL_QUERY);
				while (RS.next())
			      {
					String EmpID = RS.getString("EmpID");
			        String FName = RS.getString("FName");
			        String LName = RS.getString("LName");
			        String City = RS.getString("LName");
			        String ProjID = RS.getString("ProjID");
			        
			        
			        // print the results
			        System.out.format("%s, %s, %s, %s, %s\n", EmpID, FName, LName, City, ProjID );
			      }
			}
			else if (ch==4) {
				System.out.println("Enter EmpID ");
				String EmpID = sc.next();
				String SQL_QUERY = "DELETE FROM emp "+
				"Where EmpID = "+"'"+EmpID+"'";
				int counter = ST.executeUpdate(SQL_QUERY);
				if (counter != 0) {
					
					System.out.println("DATA UPDATED::" + counter);
				}
				
				
			}
			else {
				System.out.println("Sorry ! No Such Choice Exist :( ");
			}
		}
		else {
			System.out.println("Sorry ! No Such Choice Exist :( ");
		}
		
		
	}

}
