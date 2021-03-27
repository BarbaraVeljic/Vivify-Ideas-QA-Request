package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_Page extends BasicPage {

	public Register_Page(WebDriver driver, WebDriverWait waiter, JavascriptExecutor js) {
		super(driver, waiter, js);
		// TODO Auto-generated constructor stub
	}

	public WebElement getRegister() {
		return driver.findElement(By.linkText("Register"));
	}

	public WebElement getFirstName() {
		return driver.findElement(By.id("first-name"));
	}
	public WebElement getLastName() {
		return driver.findElement(By.id("last-name"));
	}
	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}
	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getPasswordConfirmation() {
		return driver.findElement(By.id("password-confirmation"));
	}
	public WebElement getCheckBox() {
		return driver.findElement(By.className("form-check-input"));
	}
	public WebElement getSubmitBtn() {
		return driver.findElement(By.linkText("Submit"));
	}
	public void Registration(String FirstName,String LastName,String Email,String Password) {
		this.getFirstName().sendKeys(FirstName);
		this.getLastName().sendKeys(LastName);
		this.getEmail().sendKeys(Email);
		this.getPasswordConfirmation().sendKeys(Email);
		this.getCheckBox().click();
		this.getSubmitBtn().click();
	}
}
