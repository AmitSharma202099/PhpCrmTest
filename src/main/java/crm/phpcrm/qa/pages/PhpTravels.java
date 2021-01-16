package crm.phpcrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpcrm.qa.base.TestBase;

public class PhpTravels extends TestBase{
	
	/*
	 * //*[@id="search"]/div/div/div/div/div/nav/ul/li[1]/a
	 * /html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[1]/a
	 * #search > div > div > div > div > div > nav > ul > li:nth-child(1) > a <a
	 * class="text-center hotels active" data-name="hotels" href="#hotels" target=""
	 * data-toggle="tab"> Hotels </a> document.
	 * querySelector("#search > div > div > div > div > div > nav > ul > li:nth-child(1) > a"
	 * )
	 */
	
	//*[@id="hotels"]/div/div/form/div/div/div[4]/button

	public PhpTravels() {
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//@FindBy(xpath="//button[@class='btn btn-primary btn-block']")
	@FindBy(xpath="//button[contains(@class,'btn btn-primary btn-block')]")
	WebElement Search;
	
	
	public boolean Search_validate() {
		
		return Search.isDisplayed();
	}
	
	//*[@id="//header-waypoint-sticky"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]
	
}
