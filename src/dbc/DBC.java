
package dbc;
import java.sql.*;
public class DBC {
public static Connection getConnection(){
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRecord","root","");
return con;
} catch (Exception e) {
System.err.println("Connection error");
return null;
}
}
}
