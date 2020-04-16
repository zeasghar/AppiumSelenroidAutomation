package SelenroidAutomatedTests;
import SelenroidPagesObjects.SelenroidHomeObjects;
import SelenroidPagesObjects.SelenroidTouchObjects;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class SelenroidTouchTest extends BaseClass { 
	
	
	@Test
     public void VerifyTouchActions() throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
	    driver.switchTo().alert().accept();
       
	    SelenroidTouchObjects TouchActions=new SelenroidTouchObjects(driver);
	    TouchActions.touchbuttonn.click();
	    new Actions(driver).clickAndHold(TouchActions.touchelement).perform();
	   String longtabtext= TouchActions.longpresstext.getText();
	   Assert.assertEquals(longtabtext, "LONG PRESS");
	   new Actions(driver).click(TouchActions.touchelement).perform();
	  String Singletabtext= TouchActions.singlepresstext.getText();
	  Assert.assertEquals(Singletabtext, "SINGLE TAP CONFIRMED");
	  
	  TouchActions.canvasbutton.isDisplayed();
	  TouchActions.canvasbutton.click();
	  
	  
	  new Actions(driver).clickAndHold(TouchActions.fingerview).moveByOffset(50,500).perform();
	  
	  	
	}
	
}
