package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	private RegisterPage registerPage;

	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
	}

	@Given("je me connecte sur le site Mercury")
	public void jeMeConnecteSurLeSiteMercury() {
		registerPage.goToUrl();
	}

	@When("je clique sur le lien REGISTER")
	public void jeCliqueSurLeLienREGISTER() {
		registerPage.clickOnResgister();
	}

	@Then("je me redirige vers la page REGISTER")
	public void jeMeRedirigeVersLaPageREGISTER() {

	}

	@When("je saisi le First Name {string}")
	public void jeSaisiLeFirstName(String fname) {
		registerPage.fillFirstName(fname);
	}

	@When("je saisi le Last Name {string}")
	public void jeSaisiLeFirstLastName(String lname) {
		registerPage.fillLastName(lname);
	}

	@When("je saisi le Phone {string}")
	public void jeSaisiLePhone(String phone) {
		registerPage.fillPhone(phone);
	}

	@When("je saisi l Email {string}")
	public void jeSaisiLEmail(String mail) {
		registerPage.fillEmail(mail);
	}

	@When("je clique sur le bouton Envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		registerPage.clickOnBtnSubmit();
	}

	@Then("je me redirige vers la page register success {string}")
	public void jeMeRedirigeVersLaPageRegisterSuccess(String verif) {
		Assert.assertEquals(verif, registerPage.verifRegister());
	}

}
