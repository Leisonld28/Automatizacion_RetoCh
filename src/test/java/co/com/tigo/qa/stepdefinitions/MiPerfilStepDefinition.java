package co.com.tigo.qa.stepdefinitions;


import co.com.tigo.qa.questions.ObjetoVisibles;
import co.com.tigo.qa.userinterfaces.MiPerfilUI;
import co.com.tigo.qa.utils.EsperaForzada;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static org.hamcrest.Matchers.is;

public class MiPerfilStepDefinition {
    Actor usuario = Actor.named("Metis");

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setup() {
        setTheStage(OnlineCast.ofStandardActors());
        usuario.can(BrowseTheWeb.with(hisBrowser));
    }

    @And("^selecciono mi perfil (.*)$")
    public void seleccionoMiPerfil(String opcion) {
        EsperaForzada.espera(8);
        usuario.attemptsTo(Click.on(MiPerfilUI.MI_PERFIL),
                Click.on(MiPerfilUI.OPCIONES_PERFIL.of(opcion)));
        EsperaForzada.espera(10);
    }

    @Then("^deberia ver su informacion personal")
    public void deberiaVerSuInformacionPersonal() {
        usuario.should(GivenWhenThen.seeThat(ObjetoVisibles.esVisible(MiPerfilUI.NOMBREOCORREO.of("Metis Test Automation")), is(true)));
        usuario.should(GivenWhenThen.seeThat(ObjetoVisibles.esVisible(MiPerfilUI.DOCUMENTO), is(true)));
        usuario.attemptsTo(Scroll.to(MiPerfilUI.DOCUMENTO));
        usuario.should(GivenWhenThen.seeThat(ObjetoVisibles.esVisible(MiPerfilUI.NOMBREOCORREO.of("dg-testautomation@millicom.com")), is(true)));
        EsperaForzada.espera(3);
    }

     @Then("vere el mensaje disponible")
     public void vereElMensajeDisponible() {
        usuario.attemptsTo(Scroll.to(MiPerfilUI.TITULO_NOTIFICACIONES));
     }

    @Then("vere la informacion presentada")
    public void vereLaInformacionPresentada() {
        usuario.attemptsTo(Scroll.to(MiPerfilUI.TITULO_ELIGEAQUEGRUPOQUIERESDARLEACCESO));
    }

    @When("^selecciono la opcion para (.*)$")
    public void seleccionoLaOpcionPara(String opcion){
        EsperaForzada.espera(6);
        usuario.attemptsTo(Click.on(MiPerfilUI.OPCION_CONTRASEÑA.of(opcion)));
    }

    @And("visualizo el card Actualizar Contraseña")
    public void visualizoElCardActualizarContraseña() {
        EsperaForzada.espera(4);
        Ensure.that(MiPerfilUI.TITULO_CONTRASEÑA).hasText("Actualizar contraseña");
        Ensure.that(MiPerfilUI.BOTON_CONTINUAR).isDisplayed();
    }

    @Then("deberia habilitarse el boton cerrar todas mis sesiones")
    public void DeberiaHabilitarseElBotonCerrarTodasMisSesiones() {
        EsperaForzada.espera(4);
        Scroll.to(MiPerfilUI.BOTONGLOBAL_CERRAR_TODAS_MIS_SESIONES);
    }

    @Then("deberia ver la autorizacion de medicion de datos")
    public void DeberiaVerLaAutorizacionDeMedicionDeDatos() {
        EsperaForzada.espera(7);
        Scroll.to(MiPerfilUI.TITULO_MEDICION_CALIDAD_DE_RED);
    }

    }









