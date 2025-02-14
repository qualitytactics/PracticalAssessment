package assessment.main;

import assessment.pages.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Home extends BaseClass {

	HomePage Homepage;
	CategoryPage Categorypage;

	@Test
	public void OpenHomepage() {

		driver.get(p.getProperty("URL"));
		softAssert.assertEquals(driver.getTitle(), "Online-Parfümerie ✔️ Parfum & Kosmetik kaufen | DOUGLAS");
		softAssert.assertAll();
	}

	@Test
	public void cookieconsent() {
		Homepage = new HomePage(driver);
		Homepage.Acceptcookieclick();
	}

	@Test
	public void Menuclick() {
		Homepage = new HomePage(driver);
		Homepage.Menuclick();
		Categorypage = new CategoryPage(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Categorypage.Menu));
		softAssert.assertEquals(driver.getTitle(), "Parfüm & Düfte ✔️ online kaufen » für Sie & Ihn | DOUGLAS");
		softAssert.assertAll();
	}
}
