package com.Cucumber2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	public static WebDriver driver;


	@FindBy(name="username")
	private WebElement Username;
	@FindBy(id="password")
	private WebElement Password;
	@FindBy(name="login")
	private WebElement Login;
	@FindBy(name="location")
	private WebElement Location;
	@FindBy(name="hotels")
	private WebElement Hotel;
	@FindBy(name="room_type")
	private WebElement Room;
	@FindBy(name="room_nos")
	private WebElement Noroom;
	@FindBy(name="adult_room")
	private WebElement Adultroom;
	@FindBy(name="child_room")
	private WebElement childroom;
	@FindBy(name="Submit")
	private WebElement Search;
	@FindBy(name="radiobutton_0")
	private WebElement Radio;
	@FindBy(name="continue")
	private WebElement Continue;
	@FindBy(name="first_name")
	private WebElement firstname;
	@FindBy(name="last_name")
	private WebElement lastname;
	@FindBy(xpath="//textarea[@class='txtarea']")
	private WebElement Address;
	@FindBy(xpath="(//input[@class='reg_input'])[3]")
	private WebElement Cardnumber;
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement CardType;
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	private WebElement ExpiryMonth;
	@FindBy(xpath="(//select[@class='select_combobox2'])[2]")
	private WebElement ExpiryYear;
	@FindBy(name="cc_cvv")
	private WebElement CVV;
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement Book;
	@FindBy(xpath="//input[@value='My Itinerary']")
	private WebElement Itinerary;
	@FindBy(xpath="//input[@value='Logout']")
    private WebElement Logout;

	
	//Constructor
	
	
	
	public POM(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoom() {
		return Room;
	}

	public WebElement getNoroom() {
		return Noroom;
	}

	public WebElement getAdultroom() {
		return Adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getRadio() {
		return Radio;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCardnumber() {
		return Cardnumber;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBook() {
		return Book;
	}
	public WebElement getItinerary() {
		return Itinerary;
	}
	public WebElement getLogout() {
	return Logout;


	}

}
