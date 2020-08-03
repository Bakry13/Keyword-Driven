package VodafoneEgypt.AnaVodafone.Logout;

import VodafoneEgypt.AnaVodafone.TestBase;
import VodafoneEgypt.AnaVodafone.PageFactory.General;
import VodafoneEgypt.AnaVodafone.PageFactory.Logout;
import VodafoneEgypt.AnaVodafone.PageFactory.MI;
import VodafoneEgypt.AnaVodafone.PageFactory.Menu;

public class ValidLogout  extends TestBase
{	
	public static void LogoutAction() //LogoutFunction
	{
		MI.MenuBTN.click(); 
		General.ScrollAndFind(Menu.LogoutTxt[General.LanguageID]).click();
		Logout.LogoutOKBtn.click();
	}
}
