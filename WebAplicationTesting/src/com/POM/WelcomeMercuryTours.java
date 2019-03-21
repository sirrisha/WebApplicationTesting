package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {

    //Identification of elements on the web page
	//Operations done on the elements
	@FindBy(linkText="SIGN-ON")
	 WebElement SignOn;
	 
	public void signOn()
	{
		SignOn.click();
	}
	
	
	@FindBy(linkText="REGISTER")
	 WebElement Register;
	 
	public void register()
	{
		Register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	 WebElement Support;
	 
	public void support()
	{
		Support.click();
	}
	
	@FindBy(linkText="CONTACT")
	 WebElement Contact;
	 
	public void contact()
	{
		Contact.click();
	}
	
	
	@FindBy(name="userName") 
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement LogIn;
	
	 public void logIn(String userName,String password)
	 {
		 UserName.sendKeys(userName);
		 Password.sendKeys(password);
		 LogIn.click();
	 }
	 
	 @FindBy(name="firstName")
	 WebElement FirstName;
	
	 @FindBy(name="lastName")
	 WebElement LastName;
	 
	 @FindBy(name="phone")
	 WebElement Phone;
	 
	 @FindBy(id="userName")
	 WebElement Username;
	 
	 @FindBy(name="address1")
	 WebElement Address;
	 
	 @FindBy(name="city")
	 WebElement City;
	 
	 @FindBy(name="state")
	 WebElement  State;
	 
	 @FindBy(name="postalCode")
	 WebElement Postalcode;
	 
	 @FindBy(name="country")
	 WebElement  Country;
	 
	 @FindBy(name="email")
	 WebElement  Email;
	 
	 @FindBy(name="password")
	 WebElement passWord;
	 
	 @FindBy(name="confirmPassword")
	 WebElement ConfirmPassword;
	 
	 @FindBy(name="register")
	 WebElement reGister;
	 
	 
	   public void Register1(String firstName,String lastName,double d,String userName,String address1,String city,String state,String postalCode,String  country,String email,String password,String confirmPassword) 

	   {
		   FirstName.sendKeys(firstName);
		   LastName.sendKeys(lastName);
		   long x =(long)d;
			 String phone =Long.toString(x);
			  
		   Phone.sendKeys(phone);
		   Username.sendKeys(userName);
		   Address.sendKeys(address1);
		   City.sendKeys(city);
		   State.sendKeys(state);
		   Postalcode.sendKeys(postalCode);
		   Country.sendKeys(country);
		   Email.sendKeys(email);
		   passWord.sendKeys(password);
		   ConfirmPassword.sendKeys(confirmPassword);
		   reGister.click(); 
		   
	 }
	
	
	
	
	
	
	
}
