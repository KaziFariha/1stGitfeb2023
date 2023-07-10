package launchBrowser;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
 
	public static void main(String[] args) throws InterruptedException {
		
	//Scanner snc = new Scanner(System.in);	
		
		
	//launch Crome	
	WebDriver driver = new ChromeDriver();
	
	
	// Go to website
	driver.get("https://www.google.com/");	
	
	driver.manage().window().maximize();
	
	driver.findElement (By.name("q")).sendKeys("Selenium123");
	
	Thread.sleep(3000);
	
	driver.close();
				
	}
	
}
