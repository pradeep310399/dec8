package november18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		//Go to home pagee
		WebElement link1 = driver.findElement(By.linkText("Go to Home Page"));
		link1.click();
		driver.navigate().back();
		// to check where i am?
        String destiny = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
        System.out.println("destiny: "+destiny);
        //verify am i broken
        driver.findElement(By.linkText("Verify am I broken?")).click();
        String title = driver.getTitle();
        if(title.contains("HTTP Status 404 – Not Found")) {
        	System.out.println("Yes i m broken");
        }else {
        	System.out.println("Im not broken");
        }
        driver.navigate().back();
        
        //Interact with the same link
        
        String link2 = driver.findElement(By.xpath("//a[text()='Go to Home Page']")).getAttribute("href");
        Thread.sleep(5000);
        String link3 = driver.findElement(By.xpath("//a[text()='Go to Home Page']")).getAttribute("href");
        if(link2.equals(link3)) {
        	driver.navigate().to(link2);
        	System.out.println("Both the links are same and get interacted");
        }else {
        	System.out.println("not interacted");
        }
        driver.navigate().back();
        
        // how many links in the page
        List<WebElement> TotalLinks = driver.findElements(By.tagName("a"));
		System.out.println(TotalLinks.size());
        
        
        
        
	}

}
