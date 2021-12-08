package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("sathishkumar");
		driver.findElement(By.xpath("(//input[@name='lastname'])")).sendKeys("namachivayam");
		driver.findElement(By.xpath("(//input[@name='reg_email__'])")).sendKeys("9025507012");
		driver.findElement(By.xpath("(//input[@id='password_step_input'])")).sendKeys("n.punitha@7");
		Select s1=new Select(driver.findElement(By.id("day")));
		s1.selectByValue("12");
		Select s2 = new Select(driver.findElement(By.id("month")));
		s2.selectByVisibleText("Aug");
		Select s3 = new Select(driver.findElement(By.id("year")));
		s3.selectByVisibleText("1995");
		driver.findElement(By.xpath("//label[text()='Male']/following::input[1]")).click();
		driver.findElement(By.xpath("(//button[@name='websubmit'])")).click();
		driver.navigate().forward();
				
				
		
	}

}
