package VodafoneEgypt.AnaVodafone.MI;

import java.io.IOException;

import org.testng.annotations.Test;

import VodafoneEgypt.AnaVodafone.AppVerification;
import VodafoneEgypt.AnaVodafone.Excel;
import VodafoneEgypt.AnaVodafone.ExcelSheetInit;
import VodafoneEgypt.AnaVodafone.ExtentReport;
import VodafoneEgypt.AnaVodafone.Screenshot;
import VodafoneEgypt.AnaVodafone.TestBase;
import VodafoneEgypt.AnaVodafone.PageFactory.General;
import VodafoneEgypt.AnaVodafone.PageFactory.MI;
import io.appium.java_client.android.AndroidKeyCode;

public class MI_AddonSubscriptionExecuter extends TestBase
{
	static int StartRow = ExcelSheetInit.LocateStart("StartOfAddonSubscriptionTest"); //Starting row number of subscription test in the excel sheet
	//===================================Let's start subscription tests===================================================
	@Test
	public static void MIAddonSubscriptionTestActions() throws IOException, InterruptedException
	{	
		//AppInit(); General.PageFactoryObject(); //App Initializations
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
				//---------------------------------------Login with a certain rate plan----------------------------
				if (ExcelSheetInit.KeywordAction.equals("TakeScreenshot"))
				{
					Screenshot.SaveScreenshot(driver, ExcelSheetInit.Data); //Saving screenshot in the directory and in the extent report
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyMI"))
				{  
				    if(AppVerification.VerifyElement(MI.MiPage,"MI screen is not opened")) //Verify MI screen
				    	MI_FailureRecovery.CloseAndOpenMI(ExcelSheetInit.MSISDNValue, ExcelSheetInit.PasswordValue); //Close and to MI page again in case of failure
				}
				//======================================Renewable Addon=======================================
				else if (ExcelSheetInit.KeywordAction.equals("PressAddon"))
				{
					Thread.sleep(1000);
					//General.ScrollAndFind("Add-Ons"); 
					MI.AddOns.click(); //Press on Add-Ons bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressBack"))
				{
					MI.Back.click(); //Go Back
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressFirstBundleSubscribe"))
				{
					MI.FirstBundleSubscribe.click(); //Subscribe in in the first bundle (1800 on demand in extreme)
				}
				else if (ExcelSheetInit.KeywordAction.equals("ConfirmSubscription"))
				{
					MI.ConfirmBtn.click(); //Press on confirm for subscription
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyAddonSuccessResponse"))
				{
					if(AppVerification.VerifyElement(MI.AddonSuccessToss,"Success response is not found")) //Verify success response from backend
						MI.Back.click(); //Back to MI screen
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyFailResponse"))
				{
					AppVerification.VerifyElement(MI.FailToss,"Fail Response is not found"); //Verify failure response from backend
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify150RenewableAddon"))
				{
					AppVerification.VerifyText(MI.RenewableAddon150Txt[General.LanguageID],"Monthly add-on 5LE 150MB Renewable Bundle is not found in inquiry"); //Verify Monthly add-on 5LE 150MBs renewable in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify150RenewableMBs"))
				{
					AppVerification.VerifyText(MI.Remaining150Txt[General.LanguageID],"Extreme 150MB Renewable MBs value is not 1500MBs after subscription"); //Verify that Extreme 150 renewable in the inquiry has 150MBs in inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyAddon150Mark"))
				{
					AppVerification.VerifyElement(MI.Addon150Mark,"Check mark for 150 Renewable is not found");
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRenewableBtn"))
				{
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.DeactivateTxt[General.LanguageID], "Button name is not Deactivate"); //Verify Renewable button is "Deactivate" afte subscription
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyOnDemandBtn"))
				{
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.RepurchaseTxt[General.LanguageID], "Button name is not Repurchase"); //Verify that button name is Repurchase
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySubscribeBtn"))
				{
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.SubscribeTxt[General.LanguageID], "Button name is not Subscribe"); //Verify that button name is Subscribe
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyAddon150"))
				{
					AppVerification.VerifyElement(MI.Addon150,"Check mark for 150 Renewable still exist");
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyDeactivationResponse"))
				{
					if(AppVerification.VerifyElement(MI.DeactivatingToss,"Deactivating Response is not found")) //Verify deactivating response from backend
						MI.Back.click(); //Back to MI screen 
				}
				//======================================On Demand Addon=======================================
				else if (ExcelSheetInit.KeywordAction.equals("PressOnDemand"))
				{
					MI.OnDemand.click(); //Choose on demand part for Addon bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify150OnDemandAddon"))
				{
					AppVerification.VerifyText(MI.OnDemandAddon150Txt[General.LanguageID],"Monthly add-on 5LE 150MB On Demand Bundle is not found in inquiry"); //Verify Monthly add-on 5LE 150MBs on demand in the inquiry
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			ExcelSheetInit.RowNumb++;
		}
	}
}
