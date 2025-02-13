package assessment.main;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import assessment.pages.CategoryPage;

public class Category extends BaseClass {

	CategoryPage cp;

	@Test
	public void searchproduct() throws InterruptedException {
		cp = new CategoryPage(driver);
		String path;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < SearchCriteria.get(i).size(); j++) {

				switch (j) {
				case 0:
					if (SearchCriteria.get(i).get(j) != "")
						wait.until(ExpectedConditions.visibilityOfElementLocated(cp.btnexpand));
					cp.drpProduktartclick();
					cp.sendkeytxtProduktart(SearchCriteria.get(i).get(j).toString());
					path = "//div[@class='facet-option__label']//div[contains(text(),'" + SearchCriteria.get(i).get(j)
							+ "')]";
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
					driver.findElement(By.xpath(path)).click();
					break;

				case 1:
					if (SearchCriteria.get(i).get(j) != "")
						wait.until(ExpectedConditions.visibilityOfElementLocated(cp.btnexpand));
					cp.drpMarkeclick();
					cp.sendkeytxtMarkesuchen(SearchCriteria.get(i).get(j).toString());
					path = "//div[contains(text(),'" + SearchCriteria.get(i).get(j) + "')]";

					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
					driver.findElement(By.xpath(path)).click();
					break;
				case 2:
					if (SearchCriteria.get(i).get(j) != "")
						wait.until(ExpectedConditions.invisibilityOfElementLocated(cp.drpGeschenkfur));
					wait.until(ExpectedConditions.elementToBeClickable(cp.drpGeschenkfur));
					cp.drpGeschenkfurclick();
					path = "//div[contains(text(),'" + SearchCriteria.get(i).get(j) + "')]";
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
					driver.findElement(By.xpath(path)).click();
					break;
				case 3:
					if (SearchCriteria.get(i).get(j) != "")
						wait.until(ExpectedConditions.invisibilityOfElementLocated(cp.drpFurWen));
					wait.until(ExpectedConditions.elementToBeClickable(cp.drpFurWen));
					cp.drpFurWenclick();
					path = "//div[contains(text(),'" + SearchCriteria.get(i).get(j) + "')]";
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
					driver.findElement(By.xpath(path)).click();
					break;
				}

			}
		}

	}
}
