package co.com.tigo.qa.tasks;

import co.com.tigo.qa.utils.EjecutarScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.userinterfaces.FacturaDigitalMovilUI.*;
import static co.com.tigo.qa.utils.getShadowRoot.getTargetShadow;

public class FacDigiMovil implements Task{

    private WebDriver driver;


    public FacDigiMovil(WebDriver driver) {
        this.driver = driver;


    }

    @Override
    public <T extends Actor> void performAs(T t) {

        EjecutarScript.scrollSelenium(driver,getTargetShadow(driver,MAINSHADOWDIGITALMOVIL, TITULO_FACTURADIGI));
        getTargetShadow(driver, MAINSHADOWDIGITALMOVIL, BOTONMODIFICAR).click();

    }

    public static FacDigiMovil factura(WebDriver driver){
        return Tasks.instrumented(FacDigiMovil. class, driver);
    }
}



