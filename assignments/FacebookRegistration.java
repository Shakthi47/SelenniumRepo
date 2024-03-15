package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shakthi");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Priya");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("reg_email__")).sendKeys("shakthi47priya@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Saathmi@15");
	WebElement date = driver.findElement(By.id("day"));
    Select dob = new Select(date);
    dob.selectByIndex(3);
    WebElement month = driver.findElement(By.id("month"));		
    Select dob1 = new Select(month);
    dob1.selectByValue("7");
    WebElement year = driver.findElement(By.id("year"));
    Select dob2 = new Select(year);
    dob2.selectByVisibleText("1995");
    WebElement radio_female = driver.findElement(By.xpath("//input[@value='1']"));
	radio_female.click();
    }
}
