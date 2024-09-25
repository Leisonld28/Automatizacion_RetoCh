package co.com.tigo.qa.tasks;

import co.com.tigo.qa.userinterfaces.ConsultaDispositivoUI;
import co.com.tigo.qa.utils.EjecutarScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

public class ServicioBloqueo implements Task {

private WebDriver driver;

    public ServicioBloqueo(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        EjecutarScript.ejecutarScript(driver, ConsultaDispositivoUI.SELECT_DPTO,"arguments[0].setAttribute('value','Antioquia')");
        EjecutarScript.ejecutarScript(driver, ConsultaDispositivoUI.SELECT_CITY,"arguments[0].setAttribute('value','Medellin')");

    }
    public static ServicioBloqueo ejecutar(WebDriver driver){
        return Tasks.instrumented(ServicioBloqueo.class, driver);
    }
}
