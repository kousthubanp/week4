package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
			login.click();
			WebElement crmsfa = driver.findElement(By.id("button"));
			crmsfa.click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Merge Contacts")).click();
			driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
			
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
			List<String> childwindow = new ArrayList<String>(windowHandles);
			driver.switchTo().window(childwindow.get(1));
			driver.findElement(By.linkText("DemoCustomer")).click();
			driver.switchTo().window(childwindow.get(0));
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			Set<String> windowHandles1 = driver.getWindowHandles();
			System.out.println(windowHandles1);
			List<String> childwindow1= new ArrayList<String>(windowHandles1);
			driver.switchTo().window(childwindow1.get(1));
			driver.findElement(By.linkText("DemoLBCust")).click();
			driver.switchTo().window(childwindow1.get(0));
			driver.findElement(By.linkText("Merge")).click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			String title = driver.getTitle();
			System.out.println(title);
			
	}

}
