package co.com.tigo.qa.tasks;

import co.com.tigo.qa.userinterfaces.ServiciosUI;
import co.com.tigo.qa.utils.EsperaForzada;
import co.com.tigo.qa.utils.getShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

public class DescuentosVencidos implements Task{

    private WebDriver driver;


    public DescuentosVencidos(WebDriver driver) {
        this.driver = driver;


    }

    @Override
    public <T extends Actor> void performAs(T t) {

        getShadowRoot.getTargetShadow(driver, ServiciosUI.SHADOWCARDDESCUENTOVENCIDOS, ServiciosUI.TITULO_DESCUENTOSVENCIDOS).getRect();
        EsperaForzada.espera(5);
        getShadowRoot.getTargetShadow(driver, ServiciosUI.SHADOWCARDDESCUENTOVENCIDOS, ServiciosUI.BOTON_DESPLIEGUE_DESCUENTOS_VENCIDOS).click();
        EsperaForzada.espera(5);
    }

    public static DescuentosVencidos descuentos(WebDriver driver){
        return Tasks.instrumented(DescuentosVencidos. class, driver);
    }
}



