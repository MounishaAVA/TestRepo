package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// Fetching a web page
		 driver.navigate().to("https://semantic-ui.com/modules/dropdown.html");
		
		 Select objSelect = new Select(driver.findElement(By.xpath("(//div[contains(@class,'ui dropdown')])[2]"))); 
		 
		 objSelect.selectByVisibleText("Male");

	}

}
