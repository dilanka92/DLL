/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import java.sql.*;


public class RegisterDao {
    
    public static int register(User u)
    {
        int status=0;
        try
        {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps= con.prepareStatement("insert into user values(?,?,?)");
            ps.setString(1, u.getUname());
            ps.setString(2, u.getUemail());
            ps.setString(3, u.getUpass());
            
            System.out.print("name "+u.getUname()+"mail "+u.getUemail()+"pass  "+u.getUpass());
            if(u.getUname()!=null && u.getUemail()!=null && u.getUpass()!=null)
            {
                status=ps.executeUpdate();
            }
            
        }
        catch(Exception ex)
        {
            
        }
        
        return status;
    }
    
}
