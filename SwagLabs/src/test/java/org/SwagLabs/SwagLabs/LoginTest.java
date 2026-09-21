package org.SwagLabs.SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	LoginPage loginPage;
	
	@Test
	
	public void launchBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    loginPage = new LoginPage(driver);
	    loginPage.enterUsername("standard_user");
	    loginPage.enterPassword("secret_sauce");
	    loginPage.clickLoginButton();
	    
		// Code to launch the browser
	}
	
	
}
