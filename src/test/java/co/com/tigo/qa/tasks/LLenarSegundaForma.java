package co.com.tigo.qa.tasks;

import co.com.tigo.qa.userinterfaces.ConsultaDispositivoUI;
import co.com.tigo.qa.utils.EjecutarScript;
import co.com.tigo.qa.utils.EsperaForzada;
import co.com.tigo.qa.utils.PropertiesLoader;
import co.com.tigo.qa.utils.getShadowRoot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LLenarSegundaForma implements Task {
    private WebDriver driver;
    private String tipo;
    private WebElement webelementoformtheft;
    private WebElement webelementoformloss;
    static PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();

    public LLenarSegundaForma(WebDriver driver, String tipo) {

        this.driver = driver;
        this.tipo = tipo;

    }

    @Override
    public <T extends Actor> void performAs(T t) {

        String Fecha = propertiesLoader.getProperty("FECHA");
        String Hora = propertiesLoader.getProperty("HORA");
        String Desc = propertiesLoader.getProperty("DESC_RYP");
        String Direcc= propertiesLoader.getProperty("DIRECC");
        String Depto= propertiesLoader.getProperty("DEPTO");






        if (tipo.equals("Robo")){

            webelementoformtheft = getShadowRoot.getTargetShadow(driver, ConsultaDispositivoUI.BLOQUEOONESHADOWDEVICE, ConsultaDispositivoUI.BLOQUEOTHEFTSHADOWDEVICE);
            getShadowRoot.getShadowExistente(webelementoformtheft, ConsultaDispositivoUI.INPUT_DEPTO_ROBO).sendKeys(Depto);
            getShadowRoot.getShadowExistente(webelementoformtheft, ConsultaDispositivoUI.INPUT_FECHA_ROBO).sendKeys(Fecha);
            getShadowRoot.getShadowExistente(webelementoformtheft, ConsultaDispositivoUI.INPUT_HORA_ROBO).sendKeys(Hora);
            EsperaForzada.espera(3);
            getShadowRoot.getShadowExistente(webelementoformtheft, ConsultaDispositivoUI.INPUT_DIR_ROBO).sendKeys(Direcc);
            EsperaForzada.espera(5);
            EjecutarScript.scrollSelenium(driver, getShadowRoot.getShadowExistente(webelementoformtheft, ConsultaDispositivoUI.INPUT_DESC_ROBO));
            getShadowRoot.getShadowExistente(webelementoformtheft, ConsultaDispositivoUI.INPUT_DESC_ROBO).click();
            getShadowRoot.getShadowExistente(webelementoformtheft, ConsultaDispositivoUI.INPUT_DESC_ROBO).clear();
            getShadowRoot.getShadowExistente(webelementoformtheft, ConsultaDispositivoUI.INPUT_DESC_ROBO).sendKeys(Desc);




        }else {

            webelementoformloss = getShadowRoot.getTargetShadow(driver, ConsultaDispositivoUI.BLOQUEOONESHADOWDEVICE, ConsultaDispositivoUI.BLOQUEOLOSSSHADOWDEVICE);
            EjecutarScript.scrollSelenium(driver, getShadowRoot.getShadowExistente(webelementoformloss, ConsultaDispositivoUI.INPUT_DEPTO_LOSS));
            getShadowRoot.getShadowExistente(webelementoformloss, ConsultaDispositivoUI.INPUT_DEPTO_LOSS).sendKeys(Depto);
            getShadowRoot.getShadowExistente(webelementoformloss, ConsultaDispositivoUI.INPUT_FECHA_LOSS).sendKeys(Fecha);
            getShadowRoot.getShadowExistente(webelementoformloss, ConsultaDispositivoUI.INPUT_HORA_LOSS).sendKeys(Hora);
            EsperaForzada.espera(3);
            getShadowRoot.getShadowExistente(webelementoformloss, ConsultaDispositivoUI.INPUT_DIR_LOSS).sendKeys(Direcc);
            EsperaForzada.espera(5);
            getShadowRoot.getShadowExistente(webelementoformloss, ConsultaDispositivoUI.INPUT_DESC_LOSS).click();
            getShadowRoot.getShadowExistente(webelementoformloss, ConsultaDispositivoUI.INPUT_DESC_LOSS).clear();
            getShadowRoot.getShadowExistente(webelementoformloss, ConsultaDispositivoUI.INPUT_DESC_LOSS).sendKeys(Desc);
            EjecutarScript.scrollSelenium(driver, getShadowRoot.getShadowExistente(webelementoformloss, ConsultaDispositivoUI.BOTON_FINALIZAR));


        }




    }
    public static LLenarSegundaForma llenar(WebDriver driver, String tipo){
        return Tasks.instrumented(LLenarSegundaForma.class, driver, tipo);
    }
}
