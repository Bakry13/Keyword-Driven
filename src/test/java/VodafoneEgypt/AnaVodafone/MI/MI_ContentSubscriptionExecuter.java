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

public class MI_ContentSubscriptionExecuter extends TestBase
{
	static int StartRow = ExcelSheetInit.LocateStart("StartOfContentSubscriptionTest"); //Starting row number of subscription test in the excel sheet
	//===================================Let's start subscription tests===================================================
	@Test
	public static void MIContentSubscriptionTestActions() throws IOException, InterruptedException
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
				//=====================Content Social Subscription and Deactivation Test===========================
				else if (ExcelSheetInit.KeywordAction.equals("PressContent"))
				{
					Thread.sleep(1000);
					General.ScrollAndFind(MI.ContenTxt[General.LanguageID]).click(); //Press on Content bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("ScrollTo500Renewable"))
				{
					General.ScrollAndFind(MI.Renewable500Txt[General.LanguageID]).click();
				}
				else if (ExcelSheetInit.KeywordAction.equals("ScrollTo500OnDemand"))
				{
					General.ScrollAndFind(MI.OnDemand500Txt[General.LanguageID]).click();
				}
				else if (ExcelSheetInit.KeywordAction.equals("ScrollTo1000Renewable"))
				{
					General.ScrollAndFind(MI.Renewable1000Txt[General.LanguageID]).click();
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
				//---------------------------------On Demand content bundle-------------------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressThirdBundleSubscribe"))
				{
					MI.ThirdBundleSubscribe.click(); //Subscribe in the Third bundle (500 MB on demand)
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify500OnDemandSocial"))
				{
					AppVerification.VerifyText(MI.OnDemandSocial500Txt[General.LanguageID],"Monthly On Demand Social content bundle is not found"); //Monthly On Demand Social content bundle in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify500OnDemandMark"))
				{
					AppVerification.VerifyElement(MI.OnDemand500Mark,"Check mark is not found in 500MB On demand bundle");//Verify 500MB on demand bundle check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyOnDemandBtn"))
				{
					AppVerification.VerifyElementText(MI.ThirdBundleSubscribe,MI.RepurchaseTxt[General.LanguageID], "Button name is not Repurchase"); //Verify that button name is Repurchase
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySubscribeBtn"))
				{
					AppVerification.VerifyElementText(MI.ThirdBundleSubscribe,MI.SubscribeTxt[General.LanguageID], "Button name is not subscribe"); //Verify that button name is subscribe
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyOnDemand500"))
				{
					AppVerification.VerifyElement(MI.OnDemand500,"Check mark for 500 Renewable still exist"); //Verify 500MB on demand has not check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify500MBs"))
				{
					AppVerification.VerifyText(MI.Remaining500Txt[General.LanguageID],"Bundle MBs are not 500MB"); //Verify that bundle has 50MBs in inquiry
				}
				//------------------------------------------Renewable Content--------------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressFourthBundleSubscribe"))
				{
					MI.FourthBundleSubscribe.click(); //Subscribe in the Fourth bundle (500 MB Renewable)
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify500RenewableSocial"))
				{
					AppVerification.VerifyText(MI.RenewableSocial500Txt[General.LanguageID],"Monthly Renewable Social content bundle is not found"); //Monthly On Demand Social content bundle in the inquiry
				}
				
				else if (ExcelSheetInit.KeywordAction.equals("Verify500RenewableMark"))
				{
					AppVerification.VerifyElement(MI.Renewable500Mark,"Check mark is not found in 500MB Renewable bundle");//Verify 500MB renewable bundle check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRenewableBtn"))
				{
					General.ScrollAndFind(MI.DeactivateTxt[General.LanguageID]).isDisplayed();
					AppVerification.VerifyElementText(MI.FourthBundleSubscribe,MI.DeactivateTxt[General.LanguageID], "Button name is not Deactivate");; //Verify renewable Button script
				}	
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRenewable500"))
				{
					AppVerification.VerifyElement(MI.Renewable500,"Check mark for 500 Renewable still exist"); //Verify 500MB renewable has not check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyDeactivationResponse"))
				{
					if(AppVerification.VerifyElement(MI.DeactivatingToss,"Deactivating Response is not found")) //Verify deactivating response from backend
						MI.Back.click(); //Back to MI screen
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressBack"))
				{
					MI.Back.click(); //Go Back
				}
				//=========================================Content Streaming=========================================
				else if (ExcelSheetInit.KeywordAction.equals("PressStreaming"))
				{
					MI.StreamingContent.click(); //Press on Streaming
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressStreamingPost"))
				{
					MI.StreamingContentPost.click(); //Press on Streaming
				}
				//---------------------------------On Demand content bundle-------------------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("Verify1000OnDemandStreaming"))
				{
					AppVerification.VerifyText(MI.OnDemandVideo1000Txt[General.LanguageID],"Monthly On Demand Streaming content bundle is not found"); //Monthly On Demand Streaming content bundle in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify1000OnDemandMark"))
				{
					AppVerification.VerifyElement(MI.OnDemand1000Mark,"Check mark is not found in 1000MB On demand bundle");//Verify 1000MB on demand bundle check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyOnDemand1000"))
				{
					AppVerification.VerifyElement(MI.OnDemand1000,"Check mark for 1000 Renewable still exist"); //Verify 1000MB on demand has not check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify750MBs"))
				{
					AppVerification.VerifyText(MI.Remaining750Txt[General.LanguageID],"First video quota MBs of Content streaming are not 750MB"); //Verify that bundle has 750MBs in inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify250MBs"))
				{
					AppVerification.VerifyText(MI.Remaining250Txt[General.LanguageID],"Second video quota MBs of Content streaming are not 250MB"); //Verify that bundle has 250MBs in inquiry
				}
				//------------------------------------------Renewable Content--------------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("Verify1000RenewableStreaming"))
				{
					AppVerification.VerifyText(MI.RenewableVideo1000Txt[General.LanguageID],"Monthly Renewable Streaming content bundle is not found"); //Monthly On Demand Social content bundle in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("Verify1000RenewableMark"))
				{
					AppVerification.VerifyElement(MI.Renewable1000Mark,"Check mark is not found in 1000MB Renewable bundle");//Verify 1000MB renewable bundle check mark
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRenewable1000"))
				{
					AppVerification.VerifyElement(MI.Renewable1000,"Check mark for 1000 Renewable still exist"); //Verify 1000MB renewable has not check mark
				}
				//=========================================Content Music=========================================
				else if (ExcelSheetInit.KeywordAction.equals("PressMusic"))
				{
					MI.Music.click(); //Press on Music
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressMusicPost"))
				{
					MI.MusicPost.click(); //Press on Music
				}
				//---------------------------------On Demand content bundle----------------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("Verify500OnDemandMusic"))
				{
					AppVerification.VerifyText(MI.OnDemandMusic500Txt[General.LanguageID],"Monthly On Demand Music content bundle is not found"); //Monthly On Demand Music content bundle in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyOnDemandMusicBtn"))
				{
					General.ScrollAndFind(MI.RepurchaseTxt[General.LanguageID]).isDisplayed();
					AppVerification.VerifyElementText(MI.FourthBundleSubscribe, MI.RepurchaseTxt[General.LanguageID], "Button name is not Repurchase"); //Verify that button name is Repurchase
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyOnDemandSocialBtn"))
				{
					AppVerification.VerifyElementText(MI.ThirdBundleSubscribe, MI.RepurchaseTxt[General.LanguageID], "Button name is not Repurchase"); //Verify that button name is Repurchase
				}
				//------------------------------------------Renewable Content--------------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("Verify500RenewableMusic"))
				{
					AppVerification.VerifyText(MI.RenewableMusic500Txt[General.LanguageID],"Monthly Renewable Music content bundle is not found"); //Monthly Renewable Music content bundle in the inquiry
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyRenewableMusicBtn"))
				{
					AppVerification.VerifyElementText(MI.ThirdBundleSubscribe,MI.DeactivateTxt[General.LanguageID], "Button name is not Deactivate");; //Verify renewable Button script
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySubscribeMusicBtn"))
				{
					AppVerification.VerifyElementText(MI.ThirdBundleSubscribe,MI.SubscribeTxt[General.LanguageID], "Button name is not Subscribe");; //Verify Subscribe Button script
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySubscribeSocialBtn"))
				{
					General.ScrollAndFind(MI.RepurchaseTxt[General.LanguageID]).isDisplayed();
					AppVerification.VerifyElementText(MI.FourthBundleSubscribe,MI.SubscribeTxt[General.LanguageID], "Button name is not Subscribe");; //Verify Subscribe Button script
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			ExcelSheetInit.RowNumb++;
		}
	}
}
