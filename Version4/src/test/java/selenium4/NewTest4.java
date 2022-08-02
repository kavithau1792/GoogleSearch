package selenium4;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest4 {
	WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	 	driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }

  @Test(enabled=false)
  public void f() throws InterruptedException
  {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
//	  String title=js.executeScript("return document.title").toString();
//	  System.out.println(title);
//	  String url=js.executeScript("return document.URL").toString();
//	  System.out.println(url);
//	  String domain=js.executeScript("return document.domain").toString();
//	  System.out.println(domain);
//	  
//	  String alltext=js.executeScript("return document.documentElement.innerText").toString();
//	  System.out.println(alltext);
	  /*String parenttab=driver.getWindowHandle();
	  System.out.println(parenttab);
	  
	  WebDriver newtab=driver.switchTo().newWindow(WindowType.TAB);
	  newtab.get("https://www.f1.com");
	  Thread.sleep(3000);
	  
	  Set<String> alltab=driver.getWindowHandles();
	  Object[] altab=alltab.toArray();
	  System.out.println(alltab.size());
	  
	  driver.switchTo().window((String)altab[0]);
	  driver.close();
	  
	  driver.switchTo().window((String)altab[1]);
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
	  //driver.quit();*/
	  
	  String parenttab=driver.getWindowHandle();
	  System.out.println(parenttab);
	 WebDriver newtab = driver.switchTo().newWindow(WindowType.TAB);
	 newtab.get("https://f1.com");
	  Thread.sleep(3000);
	//  driver.navigate().back();
	  ///declare parent tab
	  Set<String> alltab = driver.getWindowHandles();
	  Object [] altab= alltab.toArray();
	 
	  System.out.println(alltab.size());
	//  driver.switchTo().window(parenttab);
	// driver.get("https://google.com");
	  driver.switchTo().window((String) altab[0]);
	  driver.close();
	  driver.switchTo().window((String)altab[1]);
	  driver.get("https://google.com");
	  Thread.sleep(3000);
	  	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Moolya",Keys.ENTER);
//	  	Actions alt= new Actions(driver);
//		 alt.sendKeys(Keys.PAGE_DOWN).build().perform();
//		  js.executeScript("window.scrollBy(0,600)");
//		  //if you want to scroll to the end of the page, then you can use document.body.scrollHeight
//		 
//		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		  Thread.sleep(3000);
//		  //I want to scroll up, if I want to scroll all the way up then I use -
//		  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		  Thread.sleep(3000);
//		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		  driver.findElement(By.id("btnLogin")).click();
//		  Thread.sleep(3000);
//		  driver.findElement(By.linkText("PIM")).click();
//		  driver.findElement(By.linkText("Employee List")).click();
//		  Thread.sleep(3000);
//		  js.executeScript("document.getElementById('ohrmList_chkSelectRecord_29').scrollIntoView()");
	  js.executeScript("document.getElementsByClassName('LC20lb MBeuO DKV0Md')[4].scrollIntoView()");
	  Thread.sleep(3000);
	  driver.findElement(By.partialLinkText("Moolya Software Testing Reviews by 48 Employees")).click();
  }
  @Test
  public void test1() throws InterruptedException 
  {
	  	JavascriptExecutor	js=( JavascriptExecutor)driver;
		 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cricinfo",Keys.ENTER);
		 Thread.sleep(3000);
		 driver.findElement(By.partialLinkText("Live cricket scores, match schedules, latest cricket news ...")).click();
		 driver.findElement(By.partialLinkText("Teams")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("India")).click();
		 Thread.sleep(2000);
		 js.executeScript("document.getElementsByClassName('ds-flex ds-flex-row ds-space-x-4')[0].scrollIntoView()");
		 Thread.sleep(3000);
		 driver.findElement(By.partialLinkText("Ganguly, Morgan, Muralidaran, Misbah, Johnson among 53 players in Legends League Cricket")).click();		 
  }
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
