package Gmail_Screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created by shirkandea on 04/04/2017.
 */
public class Enter_Password_Page extends PageObject {

    By textPassword = By.xpath("//input[@id='Passwd']");


    public void Verify_Page_Displayed(){

       getDriver().findElement(textPassword).isDisplayed();
    }
}
