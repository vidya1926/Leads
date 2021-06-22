package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	
	driver.manage().window().maximize();
	//driver.switchTo().alert().dismiss();
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	Thread.sleep(5000);
WebElement select = driver.findElementById(("src"));
select.sendKeys("c");
Thread.sleep(2000);
select.sendKeys(Keys.ARROW_DOWN);
select.sendKeys(Keys.TAB);
select.sendKeys(Keys.ENTER);

	
WebElement select1= driver.findElementById("dest");
select1.sendKeys("b");
Thread.sleep(1000);
select1.sendKeys(Keys.ARROW_DOWN);
select1.sendKeys(Keys.TAB);
select1.sendKeys(Keys.ENTER);

String date = driver.findElement(By.id("onward_cal")).getAttribute("onward_cal");
driver.findElement(By.xpath("//td[@class='next']//button[1]")).click();
driver.findElement(By.xpath("//td[@class='wd day']")).click();
driver.findElementById("search_btn").click();
Thread.sleep(5000);

driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label[1]")).getText();


String sLEEPERAllBusRatings = driver.findElement(By.xpath("//div[contains(@class,'sort-results w-80')]")).getText();
System.out.println(sLEEPERAllBusRatings);


	}}
	

