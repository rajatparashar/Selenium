package seleniummFromScratch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/rajat/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		//DO NOT use sendkeys() with upload files button
		WebElement browseButton = driver.findElement(By.xpath("//input[@name='fileupload']"));
		browseButton.sendKeys("/home/rajat/Downloads/ddownr.zip");		
	}
}