import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCalcTaxJUnit {

	public static void main(String[] args) throws InterruptedException {
		
		// Use Chrome browser to visit www.google.com and quit
		//remember to find where the driver and define the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\163912T\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
					
		driver.get("http://composition.sit.nyp.edu.sg:8081/");
		WebElement searchTitle; 
		searchTitle=driver.findElement(By.name("txtChargebleIncome"));
		searchTitle.sendKeys("30 000");
		
		WebElement buttonCalculate;
		buttonCalculate = driver.findElement(By.name("butCalculate"));
		buttonCalculate.click();
				
		//hold on for a while before quitting
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		taxable = driver.findElement(By.name("txtGrossTaxPayable"));
		assertEquals("Wrong taxable amount", taxable.getAttribute("value"), "375.00");
		

		
		driver.quit();
	}

}
