/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DBcontext {
    public Connection getConnection() throws Exception {
        String url="jdbc:sqlserver://" + serverName + ":" +portNumber+";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url,user,pass);
    }

    
            private final String user = "sa";
            private final String pass = "123456";
            private final String serverName = "localhost";
            private final String portNumber = "1433";
            private final String dbName = "BabooMart";

       public static void main(String[] args) {
        try{
            DBcontext dbcontext = new DBcontext();
            if(dbcontext.getConnection() != null){
                System.out.println("Kết nối thành công");
            }
            else{
                System.out.println("Kết nối thất bại ");
            }
    }   catch (Exception ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
}
