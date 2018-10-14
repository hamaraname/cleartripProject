package testCases;
import com.sun.javafx.PlatformUtil;

import dataRepo.flightBookinPageRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.driverSetup;
import utilities.waitForSearch;

import java.util.List;

public class FlightBookingTest {
	WebDriver driver; 
    driverSetup setup=new driverSetup();
    waitForSearch wait=new waitForSearch();
    
    @Test
    public void testThatResultsAppearForAOneWayJourney() {  
    	setup.setDriverPath();
    	setup.loadBrowser();
    	this.driver=setup.driver;
    	flightBookinPageRepo flight= PageFactory.initElements(driver,flightBookinPageRepo.class);
    	wait.waitFor(5000); 	
    	flight.clickOnOneWayRadioButton();
    	flight.clearFromSearchField();
    	flight.enterCityNameInsearchFromBox();
    	wait.waitFor(5000);
    	wait.selectOriginCityFromDropDown(driver);
    	flight.clearToSearchField();
    	flight.enterCityNameInsearchToBox();
    	wait.waitFor(5000);
    	wait.selectDestinationCityFromDropDown(driver);
    	flight.selectDateFrom();
    	wait.waitFor(5000);
    	flight.clickOnSearchButton();
    	wait.waitFor(5000);
    	 //verify that result appears for the provided journey search
        Assert.assertTrue(setup.isElementPresent(By.className("searchSummary")));
    	setup.closeDriver();
    	    
    }
 
 }
