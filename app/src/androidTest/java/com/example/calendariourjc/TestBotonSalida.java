package com.example.calendariourjc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestBotonSalida {

    @Test
    @Given("^la pantalla de añadir notificación$")
    public void la_pantalla_de_aadir_notificacin() throws Throwable {
        throw new PendingException();
    }

    @When("^se pulse el botón de salida$")
    public void se_pulse_el_botn_de_salida() throws Throwable {
        throw new PendingException();
    }

    @Then("^se volverá a la pantalla \"([^\"]*)\"$")
    public void se_volver_a_la_pantalla_something(String strArg1) throws Throwable {
        assertEquals(new MainActivity(),EventDetailActivity.BotonSalida.callOnClick());
        throw new PendingException();
    }

}
