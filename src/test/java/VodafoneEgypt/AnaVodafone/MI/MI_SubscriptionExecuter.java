package VodafoneEgypt.AnaVodafone.MI;

import java.io.IOException;

import org.testng.annotations.Test;

import VodafoneEgypt.AnaVodafone.AppVerification;
import VodafoneEgypt.AnaVodafone.Excel;
import VodafoneEgypt.AnaVodafone.ExtentReport;
import VodafoneEgypt.AnaVodafone.PopupHandler;
import VodafoneEgypt.AnaVodafone.Screenshot;
import VodafoneEgypt.AnaVodafone.TestBase;
import VodafoneEgypt.AnaVodafone.Login.ValidScenarios;
import VodafoneEgypt.AnaVodafone.Logout.ValidLogout;
import VodafoneEgypt.AnaVodafone.PageFactory.General;
import VodafoneEgypt.AnaVodafone.PageFactory.Home;
import VodafoneEgypt.AnaVodafone.PageFactory.Login;
import VodafoneEgypt.AnaVodafone.PageFactory.MI;
import VodafoneEgypt.AnaVodafone.PageFactory.Menu;
import io.appium.java_client.android.AndroidKeyCode;
import VodafoneEgypt.AnaVodafone.ExcelSheetInit;

public class MI_SubscriptionExecuter extends TestBase
{	
	static int StartRow = ExcelSheetInit.LocateStart("StartOfSubscriptionTest"); //Starting row number of subscription test in the excel sheet
	//===================================Let's start subscription tests===================================================
	@Test
	public static void MISubscriptionTestActions() throws IOException, InterruptedException
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
				else if (ExcelSheetInit.KeywordAction.equals("Logout"))
				{
					ValidLogout.LogoutAction(); //Logout to login with different plan
				}
				else if (ExcelSheetInit.KeywordAction.equals("ChangeLanguage"))
				{
					ValidScenarios.ChangeLanguage();
				}
				else if (ExcelSheetInit.KeywordAction.equals("EnterMSISDN"))
				{
					ExcelSheetInit.MSISDNValue = ExcelSheetInit.Data; //Store current MSISDN under test
					Login.MSISDN.sendKeys(ExcelSheetInit.Data); //Enter MSISDN
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressProceed"))
				{
					Login.ProceedBtn.click(); //Press Proceed Button
				}
				else if (ExcelSheetInit.KeywordAction.equals("EnterPassword"))
				{
					ExcelSheetInit.PasswordValue = ExcelSheetInit.Data; //Store current password under test
					Login.Password.sendKeys(ExcelSheetInit.Data); //Enter password
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressSkip"))
				{
					Home.SkipId.click(); //Press skip for 400MB offer
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyHome"))
				{
					if(AppVerification.VerifyElement(Home.Logo,"Home screen is not detected")) //Verify Home screen
						PopupHandler.Rate(); //Handle rate pop up
				}
				//---------------------------------------------Open MI page----------------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("OpenMenu"))
				{
					Menu.MenuBtn.click(); //Click on menu button
				}      
				else if (ExcelSheetInit.KeywordAction.equals("OpenMI"))
				{  
					Thread.sleep(1000);
				    Menu.MobileInternet.click(); //Choose MI
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyMI"))
				{
				    if (AppVerification.VerifyElement(MI.MiPage,"MI screen is not opened")) //Verify MI screen
				    	MI_FailureRecovery.CloseAndOpenMI(ExcelSheetInit.MSISDNValue, ExcelSheetInit.PasswordValue); //Close and to MI page again in case of failure
				    else if (AppVerification.VerifyText(MI.Extreme[General.LanguageID],"MI screen is not loaded successfully due to backend error")) //Verify that MI is loaded successfully
				    	MI_FailureRecovery.RefreshMI();
				}
				//==============================Extreme 1800 On Demand Subscription Test===============================
				else if (ExcelSheetInit.KeywordAction.equals("PressExtreme"))
				{
					Thread.sleep(500);
					General.ScrollAndFind(MI.ExtremeBundlesTxt[General.LanguageID]).click(); //Press on extreme bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressFirstBundleSubscribe"))
				{
					MI.FirstBundleSubscribe.click(); //Subscribe in in the first bundle (1800 on demand in extreme)
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
					AppVerification.VerifyElement(MI.FailToss,"Fail Response is not found"); //Verify failure response from backend
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify1800OnDemand"))
				{
					AppVerification.VerifyText(MI.OnDemandExtreme1800Txt[General.LanguageID],"Extreme 1800MB on demand is not found in inquiry"); //Verify Extreme 1800 on demand in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify1800OnDemandMBs"))
				{
					AppVerification.VerifyText(MI.Remaining3600Txt[General.LanguageID],"Extreme 1800MB on demand MBs value is not 3600MBs after second subscription"); //Verify that Extreme 1800 on demand in the inquiry has 3600MBs in inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify1800OnDemandMark"))
				{
					AppVerification.VerifyElement(MI.OnDemand1800Mark,"Check mark for 1800 on demand not found"); //Verify Extreme 1800 on demand check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyOnDemandBtn"))
				{
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.RepurchaseTxt[General.LanguageID], "Button name is not Repurchase"); //Verify that button name is Repurchase
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySubscribeBtn"))
				{
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.SubscribeTxt[General.LanguageID], "Button name is not subscribe"); //Verify that button name is subscribe
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressBack"))
				{
					MI.Back.click(); //Go Back
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressCloseSubscription"))
				{
					MI.CloseBtn.click(); //Close subscription screen
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressCancelSubscription"))
				{
					MI.CancelBtn.click(); //Close subscription screen
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyExtremeScreen"))
				{
					driver.pressKeyCode(AndroidKeyCode.BACK); //Back to MI screen
					if(AppVerification.VerifyElement(MI.ExtremeBundles,"Pop up subsciption screen still exist")) //Verify Extreme bundles screen
				    	MI_FailureRecovery.CloseAndOpenMI(ExcelSheetInit.MSISDNValue, ExcelSheetInit.PasswordValue); //Close and to MI page again in case of failure
					Thread.sleep(1000); //wait until the page is loaded
				}
				//===============================Extreme 150 Renewable Subscription Test==============================
				else if (ExcelSheetInit.KeywordAction.equals("PressExtremeNet"))
				{
					Thread.sleep(500);
					General.ScrollAndFind(MI.ExtremeNetTxt[General.LanguageID]).click(); //Press on extreme Net
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify150RenewableMark"))
				{
					AppVerification.VerifyElement(MI.Renewable150Mark,"Check mark for 150 Renewable is not found"); //Verify Extreme Net screen
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRenewableBtn"))
				{
					AppVerification.VerifyElementText(MI.FirstBundleSubscribe,MI.DeactivateTxt[General.LanguageID], "Button name is not Deactivate"); //Verify Renewable button is "Deactivate" afte subscription
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify150Renewable"))
				{
					AppVerification.VerifyText(MI.RenewableExtreme150Txt[General.LanguageID],"Extreme Net 150MB Renewable Bundle is not found in inquiry"); //Verify Extreme 150 renewable in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify150RenewableMBs"))
				{
					AppVerification.VerifyText(MI.Remaining150Txt[General.LanguageID],"Extreme 150MB Renewable MBs value is not 1500MBs after subscription"); //Verify that Extreme 150 renewable in the inquiry has 150MBs in inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyDeactivationResponse"))
				{
					if(AppVerification.VerifyElement(MI.DeactivatingToss,"Deactivating Response is not found")) //Verify deactivating response from backend
						MI.Back.click(); //Back to MI screen 
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRenewable150"))
				{
					AppVerification.VerifyElement(MI.Renewable150,"Check mark for 150 Renewable still exist"); //Verify Extreme Net 150 renewable has not check mark
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			ExcelSheetInit.RowNumb++;
		}
	}
}

