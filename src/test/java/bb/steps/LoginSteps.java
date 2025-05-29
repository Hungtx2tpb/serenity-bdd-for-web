package bb.steps;

import bb.pages.LoginPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.StepEventBus;

public class LoginSteps extends UIInteractionSteps {

    LoginPage loginPage;

    @Step
    public void clickOnLoginButton(){
        System.out.println("Driver : " + getDriver().toString());
        System.out.println("Driver hashCode: " + getDriver().hashCode());
//        System.out.println("Before open: " + System.currentTimeMillis());
        loginPage.open();
//        System.out.println("After open: " + System.currentTimeMillis());
//        loginPage.waitForAllLoadingCompleted();
        loginPage.clickOnLoginButton();
    }
//
}
