package com.e2etests.automation.step_definitions;

import org.junit.Assert;


import com.e2etests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	private LoginPage loginPage;
	
	public LoginStepDefinition() {
		this.loginPage = new LoginPage();
	}

	@Given("je me connecte sur lapplication Swag Labs")
	public void jemeconnectesurlapplicationSwagLabs() {
		loginPage.goToUrl();

	}

	@When("je saisi le User name {string}")
	public void jesaisiLeUsername(String name) {

		loginPage.fillUserName(name);
	}

	@When("je saisi le password {string}")
	public void jesaisiLepassword(String password) {
		loginPage.fillPassword(password);
	}

	@When("je clique sur le bouton login")
	public void jecliqueSurLeboutonlogin() {
		loginPage.clickOnBtnSubmit();
	}

	@Then("je me redirige vers la page d acceuil {string}")
	public void jemeredirigeverslapagedacceuil(String text) {
		String msg = loginPage.welcomemsg.getText();
		Assert.assertEquals(text, msg);
	}
	
	
	@Then("le message d erreur s affiche {string}")
	public void lemessagederreursaffiche(String text) {
		String msg = loginPage.errormsg.getText();
		Assert.assertEquals(text, msg);
	}
	
	
	@Given("je me connecte sur lapplication Swag Labs avec UserName {string} et Password {string}")
	public void jeMeConnecteSurLapplicationSwagLabsAvecUserNameEtPassword(String login, String password) {
		loginPage.login(login, password);
	}

	
	@Given("je me connecte a lapplication Swag Labs")
	public void jeMeConnecteALapplicationSwagLabs() {
		loginPage.loginCP();
	}




	
}
