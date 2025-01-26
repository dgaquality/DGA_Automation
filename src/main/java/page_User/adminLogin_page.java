package page_User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminLogin_page extends BasePage{

    public adminLogin_page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "")
    public WebElement loginmm_btn;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-auth[1]/app-login-form[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-input-text[1]/input[1]")
    public WebElement adminUsername_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-auth[1]/app-login-form[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-input-text[1]/input[1]")
    public WebElement adminPassword_txt;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-auth[1]/app-login-form[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/button[1]")
    public WebElement adminLogin_btn;

    /////////////////////////////////////////////////////////

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]\n")
    public WebElement myTask_btn;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-user-frame[1]/app-dashboard[1]/app-inbox[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/button[1]")
    public WebElement openSearch_btn;

    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-user-frame[1]/app-dashboard[1]/app-inbox[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]\n")
    public WebElement searchOrder_txt;


    @FindBy(xpath = "//body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-user-frame[1]/app-dashboard[1]/app-inbox[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/button[1]\n")
    public WebElement search_btn;

    @FindBy(xpath = "//tbody/tr[1]/td[10]/span[1]/span[1]/div[1]/button[1]")
    public WebElement openProcedure_btn;

    @FindBy(xpath = "//span[contains(text(),'إتخاذ القرار')]")
    public WebElement decision_btn;

    @FindBy(xpath = "    //label[contains(text(),'قبول الطلب')]")
    public WebElement accept_btn;

    @FindBy(xpath = "//button[contains(text(),'إرسال')]")
    public WebElement sent_btn;

    @FindBy(xpath = "//button[contains(text(),'نعم')]")
    public WebElement yes_btn;

    @FindBy(xpath = "//button[contains(text(),'حسنا')]")
    public WebElement closepopup_btn;

    @FindBy(xpath = "//label[contains(text(),'إصدار الشهادة')]")
    public WebElement createCertificate_btn;

    @FindBy(xpath = "//button[contains(text(),'إصدار')]")
    public WebElement certificate_btn;




















    //body/app-root[1]/div[1]/main[1]/div[1]/div[1]/app-auth[1]/app-login-form[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-input-text[1]

    public void admin_Login(String adminUsername, String adminPassword) throws InterruptedException {

        //Thread.sleep(2000);
        //clickElement(adminLogin_btn);

        //Thread.sleep(2000);
        setTextElementText(adminUsername_txt,adminUsername);
        setTextElementText(adminPassword_txt,adminPassword);

        clickElement(adminLogin_btn);




        ///////////////////////////////////////////////////////
        clickElement(myTask_btn);

        clickElement(openSearch_btn);

        setTextElementText(searchOrder_txt,savePlatformServiceList_page.modifiedText);

        clickElement(search_btn);

        Thread.sleep(2000);

        clickElement(openProcedure_btn);

        clickElement(decision_btn);

        clickElement(accept_btn);

        clickElement(sent_btn);

        clickElement(yes_btn);

        clickElement(closepopup_btn);

        ///////////////////////////////////////
        //second employeer license

        clickElement(openSearch_btn);

        setTextElementText(searchOrder_txt,savePlatformServiceList_page.modifiedText);

        clickElement(search_btn);

        Thread.sleep(2000);

        clickElement(openProcedure_btn);

        clickElement(decision_btn);

        clickElement(accept_btn);

        clickElement(sent_btn);

        clickElement(yes_btn);

        clickElement(closepopup_btn);




        /////////////////////////////////////////////////
        //third emplyeer products team

        clickElement(openSearch_btn);

        setTextElementText(searchOrder_txt,savePlatformServiceList_page.modifiedText);

        clickElement(search_btn);

        Thread.sleep(2000);

        clickElement(openProcedure_btn);

        clickElement(decision_btn);

        clickElement(accept_btn);

        clickElement(sent_btn);

        clickElement(yes_btn);

        clickElement(closepopup_btn);

        ////////////////////////////////////////
        // fourth emplyeer

        clickElement(openSearch_btn);

        setTextElementText(searchOrder_txt,savePlatformServiceList_page.modifiedText);

        clickElement(search_btn);

        Thread.sleep(2000);

        clickElement(openProcedure_btn);

        clickElement(decision_btn);

        clickElement(accept_btn);

        clickElement(sent_btn);

        clickElement(yes_btn);

        clickElement(closepopup_btn);

        ////////////////////////////////////////

        // fifth emplyeer

        clickElement(openSearch_btn);

        setTextElementText(searchOrder_txt,savePlatformServiceList_page.modifiedText);

        clickElement(search_btn);

        Thread.sleep(2000);

        clickElement(openProcedure_btn);

        clickElement(decision_btn);

        clickElement(accept_btn);

        clickElement(sent_btn);

        clickElement(yes_btn);

        clickElement(closepopup_btn);


        //////////////////////////////////////////////////////////////////
        //  create certificate emplyeer

        clickElement(openSearch_btn);

        setTextElementText(searchOrder_txt,savePlatformServiceList_page.modifiedText);

        clickElement(search_btn);

        Thread.sleep(2000);

        clickElement(openProcedure_btn);

        clickElement(decision_btn);

        clickElement(createCertificate_btn);

        clickElement(certificate_btn);

        clickElement(yes_btn);

        clickElement(closepopup_btn);













    }

}


