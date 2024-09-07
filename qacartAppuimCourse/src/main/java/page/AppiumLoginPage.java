package page;

import base.Package.Base;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AppiumLoginPage extends Base {
    public AppiumLoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void validLogin() {
        driver.findElementByAccessibilityId("test-Username").sendKeys("standard_user");
        driver.findElementByAccessibilityId("test-Password").sendKeys("secret_sauce");
        driver.findElementByAccessibilityId("test-LOGIN").click();


    }
    public void validUsername() {
        driver.findElementByAccessibilityId("test-Username").sendKeys("standard_user");
        driver.findElementByAccessibilityId("test-Password").sendKeys("ddds");
        driver.findElementByAccessibilityId("test-LOGIN").click();
        Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text=\"Username and password do not match any user in this service.\"]").getText(),"Username and password do not match any user in this service.");

    }
    public void validPassword() {
        driver.findElementByAccessibilityId("test-Username").sendKeys("dds");
        driver.findElementByAccessibilityId("test-Password").sendKeys("secret_sauce");
        driver.findElementByAccessibilityId("test-LOGIN").click();
        Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text=\"Username and password do not match any user in this service.\"]").getText(),"Username and password do not match any user in this service.");

    }
    public void lockUser() {
        driver.findElementByAccessibilityId("test-Username").sendKeys("locked_out_user");
        driver.findElementByAccessibilityId("test-Password").sendKeys("secret_sauce");
        driver.findElementByAccessibilityId("test-LOGIN").click();
        Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text=\"Sorry, this user has been locked out.\"]").getText(),"Sorry, this user has been locked out.");

    }
    public void problemUser() {
        driver.findElementByAccessibilityId("test-Username").sendKeys("problem_user");
        driver.findElementByAccessibilityId("test-Password").sendKeys("secret_sauce");
        driver.findElementByAccessibilityId("test-LOGIN").click();

    }
}
