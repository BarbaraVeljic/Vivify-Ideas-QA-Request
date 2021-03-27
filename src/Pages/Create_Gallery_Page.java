package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Gallery_Page extends BasicPage {

	public Create_Gallery_Page(WebDriver driver, WebDriverWait waiter, JavascriptExecutor js) {
		super(driver, waiter, js);
		// TODO Auto-generated constructor stub
	}

	public WebElement getCreateGallery() {
		return driver.findElement(By.linkText("Create Gallery"));

	}

	public WebElement getTitle() {
		return driver.findElement(By.id("title"));
	}

	public WebElement getDescriptions() {
		return driver.findElement(By.id("description"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getAddImg() {
		return driver.findElement(By.linkText("Add image"));
	}

	public WebElement getDeleteImg() {
		return driver.findElement(By.className("fas fa-trash"));

	}

	public WebElement getCircleUp() {
		return driver.findElement(By.className("fas fa-chevron-circle-up"));
	}

	public WebElement getCircleDown() {
		return driver.findElement(By.className("fas fa-chevron-circle-down"));
	}

	public WebElement getSubmitBtn() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}

	public WebElement getCancelBtn() {
		return driver.findElement(By.linkText("Cancel"));
	}

	public WebElement getImageUrl() {
		return driver.findElement(By.xpath("//input[@type='url']"));
	}

	public void createGallery(String Title, String Description, String UrlImg) {
		this.getTitle().sendKeys(Title);
		this.getDescriptions().sendKeys(Description);
		this.getImageUrl().sendKeys(UrlImg);
		this.getSubmitBtn().click();
	}
	
}