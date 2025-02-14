package assessment.main;

import org.testng.annotations.Test;
import assessment.pages.CategoryPage;

public class Category extends BaseClass {

	CategoryPage Categorypage;

	@Test
	public void searchproduct() throws InterruptedException {
		Categorypage = new CategoryPage(driver);
		Categorypage.drpProduktartclick();
		Categorypage.sendkeytxtProduktart(SearchCriteria.get(0).get(0).toString());
		Categorypage.selectProduktartoption();

		Categorypage.drpMarkeclick();
		Categorypage.sendkeytxtMarkesuchen(SearchCriteria.get(0).get(1).toString());
		Categorypage.selectdrpMarkeoption();

		Categorypage.drpGeschenkfurclick();
		//Categorypage.sendkeytxtselectdrpGeschenkfuroption(SearchCriteria.get(0).get(2).toString());
		Categorypage.selectdrpGeschenkfuroption();

		Categorypage.drpFurWenclick();
		//Categorypage.sendkeytxtselectdrpFurWenoption(SearchCriteria.get(0).get(3).toString());
		Categorypage.selectdrpFurWenoption();
	}
}
