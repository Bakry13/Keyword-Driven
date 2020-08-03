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

public class MI_SuperPassSubscriptionExecuter extends TestBase
{
	static int StartRow = ExcelSheetInit.LocateStart("StartOfSuperPassSubscriptionTest"); //Starting row number of subscription test in the excel sheet
	//===================================Let's start subscription tests===================================================
	@Test
	public static void MISuperPassSubscriptionTestActions() throws IOException, InterruptedException
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
				//------------------------------------------Take screenshot----------------------------------------
				if (ExcelSheetInit.KeywordAction.equals("TakeScreenshot"))
				{
					Screenshot.SaveScreenshot(driver, ExcelSheetInit.Data); //Saving screenshot in the directory and in the extent report
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyMI"))
				{  
				    if(AppVerification.VerifyElement(MI.MiPage,"MI screen is not opened")) //Verify MI screen
				    	MI_FailureRecovery.CloseAndOpenMI(ExcelSheetInit.MSISDNValue, ExcelSheetInit.PasswordValue); //Close and to MI page again in case of failure
				}
				//---------------------------Super Pass 500 MB social Subscription Test----------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressSuperPass"))
				{
					Thread.sleep(1000);
					General.ScrollAndFind(MI.SuperPassTxt[General.LanguageID]).click(); //Press on Super Pass bundles 
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressFirstBundleSubscribe"))
				{
					MI.FirstBundleSubscribe.click(); //Subscribe in in the first bundle (500 MB Renewable)
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressSecondBundleSubscribe"))
				{
					MI.SecondBundleSubscribe.click(); //Subscribe in in second bundle
				}
				else if (ExcelSheetInit.KeywordAction.equals("ConfirmSubscription"))
				{
					MI.ConfirmBtn.click(); //Press on confirm for subscription
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySuccessResponse"))
				{
					if(AppVerification.VerifyElement(MI.SuccessToss,"Success response is not found")) //Verify success response from backend
						MI.Back.click(); //Back to MI screen
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyFailResponse"))
				{
					AppVerification.VerifyElement(MI.FailToss,"Fail Response is not found"); //Verify Fail response from backend
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify500SocialRenewable"))
				{
					AppVerification.VerifyText(MI.SuperSocial500Txt[General.LanguageID],"Super Social 500 is not found"); //Verify Super pass 500MB social Renewable in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySuper500RenewableMBs"))
				{
					AppVerification.VerifyText(MI.RemainingSuper500Txt[General.LanguageID],"Super Social MBs are not 500Mega"); //Verify Super pass 500MB social Renewable in the inquiry has 500MBs in inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify500RenewableMark"))
				{
					AppVerification.VerifyElement(MI.RenewableSuper500Mark,"Check mark is not found in super social 500MB");//Verify Super pass 500MB social check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRenewableBtn"))
				{
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.DeactivateTxt[General.LanguageID], "Button name is not Deactivate");; //Verify Super pass 500MB social Button script
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyDeactivationResponse"))
				{
					if(AppVerification.VerifyElement(MI.DeactivatingToss,"Deactivating Response is not found")) //Verify deactivating response from backend
						MI.Back.click(); //Back to MI screen
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyOnDemandBtn"))
				{
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.RepurchaseTxt[General.LanguageID], "Button name is not Repurchase"); //Verify that button name is Repurchase
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySubscribeBtn"))
				{
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.SubscribeTxt[General.LanguageID], "Button name is not Subscribe"); //Verify that button name is Subscribe
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRenewable500"))
				{
					AppVerification.VerifyElement(MI.RenewableSuper500,"Check mark for 500 Renewable still exist"); //Verify SuperPass 500MB renewable has not check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressBack"))
				{
					MI.Back.click(); //Go Back
				}
				//---------------------------Super Pass 500 Streaming Subscription and deactivation Test------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressStreaming"))
				{
					MI.Streaming.click(); //Press on Super streaming
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify500StreamingRenewable"))
				{
					AppVerification.VerifyText(MI.SuperStreaming500Txt[General.LanguageID],"Super Streaming 500 is not found"); //Verify Super pass 500MB social Renewable in the inquiry
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			ExcelSheetInit.RowNumb++;
		}
	}
}
