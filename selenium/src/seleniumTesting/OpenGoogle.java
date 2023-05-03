package seleniumTesting;

import java.awt.Frame;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\globeitzone.lk\\Desktop\\QA\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//WebDriverWait wait = new WebDriverWait(driver,30);
driver.get("https://www.google.com");
driver.get("https://itera-qa.azurewebsites.net/home/automation");

 List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox'and contains(@id,'day')]"));
 System.out.println("Total no of checkboxes:" + checkboxes.size());
 //driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[4]/label")).click();



 



//driver.get("https://www.spicejet.com/");
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.navigate().to("https://www.browserstack.com/selenium");
//driver.navigate().to("https://www.guru99.com");
//driver.navigate().forward();
//driver.navigate().back();
//driver.navigate().refresh();
//driver.switchTo().frame(1);
//driver.switchTo().frame("resultframe");
//WebElement iframeElement = driver.findElement(By.id("resultframe"));
//driver.switchTo().frame(iframeElement);
//driver.findElement(By.name("q")).sendKeys("gggg");




//driver.quit();
	
	
	}

}
