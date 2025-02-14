package assessment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import assessment.utility.Utility;
import assessment.main.BaseClass;

public class CategoryPage extends BaseClass {
	WebDriver driver;
	Utility Utility = new Utility();

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

	public By txtselectProduktartoption = By.xpath("//div[@class='facet-option__label']//div[contains(text(),'"
			+ SearchCriteria.get(0).get(0).toString() + "')]");

	public By txtselectdrpProduktartoption = By.xpath("//div[contains(text(),'" + SearchCriteria.get(0).get(0) + "')]");
	public By txtselectdrpMarkeoption = By.xpath("//div[contains(text(),'" + SearchCriteria.get(0).get(1) + "')]");
	public By txtselectdrpGeschenkfuroption = By
			.xpath("//div[contains(text(),'" + SearchCriteria.get(0).get(2) + "')]");
	public By txtselectdrpFurWenoption = By.xpath("//div[contains(text(),'" + SearchCriteria.get(0).get(3) + "')]");

	public By btnsearchcriteria = By.xpath("//button[contains(text(),'" + SearchCriteria.get(0).get(3) + "')]");

	public void sendkeytxtProduktart(String Value) {
		Utility.Send_Value(txtProduktart, Value);
	}

	public void sendkeytxtMarkesuchen(String Value) {
		Utility.Send_Value(txtMarkesuchen, Value);
	}

	public void sendkeytxtselectdrpGeschenkfuroption(String Value) {
		Utility.Send_Value(txtselectdrpGeschenkfuroption, Value);
	}

	public void sendkeytxtselectdrpFurWenoption(String Value) {
		Utility.Send_Value(txtselectdrpFurWenoption, Value);
	}

	public void selectProduktartoption() {

		Utility.Click_on_Element(txtselectProduktartoption);

	}

	public void selectdrpMarkeoption() {
		Utility.Click_on_Element(txtselectdrpMarkeoption);
	}

	public void selectdrpProduktartoption() {
		Utility.Click_on_Element(txtselectdrpProduktartoption);
	}

	public void selectdrpGeschenkfuroption() {
		Utility.Click_on_Element(txtselectdrpGeschenkfuroption);
	}

	public void selectdrpFurWenoption() {
		Utility.Click_on_Element(txtselectdrpFurWenoption);
	}

	public void Waitforpageload() {
		Utility.Click_on_Element(Menu);
	}

	public void drpMarkeclick() {
		Utility.Click_on_Element(drpMarke);
	}

	public void drpGeschenkfurclick() {
		Utility.Click_on_Element(drpGeschenkfur);
	}

	public void drpFurWenclick() {
		Utility.Click_on_Element(drpFurWen);
	}

	public void btnexpandclick() {
		Utility.Click_on_Element(btnexpand);
	}

	public void drpProduktartclick() {
		Utility.Click_on_Element(drpProduktart);
	}
	
	public void verificationcondition() {
		Utility.verificationcondition(btnsearchcriteria);
	}


}
