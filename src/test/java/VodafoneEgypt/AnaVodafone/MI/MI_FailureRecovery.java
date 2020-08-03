package VodafoneEgypt.AnaVodafone.MI;

import java.io.IOException;
import java.time.Duration;

import com.relevantcodes.extentreports.LogStatus;

import VodafoneEgypt.AnaVodafone.AppVerification;
import VodafoneEgypt.AnaVodafone.ExcelSheetInit;
import VodafoneEgypt.AnaVodafone.ExtentReport;
import VodafoneEgypt.AnaVodafone.PopupHandler;
import VodafoneEgypt.AnaVodafone.TestBase;
import VodafoneEgypt.AnaVodafone.Login.ValidScenarios;
import VodafoneEgypt.AnaVodafone.Logout.ValidLogout;
import VodafoneEgypt.AnaVodafone.PageFactory.General;
import VodafoneEgypt.AnaVodafone.PageFactory.Home;
import VodafoneEgypt.AnaVodafone.PageFactory.MI;
import VodafoneEgypt.AnaVodafone.PageFactory.Menu;
import io.appium.java_client.android.AndroidKeyCode;

public class MI_FailureRecovery extends TestBase
{
	public static void LogoutAndOpenMI(String MSISDNValue, String PasswordValue) throws IOException
	{
		try 
		{
			ValidLogout.LogoutAction(); //Logout
			ValidScenarios.ValidLogin(MSISDNValue, PasswordValue); //Login with the current data
			if(AppVerification.VerifyElement(Home.Logo,"Home screen is not detected")) //Verify Homr screen
				PopupHandler.Rate(); //Handle rate pop up
			Menu.MenuBtn.click(); //Click on menu button
			Thread.sleep(3500);
			Menu.MobileInternet.click(); //Choose MI
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	public static void CloseAndOpenMI(String MSISDNValue, String PasswordValue) throws IOException
	{
		try {
			driver.pressKeyCode(AndroidKeyCode.HOME); //Go to Home
			driver.launchApp(); //Restore app again
			//ValidScenarios.PressAllow(); //Press on allow button in case app installation
			//ValidScenarios.ValidLogin(MSISDNValue, PasswordValue); //Login with the current data
			//if(AppVerification.VerifyElement(Home.Logo,"Home screen is not detected")) //Verify Homr screen
			//	PopupHandler.Rate(); //Handle rate pop up
			//driver.runAppInBackground(Duration.ofSeconds(1)); //run app in back ground for one second
			Menu.MenuBtn.click(); //Click on menu button
			Thread.sleep(3500);
			Menu.MobileInternet.click(); //Choose MI
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void HomeThenRecent()
	{
		driver.pressKeyCode(AndroidKeyCode.HOME); //Go to Home
		driver.pressKeyCode(AndroidKeyCode.MENU); //Select Menu
		General.RecentAnaVodafone_Xiaomi.click(); //Select ana vodafone app from menu for xiaomi
	}
	public static int RefreshCount = 0;
	public static void RefreshMI()
	{
		System.out.println("Calling refresh method");
		if(RefreshCount < 4)
		{
			try {
				MI.RefreshBtn.click();
				assert (General.ScrollAndFind(MI.Extreme[General.LanguageID]).isDisplayed());
			} catch (Exception e) {
				RefreshCount++;
				ExtentReport.test.log(LogStatus.FAIL,"MI screen is not loaded successfully due to backend error");
				RefreshMI();
			}
		}
		if (RefreshCount == 4)
		{
			ExcelSheetInit.RowNumb = 1000;
		}
	}
}
