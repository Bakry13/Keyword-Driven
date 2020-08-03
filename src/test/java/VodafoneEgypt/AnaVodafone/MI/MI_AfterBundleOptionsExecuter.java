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

public class MI_AfterBundleOptionsExecuter extends TestBase
{
	static int StartRow = ExcelSheetInit.LocateStart("StartOfAfterBundleOptionsTest"); //Starting row number of subscription test in the excel sheet
	//===================================Let's start subscription tests===================================================
	@Test
	public static void MISubscriptionTestActions() throws IOException, InterruptedException
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

				//---Open addon page---------
				if (ExcelSheetInit.KeywordAction.equals("OpenABO"))
				{
					//MI.AfterBundleOption.click(); //Choose After Bundle Options    
					General.ScrollAndFind(MI.AFterBundle_Txt[General.LanguageID]).click(); 
				}
				else if (ExcelSheetInit.KeywordAction.equals("Buyaddon"))
				{
				   Thread.sleep(2000);
					MI.BuyAddon.click(); //Press On By Addon
				}	
				else if (ExcelSheetInit.KeywordAction.equals("Verifyonaddonpage"))
				{
					AppVerification.VerifyElement(MI.AddonTitle,"page not found");
				}
				else if (ExcelSheetInit.KeywordAction.equals("Tackscreenshoot"))
				{
					Screenshot.SaveScreenshot(driver, ExcelSheetInit.Data);
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressBack"))
				{
					
					MI.Back.click();
				}
				//----------------check renewable bundle---------------
				else if (ExcelSheetInit.KeywordAction.equals("Verify500Renewable"))
                {
                       AppVerification.VerifyText(MI.RenewableExtreme150Txt[General.LanguageID],"Extreme Net 150MB Renewable Bundle is not found in After bundle options"); //Verify Extreme 150 renewable in after bundle option
                }
				else if (ExcelSheetInit.KeywordAction.equals("VerifyMI"))
				{  
				    if(AppVerification.VerifyElement(MI.MiPage,"MI screen is not opened")) //Verify MI screen
				    	MI_FailureRecovery.CloseAndOpenMI(ExcelSheetInit.MSISDNValue, ExcelSheetInit.PasswordValue); //Close and to MI page again in case of failure
				}
				//-----on demand toggle-----------
				else if (ExcelSheetInit.KeywordAction.equals("SwitchOnD"))
				{
					Thread.sleep(2000);
					MI.StopOnDemandBtn.click(); // Activate    
				}
				else if (ExcelSheetInit.KeywordAction.equals("Confirm"))
				{
					MI.ConfirmBtn.click(); //CPress confirm      
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySuccessResponseA"))
				{
					if(AppVerification.VerifyElement(MI.SuccessToss,"Success Response is not found")) //Verify activating response from backend
						MI.Back.click(); //Back to MI screen 
					
				}
				else if (ExcelSheetInit.KeywordAction.equals("SwitchOffD"))
				{Thread.sleep(2000);
					MI.StopOnDemandBtn.click(); //Deactivate    
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySuccessResponseD"))
				{
					//MI_AfterBundleOptionsVerification.VerifySuccessResponseDeactivation();
					if(AppVerification.VerifyElement(MI.DeactivatingToss,"Deactivating Response is not found")) //Verify deactivating response from backend
						MI.Back.click(); //Back to MI screen 
				}
				
				//-----stop internet renewable----------
				else if (ExcelSheetInit.KeywordAction.equals("SwitchOnR"))
				{
					Thread.sleep(2000);
					MI.StopRenewableBtn.click();  //Activate
				}
				else if (ExcelSheetInit.KeywordAction.equals("SwitchOffR"))
				{
					Thread.sleep(2000);
					MI.StopRenewableBtn.click(); //deactivate     
				}
				//----------Roll over---------
				else if (ExcelSheetInit.KeywordAction.equals("Switchonroll"))
				{
					Thread.sleep(2000);
					MI.StopRolloverBtn.click(); //Activate 					
				}
				else if (ExcelSheetInit.KeywordAction.equals("Switchoffroll"))
				{
					Thread.sleep(2000);
					MI.StopRolloverBtn.click(); //Deactivate      
				}
				else if (ExcelSheetInit.KeywordAction.equals("DeactivateBundle"))
				{
					Thread.sleep(2000);
					MI.DeactivteBundle.click(); //Choose to deactivate bundle      
				}
				// logout 
				else if (ExcelSheetInit.KeywordAction.equals("Logout"))
				{
					ValidLogout.LogoutAction();
				}
				//-----------RDA toggle---------
		
				else if (ExcelSheetInit.KeywordAction.equals("SwitchonRDA"))
				{
					Thread.sleep(2000);
					MI.RedDataAssistanceBtn.click(); //Choose After Bundle Options  	
				}	
				else if (ExcelSheetInit.KeywordAction.equals("SwitchoffRDA"))
				{
					Thread.sleep(2000);
					MI.RedDataAssistanceBtn.click(); //Choose After Bundle Options      
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			ExcelSheetInit.RowNumb++;
		}
	}
}
