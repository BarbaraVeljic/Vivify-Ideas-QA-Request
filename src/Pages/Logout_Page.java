package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout_Page extends BasicPage {

	public Logout_Page(WebDriver driver, WebDriverWait waiter, JavascriptExecutor js) {
		super(driver, waiter, js);
		// TODO Auto-generated constructor stub
	}

	public WebElement getLogout() {
		return driver.findElement(By.linkText("Logout"));
	}

	public void logout() {
		this.getLogout().click();
	}
	public boolean SuccesfullLogout() {
		boolean succes;
		try {
			driver.findElement(By.linkText("Login"));
			succes=true;
		}
		catch(Exception e) {
			succes=false;
		}
		return succes;
}
}