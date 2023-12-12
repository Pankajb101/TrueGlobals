package Main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import AmazonAssignment.Registration;
import AmazonAssignment.SearchProduct;


public class Run {
	WebDriver driver;
	Registration res;
	SearchProduct ser;
	
  @Test(priority=0)
  public void Openweb() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  this.driver = new ChromeDriver();
	  res=new Registration(driver);
	  ser=new SearchProduct(driver);
	  	  
	  this.driver.get("https://www.amazon.in/");
	  
	  Thread.sleep(4000);
	  
  }
 /*@Test(priority=1)
  public void registeruser() throws InterruptedException
  {
	  Thread.sleep(2000);
	  res.signinbtn.click();
	  res.createacct.click();
	  Thread.sleep(3000);
	  res.name.sendKeys("Pankaj patil");
      res.mobile.sendKeys("9021326164");
      res.email.sendKeys("pankajpatil01@gmail.com");
      res.password.sendKeys("Pankajp@18");
      res.submit.click();
          
	  Thread.sleep(5000);

		  
	  }*/
 
 @Test(priority=2)
 public void AddtoCart() throws InterruptedException
 {
	  ser.Searchbox.sendKeys("Iphone 13");
	  ser.Search.click();
	  Thread.sleep(1000);
	  ser.find.click();
	  
	  String parent = driver.getWindowHandle(); 
	  Set<String> windows = new HashSet<String>(); 
	  windows=(driver.getWindowHandles()); 
	   //driver.switchTo().window(windows.); 
	   // 
	   
	                   Iterator<String> itr=windows.iterator(); 
	                   while(itr.hasNext()) 
	                   { 
	                    String childwindow=itr.next(); 
	               
	              if(!parent.equalsIgnoreCase(childwindow)) 
	              { 
	               driver.switchTo().window(childwindow); 
	               //System.out.println("current page title  "+driver.getCurrentUrl()); 
	              } 
	                   }
	                   
	  ser.add.click();
	  }
 

}


