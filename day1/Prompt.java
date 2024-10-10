package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/alert.xhtml");
		WebElement element = driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']//span)[2]"));
		element.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("kousthu");
		
		alert.accept();
		Thread.sleep(3000);
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		
		if (text2.contains("kousthu")) {
		System.out.println("printed");
	}
	else
		System.out.println("not printed");
	}
	}


