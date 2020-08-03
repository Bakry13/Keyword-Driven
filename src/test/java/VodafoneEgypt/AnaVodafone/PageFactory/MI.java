package VodafoneEgypt.AnaVodafone.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import VodafoneEgypt.AnaVodafone.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MI extends TestBase
{
	//===========================================Mi page Strings=============================
	public static String BundleResourceId = "com.emeint.android.myservices:id/rvNavigator";
	public static String BundleClass = "android.view.ViewGroup";
	
	public static String[] Extreme = {"Extreme", "اكستريم"}; //اكستريم
	public static String[] RepurchaseTxt = {"Repurchase","اعادة شراء"};
	public static String[] SubscribeTxt = {"Subscribe","إشترك الأن"};
	public static String[] DeactivateTxt = {"Deactivate","إيقاف الباقة"};
	//-----------------------------------------Inquiry---------------------------------------
	public static String[] OnDemandExtreme1800Txt = {"On Demand Extreme Net Bundle 30LE 1800MB","باقة اكستريم نت الغير متجدده 30 ج"};
	public static String[] Remaining3600Txt = {"Remaining 3600MB From 3600MB","متبقي 3600ميجا من 3600ميجا"};
	
	public static String[] RenewableExtreme150Txt = {"Extreme Net Bundle 5LE 150MB","إكستريم نت 5ج 150MB"};
	public static String[] Remaining150Txt = {"Remaining 150MB From 150MB","متبقي 150ميجا من 150ميجا"};
	
	public static String[] SuperSocial500Txt = {"SuperPass Social 7LE 500 SuperMB","باقةSuperPassسوشيال7ج-500SuperMB"};
	public static String[] RemainingSuper500Txt = {"Remaining 500Super Mega From 500Super Mega","متبقي 500سوبر ميجا من 500سوبر ميجا"};
	public static String[] SuperStreaming500Txt = {"SuperPass Streaming 7LE 500 SuperMB","باقةSuperPassستريمنج7ج-500SuperMB"};
	
	public static String[] Weekly50Txt = {"Weekly Internet Bundle 2LE","باقة النت الاسبوعية 2ج"};
	public static String[] Remaining50Txt = {"Remaining 50MB From 50MB","متبقي 50ميجا من 50ميجا"};
	
	public static String[] Hour10Txt = {"1 Hour 0.75 LE","باقة ساعة 0.75ج"};
	public static String[] Remaining10Txt = {"Remaining 10MB From 10MB","متبقي 10ميجا من 10ميجا"};
	
	public static String[] OnDemandSocial500Txt = {"Monthly On Demand Social Add-on 5 LE","باقة سوشيال الاضافية 5 ج"};
	public static String[] Remaining500Txt = {"Remaining 500MB From 500MB","متبقي 500ميجا من 500ميجا"};
	
	public static String[] RenewableSocial500Txt = {"Monthly Renewable Social Bundle 5 LE","باقة سوشيال  الاضافية 5 ج المتجددة"}; //باقة سوشيال الاضافية 5 ج المتجددة
	
	public static String[] OnDemandVideo1000Txt = {"Monthly On Demand Video Bundle 10 LE","باقة فيديو  الاضافية 10ج"};
	public static String[] Remaining750Txt = {"Remaining 750MB From 750MB","متبقي 750ميجا من 750ميجا"};
	public static String[] Remaining250Txt = {"Remaining 250MB From 250MB","متبقي 250ميجا من 250ميجا"};
	
	public static String[] RenewableVideo1000Txt = {"Monthly Renewable Video Bundle 10 LE","باقة فيديو الاضافية 10ج المتجددة"};
	public static String[] Remaining1000Txt = {"Remaining 1000MB From 1000MB","متبقي 1000ميجا من 1000ميجا"};
	
	public static String[] OnDemandMusic500Txt = {"Monthly On demand Music Unlimited Addon 5 LE","باقة مزيكا الشهرية بلا حدود 5 ج"};
	
	public static String[] RenewableMusic500Txt = {"Monthly Renewable Music Unlimited Addon 5 LE","باقة مزيكا الشهرية بلا حدود المتجددة 5 ج"};
	
	public static String[] RenewableAddon150Txt = {"Monthly add-on 5LE Renewable","باقة النت الاضافية 5ج المتجددة"};
	
	public static String[] OnDemandAddon150Txt = {"Monthly add-on 5LE On-Demand","باقة النت الاضافية 5ج"};
	//-------------------------------Eligible bundles and Addons-----------------------------
	//--------------------------------------Extreme Bundles----------------------------------
	public static String[] ExtremeBundlesTxt = {"Extreme bundles","باقات اكستريم"};
	public static String[] OnDemand1800Txt = {"1800 MB On demand","1800 ميجابيت غير متجددة"};
	public static String[] OnDemand2500Txt = {"2500 MB On demand","2500 ميجابيت غير متجددة"};
	public static String[] OnDemand4000Txt = {"4000 MB On demand","4000 ميجابيت غير متجددة"};
	public static String[] OnDemand5000Txt = {"5000 MB On demand","5000 ميجابيت غير متجددة"};
	public static String[] OnDemand8000Txt = {"8000 MB On demand","8000 ميجابيت غير متجددة"};
	public static String[] OnDemand12000Txt = {"12000 MB On demand","12000 ميجابيت غير متجددة"};
	public static String[] OnDemand20000Txt = {"20000 MB On demand","20000 ميجابيت غير متجددة"};
	public static String[] OnDemand40000Txt = {"40000 MB On demand","40000 ميجابيت غير متجددة"};
	//----------------------------------------Extreme Net------------------------------------
	public static String[] ExtremeNetTxt = {"Extreme Net","اكستريم نت"};
	public static String[] Renewable150Txt = {"150 MB Renewable", "150 ميجابيت متجددة"};
	public static String[] Renewable500Txt = {"500 MB Renewable", "500 ميجابيت متجددة"};
	public static String[] Renewable1100Txt = {"1100 MB Renewable", "1100 ميجابيت متجددة"};
	public static String[] Renewable1800Txt = {"1800 MB Renewable", "1800 ميجابيت متجددة"};
	public static String[] Renewable2500Txt = {"2500 MB Renewable", "2500 ميجابيت متجددة"};
	public static String[] Renewable4000Txt = {"4000 MB Renewable", "4000 ميجابيت متجددة"};
	public static String[] Renewable6000Txt = {"6000 MB Renewable", "6000 ميجابيت متجددة"};
	public static String[] Renewable8000Txt = {"8000 MB Renewable", "8000 ميجابيت متجددة"};
	public static String[] Renewable12000Txt = {"12000 MB Renewable", "12000 ميجابيت متجددة"};
	public static String[] Renewable20000Txt = {"20000 MB Renewable", "20000 ميجابيت متجددة"};
	public static String[] Renewable40000Txt = {"40000 MB Renewable", "40000 ميجابيت متجددة"};
	//-----------------------------------------Super Pass------------------------------------
	public static String[] SuperPassTxt = {"Super pass","سوبر باس"};
	public static String[] RenewableSuper500Txt = {"500 SuperMega Renewable","500 سوبرميجا متجددة"};
	public static String[] RenewableSuper1500Txt = {"1500 SuperMega Renewable","1500 سوبرميجا متجددة"};
	public static String[] RenewableSuper2800Txt = {"2800 SuperMega Renewable","2800 سوبرميجا متجددة"};
	public static String[] RenewableSuper4500Txt = {"4500 SuperMega Renewable","4500 سوبرميجا متجددة"};
	public static String[] RenewableSuper6000Txt = {"6000 SuperMega Renewable","6000 سوبرميجا متجددة"};
	public static String[] RenewableSuper9500Txt = {"9500 SuperMega Renewable","9500 سوبرميجا متجددة"};
	//-----------------------------------------Time Based------------------------------------
	public static String[] TimeBasedTxt = {"Time Based","باقات الوقت"};
	public static String[] Renewable50Txt = {"50 MB Renewable","50 ميجابيت متجددة"};
	public static String[] Renewable100Txt = {"100 MB Renewable","100 ميجابيت متجددة"};
	public static String[] Renewable350Txt = {"350 MB Renewable","350 ميجابيت متجددة"};
	public static String[] Hourly10Txt = {"10 MB","10 ميجابيت"};
	public static String[] Hourly30Txt = {"30 MB","30 ميجابيت"};
	public static String[] Hourly60Txt = {"60 MB","60 ميجابيت"};
	//-----------------------------------Social Content--------------------------------------
	public static String[] ContenTxt = {"Content","باقات المحتوى"};
	public static String[] OnDemand25Txt = {"25 MB On demand","25 ميجابيت غير متجددة"};
	public static String[] OnDemand100Txt = {"100 MB On demand","100 ميجابيت غير متجددة"};
	public static String[] OnDemand500Txt = {"500 MB On demand","500 ميجابيت غير متجددة"};
	//-----------------------------------Streaming Content--------------------------------------
	public static String[] OnDemand120Txt = {"120 MB On demand","120 ميجابيت غير متجددة"};
	public static String[] OnDemand400Txt = {"400 MB On demand","400 ميجابيت غير متجددة"};
	public static String[] OnDemand1000Txt = {"1000 MB On demand","1000 ميجابيت غير متجددة"};
	public static String[] Renewable1000Txt = {"1000 MB Renewable","1000 ميجابيت متجددة"};
	//-----------------------------------Music Content--------------------------------------
	public static String[] Renewable20Txt = {"20 MB Renewable","20 ميجابيت متجددة"};
	//----------------------------------------AddOn-----------------------------------------
	public static String[] AddOnsTxt = {"Add-Ons","باقات اضافيه"};
	public static String[] AddOn500SocialTxt = {"500 MB social","500 ميجابيت سوشيال"};
	public static String[] AddOn1000VideoTxt = {"1000 MB video","1000 ميجابيت فيديو"};
	public static String[] AddOn500MusicTxt = {"1000 MB video","1000 ميجابيت فيديو"};
	public static String[] AddOn150Txt = {"150 MB","150 ميجابيت"};
	public static String[] AddOn1024Txt = {"1024 MB","1024 ميجابيت"};
	public static String[] AddOnThrottleTxt = {"Throttle","بلا حدود"};
	//==================================MI Page Elements=====================================
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile Internet Management']")
    public static WebElement MiPage; // MI page
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='إدارة الموبايل انترنت']") //
    public static WebElement MiPage_Ar; // MI page 	إدارة الموبايل انترنت
	/*public static WebElement MiPage() 
	{	
		WebElement MiPage = MiPage_En; 
		if (General.LanguageID == 0) MiPage = MiPage_En; 
		else if(General.LanguageID == 1) MiPage = MiPage_Ar;
		return MiPage;
	}*/	
	@AndroidFindBy(id = "com.emeint.android.myservices:id/icon")
    public static WebElement BundleIcon; // Refresh button
	
	@AndroidFindBy(id = "com.emeint.android.myservices:id/btnRefresh")
    public static WebElement RefreshBtn; // Refresh button
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm']")
    public static WebElement ConfirmBtn; // confirm subscription button
	@AndroidFindBy(xpath = "//android.widget.Button[@text='تأكيد']")
    public static WebElement ConfirmBtn_Ar; // confirm subscription button
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Cancel']")
    public static WebElement CancelBtn; // Cancel button for subscription screen
	@AndroidFindBy(xpath = "//android.widget.Button[@text='إلغاء']")
    public static WebElement CancelBtn_Ar; // Cancel button for subscription screen
	
	@AndroidFindBy(id = "com.emeint.android.myservices:id/iv_exit")
    public static WebElement CloseBtn; // Close button for subscription screen
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Internet bundle purchased successfully']")
    public static WebElement SuccessToss; // toss message after activating
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='تم الاشتراك في باقة الانترنت بنجاح']")
    public static WebElement SuccessToss_Ar; // toss message after activating
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Internet bundle deactivated successfully']")
    public static WebElement DeactivatingToss; //toss message after deactivating
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='تم إيقاف باقة الانترنت بنجاح']")
    public static WebElement DeactivatingToss_Ar; //toss message after deactivating
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add-on has been activated successfully']")
    public static WebElement AddonSuccessToss; // toss message after Addon activating
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='تم شراء باقة الانترنت الإضافية بنجاح']")
    public static WebElement AddonSuccessToss_Ar; // toss message after Addon activating
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Oops! Something went wrong. Please try again later']")
    public static WebElement FailToss; //toss message after activation failure
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='عفوا! حدث خطأ ، حاول مرة أخرى']")
    public static WebElement FailToss_Ar; //toss message after activation failure
    
    @AndroidFindBy(id = "com.emeint.android.myservices:id/toolbar_menu_icon")
    public static WebElement MenuBTN; //Menu Button from toolbar not from home
    
    @AndroidFindBy(id = "com.emeint.android.myservices:id/toolbar_backIcon")
    public static WebElement Back; //toss message after activation failure
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	public static WebElement FirstBundleSubscribe; //The first subscribe button
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	public static WebElement SecondBundleSubscribe; //Second subscribe button
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	public static WebElement ThirdBundleSubscribe; //Third subscribe button
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	public static WebElement FourthBundleSubscribe; //Fourth subscribe button
	//-------------------------------Eligible bundles and Addons-----------------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Extreme bundles']")
	public static WebElement ExtremeBundles; //Extreme Bundles element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='باقات اكستريم']")
	public static WebElement ExtremeBundles_Ar; //Extreme Bundles element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Extreme Net']")
	public static WebElement ExtremeNet; //Extreme Net element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='اكستريم نت']")
	public static WebElement ExtremeNet_Ar; //Extreme Net element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Super pass']")
	public static WebElement SuperPass; //Super Pass element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='سوبر باس']")
	public static WebElement SuperPass_Ar; //Super Pass element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Time Based']")
	public static WebElement TimeBased; //Time Based element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='باقات الوقت']")
	public static WebElement TimeBased_Ar; //Time Based element

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Content']")
	public static WebElement Content; //Content element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='باقات المحتوى']")
	public static WebElement Content_Ar; //Content element

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Add-Ons']")
	public static WebElement AddOns; //Add-Ons element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='باقات اضافيه']")
	public static WebElement AddOns_Ar; //Add-Ons element
	//-----------------------------------Extreme Bundles-------------------------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1800 MB On demand']")
	public static WebElement OnDemand1800; //Extreme 1800 On Demand Bundle
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1800 ميجابيت غير متجددة']")
	public static WebElement OnDemand1800_Ar; //Extreme 1800 On Demand Bundle
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1800 MB On demand icon']")
	public static WebElement OnDemand1800Mark; //Extreme 1800 On Demand Bundle marked
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1800 ميجابيت غير متجددة icon']")
	public static WebElement OnDemand1800Mark_Ar; //Extreme 1800 On Demand Bundle marked
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='2500 MB On demand']")
	public static WebElement OnDemand2500; //Extreme 2500 On Demand Bundle
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@2500 MB On demand icon']")
	public static WebElement OnDemand2500Mark; //Extreme 2500 On Demand Bundle marked
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='4000 MB On demand']")
	public static WebElement OnDemand4000; //Extreme 4000 On Demand Bundle
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@4000 MB On demand icon']")
	public static WebElement OnDemand4000Mark; //Extreme 4000 On Demand Bundle marked
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='5000 MB On demand']")
	public static WebElement OnDemand5000; //Extreme 5000 On Demand Bundle
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='5000 MB On demand icon']")
	public static WebElement OnDemand5000Mark; //Extreme 5000 On Demand Bundle marked
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='8000 MB On demand']")
	public static WebElement OnDemand8000; //Extreme 8000 On Demand Bundle
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='8000 MB On demand icon']")
	public static WebElement OnDemand8000Mark; //Extreme 8000 On Demand Bundle marked
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='12000 MB On demand']")
	public static WebElement OnDemand12000; //Extreme 12000 On Demand Bundle
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='12000 MB On demand icon']")
	public static WebElement OnDemand12000Mark; //Extreme 12000 On Demand Bundle marked
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='20000 MB On demand']")
	public static WebElement OnDemand20000; //Extreme 12000 On Demand Bundle
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='20000 MB On demand icon']")
	public static WebElement OnDemand20000Mark; //Extreme 20000 On Demand Bundle marked
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='40000 MB On demand']")
	public static WebElement OnDemand40000; //Extreme 40000 On Demand Bundle
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='40000 MB On demand icon']")
	public static WebElement OnDemand40000Mark; //Extreme 40000 On Demand Bundle marked
	//-----------------------------------Extreme Net-------------------------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='150 MB Renewable']")
	public static WebElement Renewable150; //Extreme Net 150 Renewable Bundle
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='150 ميجابيت متجددة']")
	public static WebElement Renewable150_Ar; //Extreme Net 150 Renewable Bundle
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='150 MB Renewable icon']")
	public static WebElement Renewable150Mark; //Extreme Net 150 Renewable Bundle check mark
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='150 ميجابيت متجددة icon']")
	public static WebElement Renewable150Mark_Ar; //Extreme Net 150 Renewable Bundle check mark
	//-----------------------------------Super Pass-------------------------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Social']")
	public static WebElement Social; //Social part of super pass
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='سوشيال']")
	public static WebElement Social_Ar; //Social part of super pass
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Streaming']")
	public static WebElement Streaming; //streaming part of super social
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ستريمنج']")
	public static WebElement Streaming_Ar; //streaming part of super social
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 MB Renewable']")
	public static WebElement Renewable500; //Super social 500MB Renewable
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 ميجابيت متجددة']")
	public static WebElement Renewable500_Ar; //Super social 500MB Renewable
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 MB Renewable icon']")
	public static WebElement Renewable500Mark; //Super social 500MB Renewable check mark
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 ميجابيت متجددة icon']")
	public static WebElement Renewable500Mark_Ar; //Super social 500MB Renewable check mark
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 SuperMega Renewable']")
	public static WebElement RenewableSuper500; //Super social 500MB Renewable
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 سوبرميجا متجددة']")
	public static WebElement RenewableSuper500_Ar; //Super social 500MB Renewable
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 SuperMega Renewable icon']")
	public static WebElement RenewableSuper500Mark; //Super social 500MB Renewable check mark
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 سوبرميجا متجددة icon']")
	public static WebElement RenewableSuper500Mark_Ar; //Super social 500MB Renewable check mark
	//-----------------------------------Time Based-------------------------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Weekly']")
	public static WebElement Weekly; //Weekly time based element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='باقات اسبوعيه']")
	public static WebElement Weekly_Ar; //Weekly time based element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Hourly']")
	public static WebElement Hourly; //Hourly time based element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='باقات ساعة']")
	public static WebElement Hourly_Ar; //Hourly time based element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='50 MB Renewable']")
	public static WebElement Renewable50; //Weekly 50MB Renewable
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='50 ميجابيت متجددة']")
	public static WebElement Renewable50_Ar; //Weekly 50MB Renewable
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='50 MB Renewable icon']")
	public static WebElement Renewable50Mark; //Weekly 50MB Renewable check mark
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='50 ميجابيت متجددة icon']")
	public static WebElement Renewable50Mark_Ar; //Weekly 50MB Renewable check mark
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='10 MB']")
	public static WebElement Hourly10; //Hourly 10MB
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='10 ميجابيت']")
	public static WebElement Hourly10_Ar; //Hourly 10MB
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='10 MB icon']")
	public static WebElement Hourly10Mark; //Hourly 10MB check mark
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='10 ميجابيت icon']")
	public static WebElement Hourly10Mark_Ar; //Hourly 10MB check mark
	//-----------------------------------Content-------------------------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Social']")
	public static WebElement SocialContent; //Content Social element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='باقة السوشيال']")
	public static WebElement SocialContent_Ar; //Content Social element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Streaming']")
	public static WebElement StreamingContent; //Content Streaming element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ستريمنج']")
	public static WebElement StreamingContent_Ar; //Content Streaming element

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Music']")
	public static WebElement Music; //Content Music element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='موسيقي']")
	public static WebElement Music_Ar; //Content Music element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Streaming']")
	public static WebElement StreamingContentPost; //Content Streaming element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='باقة الفيديو']")
	public static WebElement StreamingContentPost_Ar; //Content Streaming element

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Music']")
	public static WebElement MusicPost; //Content Music element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='باقة المزيكا']")
	public static WebElement MusicPost_Ar; //Content Music element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 MB On demand']")
	public static WebElement OnDemand500; //Content 500MB
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 ميجابيت غير متجددة']")
	public static WebElement OnDemand500_Ar; //Content 500MB
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 MB On demand icon']")
	public static WebElement OnDemand500Mark; //Content 500MB check mark
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='500 ميجابيت غير متجددة icon']")
	public static WebElement OnDemand500Mark_Ar; //Content 500MB check mark
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1000 MB Renewable']")
	public static WebElement Renewable1000; //Content 1000MB Renewable
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1000 ميجابيت متجددة']")
	public static WebElement Renewable1000_Ar; //Content 1000MB Renewable
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1000 MB Renewable icon']")
	public static WebElement Renewable1000Mark; //Content 1000MB Renewable check mark
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1000 ميجابيت متجددة icon']")
	public static WebElement Renewable1000Mark_Ar; //Content 1000MB Renewable check mark
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1000 MB On demand']")
	public static WebElement OnDemand1000; //Content 1000MB
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1000 ميجابيت غير متجددة']")
	public static WebElement OnDemand1000_Ar; //Content 1000MB
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1000 MB On demand icon']")
	public static WebElement OnDemand1000Mark; //Content 1000MB check mark
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1000 ميجابيت غير متجددة icon']")
	public static WebElement OnDemand1000Mark_Ar; //Content 1000MB check mark
	//-----------------------------------Add-Ons-------------------------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Renewable']")
	public static WebElement Renewable; //Addon Renewable element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Renewable']")
	public static WebElement Renewable_Ar; //Addon Renewable element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='On demand']")
	public static WebElement OnDemand; //Addon On demand element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='حسب الطلب']")
	public static WebElement OnDemand_Ar; //Addon On demand element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='No Eligible Bundles for you']")
	public static WebElement NoEligibleAddon; //No eligible Addon On demand element
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='لا تؤجد باقات متاحة']")
	public static WebElement NoEligibleAddon_Ar; //No eligible Addon On demand element
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='150 MB']")
	public static WebElement Addon150; //Addon 150 Renewable Bundle
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='150 ميجابيت']")
	public static WebElement Addon150_Ar; //Addon 150 Renewable Bundle
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='150 MB icon']")
	public static WebElement Addon150Mark; //Addon 150 Renewable Bundle check mark
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='150 ميجابيت icon']")
	public static WebElement Addon150Mark_Ar; //Addon 150 Renewable Bundle check mark
	//---------------------------------------Inquiry-----------------------------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='On Demand Extreme Net Bundle 30LE 1800MB']")
	public static WebElement Extreme1800OnDemand; //Extreme 1800 On Demand Bundle in inquiry
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='باقة اكستريم نت الغير متجدده 30 ج']")
	public static WebElement Extreme1800OnDemand_Ar; //Extreme 1800 On Demand Bundle in inquiry
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Remaining 3600MB From 3600MB']")
	public static WebElement Extreme1800OnDemandMBs; ////Extreme 1800 On Demand Bundle MBs after second subscription
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='متبقي 3600ميجا من 3600ميجا']")
	public static WebElement Extreme1800OnDemandMBs_Ar; ////Extreme 1800 On Demand Bundle MBs after second subscription
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Extreme Net Bundle 5LE 150MB']")
	public static WebElement Extreme150Renewable; //Extreme 150 Renewable Bundle in inquiry
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='إكستريم نت 5ج 150MB']")
	public static WebElement Extreme150Renewable_Ar; //Extreme 150 Renewable Bundle in inquiry
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Remaining 150MB From 150MB']")
	public static WebElement Extreme150RenewableMBs; //Extreme 150 Renewable Bundle MBs value in inquiry
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='متبقي 150ميجا من 150ميجا']")
	public static WebElement Extreme150RenewableMBs_Ar; //Extreme 150 Renewable Bundle MBs value in inquiry
	//-----------------------------------After Bundle Options--------------------------------
	public static String[] AFterBundle_Txt = {"Manage after bundle options","المحاسبة بعد إنتهاء الباقة"};
	
	@AndroidFindBy(id = "com.emeint.android.myservices:id/tvManageAfterBundleOption")
    public static WebElement AfterBundleOption; //Open After bundle option Button
    
    @AndroidFindBy(id = "com.emeint.android.myservices:id/tvBuyAddon")
    public static WebElement BuyAddon; //Open BuyAddon
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Stop internet on demand']")
    public static WebElement StopOnDemandTxt ;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='إيقاف النت الغير متجددة']")
    public static WebElement StopOnDemandTxt_Ar ;
    
    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.Switch")
    public static WebElement StopOnDemandBtn ;  // Activate stop internet on demand
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Stop Internet Renewable']")
    public static WebElement  StopRenewableTxt ;  // Activate stop internet renewable 
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='إيقاف النت المتجددة']")
    public static WebElement  StopRenewableTxt_Ar ;  // Activate stop internet renewable 
   
    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.Switch")
    public static WebElement StopRenewableBtn ; // Activate stop internet renewable 
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Stop Rollover Feature']")
    public static WebElement StopRolloverTxt ;  // Activate rollover
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='الغاء خاصية ترحيل الميجابايتس']")
    public static WebElement StopRolloverTxt_Ar ;  // Activate rollover
    
    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.widget.Switch")
    public static WebElement StopRolloverBtn ;  // Activate rollover
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Red Data Assistant']")
    public static WebElement RedDataAssistanceTxt ;  // Activate RDA for red
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Red Data Assistant']")
    public static WebElement RedDataAssistanceTxt_Ar ;  // Activate RDA for red
    
    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.Switch")
    public static WebElement RedDataAssistanceBtn ;  // Activate RDA for red
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add-Ons']")
    public static WebElement AddonTitle;  //addon page title
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='باقات اضافيه']")
    public static WebElement AddonTitle_Ar;  //addon page title
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Deactivate']")
    public static WebElement DeactivteBundle;  //addon page title
    @AndroidFindBy(xpath = "//android.widget.Button[@text='إيقاف الباقة']")
    public static WebElement DeactivteBundle_Ar;  //addon page title 
    
//---------------------------------Inquiry-------------------------------    public static String[] Renew_Txt = {"Renew your bundle now","جدد الباقة الأن"};
    public static String[] Renew_Txt = {"Renew your bundle now","جدد الباقة الأن"};
    public static String[] Expiry_Date={"Expiry Date","تاريخ انتهاء الباقة"};
    public static String[] RedHerMIbundle={"Red Her MI bundle","RED Her"};
    public static String[] RedClassicMIbundle={"Red  Basic MI bundle","RED Basic"};
    public static String[] RedTravelerMIbundle={"Red Traveler MI bundle","RED Traveler"};
    		
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Renew your bundle now']")
    public static WebElement RenewBundle;  
    @AndroidFindBy(xpath = "//android.widget.Button[@text='جدد الباقة الأن']") 
    public static WebElement RenewBundle_AR;  
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Internet bundle repurchased successfully']")
    public static WebElement RenewalSuccessToss; // toss message after renewal
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='تم إعادة شراء باقة الانترنت بنجاح']")
    public static WebElement RenewalSuccessToss_AR; 
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]")
    public static WebElement Firstqouta;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView[2]")
    public static WebElement Secondqouta;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Oops! Something went wrong. Please try again later']")
    public static WebElement Error;  // error in second renewal
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='عفوا! حدث خطأ ، حاول مرة أخرى']")
    public static WebElement Error_AR;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public static WebElement OK; 
    @AndroidFindBy(xpath = "//android.widget.Button[@text='نعم']")
    public static WebElement OK_AR; 
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='You don’t have enough balance, please recharge first']")
    public static WebElement RechargeError;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='لا يوجد لديك رصيد كافي، برجاء الشحن اولا']")///////////////
    public static WebElement RechargeError_AR;


//==========================================================================================================
	public MI(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		if (General.LanguageID == 1)
		{
			//Updating Elements with Arabic values====
			//General---------------------------------
			MiPage = MiPage_Ar;
			ConfirmBtn = ConfirmBtn_Ar;
			CancelBtn = CancelBtn_Ar;
			SuccessToss = SuccessToss_Ar;
			DeactivatingToss = DeactivatingToss_Ar;
			AddonSuccessToss = AddonSuccessToss_Ar;
			FailToss = FailToss_Ar;
			//Eligible Bundles------------------------
			ExtremeBundles = ExtremeBundles_Ar;
			ExtremeNet = ExtremeNet_Ar;
			SuperPass = SuperPass_Ar;
			TimeBased = TimeBased_Ar;
			Content = Content_Ar;
			AddOns = AddOns_Ar;
			//Extreme Bundles-------------------------
			OnDemand1800 = OnDemand1800_Ar;
			OnDemand1800Mark = OnDemand1800Mark_Ar;
			//Extreme Net-----------------------------
			Renewable150 = Renewable150_Ar;
			Renewable150Mark = Renewable150Mark_Ar;
			//Super Pass-----------------------------
			Social = Social_Ar;
			Streaming = Streaming_Ar;
			Renewable500 = Renewable500_Ar;
			Renewable500Mark = Renewable500Mark_Ar;
			RenewableSuper500 = RenewableSuper500_Ar;
			RenewableSuper500Mark = RenewableSuper500Mark_Ar;
			//Time Based-----------------------------
			Weekly = Weekly_Ar;
			Hourly = Hourly_Ar;
			Renewable50 = Renewable50_Ar;
			Renewable50Mark = Renewable50Mark_Ar;
			Hourly10 = Hourly10_Ar;
			Hourly10Mark = Hourly10Mark_Ar;
			//Content--------------------------------
			SocialContent = SocialContent_Ar;
			StreamingContent = StreamingContent_Ar;
			Music = Music_Ar;
			StreamingContentPost = StreamingContentPost_Ar;
			MusicPost = MusicPost_Ar;
			OnDemand500 = OnDemand500_Ar;
			OnDemand500Mark = OnDemand500Mark_Ar;
			Renewable1000 = Renewable1000_Ar;
			Renewable1000Mark = Renewable1000Mark_Ar;
			OnDemand1000 = OnDemand1000_Ar;
			OnDemand1000Mark = OnDemand1000Mark_Ar;
			//Addon----------------------------------
			Renewable = Renewable_Ar;
			OnDemand = OnDemand_Ar;
			NoEligibleAddon = NoEligibleAddon_Ar;
			Addon150 = Addon150_Ar;
			Addon150Mark = Addon150Mark_Ar;
			//Inquiry--------------------------------
			Extreme1800OnDemand = Extreme1800OnDemand_Ar;
			Extreme1800OnDemandMBs = Extreme1800OnDemandMBs_Ar;
			Extreme150Renewable = Extreme150Renewable_Ar;
			Extreme150RenewableMBs = Extreme150RenewableMBs_Ar;
			//After Bundle Options-------------------
			StopOnDemandTxt = StopOnDemandTxt_Ar;
			StopRenewableTxt = StopRenewableTxt_Ar;
			StopRolloverTxt = StopRolloverTxt_Ar;
			RedDataAssistanceTxt = RedDataAssistanceTxt_Ar;
			AddonTitle = AddonTitle_Ar;
			DeactivteBundle = DeactivteBundle_Ar;
			//MIInqury---------------------
			RenewBundle=RenewBundle_AR;
			RenewalSuccessToss=RenewalSuccessToss_AR;
			OK=OK_AR;
			RechargeError=RechargeError_AR;
			
		}
    }
}

