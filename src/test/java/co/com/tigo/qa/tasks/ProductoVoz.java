package co.com.tigo.qa.tasks;

import co.com.tigo.qa.userinterfaces.ServiciosUI;
import co.com.tigo.qa.utils.EsperaForzada;
import co.com.tigo.qa.utils.getShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

public class ProductoVoz implements Task{

    private WebDriver driver;


    public ProductoVoz(WebDriver driver) {
        this.driver = driver;


    }

    @Override
    public <T extends Actor> void performAs(T t) {
        EsperaForzada.espera(6);
        getShadowRoot.getTargetShadow(driver, ServiciosUI.SHADOW_CARD_INFORMACION_VOZ, ServiciosUI.BOTON_HISTORIAL_VOZ).click();
        EsperaForzada.espera(8);
        getShadowRoot.getTargetShadow(driver, ServiciosUI.SHADOW_CARD_HISTORICO, ServiciosUI.TITULO_HISTORICO_CONSUMO).getRect();
        EsperaForzada.espera(10);
    }

    public static ProductoVoz voz(WebDriver driver){
        return Tasks.instrumented(ProductoVoz. class, driver);
    }
}



