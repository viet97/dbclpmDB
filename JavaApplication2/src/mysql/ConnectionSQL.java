/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
/**;
 *
 * @author macos
 */
public class ConnectionSQL {
   
    /**
     *
     * @return
     * @throws SQLException
     */
    public static Connection instance() throws SQLException {
     String dbClass = "com.mysql.jdbc.Driver";
     String dbUrl ="jdbc:mysql://localhost:3306/dbclpm";
     Connection conn = null;

    try { 
        Class.forName(dbClass); 
        conn = (Connection) DriverManager.getConnection (dbUrl, "root", "password"); 
    }catch(ClassNotFoundException e) {
        e.printStackTrace();
    }catch(SQLException e1) {
        e1.printStackTrace();
    }
    return conn;
  }
  
  public ResultSet excuteQuery(String query){
    try {
        Statement stmt = ConnectionSQL.instance().createStatement();
        ResultSet rs = stmt.executeQuery(query);
         return rs;

    }catch(SQLException e) {
        e.printStackTrace();
           
    }
     return null;
  }
}
