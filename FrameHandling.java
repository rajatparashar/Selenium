package seleniummFromScratch;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/rajat/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/");	
		System.out.println("URL got opened");
		WebElement iFrameButton = driver.findElement(By.xpath("//li[@id='iFrame']"));
		iFrameButton.click();		
		System.out.println("Iframe button clicked");
		Thread.sleep(1000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver.switchTo().frame(frame);
		System.out.println("Frame switched");
		Thread.sleep(1000);
		WebElement menuButton = driver.findElement(By.xpath("//div[@id='mobile_menu_toggler']"));
		menuButton.click();	
		System.out.println("Menu button clicked");
		Thread.sleep(1000);
		WebElement aboutUsLink = driver.findElement(By.linkText("About Us"));
		aboutUsLink.click();
		System.out.println("About Us link clicked");
		Thread.sleep(3000);
		String headingString = driver.findElement(By.xpath("//h1[contains(text(),'About the company')]")).getText();
		if(headingString.equals("About the company")) {
			System.out.println("Verified and Passed");
		}
		else {
			System.out.println("Error in verification!!");
		}	
		driver.close();
	}
}