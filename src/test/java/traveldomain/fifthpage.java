package traveldomain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fifthpage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.mailtravel.co.uk/payment.php?205e0d12-0aad-11ee-aaeb-20677cd381a0");
		       
		            	driver.manage().window().maximize();

	}

}
