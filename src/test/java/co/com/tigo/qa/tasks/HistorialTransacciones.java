package co.com.tigo.qa.tasks;

import co.com.tigo.qa.interactions.Espera;
import co.com.tigo.qa.userinterfaces.SaldosUI;
import co.com.tigo.qa.utils.EjecutarScript;
import co.com.tigo.qa.utils.EsperaForzada;
import co.com.tigo.qa.utils.getShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HistorialTransacciones implements Task{

    private WebDriver driver;


    public HistorialTransacciones(WebDriver driver) {
        this.driver = driver;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement element = getShadowRoot.getTargetShadow(driver, SaldosUI.SHADOWHISTORIAL, SaldosUI.VER_MAS_HISTORIAL);
        EjecutarScript.clickSelenium(driver, element);
        EsperaForzada.espera(1);
        actor.attemptsTo(   Click.on(SaldosUI.BOTON_TIPOPROD),
                            Click.on(SaldosUI.BOTON_RECARGAS),
                            Espera.esperaSeg(3),
                            Click.on(SaldosUI.BOTON_SIETEDIAS),
                            Click.on(SaldosUI.BOTON_MESACTUAL),
                            Espera.esperaSeg(3),
                            Click.on(SaldosUI.BOTON_PRIMERITEM),
                            Espera.esperaSeg(3),
                            Click.on(SaldosUI.BOTON_PRIMERITEM),
                            Espera.esperaSeg(1),
                            Click.on(SaldosUI.BOTON_RECARGAS),
                            Click.on(SaldosUI.BOTON_PAQUETES),
                            Espera.esperaSeg(2),
                            Click.on(SaldosUI.BOTON_MESACTUAL),
                            Click.on(SaldosUI.BOTON_MESANTERIOR),
                            Espera.esperaSeg(2)


        );
        EsperaForzada.espera(2);

        }


    public static HistorialTransacciones historial(WebDriver driver){
        return Tasks.instrumented(HistorialTransacciones.class, driver);
    }
}


