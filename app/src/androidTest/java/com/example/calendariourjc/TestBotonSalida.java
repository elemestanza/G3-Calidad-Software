package com.example.calendariourjc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.example.calendariourjc.EventDetailActivity;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
public class TestBotonSalida {

    @Given("^la pantalla de añadir notificación$")
    public void la_pantalla_de_aadir_notificacin() throws Throwable {

    }

    @When("^se pulse el botón de salida$")
    public void se_pulse_el_botn_de_salida() throws Throwable {
        throw new PendingException();
    }

    @Then("^se volverá a la pantalla \"([^\"]*)\"$")
    public void se_volver_a_la_pantalla_something(String strArg1) throws Throwable {
        assertEquals(new MainActivity(),EventDetailActivity.BotonSalida.callOnClick());
    }

}
