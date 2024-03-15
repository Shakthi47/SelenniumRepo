package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Shakthi");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Priya");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Shakthi");
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Softwate");
	driver.findElement(By.name("description")).sendKeys("Selenium WebDriver");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("shakthi47priya@gmail.com");
	WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    Select sect = new Select(State);
    sect.selectByVisibleText("New York");
    driver.findElement(By.name("submitButton")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.name("description")).clear();
    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("For Testing Purpose only");
    System.out.println(driver.getTitle());
    //driver.close();
}
}
