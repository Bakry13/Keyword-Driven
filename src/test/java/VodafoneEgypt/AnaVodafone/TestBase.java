package VodafoneEgypt.AnaVodafone;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
/**
 * Unit test for simple App.
 * @param <AndroidDriver>
 */
public class TestBase 
{
	public static AndroidDriver driver;
	public static File AppPath = new File(System.getProperty("user.dir")+"/APK/"+"AnaVodafone.apk");
	public static void AppInit()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "emulator-5554"); //10.73.231.92:5555, DEFNW18C05005421
	
	//	capabilities.setCapability("platformVersion", "8");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "UiAutomator2"); 
		//capabilities.setCapability("unicodeKeyboard", true); //to disable keypad
		//capabilities.setCapability("resetKeyboard", true); //to disable keypad
	//	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2"); //To detect elements after closing pop up dialog
	//	capabilities.setCapability("fullReset", true);
		capabilities.setCapability("noReset", true);
	//	capabilities.setCapability("app", AppPath.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.emeint.android.myservices");
		capabilities.setCapability("appActivity", "vodafone.vis.engezly.ui.screens.splash.SplashRevampActivity");
		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //wait before every action max 15sec
	}
}
