package week2.day2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> tablerows =driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println(tablerows.size());
		

		List<WebElement> mentorName =driver.findElements(By.xpath("(//table[@id='table_id']/tbody/tr/td[5])"));
				
		for (WebElement mentor : mentorName)
		{
			System.out.println(mentor.getText());
			
		}
		
	}

}