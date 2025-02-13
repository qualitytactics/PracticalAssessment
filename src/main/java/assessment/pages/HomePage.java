package assessment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public By Menu = By.xpath("//a[normalize-space()='PARFUM']");

	public By shadowHost = By.id("usercentrics-root");
	public By ALLEERLAUBEN = By.cssSelector(".sc-dcJsrY.eIFzaz");

	public void Menuclick() {
		driver.findElement(Menu).click();
	}

	public void Acceptcookieclick() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement shadowHostele = driver.findElement(shadowHost);
		SearchContext shadowRoot = shadowHostele.getShadowRoot();
		WebElement elementInsideShadow = shadowRoot.findElement(ALLEERLAUBEN);
		elementInsideShadow.click();
	}

}
