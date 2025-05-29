package bb.steps;

import bb.pages.LoginPage;
import bb.utils.DataUtils;
import bb.utils.LoggerUtil;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.StepEventBus;

public class LoginSteps extends UIInteractionSteps {

    LoginPage loginPage;

    @Step
    public void clickOnLoginButton(){
        LoggerUtil.initializeAndLogTime();
        System.out.println("URL: " + DataUtils.getValueConf("webdriver.base.url"));
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Driver hashCode: " + getDriver().hashCode());
        loginPage.open();
        loginPage.clickOnLoginButton();
    }

}
