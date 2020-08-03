package VodafoneEgypt.AnaVodafone.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import VodafoneEgypt.AnaVodafone.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Logout extends TestBase
{
    //----------------------------------Home Page Elements---------------------------------------	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public static WebElement LogoutOKBtn;  //Logout OK button
	@AndroidFindBy(xpath = "//android.widget.Button[@text='نعم']")
    public static WebElement LogoutOKBtn_Ar;  //Logout OK button

	public Logout(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		if (General.LanguageID == 1)
		{
			//Updating Elements with Arabic values====
			LogoutOKBtn = LogoutOKBtn_Ar;
		}
    }
}
