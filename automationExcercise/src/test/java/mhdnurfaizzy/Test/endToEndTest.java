package mhdnurfaizzy.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class endToEndTest {
	WebDriver driver = new EdgeDriver();
	
	@Test
	public void register() {
		
		driver.get("https://automationexercise.com/");
		
//		landed homepage
		driver.findElement(By.cssSelector(".header-middle"));
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.cssSelector("div[class='signup-form'] h2")).isDisplayed();
		Faker faker = new Faker();
        // Generate fake data for registration form
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(firstName + lastName);
		driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys(firstName + lastName + "@gmail.com");
		System.out.println(firstName+lastName);
		driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']")).isDisplayed();
		
        // Fill in Account Information
        driver.findElement(By.cssSelector("#id_gender1")).click();
        driver.findElement(By.cssSelector("#password")).sendKeys("YourPassword");

        // Select Date of Birth
        Select dayDropdown = new Select(driver.findElement(By.cssSelector("#days")));
        dayDropdown.selectByVisibleText("10");
        Select monthDropdown = new Select(driver.findElement(By.cssSelector("#months")));
        monthDropdown.selectByVisibleText("May");
        Select yearDropdown = new Select(driver.findElement(By.cssSelector("#years")));
        yearDropdown.selectByVisibleText("2010");

        // Check Newsletter and Special Offers checkboxes
        driver.findElement(By.cssSelector("#newsletter")).click();
        driver.findElement(By.cssSelector("#optin")).click();

        // Fill in Address Information
        driver.findElement(By.cssSelector("#first_name")).sendKeys("Your First Name");
        driver.findElement(By.cssSelector("#last_name")).sendKeys("Your Last Name");
        driver.findElement(By.cssSelector("#company")).sendKeys("Your Company");
        driver.findElement(By.cssSelector("#address1")).sendKeys("Your Address");

        // Select Country
        Select countryDropdown = new Select(driver.findElement(By.cssSelector("#country")));
        countryDropdown.selectByVisibleText("United States");

        // Select State
        driver.findElement(By.cssSelector("#state")).sendKeys("Jakarta");

        // Fill in City, Zipcode, and Mobile Number
        driver.findElement(By.cssSelector("#city")).sendKeys("Your City");
        driver.findElement(By.cssSelector("#zipcode")).sendKeys("Your Zipcode");
        driver.findElement(By.cssSelector("#mobile_number")).sendKeys("Your Mobile Number");

        // Click Create Account button
        driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
        System.out.println(driver.findElement(By.cssSelector("h2[class='title text-center'] b")).getText());
        
        
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        
        //Delete account
        driver.navigate().refresh();
        driver.findElement(By.cssSelector("a[href='/logout']")).click();       
        System.out.println(driver.findElement(By.cssSelector("h2[class='title text-center'] b")).getText());
        
        
        driver.quit();
		
	}
	


}
