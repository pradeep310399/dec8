package december2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		//select the languages you know
		
		driver.findElement(By.xpath("//div[text()='Java']/input")).click();
		driver.findElement(By.xpath("//div[text()='SQL']/input")).click();
		driver.findElement(By.xpath("//div[text()='C']/input")).click();
		driver.findElement(By.xpath("//div[text()='C++']/input")).click();
	// whether the check box is selected or not
		 
	 boolean selected = driver.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected();
	 System.out.println(selected);
	 
	 //deselect the checkbox
	 
	 driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
	 boolean deselect = driver.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected();
		if (deselect) {
			System.out.println("The checkbox is not Deselected");
		} else {
			System.out.println("The checkbox is Deselected");
		}

//Select all below checkboxes 
		for (int i = 1; i <=5; i++) {
			driver.findElement(By.xpath("//div[text()='Option "+i+"']/input")).click();
		}
	
	
	}

}
