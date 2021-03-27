package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Gallery_App_Test extends BasicTest {
	@Test(priority = 3)
	public void logIn() {
		driver.navigate().to(baseUrl);
		this.loginPage.getLogin().click();
		this.loginPage.logMe(email, password);
		assertEquals(this.loginPage.SuccesfullLogin(), true, 
				"[ERROR] Unexpected login message");
	}

	@Test(priority = 5)
	public void createGallery() throws InterruptedException {
		Thread.sleep(4000);
		this.createGalleryPage.getCreateGallery().click();
		this.createGalleryPage.createGallery("proba", "proba", 
				"https://eskipaper.com/images/images-2.jpg");
		assertEquals(this.myGalleryPage.SuccesfullAddToGallery("proba"), true,
				"[ERROR]Unexpected Create Gallery message");
	}

	@Test(priority = 7)
	public void myGaleryPage() throws InterruptedException {
		Thread.sleep(4000);
		this.myGalleryPage.getMyGalleries().click();
		assertEquals(this.myGalleryPage.SuccesfullAddToGallery("proba"), true,
				"[ERROR]Unexpected My Gallery Page message");
	}

	@Test(priority = 8)
	public void editMyGallery() throws InterruptedException {
		this.myGalleryPage.editMyGallery("proba", "Edit", "Edit", 
				"https://upload.wikimedia.org/wikipedia/commons/4/41/Sunflower_from_Silesia2.jpg");
		Thread.sleep(4000);
		
	}
	@Test(priority = 9)
	public void deleteMyGallery() throws InterruptedException  {
		this.myGalleryPage.deleteMyGallery("Edit");
		assertEquals(this.myGalleryPage.SuccesfullAddToGallery("Edit"), true,
				"[ERROR]Unexpected Edit Gallery Page message");
	}
	@Test(priority = 10)
	public void logout() {
		this.logOutPage.logout();
		assertEquals(this.logOutPage.SuccesfullLogout(), true,
				"[ERROR]Unexpected logout message");
	}
}
