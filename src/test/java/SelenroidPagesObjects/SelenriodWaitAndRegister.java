package SelenroidPagesObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelenriodWaitAndRegister {
	
	// Constructor Code
	
		public SelenriodWaitAndRegister(AndroidDriver<AndroidElement> driver)
		{
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		
		
		@AndroidFindBy(id="io.selendroid.testapp:id/waitingButtonTest")
		public static WebElement waitBar;
		
		@AndroidFindBy(id="io.selendroid.testapp:id/inputUsername")
		public static WebElement username;
		@AndroidFindBy(id="io.selendroid.testapp:id/inputEmail")
		public static WebElement email;
		
		@AndroidFindBy(id="io.selendroid.testapp:id/inputPassword")
		public static WebElement password;
		
		@AndroidFindBy(id="io.selendroid.testapp:id/inputName")
		public static WebElement name;
		
		
		@AndroidFindBy(id="io.selendroid.testapp:id/input_adds")
		public static WebElement acceptcheck;
		
		@AndroidFindBy(id="io.selendroid.testapp:id/btnRegisterUser")
		public static WebElement register;
		
		@AndroidFindBy(id="io.selendroid.testapp:id/buttonRegisterUser")
		public static WebElement Confirmregister;
		
		@AndroidFindBy(id="io.selendroid.testapp:id/label_username")
		public static WebElement LabelUsername;
		

}
