package testCases;
import com.sun.javafx.PlatformUtil;

import dataRepo.flightBookinPageRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.driverSetup;
import utilities.waitForSearch;

	public class SignInTest {
		WebDriver driver; 
		driverSetup setup=new driverSetup();
		waitForSearch wait=new waitForSearch();

		@Test
		public void shouldThrowAnErrorIfSignInDetailsAreMissing(){
			setup.setDriverPath();
			setup.loadBrowser();
			flightBookinPageRepo flight=PageFactory.initElements(setup.driver, flightBookinPageRepo.class);
			this.driver=setup.driver;
			wait.waitFor(5000);
			flight.clickOnYourTrip();
			System.out.println("clickOnYourTrip");
			wait.waitFor(5000);
			flight.clickOnSignInButton();
			wait.waitFor(5000);
			setup.switchtoFrame("modal_window");
			wait.waitFor(5000);
			flight.clickOnSignButtonOnFrame();
			wait.waitFor(5000);
			String errors1 = driver.findElement(By.id("errors1")).getText();
			Assert.assertTrue(errors1.contains("There were errors in your submission"));
			wait.waitFor(5000);
	        setup.closeDriver();

        /*setDriverPath();
        driver.get("https://www.cleartrip.com/");
        waitFor(5000);
        driver.findElement(By.linkText("Your trips")).click();
        driver.findElement(By.id("SignIn")).click();
        waitFor(5000);
        driver.switchTo().frame("modal_window");
        waitFor(5000);
        driver.findElement(By.id("signInButton")).click();
        String errors1 = driver.findElement(By.id("errors1")).getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));
        waitFor(5000);
        driver.quit();*/
    }

   /* private void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @SuppressWarnings("restriction")
	private void setDriverPath() {
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
    }*/

}  

