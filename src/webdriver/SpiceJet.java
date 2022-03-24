package webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet {
	
	
	public static void selectDate(WebDriver driver,WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value',' "+dateVal+" ');", element);
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gourav.vig\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//From page
		
		driver.findElement(By.xpath("//*[text()=\"From\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"India\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Delhi\"]")).click();

		//To page
	//	driver.findElement(By.xpath("//*[text()=\"To\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Bengaluru\"]")).click();

		//Select departure date
		//Thread.sleep(5000);
		WebElement date = driver.findElement(By.xpath("//*[@data-testid=\"departure-date-dropdown-label-test-id\"]"));
		String dateVal="Mon, 4 Apr 2022";
		selectDate(driver, date, dateVal);
		
		//driver.findElement(By.xpath("//*[@data-testid=\"undefined-month-March-2022\"]//div[text()=\"18\"]")).click();

		//click next
		driver.findElement(By.xpath("//*[@data-testid=\"home-page-flight-cta\"]")).click();

		/*WebElement web = driver.findElement(By.xpath("(//*[@data-testid=\"spicemax-flight-select-radio-button-3\"]//..)[1]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click", web);*/

		//select spicemax button
		String fNumber = driver.findElement(By.xpath("//div[text()=\"SG 191\"]")).getText();
		System.out.println(fNumber);
		String fPrice = driver.findElement(By.xpath("(//*[text()=\"5,619\"])[1]")).getText();
		System.out.println("Rupees"+"="+ fPrice);

		driver.findElement(By.xpath("(//*[@data-testid=\"spicemax-flight-select-radio-button-3\"]//..)[1]")).click();
	//	driver.findElement(By.xpath("(//div[@data-testid=\"spicesaver-flight-select-radio-button-1\"])[2]")).click();
		try {
			driver.findElement(By.xpath("(//*[@data-testid=\"continue-search-page-cta\"])[3]")).click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//select title
		driver.findElement(By.xpath("//*[@data-testid=\"title-contact-detail-card\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Mr\"]")).click();
		//title.selectByVisibleText("Mrs");

		//contact details
		//name
		driver.findElement(By.xpath("//*[@data-testid=\"first-inputbox-contact-details\"]")).sendKeys("Balle");
		//last name
		driver.findElement(By.xpath("//*[@data-testid=\"last-inputbox-contact-details\"]")).sendKeys("Balle");
		//contact
		driver.findElement(By.xpath("//*[@data-testid=\"contact-number-input-box\"]")).sendKeys("9876543210");
		//email
		driver.findElement(By.xpath("//*[@data-testid=\"emailAddress-inputbox-contact-details\"]")).sendKeys("xyz@gmail.com");
		//town and city
		driver.findElement(By.xpath("//*[@data-testid=\"city-inputbox-contact-details\"]")).sendKeys("FurFuri Nagar");

		//Passenger details
		//name
		driver.findElement(By.xpath("//*[@data-testid=\"traveller-0-first-traveller-info-input-box\"]")).sendKeys("Balle");
		//last
		driver.findElement(By.xpath("//*[@data-testid=\"traveller-0-last-traveller-info-input-box\"]")).sendKeys("Balle");
		//number
		driver.findElement(By.xpath("//*[@data-testid=\"sc-member-mobile-number-input-box\"]")).sendKeys("9876543210");

		//Continue
		driver.findElement(By.xpath("//*[@data-testid=\"traveller-info-continue-cta\"]")).click();

		//Seat select
		driver.findElement(By.xpath("(//*[text()=\"1A\"])[1]")).click();

		//Adjacent Seat
		driver.findElement(By.xpath("(//*[@viewBox=\"0 0 18 18\"])[2]")).click();
		//Accept
		driver.findElement(By.xpath("//*[@style=\"height: 26px; width: 26px;\"]")).click();
		//System.out.println("hi");

		//Continue
		driver.findElement(By.xpath("(//*[text()=\"Continue\"])[2]")).click();
		//System.out.println("1");


		//select meal
		driver.findElement(By.xpath("(//*[text()=\"Select Meals\"]//..)[1]")).click();

		System.out.println("2");
			driver.findElement(By.xpath("//*[text()=\"Cucumber, tomato & cheese in multigrain bread\"]")).click();
			System.out.println("3");
			//done
			driver.findElement(By.xpath("(//*[text()=\"Done\"]//..)[1]")).click();

			//continue
			//driver.findElement(By.xpath("(//*[@style=\"border-radius: 0px;\"])[1]")).click();
			//System.out.println("4");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//*[text()=\"Continue\"]//..)[1]")).click();
			//System.out.println("5");

		//verify location
	    String loc =	driver.findElement(By.xpath("//*[@style=\"flex: 0.67 1 0%; -webkit-box-flex: 0.67;\"]")).getText();
		System.out.println(loc);
		//verify Price
		String price = driver.findElement(By.xpath("//*[@style=\"flex: 0.33 1 0%; -webkit-box-flex: 0.33;\"]")).getText();
		System.out.println(price);

		//convenience fee
		String convenienceFee = driver.findElement(By.xpath("(//*[@style=\"flex: 0.3 1 0%; -webkit-box-flex: 0.3;\"])[2]")).getText();
		System.out.println("Convenience Price: "+convenienceFee);

		//Payable Amount
		String payableAmt = driver.findElement(By.xpath("(//*[text()=\"Payable Amount\"]//../..)[1]")).getText();
		System.out.println(payableAmt);

		if(fPrice==price) {
			System.out.println("Price are same as First showing");
		}else {
			System.out.println("Price are not same as First showing");
		}

	}

}
