package SelenroidAutomatedTests;
import SelenroidPagesObjects.SelenroidHomeObjects; 

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class SelenroidPopUpButtonTest extends BaseClass { 
	
	
	@Test
     public void VerifyDisplay() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
	    driver.switchTo().alert().accept();
	    SelenroidHomeObjects popupbutton=new SelenroidHomeObjects(driver);
	    popupbutton.popupButton.click();
	    String b = popupbutton.popupButtonDismiss.getText();
		System.out.println(b);
		Assert.assertEquals(b, "Display Popup Window");
		popupbutton.popupButtonDismiss.click();
		
	}
	

	
	
}
