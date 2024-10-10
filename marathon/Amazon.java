package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
       driver.findElement(By.xpath("//input[@dir='auto']")).sendKeys("bags for boys");
       Thread.sleep(2000);
       driver.findElement(By.id("nav-search-submit-button")).click();
       driver.findElement(By.xpath("//span[text()='35L Campus 02 | School Bag | Double Compartment with Top & Side Quick Access Pocket | Well- Padded Backpack | Side Water-Bottle Pocket | For Girls & Boys | 750 Days Warranty']")).click();
String text = driver.findElement(By.xpath("//span[text()='1-48 of over 90,000 results for']")).getText();
System.out.println(text);
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]/following-sibling::span)[3]")).click();
driver.findElement(By.xpath("//li[@id='p_123/418063']/span[1]/a[1]/span[1]")).click();
driver.findElement(By.xpath("//span[text()='Featured']")).click();
driver.findElement(By.linkText("Newest Arrivals")).click();
String text2 = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]")).getText();
System.out.println(text2);
String text3 = driver.findElement(By.xpath("//span[text()='2,100']")).getText();
System.out.println(text3);
Thread.sleep(2000);
String title = driver.getTitle();
System.out.println(title);
driver.quit();
	}

}
