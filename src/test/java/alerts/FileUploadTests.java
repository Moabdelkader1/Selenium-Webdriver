package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var fileUpload = homePage.clickFileUpload();
        fileUpload.uploadFile("C:/Users/dell/Downloads/Mohamed_Abdelkader_CV.pdf");
        fileUpload.clickUploadButton();
        assertEquals(fileUpload.getUploadedFile(),"Mohamed_Abdelkader_CV.pdf");
    }
}
