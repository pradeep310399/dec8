package december2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		// click on the image of home page
		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		String homepage = driver.getTitle();
		System.out.println(homepage);
		
		if(homepage.contains("TestLeaf - Selenium Playground")) {
			System.out.println("Homepage is displayed");
		}else {
			System.out.println("Homepage is not displayed");
		}
		driver.navigate().back();
		
		//Am i broken  image
		
		WebElement brokenimage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		String attribute = brokenimage.getAttribute("src");
		driver.navigate().to(attribute);
		
		String title = driver.getTitle();
		
		if(title.contains("HTTP Status 404 – Not Found")) {
			System.out.println("I'm Broken image");
		}else {
			System.out.println("Not an broken image");
		}
		driver.navigate().back();
		
		//click the image by using keyboard
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		driver.navigate().back();
		
	
	}

}
