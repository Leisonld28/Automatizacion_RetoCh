package co.com.tigo.qa.tasks;

import co.com.tigo.qa.userinterfaces.ConsultaDispositivoUI;
import co.com.tigo.qa.userinterfaces.ServiciosUI;
import co.com.tigo.qa.utils.EjecutarScript;
import co.com.tigo.qa.utils.getShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

public class SoporteTecnico implements Task{

    private WebDriver driver;

    public SoporteTecnico(WebDriver driver) {
        this.driver = driver;

    }

    @Override
    public <T extends Actor> void performAs(T t) {

        EjecutarScript.scrollSelenium(driver, getShadowRoot.getTargetShadow(driver, ServiciosUI.MAINSHADOWSOPORTE, ConsultaDispositivoUI.BOTONCONSULTAR));
        getShadowRoot.getTargetShadow(driver, ServiciosUI.MAINSHADOWSOPORTE, ConsultaDispositivoUI.BOTONCONSULTAR).click();

        }


    public static SoporteTecnico soportetecnicomovil(WebDriver driver){
        return Tasks.instrumented(SoporteTecnico.class, driver);
    }
}


