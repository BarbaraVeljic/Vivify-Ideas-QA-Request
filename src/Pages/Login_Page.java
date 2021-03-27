package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page extends BasicPage {

	public Login_Page(WebDriver driver, WebDriverWait waiter, JavascriptExecutor js) {
		super(driver, waiter, js);
		// TODO Auto-generated constructor stub
	}

	public WebElement getLogin() {
		return driver.findElement(By.linkText("Login"));

	}
	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}
	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
}
	public WebElement getSubmitBtn() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	public void logMe(String Email,String Password) {
		this.getEmail().sendKeys(Email);
		this.getPassword().sendKeys(Password);
		this.getSubmitBtn().click();
	}
	public boolean SuccesfullLogin() {
		boolean succes;
		try {
			driver.findElement(By.linkText("Logout"));
			succes=true;
		}
		catch(Exception e) {
			succes=false;
		}
		return succes;
}
}