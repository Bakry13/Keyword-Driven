package VodafoneEgypt.AnaVodafone.Login;

import VodafoneEgypt.AnaVodafone.AppExecuter;
import VodafoneEgypt.AnaVodafone.ExcelSheetInit;
import VodafoneEgypt.AnaVodafone.ExtentReport;
import VodafoneEgypt.AnaVodafone.PageFactory.General;
import VodafoneEgypt.AnaVodafone.PageFactory.Home;
import VodafoneEgypt.AnaVodafone.PageFactory.Login;
import VodafoneEgypt.AnaVodafone.PageFactory.MI;

public class ValidScenarios 
{
	public static void PressAllow()
	{
		try {
			//General.ScrollAndFind(Login.AllowTxt[General.LanguageID]).click();
			Login.AllowButton.click();
		} catch (Exception e) {}
	}
	
	public static void CheckLanguage()
	{
		try {
			if (!(Login.Hi.getText().equals("Hi,")) && General.LanguageID == 0) //Check if language is not English
				Login.ChangeLanguage.click(); //Change language from Ar to En
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ValidLogin(String MSISDNValue, String PasswordValue)
	{
		try {
			Login.MSISDN.sendKeys(MSISDNValue); //Enter MSISDN
			Login.ProceedBtn.click(); //Press Proceed Button
			Login.Password.sendKeys(PasswordValue); //Enter password
			Login.ProceedBtn.click(); //Press Proceed Button
			Thread.sleep(2500);
			Home.Skip.click();
		} catch (InterruptedException e) {
		}
	}
	
	public static void ChangeLanguage()
	{
		Login.ChangeLanguage.click(); //Change language from En to Ar and vice versa
		if (General.LanguageID < 1) //If the language still En
		{	
			ExcelSheetInit.RowNumb = -1; //Reset to the start of TCs
			ExcelSheetInit.DataColumnNumb = ExcelSheetInit.ArabicDataColumnNumb; //Updating data to read from Arabic column
			ExtentReport.extent.endTest(ExtentReport.test); //close the test case in extent report
			General.LanguageID = 1; //Change language to Ar
			General.PageFactoryObject(); //Initializing page factory objects with new language 
		}
	}
}
