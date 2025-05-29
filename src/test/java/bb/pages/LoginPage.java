package bb.pages;

import bb.common.BasePage;
import bb.utils.DBHelper;
import bb.utils.DataUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//a[@class=\"getStarted_Sjon\"]")
    WebElementFacade btnLogin;

    public void clickOnLoginButton(){

        btnLogin.waitUntilClickable().click();
        System.out.println(DataUtils.getValueConf("database.url"));
    }
}

