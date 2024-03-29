//PROGRAM :Connection of Database:Insert 
import java.io.*;
import java.util.*;
import java.sql.*;

public class P53_db_insert {
    public static void main(String args[]){
        Connection con;
        Statement st;

        int no;
        String name;
        float sal;
        Scanner s = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");//loads the MySQL JDBC (Java Database Connectivity) driver class into memory
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems_db?characterEncoding=utf8","root","");//create a connection to the database specified in the URL 
            st = con.createStatement(); //creates a 'Statement' object that can be used to execute SQL queries against the database.
            System.out.println("\nEnter no,name and Salary :");
            no =s.nextInt();
            s.nextLine();
            name = s.nextLine();
            sal = s.nextFloat();
            //String str = "insert into emp values(2,"add",40000)";
            String str = "insert into emp values (";
            str = str + no + ",'";
            str = str + name + "',";
            str = str + sal +")";
            System.out.println("\n"+str);
            st.executeUpdate(str);//
            System.out.println("\nOne record is Inserted.");
        }  
        catch(Exception e){
            System.out.println("\nError :"+e);
        }

    }    
}

/* OUTPUT 
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P53_db_insert

Enter no,name and Salary :
8642
Sreekumar
7000

insert into emp values (8642,'Sreekumar',7000.0)

One record is Inserted.
 */