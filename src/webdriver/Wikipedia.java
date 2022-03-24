package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author gourav.vig
 *
 */
public class Wikipedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecho.driver", "C:\\Users\\gourav.vig\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:www.google.com");
		//driver.findElement(By.name("q")).sendKeys("Wikipedia");
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("//*[@class='LC20lb MBeuO DKV0Md']")).click();
		//driver.findElement(By.name("search")).sendKeys("Dinosaur");
		//driver.findElement(By.name("search")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("//*[@href='/wiki/Dinosaur']")).click();
		//driver.close();
	}

}
