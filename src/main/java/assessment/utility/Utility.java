package assessment.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import assessment.main.BaseClass;

public class Utility extends BaseClass {

	
	public void Send_Value(By elementname, String Value) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementname));
		wait.until(ExpectedConditions.elementToBeClickable(elementname));
		driver.findElement(elementname).sendKeys(Value);
	}

	public void Click_on_Element(By elementname) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementname));
		wait.until(ExpectedConditions.elementToBeClickable(elementname));
		driver.findElement(elementname).click();
	}
	public void verificationcondition(By elementname) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementname));
		softAssert.assertEquals(driver.findElements(elementname).size(), 1);
		softAssert.assertAll();
	}
	
}
