package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dataRepo.hotelBookinPageRepo;

public class waitForSearch {
	// WebDriver driver; 
    driverSetup setup=new driverSetup();
	
	 public void waitFor(int durationInMilliSeconds) {
	        try {
	            Thread.sleep(durationInMilliSeconds);
	        } catch (InterruptedException e) {
	            e.printStackTrace(); 
	        }
	    }

	 public void selectOriginCityFromDropDown(WebDriver driver){
		 List<WebElement> originOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
	        originOptions.get(0).click();
	 }
	 
	 public void selectDestinationCityFromDropDown(WebDriver driver){
			 List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
			 destinationOptions.get(0).click();
		 } 
	 // ui-id-1
	 public void selectHotelsInCity(WebDriver driver){
		 List<WebElement> hotels = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
		 hotels.get(0).click();
	 }
	 
	
	 
	 
	 
	 public void selectTravellersDetails(String visibleText,WebElement travellersOnhome){		 
		 Select select=new Select(travellersOnhome);
		 select.selectByVisibleText(visibleText);
		 
	 }
	 
}
