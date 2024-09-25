package co.com.tigo.qa.tasks;

import co.com.tigo.qa.userinterfaces.TiendaUI;
import co.com.tigo.qa.utils.EjecutarScript;
import co.com.tigo.qa.utils.getShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

public class Tienda implements Task {

    private final WebDriver driver;

    public Tienda(WebDriver driver) {
        this.driver = driver;

    }

    @Override
    public <T extends Actor> void performAs(T t) {
        EjecutarScript.scrollSelenium(driver, getShadowRoot.getTargetShadow(driver, TiendaUI.MAINSHADOWTIENDA, TiendaUI.BOTONIR));
        getShadowRoot.getTargetShadow(driver, TiendaUI.MAINSHADOWTIENDA, TiendaUI.BOTONIR).click();

    }

    public static Tienda irATienda(WebDriver driver) {
        return Tasks.instrumented(Tienda.class, driver);
    }
}