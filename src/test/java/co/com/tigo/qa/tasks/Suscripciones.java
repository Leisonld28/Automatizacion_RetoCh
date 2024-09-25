package co.com.tigo.qa.tasks;

import co.com.tigo.qa.interactions.Espera;
import co.com.tigo.qa.userinterfaces.OneAppMovilUI;
import co.com.tigo.qa.userinterfaces.PaquetesUI;

import static java.time.Duration.ofSeconds;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Suscripciones {

    public static Performable seleccionarSuscripcion(String suscripcion){
        return Task.where("selecciona suscripción {0}",
                Scroll.to(OneAppMovilUI.PAQUETE_SUSCRIPCION.of(suscripcion).waitingForNoMoreThan(ofSeconds(30))),
                Click.on(OneAppMovilUI.PAQUETE_SUSCRIPCION.of(suscripcion).waitingForNoMoreThan(ofSeconds(30)))
        );
    }

    public static Performable pagarSuscripcion(String tipoPago){
        return Task.where("selecciona forma de pago {0} y pagar suscripcion ",
                Espera.esperaSeg(5),
                Scroll.to(PaquetesUI.OPCION_MENU_FORMA_DE_PAGO.of(tipoPago)).andAlignToTop(),
                Click.on(PaquetesUI.OPCION_MENU_FORMA_DE_PAGO.of(tipoPago).waitingForNoMoreThan(ofSeconds(30))),
                Scroll.to(PaquetesUI.BOTON_PAGAR).andAlignToTop(),
                Click.on(PaquetesUI.BOTON_PAGAR)
        );
    }
    public static Performable ir(String seccion) {
        return Task.where("{0} scroll a la sección {0}",
                Scroll.to(PaquetesUI.SECCION.of(seccion).waitingForNoMoreThan(ofSeconds(30)))
        );

    }

    public static Performable EliminarSuscripcion () {
        return Task.where("{0}El selecciona el icono borrar Suscripcion",
                Click.on(PaquetesUI.ICONO_ELIMINAR_SUSCRIPCION)
        );
    };

    public static Performable ConfirmarBorradoSuscripcion () {
        return Task.where("{0}El selecciona confirmación de borrado Suscripcion",
                Click.on(PaquetesUI.CONFIRMAR_ELIMINAR_SUSCRIPCION)
        );
    };
}
