package Tests_User;

import org.testng.annotations.Test;
import page_User.tryPage;

public class trypage extends testbase{


    //Login_Page login_obj;
    //JsonDataReader jsonReader;

    tryPage login_obj;

    @Test
    public void usercanloginn() throws InterruptedException {

        login_obj=new tryPage(driver);
        login_obj.newloginfin();

    }





    /*

    @Test
    //@Description("Start screen login")
    public void UserCanLogin() throws InterruptedException, IOException, ParseException {


        login_obj=new Login_Page(driver);
       // jsonReader = new JsonDataReader();
        //jsonReader.jsonreader();


        login_obj.User_Login(jsonReader.username,jsonReader.password);
    }

    */
}
