package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	//driver.findElement(By.xpath("//
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	
}
}
