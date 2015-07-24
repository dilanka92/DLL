/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dll_WebService;

import bean.LoginBean;
import bean.LoginDao;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Dilanka
 */
@WebService(serviceName = "DLL_Service")
public class DLL_Service {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "login")
    public List<String>login(String userName) {
        
        LoginBean user = new bean.LoginBean();
        //LoginDao login = new LoginDao();
        
        user.setUser(userName);
        ArrayList<String> UserInfo =(ArrayList<String>) LoginDao.validate(user);
        return UserInfo;
    }
    
}


