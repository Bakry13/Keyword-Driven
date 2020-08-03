package VodafoneEgypt.AnaVodafone;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import VodafoneEgypt.AnaVodafone.PageFactory.General;

public class ExtentReport extends TestBase
{
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@BeforeSuite
	public void StartReport() 
	{
		extent = new ExtentReports(System.getProperty("user.dir") + "/Reports/Extent_Report.html");
	}

	@AfterSuite
	public void EndReport()
	{
		extent.flush();
		extent.close();
	}
	
	public static void StartEndTC(String KeywordAction, int StartRow)
	{
		//------------------------------------Test cases start and end in report-------------------------------------
		try {
			if (KeywordAction.equals("StartOfTC") || KeywordAction.equals("EndOfTest"))
			{
				if (ExcelSheetInit.RowNumb != StartRow) // if it is not the first test case we will end the previous one
				{
					//Screenshot.SaveScreenshot(driver, ExcelSheetInit.TCName); //Saving screenshot in the directory and in the extent report after every test case
					extent.endTest(test); //close the test case in extent report
				}
				if ((KeywordAction.equals("StartOfTC")))// if it is not the last test case we will start the next one
				{
					ExcelSheetInit.TCNumber = Integer.toString(ExcelSheetInit.TCNumb++); //Counting test case number
					ExcelSheetInit.TCName = ExcelSheetInit.TCNumber + "-" + Excel.read(ExcelSheetInit.RowNumb+1, ExcelSheetInit.TCNameColumnNumb) + "_" + General.Language[General.LanguageID]; //store test case name with the language
					test = extent.startTest(ExcelSheetInit.TCName); //Test Case name in extent report
				}
				if ((KeywordAction.equals("EndOfTest")))// if it is the end of the test
				{
					ExcelSheetInit.RowNumb--; //return to "EndOfTest" row
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
