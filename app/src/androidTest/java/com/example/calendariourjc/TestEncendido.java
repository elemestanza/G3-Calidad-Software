package com.example.calendariourjc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestEncendido {

    EventDetailActivity pantalla_notificacion;

    @Test
    @Given("^el icono de la app$")
    public void icono_de_la_app() throws Throwable {
        pantalla_notificacion = new EventDetailActivity<>();
    }

    @When("^se pulse el icono de la app$")
    public void se_pulse_el_botn_de_la_app() throws Throwable {
        CalendarActivity.BotonIni.getClass();
    }

    @Then("^se abrirá correctamente \"([^\"]*)\"$")
    public void se_abrirá_correctamente(String strArg1) throws Throwable {
        assertEquals(MainActivity.class,CalendarActivity.BotonIni.getClass());
    }

}
