package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/radio.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//label[text()='Chrome']")).click();
	driver.findElement(By.xpath("//label[text()='Chennai']")).click();
	driver.findElement(By.xpath("//label[text()='Chennai']")).click();
	System.out.println("Safari");
	
}
}
