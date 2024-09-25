package co.com.tigo.qa.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.cssSelector;
public class DemoqaUI {
    public static final Target WEB_TABLES= Target.the("boton Web Tables")
            .locatedBy("//li[@class='btn btn-light '][contains(.,'Web Tables')]");
    public static final Target CORREO= Target.the("Clic en ADD registro")
            .locatedBy("//input[contains(@typer,'text')]");
    public static final Target PASSWORD= Target.the("boton Web Tables")
            .locatedBy("//input[contains(@type,'password')]");
    public static final Target SUBMITNUEVO= Target.the("Clic en ADD registro")
            .locatedBy("//button[@type='submit']");


    public static final Target LOGIN1= Target.the("Botón Login")
            .locatedBy("//a[@class='nav-link '][contains(.,'Login')]");

    public static final Target BOOK_STORE_APPLICATION= Target.the("boton Book Store Application")
            .locatedBy("//div[@class='card mt-4 top-card'][contains(.,'Book Store Application')]");

    public static final Target ELEMENTS= Target.the("boton añadir Elements")
            .locatedBy("//div[@class='card mt-4 top-card'][contains(.,'Elements')]");
    public static final Target HEADER_ELEMENTS= Target.the("boton añadir Elements")
            .locatedBy("//div[@class='header-text'][contains(.,'Elements')]");
    public static final Target ADD= Target.the("Clic en ADD registro")
            .locatedBy("//button[@type='button'][contains(.,'Add')]");
    public static final Target NOMBRE= Target.the("Clic en ADD registro")
            .locatedBy("//input[@id='firstName']");
    public static final Target APELLIDO= Target.the("Clic en ADD registro")
            .locatedBy("//input[contains(@placeholder,'Last Name')]");

    public static final Target EDAD= Target.the("Clic en ADD registro")
            .locatedBy("//input[contains(@placeholder,'Age')]");
    public static final Target SALARIO= Target.the("Clic en ADD registro")
            .locatedBy("//input[contains(@placeholder,'Salary')]");
    public static final Target DEPARTAMENTO= Target.the("Clic en ADD registro")
            .locatedBy("//input[contains(@placeholder,'Department')]");





    public static final Target JOIN = Target.the("boton join")
            .locatedBy("//img[@class='banner-image']");

    public static final Target YOURFEED = Target.the("Titulo Your feed")
            .locatedBy("//p[contains(.,'Select how many \uD83D\uDC15 there are in the following sequence:')]");
    public static final Target NEWARTICLE = Target.the("boton eliminar Nuevo articulo")
            .locatedBy("//a[@href='#/editor']");
    public static final Target ARTICLEDESCRIPTION = Target.the("boton eliminar Nuevo articulo")
            .locatedBy("//input[@name='description']");
    public static final Target ARTICLETITLE = Target.the("boton eliminar Nuevo articulo")
            .locatedBy("//input[contains(@name,'title')]");
    public static final Target ARTICLEWRITE = Target.the("boton eliminar Nuevo articulo")
            .locatedBy("//textarea[contains(@class,'form-control')]");
    public static final Target EDITARARTICULO = Target.the("boton eliminar Nuevo articulo")
            .locatedBy("(//a[contains(.,'Edit Article')])[1]");
    public static final Target BOTÓNPUBLICARARTICULO = Target.the("boton eliminar Nuevo articulo")
            .locatedBy("//button[@type='submit']");



    public static final Target WEB_TABLE_TITULO = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//div[contains(text(),'Web Tables')]");

    public static final Target WIDGETS = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//div[@class='card mt-4 top-card'][contains(.,'Widgets')]");

    public static final Target WIDGETS_TITLE = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//div[@class='header-wrapper'][contains(.,'Widgets')]");

    public static final Target DATA_PICKER = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//span[@class='text'][contains(.,'Date Picker')]");

    public static final Target SELECT_DATE = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//input[@id='datePickerMonthYearInput']");
    public static final Target DATE_AND_TIME = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//input[@id='dateAndTimePickerInput']");

    public static final Target ALERT_FRAME_WINDOWS = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//div[@class='card mt-4 top-card'][contains(.,'Alerts, Frame & Windows')]");
    public static final Target ALERT_TITLE = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//span[@class='text'][contains(.,'Alerts')]");

    public static final Target SEE_ALERT = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//button[contains(@id,'alertButton')]");
    public static final Target CINCO_SECONDS = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//button[contains(@id,'timerAlertButton')]");

    public static final Target CONFIRM_BOX = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//button[contains(@id,'confirmButton')]");
    public static final Target PROMPT_BOX = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//button[@id='promtButton']");
    public static final Target ALERT_TIT = Target.the("boton eliminar registro de la tabla")
            .locatedBy("//div[@class='main-header'][contains(.,'Alerts')]");



}
