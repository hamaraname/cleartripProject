package testCases;
import com.sun.javafx.PlatformUtil;

import dataRepo.hotelBookinPageRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.driverSetup;
import utilities.waitForSearch;

	public class HotelBookingTest {
		WebDriver driver; 
	    driverSetup setup=new driverSetup();
	    waitForSearch wait=new waitForSearch();

    @Test
    public void shouldBeAbleToSearchForHotels() {
    	setup.setDriverPath();
    	setup.loadBrowser();
    	this.driver=setup.driver;
    	hotelBookinPageRepo hotel=PageFactory.initElements(driver, hotelBookinPageRepo.class);
    	hotel.clickOnHotelLink();
    	wait.waitFor(5000);
    	hotel.enterInLocalitySearchBox();
    	System.out.println("enterInLocalitySearchBox");
    	wait.waitFor(5000);
    	wait.selectHotelsInCity(driver);
    	wait.waitFor(5000);
    	hotel.clickOnSubTitle();
    	wait.waitFor(3000);
    	WebElement element=hotel.gettravellerBoxId();
    	wait.selectTravellersDetails("1 room, 1 adult",element);
    	System.out.println("selectTravellersDetails");
    	wait.waitFor(5000);
    	hotel.clickOnSearchHotelButton();
    	System.out.println("clickOnSearchHotelButton");
    	wait.waitFor(5000);
    	setup.closeDriver();
    	
    }

}
