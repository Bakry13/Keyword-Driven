package VodafoneEgypt.AnaVodafone;

import java.io.IOException;

import org.testng.annotations.Test;

import VodafoneEgypt.AnaVodafone.Login.ValidScenarios;
import VodafoneEgypt.AnaVodafone.MI.MI_AddonSubscriptionExecuter;
import VodafoneEgypt.AnaVodafone.MI.MI_AfterBundleOptionsExecuter;
import VodafoneEgypt.AnaVodafone.MI.MI_ContentSubscriptionExecuter;
import VodafoneEgypt.AnaVodafone.MI.MI_EligibilityExecuter;
import VodafoneEgypt.AnaVodafone.MI.MI_InquiryExecuter;
import VodafoneEgypt.AnaVodafone.MI.MI_SubscriptionExecuter;
import VodafoneEgypt.AnaVodafone.MI.MI_SuperPassSubscriptionExecuter;
import VodafoneEgypt.AnaVodafone.MI.MI_TimeBasedSubscriptionExecuter;
import VodafoneEgypt.AnaVodafone.PageFactory.General;

public class AppExecuter extends TestBase
{
	//======================================All app tests===================================================
	@Test
	public void AppTests() throws IOException, InterruptedException
	{	
		AppInit(); //App Initializations
		General.PageFactoryObject(); //Initializing page factory objects
		//ValidScenarios.PressAllow(); //Press on allow button in case app installation
		//----------------------Here we will start to loop on test cases steps in the excel sheet---------------------
		while (!(ExcelSheetInit.KeywordAction.equals("EndOfAllTests"))) //loop on steps  KeywordAction != "EndOfAllTests"
		{
			try {
				ExcelSheetInit.KeywordAction = Excel.read(ExcelSheetInit.RowNumb, ExcelSheetInit.ColumnNumb); //Read Keyword action for each step
				System.out.println(ExcelSheetInit.KeywordAction);		
				//---------------------------------------------------------------------------------------------------
				if (ExcelSheetInit.KeywordAction.equals("CheckLanguage"))
				{
					ValidScenarios.CheckLanguage(); //Check that start language is English
				}
				else if (ExcelSheetInit.KeywordAction.equals("StartOfSubscriptionTest"))
				{
					MI_SubscriptionExecuter.MISubscriptionTestActions(); //MI Subscription Executer
				}
				else if (ExcelSheetInit.KeywordAction.equals("StartOfEligibilityTest"))
				{
					MI_EligibilityExecuter.MIEligibilityTestActions(); //Eligibility executer
				}
				else if (ExcelSheetInit.KeywordAction.equals("StartOfSuperPassSubscriptionTest"))
				{
					MI_SuperPassSubscriptionExecuter.MISuperPassSubscriptionTestActions(); //Super Pass subscription executer
				}
				else if (ExcelSheetInit.KeywordAction.equals("StartOfTimeBasedSubscriptionTest"))
				{
					MI_TimeBasedSubscriptionExecuter.MITimeBasedSubscriptionTestActions(); //Time Based subscription executer
				}
				else if (ExcelSheetInit.KeywordAction.equals("StartOfContentSubscriptionTest"))
				{
					MI_ContentSubscriptionExecuter.MIContentSubscriptionTestActions(); //Content subscription executer
				}
				else if (ExcelSheetInit.KeywordAction.equals("StartOfAfterBundleOptionsTest"))
				{
					MI_AfterBundleOptionsExecuter.MISubscriptionTestActions(); //After Bundle Options Executer
				}
				else if (ExcelSheetInit.KeywordAction.equals("StartOfAddonSubscriptionTest"))
				{
					MI_AddonSubscriptionExecuter.MIAddonSubscriptionTestActions(); //Content subscription executer
				}
				else if (ExcelSheetInit.KeywordAction.equals("StartOfInquiryTest"))
				{
					MI_InquiryExecuter.MIInquiryTestActions(); //inquiry executer
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			ExcelSheetInit.RowNumb++;
		}
	}
}