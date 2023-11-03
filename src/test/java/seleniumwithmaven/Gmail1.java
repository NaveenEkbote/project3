package seleniumwithmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		driver.findElement(By.xpath("//a[contains(@data-action,'create')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@type,\"text\")]")).sendKeys("Naveen");
		driver.findElement(By.xpath("(//input[starts-with(@type,\"text\")])[2]")).sendKeys("Ekbote");
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
	}

}
