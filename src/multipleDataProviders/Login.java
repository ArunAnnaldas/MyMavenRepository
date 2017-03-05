package multipleDataProviders;

import java.io.File;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@Guice
public class Login {

	//public static ExtentReports report;
	//public static ExtentTest logger;

	public void BeforeSuite() {
		//report = new ExtentReports(System.getProperty("user.dir") + "\\LearnAutomation.html", true);
		//report.loadConfig(new File(
			//	"C:\\Users\\aannaldas\\Desktop\\Automation\\Training\\Softwares\\extentreports-java-2.41.2\\extentreports-java-2.41.2\\extent-config.xml"));

	}

	@Test(dataProvider = "DataRepository", dataProviderClass = DataProviderHub.class)
	public void testLogin(String UserName, String Password) {

		System.out.println(System.getProperty("user.dir") + "\\LearnAutomation.html");

//		logger = report.startTest("loginTest");

	//	logger.log(LogStatus.INFO, "Starting with login");

		System.out.println("Login Tested successfully with UserName : " + UserName + " & Password : " + Password
				+ " with thread id : " + Thread.currentThread().getId());

		//logger.log(LogStatus.PASS, "Login is successful");
	}

}
