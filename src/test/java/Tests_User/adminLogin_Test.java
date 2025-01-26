package Tests_User;

import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import page_User.adminLogin_page;

import java.io.IOException;

public class adminLogin_Test extends testbase {



    adminLogin_page adminlogin_obj;
    JsonDataReader jsonReader;

    @Test
    //@Description("Start screen login")
    public void AdminCanLogin() throws InterruptedException, IOException, ParseException {


        driver.get("http://10.1.70.176:6034/auth/login");
        adminlogin_obj=new adminLogin_page(driver);
        jsonReader = new JsonDataReader();
        jsonReader.jsonreader();
        adminlogin_obj.admin_Login(jsonReader.adminUsername,jsonReader.adminPassword);
    }
}
