package co.com.tigo.qa.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

import java.util.*;
import java.util.regex.*;

import co.com.tigo.qa.interactions.Spinner;
import co.com.tigo.qa.models.Paquetigos;
import co.com.tigo.qa.questions.ElMensaje;
import co.com.tigo.qa.tasks.Paquetes;
import co.com.tigo.qa.utils.EsperaForzada;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class PaquetesStepDefinition {
    Actor usuario = Actor.named("Metis");

    @Before
    public void setup() {
        setTheStage(OnlineCast.ofStandardActors());
        usuario.can(BrowseTheWeb.with(hisBrowser));
    }

    @Managed
    WebDriver hisBrowser;





    @When("^selecciono el paquete TigoTePresta")
    public void seleccionoElPaqueteTigoTePresta(List<Paquetigos> paquetigo) {
        Spinner.queDesaparezcaElSpinner();
               usuario.attemptsTo(
                Paquetes.TigoTePresta(paquetigo.get(0)));

    }


    @Then("el usuario puede ver la confirmacion de la transaccion (.*)$")
    public void elUsuarioPuedeVerLaConfirmacionDeLaTransaccion(String respuesta) {
        EsperaForzada.espera(20);
        Pattern pattern = Pattern.compile("uat", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(DetalleOrdenesStepDefinition.propertiesLoader.getProperty("webdriver.base.url"));
        boolean matchFound = matcher.find();
        if (matchFound) {

            usuario.should(GivenWhenThen.seeThat(ElMensaje.confirmacionPago(respuesta), Matchers.is(respuesta)));

        }
    }



    @Then("debe ver el mensaje la transaccion (.*)$")
    public void debeVerElMensajeLaTransaccion(String MensajeConfirmacion) {
        EsperaForzada.espera(20);
        Pattern pattern = Pattern.compile("uat", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(DetalleOrdenesStepDefinition.propertiesLoader.getProperty("webdriver.base.url"));
        boolean matchFound = matcher.find();
        if (matchFound) {
            usuario.should(GivenWhenThen.seeThat(ElMensaje.tituloEliminacionPaqueteActivo(), Matchers.is(MensajeConfirmacion)));
        }
    }




}
