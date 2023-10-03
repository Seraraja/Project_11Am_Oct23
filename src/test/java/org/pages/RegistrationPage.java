package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement btnCreate;
	
	@FindBy(name = "firstname")
	private WebElement txtFirstname;
	
	@FindBy(name = "lastname")
	private WebElement txtlastname;
	
	@FindBy(name = "websubmit")
	private WebElement btnSignUp;
	
	@FindBy(id="day")
	private WebElement day; 

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}
	
	public WebElement getDay() {
		return day;
	}
	
	@FindBy(xpath="(//option[@value='4'])[1]")
	private WebElement drop;
	
	public WebElement getDrop() {
		return drop;
	}

}
