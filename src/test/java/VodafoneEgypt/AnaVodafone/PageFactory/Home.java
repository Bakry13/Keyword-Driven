package VodafoneEgypt.AnaVodafone.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import VodafoneEgypt.AnaVodafone.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home extends TestBase
{
    //----------------------------------Login Page Elements---------------------------------------
	@AndroidFindBy(id = "com.emeint.android.myservices:id/iv_side_logo")
	public static WebElement Logo;
	
	@AndroidFindBy(id = "com.emeint.android.myservices:id/laterTv")
	public static WebElement SkipId; //Skip 400MB offer pop up 
	
	@AndroidFindBy(id = "android:id/button1")
	public static WebElement NoRateBtn; //No button in android pop up
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Skip']")
	public static WebElement Skip; //Log out element in side menu
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='تخطي']")
	public static WebElement Skip_Ar; //Log out element in side menu
	
	public Home(AndroidDriver driver)
	{
        //this.driver = driver;
        //PageFactory.initElements(driver, this); //This initElements method will create all WebElements
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		if (General.LanguageID == 1)
		{
			//Updating Elements with Arabic values====
			Skip = Skip_Ar;
		}
    }
}