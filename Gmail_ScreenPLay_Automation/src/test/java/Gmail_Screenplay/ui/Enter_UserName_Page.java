package Gmail_Screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created by shirkandea on 04/04/2017.
 */
public class Enter_UserName_Page extends PageObject {

    By textUserName = By.xpath("//input[@id='Email']");


    public void Enter_User_Name(String strUserName){

        getDriver().findElement(textUserName).click();
        getDriver().findElement(textUserName).clear();
        getDriver().findElement(textUserName).sendKeys(strUserName);

    }
}
