package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.TouristPlacePage;

public class TestNGClass {
	
	WebDriver driver;
	TouristPlacePage touristPlacePage;
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\SandipWakade\\chromedriver_win32 (042023)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pune.gov.in/");
	}
	@BeforeMethod
	public void openTouristPlace()
	{
		
		HomePage homePage=new HomePage(driver);
		homePage.openTouristPlacePage();
		touristPlacePage=new TouristPlacePage(driver);
	}
	@Test
	public void verifyLalMahal()
	{
		touristPlacePage.openLalMahalPage();
	    String url=driver.getCurrentUrl();
	    String title=driver.getTitle();
	    System.out.println(url);
	    System.out.println(title);
	    if(url.equals("https://pune.gov.in/tourist-place/lal-mahal/") && 
	    		title.equals("Lal Mahal | District Pune ,Government of Maharashtra | India"))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    	Assert.fail();
	    }
	}
	@Test
	public void verifySarasbaugPeshvePark()
	{
		touristPlacePage.openSarasbaugPeshveParkPage();
	    String url=driver.getCurrentUrl();
	    String title=driver.getTitle();
	    System.out.println(url);
	    System.out.println(title);
	    if(url.equals("https://pune.gov.in/tourist-place/sarasbaug-peshve-park/") && 
	    		title.equals("Sarasbaug-Peshve Park | District Pune ,Government of Maharashtra | India"))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    	Assert.fail();
	    }
	}
	@Test
	public void verifyKhadakwasalaDam()
	{
		touristPlacePage.openKhadakwasalaDamPage();
	    String url=driver.getCurrentUrl();
	    String title=driver.getTitle();
	    System.out.println(url);
	    System.out.println(title);
	    if(url.equals("https://pune.gov.in/tourist-place/khadakwasala-dam/") && 
	    		title.equals("Khadakwasala Dam | District Pune ,Government of Maharashtra | India"))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    	Assert.fail();
	    }
	}
	@Test
	public void verifyShivneriFort()
	{
		touristPlacePage.openShivneriFortPage();
	    String url=driver.getCurrentUrl();
	    String title=driver.getTitle();
	    System.out.println(url);
	    System.out.println(title);
	    if(url.equals("https://pune.gov.in/tourist-place/shivneri/") && 
	    		title.equals("Shivneri Fort | District Pune ,Government of Maharashtra | India"))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    	Assert.fail();
	    }
	}
	@Test
	public void verifyAagakhanPalacePage()
	{
		touristPlacePage.openAagakhanPalacePage();
	    String url=driver.getCurrentUrl();
	    String title=driver.getTitle();
	    System.out.println(url);
	    System.out.println(title);
	    if(url.equals("https://pune.gov.in/tourist-place/aagakhan-palace/") && 
	    		title.equals("Aagakhan Palace | District Pune ,Government of Maharashtra | India"))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    	Assert.fail();
	    }
	}
	@Test
	public void verifySinhagad()
	{
		touristPlacePage.openSinhagadPage();
	    String url=driver.getCurrentUrl();
	    String title=driver.getTitle();
	    System.out.println(url);
	    System.out.println(title);
	    if(url.equals("https://pune.gov.in/tourist-place/sinhagad/") && 
	    		title.equals("Sinhagad | District Pune ,Government of Maharashtra | India"))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    	Assert.fail();
	    }
	}
	@Test
	public void verifyLonavalaKhandala()
	{
		touristPlacePage.openLonavalaKhandalaPage();
	    String url=driver.getCurrentUrl();
	    String title=driver.getTitle();
	    System.out.println(url);
	    System.out.println(title);
	    if(url.equals("https://pne.gov.in/tourist-place/lonavala-khandala/") && 
	    		title.equals("Lonavala-Khandala | District Pune ,Government of Maharashtra | India"))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    	Assert.fail();
	    }
	}
	

	

}
