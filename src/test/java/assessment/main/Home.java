package assessment.main;

import assessment.pages.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Home extends BaseClass {

	HomePage hp;
	CategoryPage cp;

	@Test
	public void OpenHomepage() {

		driver.get(p.getProperty("URL"));
		System.out.println(driver.getTitle());
		System.out.println(p.getProperty("Title"));
		softAssert.assertEquals(driver.getTitle(), "Online-Parfümerie ✔️ Parfum & Kosmetik kaufen | DOUGLAS");
		softAssert.assertAll();
	}

	@Test
	public void cookieconsent() {
		hp = new HomePage(driver);
		hp.Acceptcookieclick();
	}

	@Test
	public void Menuclick() {
		hp = new HomePage(driver);
		hp.Menuclick();
		cp = new CategoryPage(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(cp.Menu));
		softAssert.assertEquals(driver.getTitle(), "Parfüm & Düfte ✔️ online kaufen » für Sie & Ihn | DOUGLAS");
		softAssert.assertAll();
	}
}
