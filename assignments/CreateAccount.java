package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.partialLinkText("Accounts")).click();
	driver.findElement(By.partialLinkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
	WebElement inDD = driver.findElement(By.name("industryEnumId"));
    Select sect = new Select(inDD);
    sect.selectByIndex(3);
    WebElement oWN = driver.findElement(By.name("ownershipEnumId"));
    Select sect1 = new Select(oWN);
    sect1.selectByVisibleText("S-Corporation");
    WebElement sOU	= driver.findElement(By.name("dataSourceId"));
    Select sect2 = new Select(sOU);
    sect2.selectByValue("LEAD_EMPLOYEE");
    WebElement mCAM = driver.findElement(By.id("marketingCampaignId"));
    Select sect3 = new Select(mCAM);
    sect3.selectByIndex(6);
    WebElement sTATE = driver.findElement(By.id("generalStateProvinceGeoId"));
    Select sect4 = new Select(sTATE);
    sect4.selectByValue("TX");
    driver.findElement(By.className("smallSubmit"));
    System.out.println(driver.getTitle());
    //driver.close();
	}
}
