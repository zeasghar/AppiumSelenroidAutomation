package SelenroidAutomatedTests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	   
		public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
			// TODO Auto-generated method stub
			
			File srcfolder= new File("src/test/resources/SelenroidTestApp");
			File apkpath = new File(srcfolder,"selendroid-test-app-0.17.0.apk");
			
			
			DesiredCapabilities cap= new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Zeeshanemulator");
		    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
			cap.setCapability(MobileCapabilityType.APP, apkpath.getAbsolutePath());
			cap.setCapability("autoDismissAlerts", true);
			cap.setCapability("autoAcceptAlerts", true);
			cap.setCapability("chromedriverExecutable", "C:\\Users\\zeasghar\\eclipse-workspace\\AppiumSelenroidApp\\src\\test\\resources\\Drivers\\chromedriver.exe");
			cap.setCapability("newCommandTimeout", 120);
			
			
			
			AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
			return driver;

		}
	    
	    @AfterTest
	    
	    public void Closedown() 
	    {
	    	
	    }
	
}
