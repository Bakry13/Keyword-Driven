package VodafoneEgypt.AnaVodafone;

import java.io.IOException;

import VodafoneEgypt.AnaVodafone.MI.MI_FailureRecovery;
import VodafoneEgypt.AnaVodafone.PageFactory.Home;
import io.appium.java_client.android.AndroidDriver;

public class PopupHandler 
{
	public static void Rate() throws IOException
	{
		try {
			Home.NoRateBtn.click();
		} catch (Exception e) {
		}
		MI_FailureRecovery.CloseAndOpenMI(ExcelSheetInit.MSISDNValue, ExcelSheetInit.PasswordValue); //Close and to MI page again in case of failure
	}
}
