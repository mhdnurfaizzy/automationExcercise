package mhdnurfaizzy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mhdnurfaizzy.AbstractComponenet.abstractComponent;

public class LandingPage extends abstractComponent{

	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//PageFactory
	
	@FindBy(css ="input[data-qa='login-email']")
	 WebElement useremail;
	
	//driver.findElement(By.id("userPassword")) 
	@FindBy(css="input[placeholder='Password']")
	 WebElement passwordEle;
	
	@FindBy(css="button[data-qa='login-button']")
	 WebElement submit;
	
//	@FindBy(css="[class*='flyInOut']")
//	 WebElement errorMessage;
	
//	public String getErrorMessage() {
//		waitWebElementForAppear(errorMessage);
//		return errorMessage.getText();
//	}
	
	public void goTo()
	{
		driver.get("https://automationexercise.com/login");
	}
	
	public void loginApplication(String email, String password) {
        
		useremail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
//		ProductCatalogue productCatalog = new ProductCatalogue(driver);
//		return productCatalog;
		
	}
}
