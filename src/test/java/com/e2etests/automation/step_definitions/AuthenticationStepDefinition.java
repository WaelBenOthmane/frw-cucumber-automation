package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authentificationPage;

	public AuthenticationStepDefinition() {
		this.authentificationPage = new AuthenticationPage();
	}

	@Given("je me connecte sur lapplication Mercury")
	public void jeMeConnecteSurLapplicationMercury() {
		authentificationPage.goToUrl();

	}

	@When("je saisi le Username {string}")
	public void jeSaisiLeUsername(String name) {

		authentificationPage.fillUserName(name);
	}

	@When("je saisi le Password {string}")
	public void jeSaisiLePassword(String password) {
		authentificationPage.fillPassword(password);
	}

	@When("je clique sur le bouton Submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authentificationPage.clickOnBtnSubmit();
	}

	@Then("je me redirige vers la page dacceuil {string}")
	public void jeMeRedirigeVersLaPageDacceuil(String text) {
		String msg = authentificationPage.welcomeMsg.getText();
		Assert.assertEquals(text, msg);
	}

}
