package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
Alert alert = driver.switchTo().alert();
alert.accept();
String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
if (text.contains("pressed")) {
	System.out.println("clicked");
} else {
System.out.println("no");
}
	}

}
