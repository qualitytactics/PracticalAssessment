package assessment.main;

import java.io.FileReader;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import assessment.data.*;

public class BaseClass {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static SoftAssert softAssert;
	protected static String winHandleBefore = null, winHandleBefore1 = null, ChildWindow = null;
	protected static ArrayList<ArrayList<Object>> SearchCriteria = new ArrayList<ArrayList<Object>>();
	protected static FileReader reader;
	protected static Properties p;
	protected static int length;

	@BeforeSuite
	public void beforeSuite() {

		// Read property file
		try {
			reader = new FileReader("Masterdata.properties");
			p = new Properties();
			p.load(reader);
		} catch (Exception e) {

		}
		// Read Excel Data
		ReadData RD = new ReadData();
		SearchCriteria = RD.readdata("Search");
		length = SearchCriteria.size();

		// Open Browser
		String browser = p.getProperty("browser");
		if (browser.equals("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--test-type");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		} else if (browser.equals("Firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--test-type");
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		} else {
			System.out.println("Browser isn't availabled");

		}
		softAssert = new SoftAssert();
	}

	@AfterSuite
	public void afterSuite() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
