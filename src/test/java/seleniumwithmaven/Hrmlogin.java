package seleniumwithmaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Hrmlogin {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.chrome.driver", "C:\\.exe");//
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Naveen");
		driver.findElement(By.name("lastname")).sendKeys("Ekbote");
		driver.findElement(By.name("reg_email__")).sendKeys("ekbote.naveen156@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Naveen@10023");
		Thread.sleep(1000);
		driver.findElement(By.id("day")).sendKeys("03");
		driver.findElement(By.id("month")).sendKeys("February");
		driver.findElement(By.id("year")).sendKeys("2003");
	//	Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"u_2_o_WZ\"]/span[2]")).click();
		//driver.findElement(By.xpath("//*[@for='u_2_5_Ig']")).click();
		//driver.findElement(By.xpath("//*[@id='u_2_5_Ig']")).click();
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ekbote.naveen156@gmail.com");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.name("websubmit")).click();
	}
}
