package Gmail_Screenplay.steps;

import Gmail_Screenplay.ui.Enter_Password_Page;
import Gmail_Screenplay.ui.Enter_UserName_Page;
import Gmail_Screenplay.ui.GmailHomePage;
import net.thucydides.core.annotations.Step;

/**
 * Created by shirkandea on 04/04/2017.
 */
public class GmailUser {

    GmailHomePage objGmailPage;
    Enter_UserName_Page objUserNamePage;
    Enter_Password_Page objPasswordPage;

    @Step
    public void isOnGmailPage(){
        objGmailPage.open();
    }


    @Step
    public void clickOnSigin(){

        objGmailPage.Navigate_To_SigIn();
    }

    @Step
    public void enterValidUserName(){
        objUserNamePage.Enter_User_Name("testapplenews");
    }


    @Step
    public void should_navigate_to_page_to_enter_password(){
        objPasswordPage.Verify_Page_Displayed();
    }

}
