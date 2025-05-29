package bb.defs;

//import bb.steps.CommonSteps;
import bb.TestRunner;
import bb.common.BaseStepDefs;
import bb.steps.LoginSteps;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;

public class LoginDefs extends BaseStepDefs {
    @Steps
    LoginSteps loginSteps;

    @Given("user opens Ebank app")
    public void userOpenEbankApp(){
        loginSteps.clickOnLoginButton();
        Serenity.takeScreenshot();
//        System.out.println("Driver in LoginDefs: " + driver);
//        System.out.println("Driver hashCode in LoginDefs: " + driver.hashCode());

    }
}