package seleniumwithmaven;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gmail {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		driver.findElement(By.xpath("//span[@class='laptop-desktop-only']")).click();
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Naveen");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Ekbote");
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		//driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("08");
		Thread.sleep(2000);
		driver.findElement(By.name("day")).sendKeys("08");
		driver.findElement(By.id("month")).sendKeys("february");
		driver.findElement(By.name("year")).sendKeys("2016");
		driver.findElement(By.xpath("//*[@id=\"gender\"]/option[3]")).click();
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='t5nRo Id5V1'])[3]"))).click();
		driver.findElement(By.xpath("//input[1]")).sendKeys("Naveen15558");
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1[@class='ahT6S  y77zqe']"),"Create a strong password"));
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Naveen@158");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Naveen@158");
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
	} 
}
 