package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicity_Wait {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/gourav.vig/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("gmail");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[text()=\"Gmail - Google\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Sign in\"]")).click();
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("gvigtesting@gmail.com");
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		driver.findElement(By.xpath("//*[@aria-label=\"Enter your password\"]")).sendKeys("Gaurav@789");
	//	driver.findElement(By.xpath("//*[@aria-label=\"Enter your password\"]")).sendKeys(Keys.ENTER);


	    driver.findElement(By.xpath("(//*[@jsname=\"V67aGc\"])[2]")).click();



	}

}