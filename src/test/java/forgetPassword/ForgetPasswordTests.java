package forgetPassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ForgetPasswordTests extends BaseTests {

    @Test
    public void checkText(){
        var forgotPasswordPage =homePage.clickForgotPassword();
        forgotPasswordPage.SetEmail("tau@example.com");
        var emailSentPage = forgotPasswordPage.clickRetrieveButton();

        assertEquals(emailSentPage.getText(),"Internal Server Error");
    }
}
