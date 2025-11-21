package TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase { protected static AppiumDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("appium:deviceName", "iPhone 14 Pro");
        caps.setCapability("udid", "00008120-000A6C2411F0201E");
        caps.setCapability("appium:automationName", "XCUITest");
        caps.setCapability("appium:platformVersion", "18.6.2");
        caps.setCapability("appium:autoAcceptAlerts", "true");
        caps.setCapability("appium:app", "/Users/albearmousa/Library/Developer/Xcode/DerivedData/Runner-gkbkkbmsbvvlkvbkfushximpzwzu/Build/Products/Release-orange_dev-iphoneos/Runner.app");
        driver = new IOSDriver(new URL("http://localhost:4723/"), caps);
    }
}
