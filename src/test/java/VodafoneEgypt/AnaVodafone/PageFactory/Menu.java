package VodafoneEgypt.AnaVodafone.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import VodafoneEgypt.AnaVodafone.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Menu extends TestBase
{
	//-------------------------------------Menu Strings------------------------------------------
	public static String[] LogoutTxt = {"Logout","الخروج"};
	//----------------------------------Side Menu Elements---------------------------------------     
    @AndroidFindBy(id = "com.emeint.android.myservices:id/iv_side_menu")
    public static WebElement MenuBtn; //Open Menu Button

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile internet']")
    public static WebElement MobileInternet;  //Mobile internet button
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='الموبايل إنترنت']")
    public static WebElement MobileInternet_Ar;  //Mobile internet button
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Logout']")
    public static WebElement Logout;  //Logout button
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='الخروج']")
    public static WebElement Logout_Ar;  //Logout button

	public Menu(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		if (General.LanguageID == 1)
		{
			//Updating Elements with Arabic values====
			MobileInternet = MobileInternet_Ar;
			Logout = Logout_Ar;
		}
    }
}
