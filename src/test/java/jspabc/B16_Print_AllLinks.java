package jspabc;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B16_Print_AllLinks {
	
	public WebDriver driver;
	
	
  @Test
  public void links() {
	  
       List<WebElement> str = driver.findElements(By.tagName("a"));
       
       System.out.println(str.size());
       
 
              for (int i = 0; i < str.size(); i++) {
            	  
            	  
            	  if (str.get(i).getText().equalsIgnoreCase("")) {
            		  
            		  System.out.println("Maintain some gaps in Application");
            		  
					
				}
            	  
            	
            	  
            	  
            	  System.out.println(str.get(i).getText());
            	  
            	  
            	 
       
		
	}
		
	}
            	  
				
			
 
	  
	  
  
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}