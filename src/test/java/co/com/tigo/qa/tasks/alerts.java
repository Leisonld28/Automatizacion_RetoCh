package co.com.tigo.qa.tasks;

import co.com.tigo.qa.userinterfaces.DemoqaUI;
import co.com.tigo.qa.utils.PropertiesLoader;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class alerts {
    static PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();
    WebDriver driver;

    @And("Genero alerta See Alert")
    public void generoAlertaSeeAlert() throws Exception {
        Click.on(DemoqaUI.SEE_ALERT);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darwin\\Documents\\RepositorioAutomatizacion\\Pruebas-Auto\\src\\test\\resources\\driver\\chromedriver.exe");
        Alert alert = driver.switchTo().alert(); // Cambiar el foco a la alerta
        String text = alert.getText(); // Obtener el texto de la alerta
        System.out.println(text); // Imprimir el texto de la alerta
        alert.accept(); // Aceptar la alerta y cerrarla


    }

}
