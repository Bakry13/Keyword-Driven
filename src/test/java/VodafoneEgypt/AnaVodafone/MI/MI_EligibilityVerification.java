package VodafoneEgypt.AnaVodafone.MI;

import java.io.IOException;

import com.relevantcodes.extentreports.LogStatus;

import VodafoneEgypt.AnaVodafone.Excel;
import VodafoneEgypt.AnaVodafone.ExcelSheetInit;
import VodafoneEgypt.AnaVodafone.ExtentReport;
import VodafoneEgypt.AnaVodafone.PageFactory.General;
import VodafoneEgypt.AnaVodafone.PageFactory.MI;
import VodafoneEgypt.AnaVodafone.PageFactory.Menu;

public class MI_EligibilityVerification extends MI_EligibilityExecuter 
{
	//===========================Verify On Eligible bundles in Extreme Bundles (Red) screen===========================
	public static void VerifyExtremeEligibility() throws IOException
	{
		try
		{	assert General.ScrollAndFind(MI.OnDemand1800Txt[General.LanguageID]).isDisplayed(); //find On demand Extreme 1800MB bundle
			ExtentReport.test.log(LogStatus.PASS, "Extreme 1800MB on demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 1800MB on demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.OnDemand2500Txt[General.LanguageID]).isDisplayed(); //find On demand Extreme 2500MB bundle
			ExtentReport.test.log(LogStatus.PASS, "Extreme 2500MB on demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 2500MB on demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.OnDemand4000Txt[General.LanguageID]).isDisplayed(); //find On demand Extreme 4000MB bundle
			ExtentReport.test.log(LogStatus.PASS, "Extreme 4000MB on demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 4000MB on demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.OnDemand5000Txt[General.LanguageID]).isDisplayed(); //find On demand Extreme 5000MB bundle
			ExtentReport.test.log(LogStatus.PASS, "Extreme 5000MB on demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 5000MB on demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.OnDemand8000Txt[General.LanguageID]).isDisplayed(); //find On demand Extreme 8000MB bundle
			ExtentReport.test.log(LogStatus.PASS, "Extreme 8000MB on demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 8000MB on demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.OnDemand12000Txt[General.LanguageID]).isDisplayed(); //find On demand Extreme 12000MB bundle
			ExtentReport.test.log(LogStatus.PASS, "Extreme 12000MB on demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 12000MB on demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.OnDemand20000Txt[General.LanguageID]).isDisplayed(); //find On demand Extreme 20000MB bundle
			ExtentReport.test.log(LogStatus.PASS, "Extreme 20000MB on demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 20000MB on demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.OnDemand40000Txt[General.LanguageID]).isDisplayed(); //find On demand Extreme 40000MB bundle
			ExtentReport.test.log(LogStatus.PASS, "Extreme 40000MB on demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 40000MB on demand bundle does not exist");
		}
	}
	//===========================Verify On Eligible bundles in Extreme Net Bundles===========================
	public static void VerifyExtremeNetEligibility() throws IOException
	{
		try
		{	assert General.ScrollAndFind(MI.Renewable150Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 150 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 150 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.Renewable500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 500 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 500 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable1100Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 1100 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 1100 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.Renewable1800Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 1800 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 1800 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable2500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 2500 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 2500 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable4000Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 4000 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 4000 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable6000Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 6000 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 6000 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.Renewable8000Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 8000 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 8000 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable12000Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 12000 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 12000 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable20000Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 20000 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 20000 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable40000Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Extreme 40000 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Extreme 40000 MB Renewable bundle does not exist");
		}
	}
	//===========================Verify On Eligible bundles in Super Pass screen===========================
	public static void VerifySuperPassEligibility() throws IOException
	{
		try
		{	assert General.ScrollAndFind(MI.RenewableSuper500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Super 500 SuperMega Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Super 500 SuperMega Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.RenewableSuper1500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Super 1500 SuperMega Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Super 1500 SuperMega Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.RenewableSuper2800Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Super 2800 SuperMega Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Super 2800 SuperMega Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.RenewableSuper4500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Super 4500 SuperMega Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Super 4500 SuperMega Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.RenewableSuper6000Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Super 6000 SuperMega Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Super 6000 SuperMega Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.RenewableSuper9500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Super 9500 SuperMega Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Super 9500 SuperMega Renewable bundle does not exist");
		}
	}
	//===========================Verify On Eligible bundles in Weekly time Based screen===========================
	public static void VerifyWeeklyEligibility() throws IOException
	{
		try
		{	assert General.ScrollAndFind(MI.Renewable50Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Time Based Weekly 150 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Time Based Weekly 150 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.Renewable100Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Time Based Weekly 100 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Time Based Weekly 100 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable350Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Time Based Weekly 350 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Time Based Weekly 350 MB Renewable bundle does not exist");
		}
	}
	//===========================Verify On Eligible bundles in Hourly time Based screen===========================
	public static void VerifyHourlyEligibility() throws IOException
	{
		try
		{	assert General.ScrollAndFind(MI.Hourly10Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Time Based Hourly 10 MB bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Time Based Hourly 10 MB bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.Hourly30Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Time Based Hourly 30 MB bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Time Based Hourly 30 MB bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Hourly60Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Time Based Hourly 60 MB bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Time Based Hourly 60 MB bundle does not exist");
		}
	}
	//------------------------Verify on content bundles for prepaid rate plans---------------------------------
	//===========================Verify On Eligible bundles in Content Social screen===========================
	public static void VerifyContentSocialPreEligibility() throws IOException
	{
		try
		{	assert General.ScrollAndFind(MI.OnDemand25Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Social 25 MB On demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Time Based Social 10 MB On demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.OnDemand100Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Social 100 MB On demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Social 100 MB On demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.OnDemand500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Social 500 MB On demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Social 500 MB On demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Social 500 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Social 500 MB Renewable bundle does not exist");
		}
	}
	//===========================Verify On Eligible bundles in Content Streaming screen===========================
	public static void VerifyContentStreamingPreEligibility() throws IOException
	{
		try
		{	assert General.ScrollAndFind(MI.OnDemand120Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Streaming 120 MB On demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Time Based Streaming 120 MB On demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.OnDemand400Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Streaming 400 MB On demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Streaming 400 MB On demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.OnDemand1000Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Streaming 1000 MB On demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Streaming 1000 MB On demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable1000Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Streaming 1000 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Streaming 1000 MB Renewable bundle does not exist");
		}
	}
	//===========================Verify On Eligible bundles in Content Music screen===========================
	public static void VerifyContentMusicPreEligibility() throws IOException
	{
		try
		{	assert General.ScrollAndFind(MI.Renewable20Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Music 20 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Time Based Music 20 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	assert General.ScrollAndFind(MI.Renewable100Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Music 100 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Music 100 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Music 500 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Music 500 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.OnDemand500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Music 500 MB On demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Music 1000 MB Renewable bundle does not exist");
		}
	}
	//-------------------------------Verify on Content bundles for postpaid rate plans-------------------------
	//===========================Verify On Eligible bundles in Content Social screen===========================
	public static void VerifyContentSocialPostEligibility() throws IOException
	{
		try
		{	General.ScrollAndFind(MI.OnDemand500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Social 500 MB On demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Social 500 MB On demand bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.Renewable500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Social 500 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Social 500 MB Renewable bundle does not exist");
		}
	}
	//===========================Verify On Eligible bundles in Content Streaming screen===========================
	public static void VerifyContentStreamingPostEligibility() throws IOException
	{
		try
		{	General.ScrollAndFind(MI.Renewable1000Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Streaming 1000 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Streaming 1000 MB Renewable bundle does not exist");
		}
	}
	//===========================Verify On Eligible bundles in Content Music screen===========================
	public static void VerifyContentMusicPostEligibility() throws IOException
	{
		try
		{	General.ScrollAndFind(MI.Renewable500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Music 500 MB Renewable bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Music 500 MB Renewable bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.OnDemand500Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Content Music 500 MB On demand bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Content Music 500 MB Renewable bundle does not exist");
		}
	}
	//==============================Verify On Eligible bundles in Addon==================================
	//-----------------------------------------Addon for prepaid-----------------------------------------
	public static void VerifyAddonPreEligibility() throws IOException
	{
		try
		{	General.ScrollAndFind(MI.AddOn500SocialTxt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Addon 500 MB social bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Addon 500 MB social bundle does not exist");
		}
		//--------------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.AddOn1000VideoTxt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Addon 1000 MB video bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Addon 1000 MB video bundle does not exist");
		}
		//-------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.AddOn500MusicTxt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Addon 500 MB music bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Addon 500 MB music bundle does not exist");
		}
		//-------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.AddOn150Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Addon 150 MB bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Addon 150 MB bundle does not exist");
		}
		//-------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.AddOn1024Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Addon 1024 MB bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Addon 1024 MB bundle does not exist");
		}
		//-------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.AddOnThrottleTxt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Addon Throttle bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Addon Throttle bundle does not exist");
		}
	}
	//-----------------------------------------Addon for postpaid-----------------------------------------
	public static void VerifyAddonPostEligibility() throws IOException
	{
		try
		{	General.ScrollAndFind(MI.AddOn150Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Addon 150 MB bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Addon 150 MB bundle does not exist");
		}
		//-------------------------------------------------------------------------------------------------------
		try
		{	General.ScrollAndFind(MI.AddOn1024Txt[General.LanguageID]).isDisplayed();
			ExtentReport.test.log(LogStatus.PASS, "Addon 1024 MB bundle exists"); //Record expected result
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, "Addon 1024 MB bundle does not exist");
		}
	}
}
