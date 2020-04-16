package DataDrivenTesting;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="InputData")
	public Object[][] getDataforEditField()
	{
		//3 sets of data, "hello" , "!@#$$"
		Object[][] obj=new Object[][]
				{
			
			{"Zeeshan"}, {"Imran"}, {"Azeem"}
				};
				
				return obj;
				
	}

}
