package com.phpcrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.phpcrm.qa.util.TestUtil;

public class TestBase {
	
	public static 	WebDriver driver;
	public static Properties prop;
	
	 protected TestBase() {
		try {
		prop = new Properties();
		//FileInputStream ip = new FileInputStream(System.getProperty("C:\\Eclipse\\Selenium_Projects\\PHPCRMTest\\src\\main\\java\\com\\phpcrm\\qa\\config\\config.properties"));
		FileInputStream ip = new FileInputStream("C:\\Eclipse\\Selenium_Projects\\PHPCRMTest\\src\\main"
				+ "\\java\\com\\phpcrm\\qa\\config\\config.properties");
		prop.load(ip);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	public static void Initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Supported Materials\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.edge.driver", "C:\\Eclipse\\Supported Materials\\edgedriver_win64\\msedgedriver.exe");	
			driver = new EdgeDriver();
						
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("base_url"));
		
		
	}
	

}


