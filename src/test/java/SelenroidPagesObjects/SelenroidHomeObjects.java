package SelenroidPagesObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelenroidHomeObjects {
	
	// Constructor Code
	
	public SelenroidHomeObjects(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/visibleButtonTest")
	public WebElement displayedButton;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/visibleTextView")
	public WebElement displayedmessage;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/showPopupWindowButton")
    public WebElement popupButton;
	
	@AndroidFindBy(accessibility="showPopupWindowButtonCD")
	public WebElement popupButtonDismiss;
	
	
	
	
}