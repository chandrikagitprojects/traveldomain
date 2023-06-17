package traveldomain;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Secondpage {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.mailtravel.co.uk/holiday/india-f0050aa159413059b0d39248658bdb50");
driver.manage().window().maximize();

Thread.sleep(2000);


JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,400)");



//driver.findElement(By.xpath("//img[@src='image.php?nbf=light_arrow_r']")).click();

WebElement radio = driver.findElement(By.id("calbox-f0050aa159413059b0d39248658bdb50-1"));

radio.click();


WebElement dd = driver.findElement(By.xpath("//select[@id='numAdults-f0050aa159413059b0d39248658bdb50']"));
Select select= new Select(dd);
select.selectByVisibleText("2");

String price = driver.findElement(By.cssSelector(".ibecurr[data-curr='GBP'][data-amt='4198']")).getAttribute("price");

System.out.println(price);

driver.findElement(By.xpath("//div[@id='book-button']//div[contains(@class,'nbf_fancyimg_pms_add_button nbf_fg_pms_button_text nbf_bg_pms_button nbf_fg_pms_button_text')][normalize-space()='Book Online']")).click();
System.out.println(driver.getCurrentUrl());
String passengers = driver.findElement(By.cssSelector("div[class='nbf_tpl_pms_bf_passenger_type unit size1of2'] label")).getText();
System.out.println(passengers);
String departuringfrom = driver.findElement(By.cssSelector("label[for='departure-select-f0050aa159413059b0d39248658bdb50']")).getText();
System.out.println(departuringfrom);
String Departuredate = driver.findElement(By.cssSelector(".nbf_tpl_pms_bf_departuredate")).getText();
System.out.println(Departuredate);
WebElement dd1 = driver.findElement(By.id("room-1859919-numselect"));
Select select1= new Select(dd1);
select1.selectByVisibleText("1");
 
driver.findElement(By.xpath("//button[@class='nbf_button nbf_tpl_pms_book_button']")).click();
	
WebElement dd2 = driver.findElement(By.xpath("//select[@id='pax-a-title-1']"));

Select select2= new Select(dd2);
select2.selectByVisibleText("Mr");

WebElement firstnameField =driver.findElement(By.xpath("//input[@id='pax-a-first-1']"));
firstnameField.sendKeys("firstname");

WebElement lastnameField =driver.findElement(By.xpath("//input[@id='pax-a-last-1']"));
lastnameField.sendKeys("lastname");

WebElement dd3 = driver.findElement(By.xpath("//select[@id='pax-a-dobd-1']"));

Select select3= new Select(dd3);
select3.selectByVisibleText("10");

WebElement dd4 = driver.findElement(By.xpath("//select[@id='pax-a-dobm-1']"));

Select select4= new Select(dd4);
select4.selectByVisibleText("October");

WebElement dd5 = driver.findElement(By.xpath("//select[@id='pax-a-doby-1']"));

Select select5= new Select(dd5);
select5.selectByVisibleText("1989");



WebElement dd6 = driver.findElement(By.xpath("//select[@id='pax-a-title-2']"));

Select select6= new Select(dd6);
select6.selectByVisibleText("Mrs");

WebElement firstnameField1 =driver.findElement(By.xpath("//input[@id='pax-a-first-2']"));
firstnameField1.sendKeys("firsts");

WebElement lastnameField1 =driver.findElement(By.xpath("//input[@id='pax-a-last-2']"));
lastnameField1.sendKeys("lasts");

WebElement dd7 = driver.findElement(By.xpath("//select[@id='pax-a-dobd-2']"));

Select select7= new Select(dd7);
select7.selectByVisibleText("12");

WebElement dd8 = driver.findElement(By.xpath("//select[@id='pax-a-dobm-2']"));

Select select8= new Select(dd8);
select8.selectByVisibleText("December");

WebElement dd9 = driver.findElement(By.xpath("//select[@id='pax-a-doby-2']"));

Select select9= new Select(dd9);
select9.selectByVisibleText("1989");

WebElement yournamefield =driver.findElement(By.xpath("//input[@id='contact-name']"));
yournamefield.sendKeys("firstname lastname");

WebElement mobilephonenumberField =driver.findElement(By.xpath("//input[@id='contact-mobile']"));
mobilephonenumberField.sendKeys("07474747474");

WebElement emailfield =driver.findElement(By.xpath("//input[@id='contact-email']"));
emailfield.sendKeys("testing@gmail.com");

WebElement Addresslane1Field =driver.findElement(By.xpath("//input[@id='contact-address1']"));
Addresslane1Field.sendKeys("addr1");

WebElement Addresslane2Field =driver.findElement(By.xpath("//input[@id='contact-address2']"));
Addresslane2Field.sendKeys("add2");

WebElement cityField =driver.findElement(By.xpath("//input[@id='contact-city']"));
cityField.sendKeys("city");

WebElement postcodeField =driver.findElement(By.xpath("//input[@id='contact-postcode']"));
postcodeField.sendKeys("postcode");

WebElement dd10 = driver.findElement(By.xpath("//select[@id='contact-hearabout']"));

Select select10= new Select(dd10);
select10.selectByVisibleText("Email");

driver.findElement(By.xpath("//div[@class='nbf_fancy_paxButton nbf_fg_pms_button_text ']")).click();



	
	}

}
