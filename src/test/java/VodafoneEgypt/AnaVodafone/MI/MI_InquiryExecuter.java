package VodafoneEgypt.AnaVodafone.MI;
import java.io.IOException;
import org.testng.annotations.Test;

import VodafoneEgypt.AnaVodafone.AppVerification;
import VodafoneEgypt.AnaVodafone.Excel;
import VodafoneEgypt.AnaVodafone.ExcelSheetInit;
import VodafoneEgypt.AnaVodafone.ExtentReport;
import VodafoneEgypt.AnaVodafone.Screenshot;
import VodafoneEgypt.AnaVodafone.TestBase;
import VodafoneEgypt.AnaVodafone.Logout.ValidLogout;
import VodafoneEgypt.AnaVodafone.PageFactory.General;
import VodafoneEgypt.AnaVodafone.PageFactory.MI;

public class MI_InquiryExecuter extends TestBase
{
	static int StartRow = ExcelSheetInit.LocateStart("StartOfInquiryTest"); //Starting row number of subscription test in the excel sheet
	//===================================Let's start subscription tests===================================================
	@Test
	public static void MIInquiryTestActions() throws IOException, InterruptedException
	{	
	
		//AppInit(); PageFactoryObject(); //App Initializations
		//----------------------Here we will start to loop on test cases steps in the excel sheet---------------------
		while (!(ExcelSheetInit.KeywordAction.equals("EndOfTest"))) //loop on steps  KeywordAction != "EndOfTest"
		{
			
			try {
				ExcelSheetInit.KeywordAction = Excel.read(ExcelSheetInit.RowNumb, ExcelSheetInit.ColumnNumb); //Read Keyword action for each step
				System.out.println(ExcelSheetInit.KeywordAction);		
				ExcelSheetInit.Data = Excel.read(ExcelSheetInit.RowNumb, ExcelSheetInit.DataColumnNumb); //Read needed data for every step
				System.out.println(ExcelSheetInit.Data);
				//----------------------------Test cases start and end in report-----------------------------------
				ExtentReport.StartEndTC(ExcelSheetInit.KeywordAction, StartRow);
				//-----------------------------------------Find the keyword----------------------------------------
		
				//--------------------- check renewal for first time -----
				if (ExcelSheetInit.KeywordAction.equals("Pressrenew")) 
				{
					Thread.sleep(3000);
					General.ScrollAndFind(MI.Renew_Txt[General.LanguageID]).click();     
				}
				else if (ExcelSheetInit.KeywordAction.equals("Confirm"))
				{
				   MI.ConfirmBtn.click();
				}	
			    
				else if (ExcelSheetInit.KeywordAction.equals("VerifySuccessResponseA"))
				{
					if(AppVerification.VerifyElement(MI.RenewalSuccessToss,"Bundle isn't repurchased"));// assert on renewal
					//{MI_FailureRecovery.CloseAndOpenMI(ExcelSheetInit.MSISDNValue, ExcelSheetInit.PasswordValue);}
				}	
				else if (ExcelSheetInit.KeywordAction.equals("TakeScreenshot"))
				{
					Screenshot.SaveScreenshot(driver, ExcelSheetInit.Data);
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify Qouta1")) // assert on first qouata
				{
					AppVerification.VerifyElement(MI.Firstqouta,"backend fail");
				}	
				else if (ExcelSheetInit.KeywordAction.equals("Verify Qouta2")) // assert on second qouata
				{
					AppVerification.VerifyElement(MI.Secondqouta,"Bundle isn't repurchased");
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyMI"))
				{  
				    if(AppVerification.VerifyElement(MI.MiPage,"MI screen is not opened")) //Verify MI screen
				    	MI_FailureRecovery.CloseAndOpenMI(ExcelSheetInit.MSISDNValue, ExcelSheetInit.PasswordValue); //Close and to MI page again in case of failure
				}
				else if (ExcelSheetInit.KeywordAction.equals("closeApp")) // Close app after overlay
				{
					MI_FailureRecovery.CloseAndOpenMI(ExcelSheetInit.MSISDNValue, ExcelSheetInit.PasswordValue);
				}
				
				//--------------------- check renewal fails for the second time -----
				
				else if (ExcelSheetInit.KeywordAction.equals("VerifyErrorResponse"))
				{
					AppVerification.VerifyElement(MI.Error,"Backend error");// assert on renewal
				}	
				
				else if (ExcelSheetInit.KeywordAction.equals("OK"))
				{
					MI.OK.click();
				}	
				// logout 
				else if (ExcelSheetInit.KeywordAction.equals("Logout"))
				{
					ValidLogout.LogoutAction();
				}  
				//--------------------- check renewal with no balance -----
				else if (ExcelSheetInit.KeywordAction.equals("VerifyChargeBalanceResponse"))
				{
					AppVerification.VerifyElement(MI.RechargeError,"Backend error");// assert recharge error
				}
				//-------- expiry for ondemand-----------
				else if (ExcelSheetInit.KeywordAction.equals("VerifyExpiry"))// check expiry for ondemand
				{
					General.ScrollAndFind(MI.Expiry_Date[General.LanguageID]);     
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRedHer")) // check red her bundle
				{
					General.ScrollAndFind(MI.RedHerMIbundle[General.LanguageID]);     
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRedWellcome")) // check red wellcome bundle
				{
					General.ScrollAndFind("Red Wellcome MI bundle");     
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRedClassic")) // check red Classic bundle
				{
					General.ScrollAndFind(MI.RedClassicMIbundle[General.LanguageID]);     
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRedTraveller")) // check red Traveller bundle
				{
					General.ScrollAndFind(MI.RedTravelerMIbundle[General.LanguageID]);     
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			ExcelSheetInit.RowNumb++;
		}
	}
}
