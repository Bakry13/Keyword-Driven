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

public class MI_TimeBasedSubscriptionExecuter extends TestBase
{
	static int StartRow = ExcelSheetInit.LocateStart("StartOfTimeBasedSubscriptionTest"); //Starting row number of subscription test in the excel sheet
	//===================================Let's start subscription tests===================================================
	@Test
	public static void MITimeBasedSubscriptionTestActions() throws IOException, InterruptedException
	{	
		//AppInit(); General.PageFactoryObject(); //App Initializations
		//----------------------Here we will start to loop on test cases steps in the excel sheet-------------------
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
				//--------------------Time Based Weekly 50 MB Subscription and Deactivation Test-------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressTimeBased"))
				{
					Thread.sleep(1000);
					General.ScrollAndFind(MI.TimeBasedTxt[General.LanguageID]).click(); //Press on time based bundles
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
				else if (ExcelSheetInit.KeywordAction.equals("VerifyWeeklyBundle2LE"))
				{
					AppVerification.VerifyText(MI.Weekly50Txt[General.LanguageID],"Weekly Internet Bundle 2LE is not found"); //Verify Weekly Internet Bundle 2LE in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyWeeklyBundle2LEMBs"))
				{
					AppVerification.VerifyText(MI.Remaining50Txt[General.LanguageID],"Weekly Internet Bundle 2LE MBs are not 50MB"); //Verify Weekly Internet Bundle 2LE has 50MBs in inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify50RenewableMark"))
				{
					AppVerification.VerifyElement(MI.Renewable50Mark,"Check mark is not found in super Weekly bundle 50MB");//Verify Super pass 500MB social check mark
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
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.RepurchaseTxt[General.LanguageID], "Button name is not subscribe"); //Verify that button name is subscribe
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySubscribeBtn"))
				{
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.SubscribeTxt[General.LanguageID], "Button name is not Subscribe"); //Verify that button name is Subscribe
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRenewable50"))
				{
					AppVerification.VerifyElement(MI.Renewable50,"Check mark for 50 Renewable still exist"); //Verify SuperPass 500MB renewable has not check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressBack"))
				{
					MI.Back.click(); //Go Back
				}
				//---------------------------Time Based Houly 10MB Subscription and deactivation Test------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressHourly"))
				{
					MI.Hourly.click(); //Press on Hourly
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify10Hourly"))
				{
					AppVerification.VerifyText(MI.Hour10Txt[General.LanguageID],"Hourly 10MB is not found"); //Verify Hourly 10MB in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify10HourlyMBs"))
				{
					AppVerification.VerifyText(MI.Remaining10Txt[General.LanguageID],"Hourly 0.75LE MBs are not 10MB"); //VerifyHourly 0.75LE MBs has 10MBs in inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify10HourlyMark"))
				{
					AppVerification.VerifyElement(MI.Hourly10Mark,"Check mark is not found in Hourly bundle 10MB");//Verify Hourly 10MB check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyHourly10"))
				{
					AppVerification.VerifyElement(MI.Hourly10,"Check mark for 10MB Hourly still exist"); //Verify Hourly 10MB has not check mark
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			ExcelSheetInit.RowNumb++;
		}
	}
}
