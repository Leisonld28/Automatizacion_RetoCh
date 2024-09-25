package co.com.tigo.qa.stepdefinitions;

import co.com.tigo.qa.interactions.Espera;
import co.com.tigo.qa.tasks.Demoqa;
import co.com.tigo.qa.userinterfaces.DemoqaUI;
import co.com.tigo.qa.userinterfaces.LoginUI;
import co.com.tigo.qa.utils.EsperaForzada;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.tasks.Demoqa.formularioaddcandidato;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class DemoqaStepDefinition {

    Actor usuario = Actor.named("Metis");

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setup() {
        setTheStage(OnlineCast.ofStandardActors());
        usuario.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("Selecciono la opcion Login$")
    public void seleccionoLaOpcionLogin() {
        EsperaForzada.espera(2);

        usuario.attemptsTo(
                Click.on(DemoqaUI.LOGIN1));

    }

    @And("ingreso los campos del formulario sign in")
    public void ingresoLosCamposDelFormularioSignIn() {
        usuario.attemptsTo(
                Demoqa.formulariologin()
        );
    }

    @Then("se valida el Login exitoso")
    public void seValidaElLoginExitoso() {
        usuario.attemptsTo(

                Scroll.to(DemoqaUI.YOURFEED)

        );
        EsperaForzada.espera(5);
    }

    @Given("Ingreso los campos del formulario del articulo")
    public void ingresoLosCamposDelFormularioDelArticulo() {
        EsperaForzada.espera(2);
        usuario.attemptsTo(
                Demoqa.formularioarticulo()

        );
        EsperaForzada.espera(5);
    }

    @Given("Selecciono la opcion Widgest")
    public void seleccionoLaOpcionWidgest() {
        EsperaForzada.espera(5);

        usuario.attemptsTo(
                Scroll.to(DemoqaUI.JOIN),
                Click.on(DemoqaUI.WIDGETS),
                Scroll.to(DemoqaUI.WIDGETS_TITLE),
                Click.on(DemoqaUI.DATA_PICKER));


    }

    @And("Selecciono una fecha en date picker")
    public void seleccionoUnaFechaEnDatePicker() {
        usuario.attemptsTo(
                Demoqa.formulariofecha());

    }

    @Given("Selecciono la opcion Alerts Frame and Windows")
    public void seleccionoLaOpcionAlertsFrameAndWindows() {
        EsperaForzada.espera(5);

        usuario.attemptsTo(
                Scroll.to(DemoqaUI.JOIN),
                Click.on(DemoqaUI.ALERT_FRAME_WINDOWS),
                Scroll.to(DemoqaUI.HEADER_ELEMENTS),
                Click.on(DemoqaUI.ALERT_TITLE));

    }

    @And("Se generan las diferentes alertas existentes")
    public void seGeneranLasDiferentesAlertasExistentes() {


    }

    @And("Genero alerta See Alert")
    public void generoAlertaSeeAlert() throws Exception {
        usuario.attemptsTo(
                Click.on(DemoqaUI.SEE_ALERT));

    }

    @Then("^(Acepto|Cancelo) la alerta$")
    public void aceptoOrCanceloLaAlerta() {

    }

    @And("Genero alerta alert will appear after {int} seconds")
    public void generoAlertaAlertWillAppearAfterSeconds(int arg0) {
        usuario.attemptsTo(
                Click.on(DemoqaUI.CINCO_SECONDS));


    }

    @And("Genero alerta confirm box will appear")
    public void generoAlertaConfirmBoxWillAppear() {
        usuario.attemptsTo(
                Click.on(DemoqaUI.CONFIRM_BOX));
    }

    @And("Genero alerta prompt box will appear")
    public void generoAlertaPromptBoxWillAppear() {
        usuario.attemptsTo(
                Scroll.to(DemoqaUI.ALERT_TIT),
                Click.on(DemoqaUI.PROMPT_BOX));
    }

    @Given("Selecciono la opcion nuevo articulo")
    public void seleccionoLaOpcionNuevoArticulo() {
        usuario.attemptsTo(
                Click.on(DemoqaUI.NEWARTICLE)
        );
    }

    @Then("Realizo la validacion del articulo creado")
    public void realizoLaValidacionDelArticuloCreado() {
        usuario.attemptsTo(
        Scroll.to(DemoqaUI.EDITARARTICULO));
    }

    @Given("Selecciono la opcion Recruitment")
    public void seleccionoLaOpcionRecruitment() {
        usuario.attemptsTo(
                Click.on(LoginUI.RECRUITMENT)
        );
    }

    @When("Ingreso los campos del formulario del candidato")
    public void ingresoLosCamposDelFormularioDelCandidato() {
        usuario.attemptsTo(
                Scroll.to(LoginUI.CANDIDATOS),
                Click.on(LoginUI.ADICION_CANDIDATO),
                formularioaddcandidato()

        );
    }

    @Then("Realizo la validacion del candidato creado")
    public void realizoLaValidacionDelCandidatoCreado() {
        usuario.attemptsTo(
                Click.on(LoginUI.RECRUITMENT),
                Scroll.to(LoginUI.ADICION_CANDIDATO),
                Scroll.to(LoginUI.HIRE)
        );
        EsperaForzada.espera(4);

    }
}

