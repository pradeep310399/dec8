package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("sathishkumar");
		driver.findElement(By.id("lastNameField")).sendKeys("namachivayam");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sathish");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("N");
		driver.findElement(By.name("departmentName")).sendKeys("Quality");
		driver.findElement(By.name("description")).sendKeys("Do the work in extraordinary manner");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("aaa@gmail.com");
		Select s1=new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		s1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("God is love");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		driver.navigate().forward();
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
