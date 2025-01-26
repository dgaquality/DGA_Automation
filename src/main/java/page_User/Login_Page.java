package page_User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page  extends BasePage{


    //private static final Logger log = LoggerFactory.getLogger(Login_Page.class);

    //WebDriver driver;
    public Login_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'تسجيل دخول')]")
    public WebElement login_btn;

    @FindBy(xpath = "//input[@id='j_username']")
    public WebElement username_txt;

    @FindBy(xpath = "//input[@id='j_password']")
    public WebElement password_txt;

    @FindBy(xpath = "//body/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")
    public WebElement nafathLogin_btn;


    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-portal-home[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement platform_btn;

    @FindBy(xpath = "//button[contains(text(),'Send anyway')]")
    public WebElement proceed_btn;

    @FindBy(id = "proceed-button")
    public WebElement proceed1_btn;



    public void User_Login(String username, String password) throws InterruptedException {


        clickElement(login_btn);

        setTextElementText(username_txt,username);
        setTextElementText(password_txt,password);

        clickElement(nafathLogin_btn);


        Thread.sleep(2000);
        clickElement(proceed1_btn);


        //Thread.sleep(2000);
        clickElement(platform_btn);


    }
}
