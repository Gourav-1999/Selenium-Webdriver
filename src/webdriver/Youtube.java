package webdriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Youtube {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/gourav.vig/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		String formattedDate = date.format(dataFormat);


		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Youtube");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("(//*[text()=\"YouTube\"])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"search\" and @type=\"text\"]")).sendKeys("hoshiarpur hanuman ji");
		driver.findElement(By.xpath("//*[@id=\"search\" and @type=\"text\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title=\"Hanuman Ji In Hoshiarpur | Day 1,2 | Dussehra 2021 | Mahabali Mahaveer Sewa Samiti Dal |\"]")).click();
		Thread.sleep(5000);
		TakesScreenshot shot = (TakesScreenshot)driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(file, new File("./Screenshot/image.png"+formattedDate+".txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ScreenShot Taken!");
		driver.quit();


	}

}


