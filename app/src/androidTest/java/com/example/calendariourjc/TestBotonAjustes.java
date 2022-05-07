package com.example.calendariourjc;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestBotonAjustes {
    EventDetailActivity pantalla_notificacion;

    @Given("^la pantalla de inicio$")
    public void la_pantalla_de_inicio() throws Throwable {
        pantalla_notificacion = new EventDetailActivity<>();
    }

    @When("^se pulse el botón de ajustes$")
    public void se_pulse_el_botn_de_ajustes() throws Throwable {
        EventDetailActivity.BotonSalida.callOnClick();
    }

    @Then("^se irá a la pantalla de ajustes \"([^\"]*)\"$")
    public void se_ira_a_la_pantalla_de_ajustes(String strArg1) throws Throwable {
        assertEquals(MainActivity.class,EventDetailActivity.BotonSalida.getClass());
    }

}