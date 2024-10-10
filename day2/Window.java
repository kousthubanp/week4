package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window {

	public static void main(String[] args) {
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.linkText("FLIGHTS")).click();
Set<String> windowHandles = driver.getWindowHandles();
System.out.println(windowHandles);

List<String> childwindow = new ArrayList<String>(windowHandles);

driver.switchTo().window(childwindow.get(1));
String title = driver.getTitle();
System.out.println(title);
driver.switchTo().window(childwindow.get(0));
driver.close();

	}

}
