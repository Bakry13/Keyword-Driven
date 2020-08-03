package VodafoneEgypt.AnaVodafone.Logout;

import VodafoneEgypt.AnaVodafone.TestBase;
import VodafoneEgypt.AnaVodafone.PageFactory.Logout;
import VodafoneEgypt.AnaVodafone.PageFactory.Menu;

public class HomeValidLogout 
{
	public static void LogoutAction() //LogoutFunction
	{
		Menu.MenuBtn.click();
		Menu.Logout.click();
		Logout.LogoutOKBtn.click();
	}
}
