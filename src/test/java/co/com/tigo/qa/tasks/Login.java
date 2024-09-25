package co.com.tigo.qa.tasks;

import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.tigo.qa.interactions.Espera;
import co.com.tigo.qa.userinterfaces.LoginUI;
import co.com.tigo.qa.utils.PropertiesLoader;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

public class Login {
    static PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();
    WebDriver driver;

    public static Performable autenticar(){
        return Task.where("Autenticar ",
                Open.url(propertiesLoader.getProperty("webdriver.base.url4"))

        );

    }

    public static Performable formularioiniciosesion(){
        return Task.where("Formularioiniciosesion ",
                WaitUntil.the(LoginUI.INICIO_SESION2, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(propertiesLoader.getProperty("USERNAME")).into(LoginUI.INICIO_SESION2),
                Enter.theValue(propertiesLoader.getProperty("PASSWORD")).into(LoginUI.CONTRASEÑA2),
                Espera.esperaSeg(4)




        );

    }
}

