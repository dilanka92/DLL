/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author User
 */
public class User {
    private String uname,pass,email;
    
    public String getUname()
    {
        return uname;
    }
    public void setUname(String name)
    {
        this.uname=name;
    }
    
    public String getUpass()
    {
        return pass;
    }
    public void setUpass(String pass)
    {
        this.pass=pass;
    }
    
    public String getUemail()
    {
        return email;
    }
    public void setUemail(String mail)
    {
        this.email=mail;
    }
    
}
