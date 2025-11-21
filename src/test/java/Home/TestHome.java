package Home;

import TestBase.TestBase;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class TestHome extends TestBase {
    public void openSurveyModule(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

        WebElement survey = wait.until(ExpectedConditions.visibilityOfElementLocated((AppiumBy.accessibilityId("Survey\n445\nAll\n165\nPending\n6\nToday\n0\nOpen\n43\nShops"))));

        survey.click();
    }
}
