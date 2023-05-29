package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TouristPlacePage {
	@FindBy(xpath="//a[text()='Lal Mahal']")
	private WebElement lalMahal;
	@FindBy(xpath="//a[text()='Sarasbaug-Peshve Park']")
	private WebElement sarasbaugPeshvePark;
	@FindBy(xpath="//a[text()='Khadakwasala Dam']")
	private WebElement KhadakwasalaDam;
	@FindBy(xpath="//a[text()='Shivneri Fort']")
	private WebElement shivneriFort;
	@FindBy(xpath="//a[text()='Shanivarwada']")
	private WebElement shanivarwada;
	@FindBy(xpath="//a[text()='Aagakhan Palace']")
	private WebElement aagakhanPalace;
	@FindBy(xpath="//a[text()='Sinhagad']")
	private WebElement sinhagad;
	@FindBy(xpath="//a[text()='Lonavala-Khandala']")
	private WebElement lonavalaKhandala;
	
public TouristPlacePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void openLalMahalPage()
{
	lalMahal.click();
}
public void openSarasbaugPeshveParkPage()
{
	sarasbaugPeshvePark.click();
}
public void openKhadakwasalaDamPage()
{
	KhadakwasalaDam.click();
}
public void openShivneriFortPage()
{
	shivneriFort.click();
}
public void openShanivarwadaPage()
{
	shanivarwada.click();
	
}
public void openAagakhanPalacePage()
{
	aagakhanPalace.click();
}
public void openSinhagadPage()
{
	sinhagad.click();
}
public void openLonavalaKhandalaPage()
{
	lonavalaKhandala.click();
}

}
