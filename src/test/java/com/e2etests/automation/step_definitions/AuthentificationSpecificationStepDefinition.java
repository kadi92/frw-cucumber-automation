package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthentificationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationSpecificationStepDefinition {

	private AuthentificationPage authentificationPage;

	public AuthentificationSpecificationStepDefinition() {
		authentificationPage = new AuthentificationPage();
	}

	@Given("Je me connecte sur le site Mercury")
	public void jeMeConnecteSurLeSiteMercury() {
		authentificationPage.gotoUrl();
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authentificationPage.fillUserName(name);
	}

	@When("Je saisie le password {string}")
	public void jeSaisieLePassword(String password) {
		authentificationPage.fillPassword(password);
	}

	@When("Je clique sur le boutton submit")
	public void jeCliqueSurLeBouttonSubmit() {
		authentificationPage.clickOnBtnLogin();
	}

	@Then("Je me  redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthentificationPage.welcomeMessage.getText();
		Assert.assertEquals(text, message);
	}

}
