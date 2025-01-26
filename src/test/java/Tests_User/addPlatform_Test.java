package Tests_User;

import com.sun.org.glassfish.gmbal.Description;
import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import page_User.Login_Page;
import page_User.addPlatform_page;

import java.io.IOException;

public class addPlatform_Test extends testbase{

    Login_Page login_obj;

    addPlatform_page addplaformobj_obj;
    JsonDataReader jsonReader;

    @Description("move to regstration platform")


    /*

    @Test(priority = 1)
    //@Description("Start screen login")
    public void UserCanLogin() throws InterruptedException {


        login_obj=new Login_Page(driver);
        login_obj.User_Login();
    }

*/

    @Test
    public void UserCanRegisterPlatform() throws IOException, ParseException {
        addplaformobj_obj=new addPlatform_page(driver);
        jsonReader = new JsonDataReader();
        jsonReader.jsonreader();
        addplaformobj_obj.Reg_platform();
    }


}
