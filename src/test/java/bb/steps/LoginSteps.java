package bb.steps;

import bb.pages.LoginPage;
import bb.utils.DataUtils;
import bb.utils.LoggerUtil;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.events.AfterScenario;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.StepEventBus;
import org.openqa.selenium.remote.RemoteWebDriver;
import net.thucydides.core.webdriver.WebDriverFacade;

public class LoginSteps extends UIInteractionSteps {


    LoginPage loginPage;

    @Step
    public void clickOnLoginButton(){
//        LoggerUtil.initializeAndLogTime();
        System.out.println("URL: " + DataUtils.getValueConf("webdriver.base.url"));
//        System.out.println("Thread ID: " + Thread.currentThread().getId());
//        System.out.println("Driver hashCode: " + getDriver().hashCode());

        WebDriverFacade facade = (WebDriverFacade) getDriver();
        RemoteWebDriver remote = (RemoteWebDriver) facade.getProxiedDriver();
        System.out.println("Session ID: " + remote.getSessionId());

        loginPage.open();
        loginPage.clickOnLoginButton();
    }

    @Step
    public void middleStep(){
        loginPage.clickOnLoginButton();
    }

    @Step
    @AfterScenario
    public void demoAfterStep(){
        System.out.println("demo after step");
    }

}
