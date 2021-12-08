package november15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("namachivayampradeepkumar@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("append",Keys.TAB);
		String attribute = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	    boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enabled);
		
		

	}

}
