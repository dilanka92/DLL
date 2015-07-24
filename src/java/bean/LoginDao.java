/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginDao {

    public static List<String> validate(LoginBean bean) {
        List<String> UserDetails = new ArrayList<>();

        try {
            try (Connection con = ConnectionProvider.getCon();
                    PreparedStatement ps = con.prepareStatement("SELECT ID,Passwrd,UserType,Branch FROM login  WHERE Uname=? AND Inactive=0")) {
                ps.setString(1, bean.getUser());
                //ps.setString(2, bean.getPassword());
                //status=rs.next();
                try (ResultSet rs = ps.executeQuery()) {
                    //status=rs.next();
                    while (rs.next()) {
                        //int id = rs.getInt("ID");
                        UserDetails.add(rs.getString("ID"));
                        UserDetails.add(rs.getString("Passwrd"));
                        UserDetails.add(rs.getString("UserType"));
                        UserDetails.add(rs.getString("Branch"));
                    }
                }
            }
        } catch (Exception ex) {

        }

        return UserDetails;
    }

}
