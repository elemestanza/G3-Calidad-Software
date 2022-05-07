package com.example.calendariourjc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "app/java/com.example/calendariourjc/Features"
)
public class TestModificar {

    @Given("^la pantalla de añadir notificación$")
    public void la_pantalla_de_aadir_notificacin() throws Throwable {
        throw new PendingException();
    }

    @When("^se esté en la pantalla de añadir notificación$")
    public void se_est_en_la_pantalla_de_aadir_notificacin() throws Throwable {
        throw new PendingException();
    }

    @Test
    @Then("^habrá un diseño comprensible para poder añadir una notificación$")
    public void habr_un_diseo_comprensible_para_poder_aadir_una_notificacin() throws Throwable {
        assertNotNull(EventDetailActivity.descriptionView.getText());
        throw new PendingException();
    }

}