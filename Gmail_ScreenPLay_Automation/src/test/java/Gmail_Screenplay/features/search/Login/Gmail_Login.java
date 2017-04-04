package Gmail_Screenplay.features.search.Login;

import Gmail_Screenplay.steps.GmailUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.*;
import org.junit.runner.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by shirkandea on 04/04/2017.
 */
@RunWith(SerenityRunner.class)
public class Gmail_Login {


    @Steps
    GmailUser anand = new GmailUser();

    @Managed
    WebDriver driver;

    @Test
    public void Verify_Invalid_Password(){

        anand.isOnGmailPage();

        anand.clickOnSigin();

        anand.enterValidUserName();

        anand.should_navigate_to_page_to_enter_password();
    }
}
