package SelenroidPagesObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelenroidWebViewObjects {
	
	// Constructor Code
	
	public SelenroidWebViewObjects(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/buttonStartWebview")
	public WebElement chromewebview;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/my_text_field")
	public WebElement welcometext;
	
	
	
}