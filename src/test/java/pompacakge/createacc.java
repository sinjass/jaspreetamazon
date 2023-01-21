package pompacakge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.baseamazonclass;


public class createacc extends baseamazonclass{
// object   repository 
	@FindBy(id="ap_customer_name")
     WebElement Yourname;

@FindBy(id="ap_email")
WebElement Mobilenumberoremail;

@FindBy(id="ap_password")
WebElement Password;

@FindBy(id="ap_password_check")
WebElement Passwordagain;

@FindBy(id= "continue")
WebElement continuebtn;




//initialize page element
public createacc() {
	PageFactory.initElements(driver,this);
	
}
public void typeyourname(String name) {
	Yourname.sendKeys("name");
}

public void typepassword(String pass) {
	Password.sendKeys("pass");
}

public void typepassagn(String passagn) {
	Passwordagain.sendKeys("passagn");
}
public void continuebutton() {
	continuebtn.click();
}
}




