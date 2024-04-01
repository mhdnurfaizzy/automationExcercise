package mhdnurfaizzy.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mhdnurfaizzy.pageobjects.LandingPage;
import mhdnurfaizzy.testComponent.baseTest;

public class coFlow extends baseTest{
	WebDriver driver = new EdgeDriver();
	
	@Test(dataProvider= "getData")
	public void coFLow(HashMap<String, String> input) {
		//GO to Website
		LandingPage landingPage = new LandingPage(driver);
		landingPage.loginApplication(input.get("email"), input.get("password"));
		
//		driver.get("https://automationexercise.com/");
//		// Maximize the browser window
//        driver.manage().window().maximize();
//        //Go to login page
//        driver.findElement(By.cssSelector("a[href='/login']")).click();        
//        // Find the email input field and enter the email
//        WebElement emailField = driver.findElement(By.cssSelector("input[data-qa='login-email']"));
//        emailField.sendKeys("SelinaBauch@gmail.com");
//        // Find the password input field and enter the password
//        WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='Password']"));
//        passwordField.sendKeys("YourPassword");
//        // Find and click the login button
//        WebElement loginButton = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
//        loginButton.click();
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		List<HashMap<String, String>> data = getDataJsonToMap(System.getProperty("user.dir") + "\\src\\main\\java\\mhdnurfaizzy\\data\\Purchase.json");
		return new Object[][] { {data.get(0)},{data.get(1)} };
	}

}
