package Tests_User;

import com.sun.org.glassfish.gmbal.Description;
import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import page_User.savePlatform_Page;

import java.io.IOException;

public class savePlatform_Test extends testbase{


    savePlatform_Page saveplatformobj_obj;
    JsonDataReader jsonReader;


    @Description("save platform first phase")
    @Test
    public void UserCansavePlatform() throws IOException, ParseException, InterruptedException {
        saveplatformobj_obj=new savePlatform_Page(driver);
        jsonReader = new JsonDataReader();
        jsonReader.jsonreader();
        saveplatformobj_obj.savePlatform(jsonReader.platformNew,jsonReader.platformClassification, jsonReader.workingTime,jsonReader.platformDescription);
    }
}
