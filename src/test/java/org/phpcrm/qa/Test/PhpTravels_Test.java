package org.phpcrm.qa.Test;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phpcrm.qa.base.TestBase;

import crm.phpcrm.qa.pages.PhpTravels;

public class PhpTravels_Test extends TestBase{
	
	PhpTravels travel;
	public PhpTravels_Test(){
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		Initialization();
		travel = new PhpTravels();	
	}
	
	
	@Test
	public void Search_validate_Test() {
		boolean flag = travel.Search_validate();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void exit(){
		driver.quit();
	}
	
	
	
}
