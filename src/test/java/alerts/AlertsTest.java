package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class AlertsTest extends BaseTests {
    @Test
    public void testAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.alert_getText(),"I am a JS Confirm");
        alertsPage.alert_clickToDismiss();
        assertEquals(alertsPage.getResult(),"You clicked: Cancel");
    }

    @Test
    public void testSetInputALert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerPrompt();
        alertsPage.alert_SetText("hi");
        alertsPage.alert_clickToAccept();
        assertTrue(alertsPage.getResult().contains("hi"));
    }
}
