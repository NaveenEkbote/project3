package seleniumwithmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium%20examples/WebTable.html");
		driver.findElement(By.xpath("//tr[3]/td/input")).click();
		String value=driver.findElement(By.xpath("//tr[3]/td[2]")).getText();
		System.out.println("valur of "+ value);
		driver.close();
	}

}
