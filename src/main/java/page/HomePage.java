package page;

import base.Package.Base;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Base {
    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void checkFromLogin()
    {
        Assert.assertEquals( driver.findElementByAccessibilityId("test-Item title").getText(),"Sauce Labs Backpack");

    }
}
