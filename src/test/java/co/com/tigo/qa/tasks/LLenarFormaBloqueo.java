package co.com.tigo.qa.tasks;

import co.com.tigo.qa.userinterfaces.ConsultaDispositivoUI;
import co.com.tigo.qa.utils.EsperaForzada;
import co.com.tigo.qa.utils.PropertiesLoader;
import co.com.tigo.qa.utils.getShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LLenarFormaBloqueo implements Task {
    private WebDriver driver;
    private String tipo;
    private WebElement webelementoformuno;
    static PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();

    public LLenarFormaBloqueo(WebDriver driver, String tipo) {

        this.driver = driver;
        this.tipo = tipo;

    }

    @Override
    public <T extends Actor> void performAs(T t) {

        String NOMBRE = propertiesLoader.getProperty("NOMBRES");
        String APELLIDO = propertiesLoader.getProperty("APELLIDO");
        String DOC = propertiesLoader.getProperty("DOCUMENTO");
        String Email = propertiesLoader.getProperty("EMAIL");
        String Phone= propertiesLoader.getProperty("TELEFONO");
        String Direcc= propertiesLoader.getProperty("DIRECCION");
        String Depto= propertiesLoader.getProperty("DEPTO");

        webelementoformuno = getShadowRoot.getTargetShadow(driver, ConsultaDispositivoUI.BLOQUEOONESHADOWDEVICE, ConsultaDispositivoUI.BLOQUEOTWOSHADOWDEVICE);

        EsperaForzada.espera(2);

        if (tipo.equals("Robo")){

           getShadowRoot.getShadowExistente(webelementoformuno, ConsultaDispositivoUI.RADIOBUTTON_ROBO).click();


        }else {

           getShadowRoot.getShadowExistente(webelementoformuno, ConsultaDispositivoUI.RADIOBUTTON_PERDIDA).click();


        }


        getShadowRoot.getShadowExistente(webelementoformuno, ConsultaDispositivoUI.INPUT_NOMBRES_FORM_BLOQUEO).sendKeys(NOMBRE);
        getShadowRoot.getShadowExistente(webelementoformuno, ConsultaDispositivoUI.INPUT_APELLIDOS_FORM_BLOQUEO).sendKeys(APELLIDO);
        getShadowRoot.getShadowExistente(webelementoformuno, ConsultaDispositivoUI.INPUT_DOC_FORM_BLOQUEO).sendKeys(DOC);
        getShadowRoot.getShadowExistente(webelementoformuno, ConsultaDispositivoUI.INPUT_EMAIL_FORM_BLOQUEO).sendKeys(Email);
        getShadowRoot.getShadowExistente(webelementoformuno, ConsultaDispositivoUI.INPUT_PHONE_FORM_BLOQUEO).sendKeys(Phone);
        getShadowRoot.getShadowExistente(webelementoformuno, ConsultaDispositivoUI.INPUT_DEPARTAMENTO_FORM_BLOQUEO).sendKeys(Depto);
        getShadowRoot.getShadowExistente(webelementoformuno, ConsultaDispositivoUI.INPUT_ADDRESS_FORM_BLOQUEO).sendKeys(Direcc);
        EsperaForzada.espera(5);
        getShadowRoot.getShadowExistente(webelementoformuno, ConsultaDispositivoUI.CONTINUAR_FORM_BLOQUEO).click();
        EsperaForzada.espera(5);


    }
    public static LLenarFormaBloqueo llenar(WebDriver driver, String tipo){
        return Tasks.instrumented(LLenarFormaBloqueo.class, driver, tipo);
    }
}
