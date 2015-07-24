/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import java.sql.*;
import static bean.Provider.*;

/**
 *
 * @author User
 */
public class ConnectionProvider {
    
    private static Connection con=null;
    static
    {
        try
        {
            Class.forName(DRIVER);
            con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
            System.out.println("Connectoin Sucess");
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.print("DB Connection Failed"+ex.toString());
        }
            
    }
    
    public static Connection getCon()
        {
            return con;
        }
    
}
