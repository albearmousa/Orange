package login_screen;

import TestBase.TestBase;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class TestLogin extends TestBase {

        @Test(priority = 1)
        public void enter_valid_credential() {

            try {
                Thread.sleep(3000);

                Actions actions = new Actions(driver);

                actions.moveToLocation(140, 620).click().perform();

                System.out.println("✅ Successfully tapped 'Allow Once' by coordinates");

                Thread.sleep(2000);

            } catch (Exception e) {

                System.out.println("❌ Failed to tap by coordinates: " + e.getMessage());

                e.printStackTrace();

            }


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Username")));

            Username.sendKeys("offlinea");

            driver.findElement(By.id("Password")).sendKeys("admin@123");

            driver.findElement(By.id("Remember me")).click();

            driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Login\"`]")).click();
        }

}
