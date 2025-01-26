package Tests_User;

import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import page_User.Login_Page;

import java.io.IOException;

public class Login_Test extends testbase{

    Login_Page login_obj;
    JsonDataReader jsonReader;

    @Test
    //@Description("Start screen login")
    public void UserCanLogin() throws InterruptedException, IOException, ParseException {


        login_obj=new Login_Page(driver);
        jsonReader = new JsonDataReader();
        jsonReader.jsonreader();
        login_obj.User_Login(jsonReader.username,jsonReader.password);
    }
}
