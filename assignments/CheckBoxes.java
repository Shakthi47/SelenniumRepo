package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/checkbox.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//span[text()='Basic']")).click();
	driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	boolean check;
	check = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
	System.out.println(check);
	driver.findElement(By.xpath("//label[text()='Java']")).click();
	driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']")).click();
	driver.findElement(By.xpath("//span[text()='Disabled']")).click();
	
	//driver.close();
}
}
