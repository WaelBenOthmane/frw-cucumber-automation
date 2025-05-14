package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {

	private ConfigFileReader configFileReader;

	/** @FindBy **/

	@FindBy(how = How.CSS, using = "a[href='register.php']")
	public static WebElement linkResgister;

	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;

	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;

	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;

	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;

	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnEnvoyer;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")
	public static WebElement welcomeMsg;

	public RegisterPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/** Create methods **/

	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	public void clickOnResgister() {
		linkResgister.click();
	}

	public void fillFirstName(String fname) {
		firstName.sendKeys(fname);

	}

	public void fillLastName(String lname) {
		lastName.sendKeys(lname);

	}

	public void fillPhone(String nbrphone) {
		phone.sendKeys(nbrphone);

	}

	public void fillEmail(String mail) {
		email.sendKeys(mail);

	}

	public void clickOnBtnSubmit() {
		btnEnvoyer.click();

	}

	public String verifRegister() {

		return welcomeMsg.getText();

	}

}
