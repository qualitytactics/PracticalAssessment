package assessment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage  {

	WebDriver driver;

	public CategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public By Menu = By.xpath("//h1[@class='headline-bold product-overview__headline']");

	public By drpProduktart = By.xpath("//div[contains(text(),'Produktart')]");
	public By drpMarke = By.xpath("//div[contains(text(),'Marke')]");
	public By drpGeschenkfur = By.xpath("//div[contains(text(),'Geschenk für')]");
	public By drpFurWen = By.xpath("//div[contains(text(),'Für Wen')]");
	public By btnexpand = By.xpath("//button[normalize-space()='Mehr Filter anzeigen']");
	
	public By txtProduktart = By.xpath("//input[@placeholder='Produktart suchen']");
	public By txtMarkesuchen = By.xpath("//input[@placeholder='Marke suchen']");

	
	
	public void sendkeytxtProduktart(String Value) {
		driver.findElement(txtProduktart).sendKeys(Value);;
	}
	public void sendkeytxtMarkesuchen(String Value) {
		driver.findElement(txtMarkesuchen).sendKeys(Value);;
	}
	
	
	public void Waitforpageload() {
		driver.findElement(Menu).click();
	}
	

	public void drpMarkeclick() {
		driver.findElement(drpMarke).click();
	}

	public void drpGeschenkfurclick() {
		driver.findElement(drpGeschenkfur).click();
	}
	
	

	public void drpFurWenclick() {
		driver.findElement(drpFurWen).click();
	}

	public void btnexpandclick() {

		driver.findElement(btnexpand).click();
	}

	public void drpProduktartclick() {
		driver.findElement(drpProduktart).click();
	}

}
