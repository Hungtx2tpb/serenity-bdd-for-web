package bb.common;

import net.serenitybdd.annotations.Managed;
//import net.serenitybdd.junit5.SerenityJUnit5Extension;
//import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;

@ExtendWith(SerenityJUnit5Extension.class)
public abstract class BaseStepDefs {
    @Managed(driver = "chrome", uniqueSession = true)
    protected WebDriver driver;

}

