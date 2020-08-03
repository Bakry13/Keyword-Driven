package VodafoneEgypt.AnaVodafone;

import java.io.IOException;

public class ExcelSheetInit 
{
	public static String KeywordAction = "0"; //Keyword which we get from excel sheet
	public static String Data = "010"; //Data which we use from excel sheet
	public static int ColumnNumb = 3; //column number in excel sheet for keyword
	public static int DataColumnNumb = ColumnNumb+1; //Starting column number in excel sheet for data
	public static int ArabicDataColumnNumb = ColumnNumb+2; //Starting column number in excel sheet for Arabic data
	public static int ER_ColumnNumb = ColumnNumb+3;
	public static int TCNameColumnNumb = ColumnNumb-2; //Starting column number in excel sheet for test case name
	public static int RowNumb = 0;
	
	public static String TCName = "0";
	public static int TCNumb = 1;
	public static String TCNumber = "1";
	
	public static String MSISDNValue = "010"; //Current MSISDN under Test
	public static String PasswordValue = "Test@1234"; //Current password
	
	public static int LocateStart(String TestName)
	{
		//==============================Locating the value of row number for test executer================================
		try 
		{
			while(!KeywordAction.equals("EndOfTest"))
			{
				KeywordAction = Excel.read(RowNumb, ColumnNumb); //Read Keyword action
				if (KeywordAction.equals(TestName)) {RowNumb++; break;}
				RowNumb++;
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return RowNumb;
	}
}
