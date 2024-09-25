package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.cssSelector;

public class LoginUI {

    public static final Target USERNAMEPAGE = the("link login up free").locatedBy("//input[contains(@id,'user-name')]");

    public static final Target SPINNER = Target.the("Botón Sign up free").located(cssSelector(".group_loader"));
    public static final Target BOTON_INGRESAR_HOME_ONEAPP= Target.the("Boton de autenticación home oneApp")
            .locatedBy("//button[@href='/user/login_handler'][contains(.,'Ingresa')]");

    public static final Target CAMPO_USUARIO_AUTENTICACION= Target.the("Campo usuario en vista de autenticación home ")
            .locatedBy("//input[contains(@id,'user-name')]");

    public static final Target BOTON_CONTRASENA= Target.the("Boton Contrasena One App")
            .locatedBy("//ion-button[@expand='block'][contains(.,'CONTRASEÑA')]");

    public static final Target BOTON_CONTINUAR= Target.the("Boton Continuar con Login")
            .locatedBy("//input[contains(@id,'login-button')]");

    public static final Target CAMPO_CONTRASEÑA_AUTENTICACION= Target.the("Campo contraseña en vista de autenticación ")
            .locatedBy("//input[@id='password']");
    public static final Target CAMPO_SWAGLABS= Target.the("Campo cuenta inicializada")
            .locatedBy("//div[@class='app_logo']");


    public static final Target AÑADIR_AL_CARRITO= Target.the("boton añadir al carrito")
            .locatedBy("//button[contains(@id,'add-to-cart-sauce-labs-backpack')]");
    public static final Target CARRITO_DE_COMPRAS= Target.the("carrito de compras")
            .locatedBy("//a[@class='shopping_cart_link']");

    public static final Target ELIMINAR_PRODUCTO_DEL_CARRITO= Target.the("carrito de compras")
            .locatedBy("//button[@id='remove-sauce-labs-backpack']");
    public static final Target CLIC_EN_CHECKOUT= Target.the("checkout")
            .locatedBy("//button[@id='checkout']");

    public static final Target NOMBRE_COMPRA= Target.the("checkout")
            .locatedBy("//input[@id='first-name']");

    public static final Target APELLIDO_COMPRA= Target.the("checkout")
            .locatedBy("//input[@id='last-name']");

    public static final Target CODIGOPOSTAL_COMPRA= Target.the("checkout")
            .locatedBy("//input[@id='postal-code']");
    public static final Target CONTINUAR_COMPRA1= Target.the("checkout")
            .locatedBy("//input[@id='continue']");
    public static final Target DESCRIPCION_COMPRA= Target.the("checkout")
            .locatedBy("//div[@class='cart_desc_label']");
    public static final Target FINALIZAR_COMPRA= Target.the("checkout")
            .locatedBy("//button[@id='finish']");

    public static final Target INICIO_SESION2= Target.the("nombreusuario")
            .locatedBy("//input[@name='username']");
    public static final Target CONTRASEÑA2= Target.the("contraseña")
            .locatedBy("//input[@type='password']");

    public static final Target BOTON_lOGIN= Target.the("login")
            .locatedBy("//button[@type='submit']");

    public static final Target RECRUITMENT= Target.the("login")
            .locatedBy("//span[contains(.,'Recruitment')]");

    public static final Target CANDIDATOS= Target.the("login")
            .locatedBy("//h5[contains(.,'Candidates')]");

    public static final Target  TITULO_TRABAJO= Target.the("login")
            .locatedBy("(//i[contains(@class,'oxd-icon bi-caret-down-fill oxd-select-text--arrow')])[1]");

    public static final Target  ADICION_CANDIDATO= Target.the("login")
            .locatedBy("//button[@type='button'][contains(.,'Add')]");

    public static final Target  PRIMER_NOMBRE= Target.the("candidato")
            .locatedBy("//input[@name='firstName']");

    public static final Target  SEGUNDO_NOMBRE= Target.the("candidato")
            .locatedBy("//input[contains(@name,'middleName')]");
    public static final Target  APELLIDO2= Target.the("candidato")
            .locatedBy("//input[@name='lastName']");

    public static final Target  VACANCY= Target.the("candidato")
            .locatedBy("(//div[contains(.,'-- Select --')])[14]");

    public static final Target  CORREO_ELECTRONICO2= Target.the("correo electronico")
            .locatedBy("(//input[contains(@placeholder,'Type here')])[1]");

    public static final Target  NUMERO_TELEFONICO= Target.the("candidato")
            .locatedBy("(//input[contains(@placeholder,'Type here')])[2]");

    public static final Target  SELECCIONAR_VACANTE= Target.the("candidato")
            .locatedBy("//span[contains(.,'Sales Representative')]");

    public static final Target  GUARDAR= Target.the("Guardar")
            .locatedBy("//button[@type='submit'][contains(.,'Save')]");

    public static final Target  REGISTROS_ALMACENADOS= Target.the("Guardar")
            .locatedBy("//span[contains(.,'(71) Records Found')]");

}
