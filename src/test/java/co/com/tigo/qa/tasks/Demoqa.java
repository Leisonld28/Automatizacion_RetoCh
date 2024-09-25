package co.com.tigo.qa.tasks;

import co.com.tigo.qa.interactions.Espera;
import co.com.tigo.qa.userinterfaces.DemoqaUI;
import co.com.tigo.qa.userinterfaces.LoginUI;
import co.com.tigo.qa.utils.PropertiesLoader;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Demoqa {

    static PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();
    WebDriver driver;
    public static Performable formulariologin(){
        return Task.where("formulariologin ",
                WaitUntil.the(LoginUI.INICIO_SESION2, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(propertiesLoader.getProperty("USERNAME")).into(LoginUI.INICIO_SESION2),
                Enter.theValue(propertiesLoader.getProperty("PASSWORD")).into(LoginUI.CONTRASEÑA2),
                Espera.esperaSeg(4),
                Click.on(LoginUI.BOTON_lOGIN)
        );

    }
    public static Performable formularioaddcandidato(){
        return Task.where("formularioaddcandidato ",
                WaitUntil.the(LoginUI.PRIMER_NOMBRE, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(propertiesLoader.getProperty("PRIMERNOMBRE")).into(LoginUI.PRIMER_NOMBRE),
                Enter.theValue(propertiesLoader.getProperty("SEGUNDONOMBRE")).into(LoginUI.SEGUNDO_NOMBRE),
                Enter.theValue(propertiesLoader.getProperty("APELLIDOS")).into(LoginUI.APELLIDO2),
                Click.on(LoginUI.VACANCY),
                Click.on(LoginUI.SELECCIONAR_VACANTE),
                Enter.theValue(propertiesLoader.getProperty("CORREOELECTRONICO")).into(LoginUI.CORREO_ELECTRONICO2),
                Enter.theValue(propertiesLoader.getProperty("TELEFON")).into(LoginUI.NUMERO_TELEFONICO),
                Enter.theValue(propertiesLoader.getProperty("PALABRASCLAVES")).into(LoginUI.PALABRA_CLAVES),
                Enter.theValue(propertiesLoader.getProperty("NOTAS")).into(LoginUI.NOTAS),
                Click.on(LoginUI.CONSENTIMIENTO),
                Espera.esperaSeg(4),
                Scroll.to(LoginUI.GUARDAR),
                Click.on(LoginUI.GUARDAR),
                Espera.esperaSeg(5),
                Click.on(LoginUI.BOTON_SHORTLIST),
                Espera.esperaSeg(2),
                Click.on(LoginUI.SAVE_BOTON_SHORTLIST),
                Espera.esperaSeg(5),
                Click.on(LoginUI.BOTON_ENTREVISTA),
                Enter.theValue(propertiesLoader.getProperty("TITULO")).into(LoginUI.TITULO),
                Enter.theValue(propertiesLoader.getProperty("ENTREVISTADOR")).into(LoginUI.ENTREVISTADOR),
                Click.on(LoginUI.NOMBRE_ENTREVISTADOR),
                Click.on(LoginUI.FECHA),
                Click.on(LoginUI.FECHA_HOY),
                Scroll.to(LoginUI.SAVE_BOTON_SHORTLIST),
                Click.on(LoginUI.SAVE_BOTON_SHORTLIST),
                Espera.esperaSeg(4),
                Click.on(LoginUI.CANDIDATO_ACEPTADO),
                Click.on(LoginUI.SAVE_BOTON_SHORTLIST),
                Click.on(LoginUI.OFERTAS_TRABAJO),
                Click.on(LoginUI.SAVE_BOTON_SHORTLIST),
                Click.on(LoginUI.BOTON_HIRE),
                Click.on(LoginUI.SAVE_BOTON_SHORTLIST)


        );

    }
    public static Performable formularioarticulo(){
        return Task.where("Formularioarticulo ",
                Enter.theValue(propertiesLoader.getProperty("ARTICLETITLE")).into(DemoqaUI.ARTICLETITLE),
                Enter.theValue(propertiesLoader.getProperty("ARTICLEDESCRIPTION1")).into(DemoqaUI.ARTICLEDESCRIPTION),
                Enter.theValue(propertiesLoader.getProperty("ARTICLEWRITE")).into(DemoqaUI.ARTICLEWRITE),
                Click.on(DemoqaUI.BOTÓNPUBLICARARTICULO),
                Espera.esperaSeg(4)

        );

    }
    public static Performable formulariofecha(){
        return Task.where("Formulariofecha ",
                Enter.theValue(propertiesLoader.getProperty("SELECTDATE")).into(DemoqaUI.SELECT_DATE),
                Enter.theValue(propertiesLoader.getProperty("DATEANDTIME")).into(DemoqaUI.DATE_AND_TIME),



                Espera.esperaSeg(4)




        );

    }
}