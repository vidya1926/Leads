package week3.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Missingtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stubWebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/appear.html");
		
		 driver.manage().window().maximize();
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
         String missed= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn"))).getText();
	  		System.out.println(missed); 	
	}

}
