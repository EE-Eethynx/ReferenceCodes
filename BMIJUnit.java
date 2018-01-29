import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BMIJUnit {

	@Test
	public void test() {
		
		//Exercise 4: Real Web Test (BMI calculator)
		
		// Use Chrome browser to visit www.google.com and quit
		//remember to find where the driver and define the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\163912T\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
					
		driver.get("http://www.calculator.net/bmi-calculator.html");
		
		String expectedresult = "BMI = 15.79 kg/m2";
		
		WebElement age;
		age=driver.findElement(By.xpath("//*[@id=\"cage\"]"));
		age.clear();
		age.sendKeys(String.valueOf(30));
		
		WebElement heightfeet;
		heightfeet=driver.findElement(By.xpath("//*[@id=\"cheightfeet\"]"));
		heightfeet.clear();
		heightfeet.sendKeys(String.valueOf(6));
		
		WebElement heightinches;
		heightinches=driver.findElement(By.xpath("//*[@id=\"cheightinch\"]"));
		heightinches.clear();
		heightinches.sendKeys(String.valueOf(15));
		
		WebElement weight;
		weight=driver.findElement(By.xpath("//*[@id='cpound']"));
		weight.clear();
		weight.sendKeys(String.valueOf(170));
		
		WebElement btnCalculate;
		btnCalculate=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/table[4]/tbody/tr/td[1]/input[2]"));
		btnCalculate.click();
		
		WebElement result;
		result=driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/b"));			
		System.out.print(result.getText());
		assertEquals("Wrong taxable amount", result.getText(), expectedresult);
						

		//hold on for a while before quitting
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}
		
	

}
