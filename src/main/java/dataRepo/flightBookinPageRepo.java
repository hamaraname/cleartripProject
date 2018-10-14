package dataRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flightBookinPageRepo {


	@FindBy(id="OneWay")
	public WebElement oneWayButton;
	
    @FindBy(id = "FromTag")
    public WebElement flightSearchFrom;

    @FindBy(id = "ToTag")
    public WebElement flightSearchTo;

    @FindBy(id = "SearchBtn")
    public WebElement SearchflightsButton;
    
    @FindBy(xpath="//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
    public WebElement datePickerForFlight;
    
    @FindBy(linkText="Your trips")
    public WebElement YourTrips;
    
    @FindBy(id="SignIn")
    WebElement SignInOnYourTrip;
    
    @FindBy(id="signInButton")
    public WebElement SignInButtonOnFrame;
    
    @FindBy(id="errors1")
    public WebElement SubmitError;
    
    
    public void clickOnOneWayRadioButton(){
    	oneWayButton.click();
    }
    
    public void clearFromSearchField(){
    	flightSearchFrom.clear();
    }
    
    public void enterCityNameInsearchFromBox(){
    	flightSearchFrom.sendKeys("Bangalore");
    }
    
    public void clearToSearchField(){
    	flightSearchTo.clear();
    }
    
    public void enterCityNameInsearchToBox(){
    	flightSearchTo.sendKeys("delhi");
    }
    
    public void selectDateFrom(){
    	datePickerForFlight.click();
    }
    
   public void clickOnSearchButton(){
	   SearchflightsButton.click();
   }
    
   public void clickOnYourTrip(){
	   YourTrips.click();
   }
   
   public void clickOnSignInButton(){
	   SignInOnYourTrip.click();
   }
    
   public void clickOnSignButtonOnFrame(){
	   SignInButtonOnFrame.click();
   }
    
    
    
    
    
       
}
