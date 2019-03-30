package seleniummFromScratch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HandleDropBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/rajat/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		
		//handle drop box
		
		WebElement date = driver.findElement(By.id("day"));
		//create object of Select class
		Select select = new Select(date);
		select.selectByVisibleText("3");
	}
}