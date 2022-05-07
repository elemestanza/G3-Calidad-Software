package com.example.calendariourjc;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestBotonSalida {
    EventDetailActivity pantalla_notificacion;

    @Given("^la pantalla de añadir notificación$")
    public void la_pantalla_de_aadir_notificacin() throws Throwable {
        pantalla_notificacion = new EventDetailActivity<>();
    }

    @When("^se pulse el botón de salida$")
    public void se_pulse_el_botn_de_salida() throws Throwable {
        EventDetailActivity.BotonSalida.callOnClick();
    }

    @Then("^se volverá a la pantalla \"([^\"]*)\"$")
    public void se_volver_a_la_pantalla_something(String strArg1) throws Throwable {
        assertEquals(MainActivity.class,EventDetailActivity.BotonSalida.getClass());
    }

}