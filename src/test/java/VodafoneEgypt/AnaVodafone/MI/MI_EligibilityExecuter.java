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

public class MI_EligibilityExecuter extends TestBase
{
	static int StartRow = ExcelSheetInit.LocateStart("StartOfEligibilityTest"); //Starting row number of subscription test in the excel sheet
	//===================================Let's start subscription tests===================================================
	@Test
	public static void MIEligibilityTestActions() throws IOException, InterruptedException
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
				if (ExcelSheetInit.KeywordAction.equals("TakeScreenshot"))
				{
					Screenshot.SaveScreenshot(driver, ExcelSheetInit.Data); //Saving screenshot in the directory and in the extent report
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyMI"))
				{  
				    if(AppVerification.VerifyElement(MI.MiPage,"MI screen is not opened")) //Verify MI screen
				    	MI_FailureRecovery.CloseAndOpenMI(ExcelSheetInit.MSISDNValue, ExcelSheetInit.PasswordValue); //Close and to MI page again in case of failure
				}
				//---------------------------------------Extreme Bundles Eligibility--------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressExtreme"))
				{
					General.ScrollAndFind(MI.ExtremeBundlesTxt[General.LanguageID]).click(); //Press on extreme bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyExtremeEligibility"))
				{
					MI_EligibilityVerification.VerifyExtremeEligibility(); //Verify on eligible Extreme bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressBack"))
				{
					MI.Back.click(); //Verify on eligible Extreme bundles
				}
				//---------------------------------------Extreme Net Eligibility----------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressExtremeNet"))
				{
					General.ScrollAndFind(MI.ExtremeNetTxt[General.LanguageID]).click(); //Press on extreme Net
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyExtremeNetEligibility"))
				{
					MI_EligibilityVerification.VerifyExtremeNetEligibility(); //Verify on eligible Extreme bundles
				}
				//---------------------------------------Super Pass Eligibility----------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressSuperPass"))
				{
					General.ScrollAndFind(MI.SuperPassTxt[General.LanguageID]).click(); //Press on Super Pass bundles 
					Thread.sleep(1000);
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifySuperPassEligibility"))
				{
					MI_EligibilityVerification.VerifySuperPassEligibility(); //Verify on eligible Extreme bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressStreaming"))
				{
					MI.Streaming.click(); //Choose super streaming part from super pass bundles
				}
				//---------------------------------------Time Based Eligibility----------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressTimeBased"))
				{
					General.ScrollAndFind(MI.TimeBasedTxt[General.LanguageID]).click(); //Press on time based bundles
					Thread.sleep(1000);
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyWeeklyEligibility"))
				{
					MI_EligibilityVerification.VerifyWeeklyEligibility(); //Verify on Weekly time based bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressHourly"))
				{
					MI.Hourly.click();; //Choose Hourly part for time based bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyHourlyEligibility"))
				{
					MI_EligibilityVerification.VerifyHourlyEligibility(); //Verify on Hourly time based bundles
				}
				//---------------------------------------Content Eligibility----------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressContent"))
				{
					General.ScrollAndFind(MI.ContenTxt[General.LanguageID]).click(); //Press on Content bundles
					Thread.sleep(1000);
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyContentSocialPreEligibility"))
				{
					MI_EligibilityVerification.VerifyContentSocialPreEligibility(); //Verify on content social bundles for prepaid rate plans
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressStreamingContent"))
				{
					MI.StreamingContent.click(); //Choose content streaming part from super pass bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressMusic"))
				{
					MI.Music.click(); //Choose Music part for content bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyContentStreamingPreEligibility"))
				{
					MI_EligibilityVerification.VerifyContentStreamingPreEligibility(); //Verify on content Streaming bundles for prepaid rate plans
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyContentMusicPreEligibility"))
				{
					MI_EligibilityVerification.VerifyContentMusicPreEligibility(); //Verify on content Music bundles for prepaid rate plans
				}
				//---------------------------------content for postpaid---------------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("VerifyContentSocialPostEligibility"))
				{
					MI_EligibilityVerification.VerifyContentSocialPostEligibility(); //Verify on content social bundles for postpaid rate plans
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyContentStreamingPostEligibility"))
				{
					MI_EligibilityVerification.VerifyContentStreamingPostEligibility(); //Verify on content Streaming bundles for postpaid rate plans
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyContentMusicPostEligibility"))
				{
					MI_EligibilityVerification.VerifyContentMusicPostEligibility(); //Verify on content Music bundles for postpaid rate plans
				}
				//---------------------------------------Addon Eligibility----------------------------------
				else if (ExcelSheetInit.KeywordAction.equals("PressAddon"))
				{
					//MI.AddOns.click(); //Press on Add-Ons bundles
					General.ScrollHorizontal(MI.BundleResourceId, MI.BundleClass, "Add-Ons").click();
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyAddonPreEligibility"))
				{
					MI_EligibilityVerification.VerifyAddonPreEligibility(); //Verify on adon bundles for prepaid rate plans
				}
				else if (ExcelSheetInit.KeywordAction.equals("PressOnDemand"))
				{
					MI.OnDemand.click(); //Choose on demand part for Addon bundles
				}
				else if (ExcelSheetInit.KeywordAction.equals("VerifyNoAddonEligibility"))
				{
					AppVerification.VerifyElement(MI.NoEligibleAddon, "(No Eligible Bundles for you) text is not displayed"); //Verify on addon when there is not eligible addons for prepaid rate plans
				}
				//---------------------------------Addon Eligibility for postpaid---------------------------
				else if (ExcelSheetInit.KeywordAction.equals("VerifyAddonPostEligibility"))
				{
					MI_EligibilityVerification.VerifyAddonPostEligibility(); //Verify on adon bundles for postpaid rate plans
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			ExcelSheetInit.RowNumb++;
		}
	}
}
