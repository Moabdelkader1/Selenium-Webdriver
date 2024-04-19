package login;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;


public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage= loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }
}
