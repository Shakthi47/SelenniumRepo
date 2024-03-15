package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteractions {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Click']")).click();
	
}
}
