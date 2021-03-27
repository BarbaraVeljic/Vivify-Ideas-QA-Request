package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_Gallery_Page extends BasicPage {

	public My_Gallery_Page(WebDriver driver, WebDriverWait waiter, JavascriptExecutor js) {
		super(driver, waiter, js);
		// TODO Auto-generated constructor stub
	}

	public WebElement getMyGalleries() {
		return driver.findElement(By.linkText("My Galleries"));
	}

	public WebElement getSearch() {
		return driver.findElement(By.className("form-control"));
	}

	public WebElement getFilterBtn() {
		return driver.findElement(By.linkText("Filter"));
	}

	public WebElement getMyGallery(String GalleryName) {
		return driver.findElement(By.linkText(GalleryName));
	}

	public WebElement getEditGallery() {
		return driver.findElement(By.linkText("Edit Gallery"));
	}

	public WebElement getDelleteGallery() {
		return driver.findElement(By.xpath("//button[@class='btn btn-custom']"));
	}

	public boolean SuccesfullAddToGallery(String GalleryName) {
		boolean succes;
		try {
			driver.findElement(By.linkText(GalleryName));
			succes = true;
		} catch (Exception e) {
			succes = false;
		}
		return succes;
	}

	public WebElement getTitle() {
		return driver.findElement(By.id("title"));
	}

	public WebElement getDescriptions() {
		return driver.findElement(By.id("description"));
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

	public void editMyGallery(String GalleryName, String Title, String Description, String UrlImg)
			throws InterruptedException {
		this.getMyGallery(GalleryName).click();
		Thread.sleep(4000);
		this.getEditGallery().click();
		this.getTitle().clear();
		this.getTitle().sendKeys(Title);
		this.getDescriptions().clear();
		this.getDescriptions().sendKeys(Description);
		this.getImageUrl().clear();
		this.getImageUrl().sendKeys(UrlImg);
		this.getSubmitBtn().click();
	}

	public void deleteMyGallery(String GalleryName) throws InterruptedException {
	//	this.getMyGallery(GalleryName).click();
		Thread.sleep(4000);
		this.getDelleteGallery().click();
		driver.findElement(By.id("element_id")).sendKeys(Keys.ENTER);
	}
}