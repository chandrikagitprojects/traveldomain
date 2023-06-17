package traveldomain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class traveldomain {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
driver.get("https://www.mailtravel.co.uk/");
driver.manage().window().maximize();
//driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
WebElement searchbox=driver.findElement(By.cssSelector("#searchtext_freetext_search_form"));
searchbox.sendKeys("India");

Select select= new Select(driver.findElement(By.cssSelector("#searchtext_freetext_search_form")));
select.getFirstSelectedOption();

String u = driver.getCurrentUrl();
if
(u.equals("https://www.mailtravel.co.uk/holiday/india-f0050aa159413059b0d39248658bdb50"))


{
	System.out.println("Test case Passed");
}

else
	
	
{
	System.out.println("Test case Failed");
}



	}

}
