package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrainStation23 {

	public static void main(String[] arg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://test.sharebus.co/");
		driver.findElement(By.xpath("//body/div[@id='app']/nav[1]/div[1]/ul[1]/li[1]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("brainstation23@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Pass@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
		//user selection
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/span/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/div/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/button/span[1]")).click();
		//set sharelead
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#app > div.body-wrapper > div.col-sm-12.col-md-11.col-lg-11.col-xl-10.col-xxl-9.mx-auto.text-start > button > div > span:nth-child(1)")).click();
		//location selection
		driver.findElement(By.id("startPoint")).sendKeys("Oslo Norway");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,675)");
		driver.findElement(By.id("destination")).sendKeys("Kolbotn Norway");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]")).click();
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[1]/span/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/button[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[2]/span/input")).click();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[3]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[2]/button[2]/span[1]")).click();
		//Membership page
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,3000)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[1]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[2]/ul/li[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/div[2]/button[2]/span[1]")).click();
		//need ticket and discount
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[5]/button[2]/span[1]")).click();
		//Thanks creating sharebus
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[4]/button/span[1]")).click();
		//Trip name and category
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/form/div[1]/div/input")).sendKeys("Yearly Refreahment Tour");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"vacation3\"]/p")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/form/div[5]/button/span[1]")).click();
		//Trip preview
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tripPreviewModal\"]/div/div/div[3]/button[2]/span[1]")).click();
		//My busses
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div/ul/li[1]/button")).click();
		
		driver.quit();
		
		
		
	}


}
