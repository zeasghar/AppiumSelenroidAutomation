package SelenroidPagesObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelenroidTouchObjects {
	
	// Constructor Code
	
	public SelenroidTouchObjects(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/scale_factor_text_view")
	public WebElement touchelement;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/touchTest")
	public WebElement touchbuttonn;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/gesture_type_text_view")
	public WebElement longpresstext;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/gesture_type_text_view")
	public WebElement singlepresstext;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/canvas_button")
	public WebElement canvasbutton;
	
	@AndroidFindBy(id="io.selendroid.testapp:id/finger_view")
	public WebElement fingerview;

	
}
