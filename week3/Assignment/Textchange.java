package week3.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textchange {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/TextChange.html");
		
		 driver.manage().window().maximize();
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	     WebElement display=driver.findElement(By.id("btn"));
	
	     String text=wait.until(ExpectedConditions.visibilityOf(display)).getText();
	     System.out.println(text);
		 driver.findElement(By.id("btn")).click();
		 	}

}
