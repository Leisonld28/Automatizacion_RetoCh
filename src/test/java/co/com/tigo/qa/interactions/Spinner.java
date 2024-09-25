package co.com.tigo.qa.interactions;

import co.com.tigo.qa.userinterfaces.ComunesUI;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class Spinner implements Interaction{

    @Step("{0} espera que desaparezca el spinner de carga de la pagina")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ComunesUI.SPINNER, WebElementStateMatchers.isNotVisible()));
    }
    public static Spinner queDesaparezcaElSpinner() {
        return Tasks.instrumented(Spinner.class);
    }

}
