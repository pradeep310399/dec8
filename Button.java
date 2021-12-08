package november18;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.navigate().back();
		System.out.println("back to homepage");
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		System.out.println("location"+location);
		String colour = driver.findElement(By.id("color")).getCssValue("color");
		System.out.println("color: "+colour);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("size: "+size);
		driver.close();
		

	}

}
