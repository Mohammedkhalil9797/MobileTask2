package appuimTest;

import base.Package.Base;


import org.testng.annotations.Test;
import page.AppiumLoginPage;
import page.HomePage;


public class LoginTest extends Base {


    @Test
        public void validLogin() throws InterruptedException {
        AppiumLoginPage appiumLoginPage=new AppiumLoginPage(driver);
        HomePage homePage=new HomePage(driver);
        appiumLoginPage.validLogin();
        homePage.checkFromLogin();

        }
        @Test
    public void validUserNameWithInvalidPassword()
        {
            AppiumLoginPage appiumLoginPage=new AppiumLoginPage(driver);
            appiumLoginPage.validUsername();
        }
    @Test
    public void inValidUserNameWithValidPassword()
    {
        AppiumLoginPage appiumLoginPage=new AppiumLoginPage(driver);
        appiumLoginPage.validPassword();
    }
    @Test
    public void lockedUser()
    {
        AppiumLoginPage appiumLoginPage=new AppiumLoginPage(driver);
        appiumLoginPage.lockUser();
    }

    @Test
    public void problemUser()
    {
        AppiumLoginPage appiumLoginPage=new AppiumLoginPage(driver);
        HomePage homePage=new HomePage(driver);
        appiumLoginPage.problemUser();
        homePage.checkFromLogin();

    }
}
