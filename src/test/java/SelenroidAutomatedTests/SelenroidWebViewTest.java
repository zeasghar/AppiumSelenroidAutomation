package SelenroidAutomatedTests;
import SelenroidPagesObjects.SelenroidHomeObjects;
import SelenroidPagesObjects.SelenroidWebViewObjects;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import DataDrivenTesting.TestData;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class SelenroidWebViewTest extends BaseClass { 
	
	
	@Test(dataProvider="InputData",dataProviderClass=TestData.class)
     public void VerifyWebViewElements(String input) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
	    driver.switchTo().alert().accept();
	    SelenroidWebViewObjects webv=new SelenroidWebViewObjects(driver);
	    webv.welcometext.sendKeys("Welcome to Appium Automation. Click on Browser View");
	    webv.chromewebview.click();
	    Thread.sleep(10000);
	    Set<String> contexts=driver.getContextHandles();

	    for(String contextName :contexts)

	    {

	    System.out.println(contextName);

	    }
	    
	   driver.context("WEBVIEW_io.selendroid.testapp");
	   driver.findElement(By.xpath("//*[@id=\"name_input\"]")).clear();
	   driver.findElement(By.xpath("//*[@id=\"name_input\"]")).sendKeys(input);
	   driver.findElement(By.xpath("/html/body/form/div/input[2]")).click();
	   String hello =  driver.findElementByXPath("/html/body/h1").getText();
	   Assert.assertEquals(hello, "This is my way of saying hello");
	   driver.context("NATIVE_APP");
       driver.findElementById("io.selendroid.testapp:id/goBack").click();

	   
	}

	   
	
	}	

