package SelenroidAutomatedTests;
import SelenroidPagesObjects.SelenroidHomeObjects; 

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class SelenroidDisplayTest extends BaseClass { 
	
	
	@Test
     public void VerifyDisplay() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
	    driver.switchTo().alert().accept();
	    SelenroidHomeObjects dptext=new SelenroidHomeObjects(driver);
	    dptext.displayedButton.click();
		String displaytext =dptext.displayedmessage.getText();
		Assert.assertEquals(displaytext, "Text is sometimes displayed");
		
	}
	

	
	
}
