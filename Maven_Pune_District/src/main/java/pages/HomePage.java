package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="(//div[@class='list-text'])[1]")
	private WebElement TelephoneNumbersButton;
	
	@FindBy(xpath="(//div[@class='list-text'])[2]")
	private WebElement TourismButton;
	
	@FindBy(xpath="(//div[@class='list-text'])[3]")
	private WebElement RtiOnlineButton;
	
	@FindBy(xpath="(//div[@class='list-text'])[4]")
	private WebElement AadharCentresButton;
	
	@FindBy(xpath="(//div[@class='list-text'])[5]")
	private WebElement ViewDigitallySigned712Button;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openWhosWhoPage()
	{
		TelephoneNumbersButton.click();
	}
	
	public void openTouristPlacePage()
	{
		TourismButton.click();
	}
	public void openRtiOnlinePage()
	{
		RtiOnlineButton.click();
	}
	public void openAdharCentresPage()
	{
		AadharCentresButton.click();
	}
	public void openViewDigitallySigned712Page()
	{
		ViewDigitallySigned712Button.click();
		
		System.out.println("Sandipwakade");
	}
	

}
