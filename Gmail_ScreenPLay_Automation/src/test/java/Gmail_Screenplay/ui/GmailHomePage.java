package Gmail_Screenplay.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by shirkandea on 04/04/2017.
 */
@DefaultUrl("https://www.google.com/gmail/")
public class GmailHomePage extends PageObject {

    By SignIN = By.xpath("//a[contains(@class, 'gmail-nav__nav-link__sign-in')]");

    public void Navigate_To_SigIn(){
        getDriver().findElement(SignIN).click();
    }

}
