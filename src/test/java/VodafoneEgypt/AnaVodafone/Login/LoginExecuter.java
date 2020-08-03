package VodafoneEgypt.AnaVodafone.Login;

import java.io.IOException;

import org.testng.annotations.Test;

import VodafoneEgypt.AnaVodafone.Excel;
import VodafoneEgypt.AnaVodafone.ExcelSheetInit;
import VodafoneEgypt.AnaVodafone.ExtentReport;
import VodafoneEgypt.AnaVodafone.Logout.ValidLogout;
import VodafoneEgypt.AnaVodafone.PageFactory.General;
import VodafoneEgypt.AnaVodafone.PageFactory.Login;
import VodafoneEgypt.AnaVodafone.PageFactory.MI;
import VodafoneEgypt.AnaVodafone.PageFactory.Menu;

public class LoginExecuter 
{
	static int StartRow = ExcelSheetInit.LocateStart("StartOfLoginTest"); //Starting row number of subscription test in the excel sheet
	//===================================Let's start subscription tests===================================================
	@Test
	public static void MISubscriptionTestActions() throws IOException, InterruptedException
	{	
		try {
			//AppInit(); PageFactoryObject(); //App Initializations
			//----------------------Here we will start to loop on test cases steps in the excel sheet---------------------
			while (!(ExcelSheetInit.KeywordAction.equals("EndOfTest"))) //loop on steps  KeywordAction != "EndOfTest"
			{
				ExcelSheetInit.KeywordAction = Excel.read(ExcelSheetInit.RowNumb, ExcelSheetInit.ColumnNumb); //Read Keyword action for each step
				System.out.println(ExcelSheetInit.KeywordAction);		
				ExcelSheetInit.Data = Excel.read(ExcelSheetInit.RowNumb, ExcelSheetInit.DataColumnNumb); //Read needed data for every step
				System.out.println(ExcelSheetInit.Data);
				//----------------------------Test cases start and end in report-----------------------------------
				ExtentReport.StartEndTC(ExcelSheetInit.KeywordAction, StartRow);
				//-----------------------------------------Find the keyword----------------------------------------
				if (ExcelSheetInit.KeywordAction.equals("EnterMSISDN"))
				{
					Login.MSISDN.sendKeys(ExcelSheetInit.Data); //Enter MSISDN
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressProceed"))
				{
					Login.ProceedBtn.click(); //Press Proceed Button
				}
				else if (ExcelSheetInit.KeywordAction.equals("EnterPassword"))
				{
					Login.Password.sendKeys(ExcelSheetInit.Data); //Enter password
				}
				else if (ExcelSheetInit.KeywordAction.equals("ChangeLanguge"))
				{
					ValidScenarios.ChangeLanguage();
				}
				else if (ExcelSheetInit.KeywordAction.equals("Logout"))
				{
					ValidLogout.LogoutAction(); //Logout to login with different plan
				}
				ExcelSheetInit.RowNumb++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
