package org.browserstack.pompages;

import org.browserstack.driver.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoQAPage {

	private static By fullname = By.xpath("//input[@id='userName']");
	private static By emailaddres = By.xpath("//input[@id='userEmail']");
	private static By currentadd = By.xpath("//textarea[@id='currentAddress']");
	private static By permanentadd = By.xpath("//textarea[@id='permanentAddress']");
	private static By submitbuttn = By.xpath("//*[@id='submit']");
	private static By submittedname = By.xpath("//p[@id='name']");
	private static By fullnamelabel = By.xpath("//label[@id='userName-label']");
	
	private static By signinbutton = By.xpath("//a[@id='log-in']");
	private static By balancevalue = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]");
	private static By addaccount = By.xpath("//span[normalize-space()='Add Account']");
	private static By username = By.xpath("//div[@class='logged-user-name']");

	public  void enterFullName(String personname) {
		WebElement name = DriverSetup.getDriver().findElement(fullname);
		name.sendKeys(personname);
	}
	
	public  void enterEmail(String emailid) {
		WebElement email = DriverSetup.getDriver().findElement(emailaddres);
		email.sendKeys(emailid);
	}
	
	public  void enterCurrentAddress(String currentaddress) {
		WebElement current = DriverSetup.getDriver().findElement(currentadd);
		current.sendKeys(currentaddress);
	}
	
	public  void enterPermanentAddress(String permanentaddress) {
		WebElement permanent = DriverSetup.getDriver().findElement(permanentadd);
		permanent.sendKeys(permanentaddress);
	}
	
	public  void clickSignin() {
		DriverSetup.getDriver().findElement(signinbutton).click();
	}
	
	public  void addAccount() {
		DriverSetup.getDriver().findElement(addaccount).click();
	}
	
	public  boolean isFormSubmitted() {
		WebElement submittedField = DriverSetup.getDriver().findElement(submittedname);
		boolean value =submittedField.isDisplayed();
		return value;
	}

	public  String getBalance() {
		return DriverSetup.getDriver().findElement(balancevalue).getText();
	}
	
	public  String getUserName() {
		return DriverSetup.getDriver().findElement(username).getText();
	}

}
