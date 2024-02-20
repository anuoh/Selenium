package listener1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {
	WebDriver driver;
	@BeforeMethod
	@BeforeSuite
	public void setUp() {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("reports/Spark.html");
	
		
		extent.setSystemInfo("Host Name" , "Salesforce");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Username", "Anupam");
		
		spark.config().setDocumentTitle("Test execution report");
		spark.config().setReportName("Firebase Regression test");
		spark.config().setTheme(Theme.DARK);
		extent.attachReporter(spark);
		
	ExtentTest test=extent.createTest("MyFirstTest");
	test.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
	test.info("info message");
	
	ExtentTest test1=extent.createTest("MySecondTest");
	test1.log(Status.PASS, "This is a logging event for MySecondTest, and it passed!");
		test1.info("info message");
		
		ExtentTest test2=extent.createTest("MyThirdTest");
		test2.log(Status.FAIL, "This is a logging event for MyThirdTest, and it failed!");
			test2.info("info message");
			
		extent.flush();
		System.out.println("completed");
	}
@Test	
public void test() {
	//WebDriverManager.chromedriver().setup();
//	ChromeDriver driver=new ChromeDriver();
	}
@AfterMethod
@AfterSuite
public void tearDown() {
	driver.quit();
}
}