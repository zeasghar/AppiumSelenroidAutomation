package SelenroidAutomatedTests;
import SelenroidPagesObjects.SelenriodWaitAndRegister;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class SelenroidWaitAndRegTest extends BaseClass { 
	
	
	@Test
     public void VerifyDisplay() throws InterruptedException, CsvValidationException, IOException {
		
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		
	    driver.switchTo().alert().accept();
	    
		
	    SelenriodWaitAndRegister values=new SelenriodWaitAndRegister(driver);
	    values.waitBar.click();
	    Thread.sleep(15000);
	    
	    CSVReader Datareader = new CSVReader(new FileReader("C:\\Users\\zeasghar\\eclipse-workspace\\AppiumSelenroidApp\\src\\test\\resources\\SelenroidTestApp\\testdata.csv"));
	    
	    String[] csvData= Datareader.readNext();
		String[] data= new String[5];	
		
		// Getting Values from CSV to in methods using Index value 
		for (int i=1; i<5; i++) 
		{
			data[i]=csvData[0];
			csvData= Datareader.readNext();
		}
	    
	    
	    values.username.sendKeys(data[1]);
	    values.email.sendKeys(data[2]);
	    values.password.sendKeys(data[3]);
	    values.name.sendKeys(data[4]);
	    values.acceptcheck.click();
	    driver.hideKeyboard();
	    values.register.click();
	    values.Confirmregister.click();
	    
	    
		
	}
	

	
	
}
