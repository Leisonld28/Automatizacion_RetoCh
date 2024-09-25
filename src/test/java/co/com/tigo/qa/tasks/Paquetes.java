package co.com.tigo.qa.tasks;

import co.com.tigo.qa.interactions.Espera;
import co.com.tigo.qa.models.Paquetigos;
import co.com.tigo.qa.userinterfaces.PaquetesUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

public class Paquetes {

    public static Performable conSaldo(String tipoPago, Paquetigos paquetigo) {
        return Task.where("{0} realiza la selección y compra de paquetigo",
                Espera.esperaSeg(5),
                Scroll.to(PaquetesUI.OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())),
                Espera.esperaSeg(5),
                JavaScriptClick.on(PaquetesUI.OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())),
                Espera.esperaSeg(15),
                Scroll.to(PaquetesUI.OPCION_MENU_FORMA_DE_PAGO.of(tipoPago + "")).andAlignToTop(),
                Espera.esperaSeg(15)
        );
    }
    public static Performable CompraUnaVezPaquetigo(String tipoPago, Paquetigos paquetigo) {
        return Task.where("{0} realiza la selección y compra de paquetigo",
                Espera.esperaSeg(5),
                Scroll.to(PaquetesUI.OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())).andAlignToTop(),
                Espera.esperaSeg(5),
                JavaScriptClick.on(PaquetesUI.OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())),
                Espera.esperaSeg(15),
                Click.on(PaquetesUI.BOTON_COMPRA_UNAVEZ),
                Espera.esperaSeg(5),
                Scroll.to(PaquetesUI.OPCION_MENU_FORMA_DE_PAGO.of(tipoPago + "")).andAlignToTop()
        );
    }
    public static Performable CompraPaquetigo(String tipoPago, Paquetigos paquetigo) {
        return Task.where("{0} realiza la selección y compra de paquetigo",
                Espera.esperaSeg(5),
                Scroll.to(PaquetesUI.OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())).andAlignToTop(),
                Espera.esperaSeg(5),
                JavaScriptClick.on(PaquetesUI.OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())),
                Espera.esperaSeg(15),
                Click.on(PaquetesUI.BOTON_COMPRA_RECURRENTE),
                Scroll.to(PaquetesUI.OPCION_MENU_FORMA_DE_PAGO.of(tipoPago)).andAlignToTop()
        );
    }
    public static Performable TigoTePresta(Paquetigos paquetigo) {
        return Task.where("{0} realiza la selección de Tigo Te Presta",
                Scroll.to(PaquetesUI.OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())).andAlignToTop(),
                Espera.esperaSeg(5),
                JavaScriptClick.on(PaquetesUI.OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())),
                Espera.esperaSeg(10),
                JavaScriptClick.on(PaquetesUI.BOTON_TIGOTEPRESTA),
                Scroll.to(PaquetesUI.BOTON_PAGAR_TP).andAlignToTop(),
                Click.on(PaquetesUI.BOTON_PAGAR_TP)
        );
    }

    public static Performable PagueTigo(Paquetigos paguetigo, String precio) {
        return Task.where("haceClickenelPaguetigoLargaDistancia",
                Espera.esperaSeg(10),
                Scroll.to(PaquetesUI.paquetesLargaDistanciaInternacional(paguetigo.getPaquetigo())),
                Click.on(PaquetesUI.botonesSaldo(precio))
        );
    }

    public static Performable DetallesdeCompra() {
        return Task.where("detallesdepaqueteinternacional",
                Espera.esperaSeg(15),
                Scroll.to(PaquetesUI.DETALLES_DE_COMPRA),
                Espera.esperaSeg(15)

        );
    }
}