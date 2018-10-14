package dataRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hotelBookinPageRepo {
	
	@FindBy(linkText = "Hotels")
	public WebElement hotelLink;

    @FindBy(id = "Tags")
    public WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    public WebElement searchHotelsButton;

    @FindBy(id = "travellersOnhome")
    public WebElement travellerSelection;
    
    @FindBy(id="travellersOnhome")
    public WebElement travellersBox;
    
    @FindBy(className="subTitle")
    WebElement SubTitle;
 
    public void clickOnHotelLink(){
    	hotelLink.click();
    }
    
    public void enterInLocalitySearchBox(){
    	localityTextBox.sendKeys("Indiranagar, Bangalore");
    }
    
    public void clickOnSubTitle(){
    	SubTitle.click();
    }
    
    public WebElement gettravellerBoxId(){
    	return travellersBox;
    }
    
    public void clickOnSearchHotelButton(){
    	searchHotelsButton.click();
    }
 }
