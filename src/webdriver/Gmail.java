package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/gourav.vig/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("gmail");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[text()=\"Gmail - Google\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Sign in\"]")).click();
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("gvigtesting@gmail.com");
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		//driver.close();

	}


}
