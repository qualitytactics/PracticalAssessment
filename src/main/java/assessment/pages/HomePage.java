package assessment.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	}

	public By Menu = By.xpath("//a[normalize-space()='PARFUM']");

	public By shadowHost = By.id("usercentrics-root");
	public By ALLEERLAUBEN = By.cssSelector(".sc-dcJsrY.eIFzaz");

	public void Menuclick() {
		driver.findElement(Menu).click();
	}

	public void Acceptcookieclick() {

		WebElement shadowHostele = driver.findElement(shadowHost);
		wait.until(ExpectedConditions.presenceOfElementLocated(shadowHost));
		SearchContext shadowRoot = shadowHostele.getShadowRoot();

		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return shadowRoot.findElements(ALLEERLAUBEN).size() > 0;
			}
		});

		WebElement elementInsideShadow = shadowRoot.findElement(ALLEERLAUBEN);
		wait.until(ExpectedConditions.elementToBeClickable(elementInsideShadow));
		elementInsideShadow.click();
	}

}
