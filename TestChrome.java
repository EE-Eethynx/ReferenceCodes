import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {
public static void main(String[] args) throws InterruptedException {
  
  //load the web driver for chrome
  // ...
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\163912T\\Downloads\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://composition.sit.nyp.edu.sg:8081");
  WebElement chargeableIncome , btnCalculate;
  
  
  for(int i = 0;i < 9; i++)
  {
   
   chargeableIncome = driver.findElement(By.name("txtChargebleIncome"));
   chargeableIncome.clear();
   
   if (i == 0)
    chargeableIncome.sendKeys("3000");
   
   else if (i == 1)
    chargeableIncome.sendKeys("25000");
   
   else if (i == 2)
    chargeableIncome.sendKeys("35000");
   
   else if (i == 3)
    chargeableIncome.sendKeys("65000");
   
   else if (i == 4)
    chargeableIncome.sendKeys("100000");
   
   else if (i == 5)
    chargeableIncome.sendKeys("150000");
   
   else if (i == 6)
    chargeableIncome.sendKeys("180000");
   
   else if (i == 7)
    chargeableIncome.sendKeys("250000");
   
   else if (i == 8)
    chargeableIncome.sendKeys("350000");
   
      btnCalculate = driver.findElement(By.name("butCalculate"));
   btnCalculate.click();
   Thread.sleep(1000);
   
  }
  
  
  
}
 

}