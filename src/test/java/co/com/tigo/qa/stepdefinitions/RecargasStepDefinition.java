package co.com.tigo.qa.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

import co.com.tigo.qa.questions.ElMensaje;
import co.com.tigo.qa.tasks.Login;
import co.com.tigo.qa.tasks.Recargas;
import co.com.tigo.qa.userinterfaces.LoginUI;
import co.com.tigo.qa.utils.EsperaForzada;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class RecargasStepDefinition {
    Actor usuario = Actor.named("Metis");

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setup() {
        setTheStage(OnlineCast.ofStandardActors());
        usuario.can(BrowseTheWeb.with(hisBrowser));
    }

    @And("^selecciono el tab de (.*)$")
    public void seleccionoElTabDe(String tipo) {
        usuario.attemptsTo(Recargas.tabCompras(tipo));
        EsperaForzada.espera(5);
    }

    @Given("^selecciono la opcion de otro valor de recarga por (.*)$")
    public void seleccionoLaOpcionDeOtroValorDeRecargaPor(String amount) {
        usuario.attemptsTo(Recargas.otroValorRecarga(amount));
    }

    @Given("^hace click en añadir al carrito$")
    public void haceClickEnAñadirAlCarrito() {
        EsperaForzada.espera(5);
        usuario.attemptsTo(Click.on(LoginUI.AÑADIR_AL_CARRITO));
        EsperaForzada.espera(5);


    }

    @Given("^eliminar producto del carrito$")
    public void eliminarProductoDelCarrito() {
        usuario.attemptsTo(JavaScriptClick.on(LoginUI.CARRITO_DE_COMPRAS),
                Click.on(LoginUI.ELIMINAR_PRODUCTO_DEL_CARRITO)
        );


    }


    @Given("^realizo el pago de un producto$")
    public void realizoElPagoDeUnProducto() {
        EsperaForzada.espera(5);
        usuario.attemptsTo(JavaScriptClick.on(LoginUI.CARRITO_DE_COMPRAS),
                Click.on(LoginUI.CLIC_EN_CHECKOUT),
                Login.formularioiniciosesion(),
                Click.on(LoginUI.DESCRIPCION_COMPRA),
                Click.on(LoginUI.FINALIZAR_COMPRA));


    }

    @Then("^el boton deberia estar deshabilitado")
    public void elBotonDeberiaEstarDeshabilitado() {
        usuario.should(GivenWhenThen.seeThat(ElMensaje.botonContinuarInhabilitado(), Matchers.is(true)));
    }
}
