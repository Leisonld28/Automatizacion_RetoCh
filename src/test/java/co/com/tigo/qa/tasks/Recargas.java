package co.com.tigo.qa.tasks;

import static co.com.tigo.qa.userinterfaces.RecargasUI.*;
import static java.time.Duration.ofSeconds;

import co.com.tigo.qa.interactions.Espera;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Recargas {

    public static Performable tabCompras(String tipo){
        return  Task.where("{0} Selecciona el Tab de "+tipo,
                Espera.esperaSeg(5),
                Click.on(TAB_TIPOCOMPRA.of(tipo).waitingForNoMoreThan(ofSeconds(15)))
        );
    }
    public static Performable otroValorRecarga(String amount){
        return  Task.where("{0} Selecciona otro valor de recarga "+amount,
                Click.on(BOTON_OTRO_VALOR_RECARGA.waitingForNoMoreThan(ofSeconds(20))),
                Scroll.to(VALOR_OTRA_RECARGAR),
                Click.on(VALOR_OTRA_RECARGAR.waitingForNoMoreThan(ofSeconds(20))),
                Enter.theValue(amount).into(VALOR_OTRA_RECARGAR)
        );
    }
    public static Performable continuar(){
        return  Task.where("{0} Hace click en continuar hacia la orden de compra",
                 Scroll.to(BOTON_CONTINUAR),
                 Click.on(BOTON_CONTINUAR)
        );
    }

}
