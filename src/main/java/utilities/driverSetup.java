package utilities;

import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driverSetup {
	public WebDriver driver;	
	@SuppressWarnings("restriction")
	public void setDriverPath() {    	
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
        	 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");          
             ChromeOptions options = new ChromeOptions();
             options.addArguments("--disable-extensions");
             options.addArguments("--disable-notifications");
             driver = new ChromeDriver(options);
           
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }   	
    }
    
	 public boolean isElementPresent(By by) {
	        try {
	            driver.findElement(by);
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }
	 
	public void closeDriver(){
		if(driver!=null)
			driver.quit();
	}
	
	public void loadBrowser(){		
		driver.get("https://www.cleartrip.com/");
	}
	
	public void switchtoFrame(String frameName){
		driver.switchTo().frame(frameName);
	}

}
