package Survey;

import TestBase.TestBase;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

@Test
public class TestSurvey extends TestBase {
    public void shopsFromNavigationBar(){
        driver.findElement(AppiumBy.accessibilityId("My shop\nTab 2 of 4")).click(); // open shop screen from navigation bar
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage[3]")).click();
    }
}
