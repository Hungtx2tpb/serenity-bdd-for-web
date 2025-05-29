package bb.defs;

import bb.TestRunner;
import bb.common.BaseStepDefs;
import bb.steps.LoginSteps;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;

public class HomePageDefs extends BaseStepDefs {

    @Steps
    LoginSteps loginSteps;

    @Given("user opens HomePage")
    public void userOpenEbankApp(){
        loginSteps.clickOnLoginButton();
        Serenity.takeScreenshot();

        System.out.println("Driver in HomeDefs: " + driver);
        System.out.println("Driver hashCode in HomeDefs: " + driver.hashCode());


    }
}
