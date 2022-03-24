package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gourav.vig\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");

		driver.manage().window().maximize();
		//Login facebook without entering any details.

		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();

		//Login facebook with valid email address or phone number and invalid password.

		driver.findElement(By.id("email")).sendKeys("selenium123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();

		//Login facebook with unregister email address or phone number.

		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("qwert");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();

		//Create a new facebook account.

		driver.findElement(By.className("_97w5")).click();
		driver.findElement(By.name("firstname")).sendKeys("udta");
		driver.findElement(By.name("lastname")).sendKeys("jahag");
		driver.findElement(By.name("reg_email__")).sendKeys("udtajahaj@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("udtajahaj@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("asd123");

		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(2);

		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jan");

		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("2000");

		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.name("websubmit")).click();


		//Login facebook with valid email address or phone number and passwords.



	}

}
