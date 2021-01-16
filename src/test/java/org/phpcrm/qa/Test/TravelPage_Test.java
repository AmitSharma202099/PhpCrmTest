package org.phpcrm.qa.Test;

import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phpcrm.qa.base.TestBase;
import crm.phpcrm.qa.pages.TravelPage;

public class TravelPage_Test extends TestBase  {
	TravelPage travelpg;
	
	public TravelPage_Test(){
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		Initialization();
		travelpg = new TravelPage();
				
	}
	
	@Test(priority=1)
	public void validate_Phptravels_Title_Test() {
		String title= travelpg.validate_Phptravels_Title();
		Assert.assertEquals(title, "Demo Script Test drive - PHPTRAVELS");
	}
	
	@Test(priority = 2)
	public void validate_Phptravels_Name_Test() {
		String Phptravels_Name = travelpg.validate_Phptravels_Name();
		Assert.assertEquals(Phptravels_Name, "PHPTRAVELS");
	}
	
	@Test(priority =3 )
	public void validate_Phptravels_SubName_Test() {
		Dimension SubName= travelpg.validate_Phptravels_SubName();
		Assert.assertEquals(SubName, "TRAVEL TECHNOLOGY PARTNER");
		
	}
		
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
		
		
	
	

}
