package crm.phpcrm.qa.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpcrm.qa.base.TestBase;

public class TravelPage extends TestBase {

	public TravelPage() {
		//super();
		//Initializing the Page Objects
		PageFactory.initElements(driver, this); // this means current class objects
		//PageFactory.initElements(driver, TravelPage.class);// you can write  TravelPage.class ( if not using this)
		//this means pointing to current class objects
		// TODO Auto-generated constructor stub
	}
	
	
	//Page Factory (PF) or Object Repository (OR):
	@FindBy(id="PHPTRAVELS")
	WebElement id_PHPTRAVELS;
	
	@FindBy(name="TRAVEL TECHNOLOGY PARTNER")
	WebElement data_name;
	
	@FindBy(id="icon")
	WebElement img;
	//*[@id="icon"]
	
	@FindBy(xpath="//image[contains(@id),'icon']")
	WebElement icon;
	
	@FindBy(xpath="//a[@href='https://PhpTravels.org/']")
	//@FindBy(="(By.linkText("https://PhpTravels.org/")"))
	WebElement login;
	
	//*[@id="email"]/button
	@FindBy(id="email")
	WebElement Subscribe;
	
	@FindBy(xpath="//button[contains(text(),'SUBSCRIBE')]")
	WebElement Subscribe2; 	
	
	///html/body/header/div/nav/a[6]
//Actions	
public String  validate_Phptravels_Title() {

	return driver.getTitle();
	
}
	
public String  validate_Phptravels_Name() {

	return id_PHPTRAVELS.getText();
	
}


public Dimension   validate_Phptravels_SubName() {

	return data_name.getSize();
	
}


public boolean validate_Phptravles_img() {
	
	return img.isDisplayed();
	
}

}
