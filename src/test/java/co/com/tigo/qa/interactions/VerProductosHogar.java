package co.com.tigo.qa.interactions;

import co.com.tigo.qa.userinterfaces.ServiciosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerProductosHogar implements Interaction {

    private int num = 1;
    private WebDriver driver;

    public VerProductosHogar(WebDriver driver) {
        this.driver = driver;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ServiciosUI.ITEMS_PRODUCTOS.of(""+num), isVisible()).forNoMoreThan(10).seconds());
        while(ServiciosUI.ITEMS_PRODUCTOS.of(""+num).resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    JavaScriptClick.on(ServiciosUI.ITEMS_PRODUCTOS.of(""+num)),
                    Espera.esperaSeg(4),
                    Click.on(ServiciosUI.DETALLE_PRODUCTOS),
                    Espera.esperaSeg(4),
                      Click.on(ServiciosUI.BOTON_REGRESAR),
                    Scroll.to(ServiciosUI.ITEMS_PRODUCTOS.of(""+num)),
                   JavaScriptClick.on(ServiciosUI.ITEMS_PRODUCTOS.of(""+num))

            );
            num++;
        }
    }

    public static VerProductosHogar verProductos(WebDriver driver){
        return new VerProductosHogar(driver);
    }
}
