package page_User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tryPage extends BasePage{


    public tryPage(WebDriver driver) {
        super(driver);
    }


    @FindBy( id="username")
    public WebElement username_txt;

    @FindBy(name = "password")
    public WebElement password_txt;

    @FindBy(id = "submit")
    public WebElement submit_txt;



    public void newloginfin() throws InterruptedException {


        // clickElement(openSearch_btn);

        //setTextElementText(searchOrder_txt,savePlatformServiceList_page.modifiedText);

        setTextElementText(username_txt, "student");
        setTextElementText(password_txt, "Password123");

        Thread.sleep(2000);

        clickElement(submit_txt);


    }



}
