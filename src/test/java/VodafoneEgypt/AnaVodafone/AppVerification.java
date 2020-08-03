package VodafoneEgypt.AnaVodafone;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.LogStatus;
import VodafoneEgypt.AnaVodafone.PageFactory.General;

public class AppVerification 
{
	public static boolean FailureFlag = false;
	//--------------------------------Verify if a certain element exists----------------------------------------
	public static boolean VerifyElement(WebElement Element, String FailureText) throws IOException
	{
		try
		{
			assert Element.isDisplayed(); //find if the element is displayed
			
			ExtentReport.test.log(LogStatus.PASS, Excel.read(ExcelSheetInit.RowNumb, ExcelSheetInit.ER_ColumnNumb)); //Record expected result
			FailureFlag = false;
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, FailureText); //Write failure statement
			FailureFlag = true;
			e.printStackTrace();
		}
		return FailureFlag;
	}
	//--------------------------------Verify if a certain Text exists----------------------------------------
	public static boolean VerifyText(String ElementText, String FailureText) throws IOException
	{
		try
		{
			assert General.ScrollAndFind(ElementText).isDisplayed(); //find if the element is displayed
			
			ExtentReport.test.log(LogStatus.PASS, Excel.read(ExcelSheetInit.RowNumb, ExcelSheetInit.ER_ColumnNumb)); //Record expected result
			FailureFlag = false;
		} catch (Exception e) 
		{
			ExtentReport.test.log(LogStatus.FAIL, FailureText); //Write failure statement
			FailureFlag = true;
			e.printStackTrace();
		}
		return FailureFlag;
	}
	//-------------------------------Verify the correctness of text of a certain element------------------------------
	public static boolean VerifyElementText(WebElement Element, String ElementText, String FailureText) throws IOException
	{		
		if(Element.getText().equals(ElementText))
		{  
			ExtentReport.test.log(LogStatus.PASS, Excel.read(ExcelSheetInit.RowNumb, ExcelSheetInit.ER_ColumnNumb)); //Record expected result
			FailureFlag = false;
		}
		else
		{  
			ExtentReport.test.log(LogStatus.FAIL, FailureText); //Write failure statement
			FailureFlag = true;  
		}
		return FailureFlag;
	}
}
