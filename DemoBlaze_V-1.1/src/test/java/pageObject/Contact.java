package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact extends BasePage {

	public Contact(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='recipient-email']")
	WebElement txtEmail;
	@FindBy(xpath = "//input[@id='recipient-name']")
	WebElement txtContactName;
	@FindBy(xpath = "//textarea[@id='message-text']")
	WebElement txtMessage;
	@FindBy(xpath = "//button[normalize-space()='Send message']")
	WebElement btnSendMessage;

	public void enter_Email_Address(String email) {
		txtEmail.sendKeys(email);
	}

	public void enter_Contact_Name(String cntname) {
		txtContactName.sendKeys(cntname);
	}

	public void write_Text_Message(String msg) {
		txtMessage.sendKeys(msg);
	}

	public void click_on_Send_Message() {
		btnSendMessage.click();

	}

}
