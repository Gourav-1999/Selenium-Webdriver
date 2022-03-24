package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeStamp {

	static WebDriver driver;
	public static void main(String[] args){
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/gourav.vig/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		//LocalDateTime date = LocalDateTime.now();
		//DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		//String formattedDate = date.format(dataFormat);


		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Youtube");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("(//*[text()=\"YouTube\"])[1]")).click();
		WebElement web1= driver.findElement(By.xpath("//*[@id=\"search\" and @type=\"text\"]"));
		web1.sendKeys("hoshiarpur hanuman ji");
		web1.submit();
	//	driver.findElement(By.xpath("//*[@id=\"search\" and @type=\"text\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@title=\"Hanuman Ji In Hoshiarpur | Day 1,2 | Dussehra 2021 | Mahabali Mahaveer Sewa Samiti Dal |\"]")).click();
		//Thread.sleep(5000);
		/*TakesScreenshot shot = (TakesScreenshot)driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(file, new File("./Screenshot/image.png"+formattedDate+".txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ScreenShot Taken!");*/


		System.out.println("hi");
		//String finalTime = driver.findElement(By.xpath("//span[@class=\"ytp-time-duration\"]")).getText();
		//System.out.println("hii");
		//System.out.println();
		int ftime = changeTime("05:00");
		System.out.println(ftime);
		int ctime = 0;


		WebElement music_player = driver.findElement(By.xpath("//*[@id=\"movie_player\"]"));
		//System.out.println("hiii");
		while(ctime != ftime) {
			try {
				Thread.sleep(4830);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Before");
			music_player.click();
			System.out.println("After");
			WebElement currTime = driver.findElement(By.xpath("//span[@class=\"ytp-time-current\"]"));
			String currentTime = currTime.getText();
			ctime = changeTime(currentTime);
			System.out.println(ctime+" "+currentTime);
		if(ctime % 5 == 0) {
			System.out.println(currentTime);
		}
		music_player.click();


	}
	}
	private static int changeTime(String time) {
		// TODO Auto-generated method stub
		int val1=0, val2=0;
		try {
			String str[] = time.split(":");
			val1 = Integer.parseInt(str[0]);
			val2 = Integer.parseInt(str[1]);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.toString();
		}
		int tm = val1 * 60 + val2;
		return tm;
	}

}
