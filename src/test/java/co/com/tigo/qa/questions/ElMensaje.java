package co.com.tigo.qa.questions;

import static java.time.Duration.ofSeconds;

import java.time.Duration;

import co.com.tigo.qa.userinterfaces.servicios.ServiciosPremiumHome;
import co.com.tigo.qa.userinterfaces.*;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;


public class
ElMensaje {

    public static Question<String> deConfirmacionDeLaTransaccionPaquetigos(String mensaje) {
        return actor -> Text.of(DetalleOrdenUI.MENSAJE_TRANSACCION.of(mensaje).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> confirmacionPago(String mensaje) {
        return actor -> Text.of(DetalleOrdenUI.MENSAJE_TRANSACCION.of(mensaje).waitingForNoMoreThan(ofSeconds(15))).answeredBy(actor);
    }

    public static Question<Boolean> confirmacionExitosa() {
        return actor -> Visibility.of(DetalleOrdenUI.MENSAJE_EXITOSO.waitingForNoMoreThan(ofSeconds(15))).answeredBy(actor);
   }
    public static Question<String> tituloDetalle() {
        return actor -> Text.of(PaquetesUI.RESUMEN_TRANSACCION.waitingForNoMoreThan(ofSeconds(15))).answeredBy(actor);
    }


     public static Question<String> detalles(String mensaje) {
        return actor -> Text.of(ConsumosUI.DETALLES.of(mensaje).waitingForNoMoreThan(Duration.ofSeconds(15))).answeredBy(actor);
    }

    public static Question<Boolean> botonContinuarInhabilitado() {
        return actor -> Visibility.of(RecargasUI.BOTON_CONTINUAR_DESACTIVADO.waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<Boolean> botonContinuarHabilitado() {
        return actor -> Visibility.of(RecargasUI.BOTON_CONTINUAR_NEQUI.waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> tokenizacionExitosa(String mensaje) {
        return actor -> Text.of(ServiciosUI.MENSAJE_AGREGAR_NUEVA_TARJETA_EXITOSA.of(mensaje).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> textoCrearCuenta() {
        return actor -> Text.of(ServiciosUI.TEXTO_CREAR_CUENTA.waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> tituloDetalleCompra() {
        return actor -> Text.of(PaquetesUI.MENSAJE_CONFIRMACION.waitingForNoMoreThan(ofSeconds(15))).answeredBy(actor);
    }

    public static Question<String> tituloSuscripcionActiva() {
        return actor -> Text.of(PaquetesUI.MENSAJE_CONFIRMACION_SUSCRIPCION.waitingForNoMoreThan(ofSeconds(15))).answeredBy(actor);
    }

    public static Question<String> tituloEliminacionPaqueteActivo() {
        return actor -> Text.of(PaquetesUI.MENSAJE_ELIMINACION_SUSCRIPCION.waitingForNoMoreThan(ofSeconds(15))).answeredBy(actor);
    }

    public static Question<String> codigoOTP() {
        return actor -> Text.of(RecargasUI.DESCRIPCION_DAVIPLATA.waitingForNoMoreThan(ofSeconds(15))).answeredBy(actor);
    }

    public static Question<String> mensajeCard() {
        return actor -> Text.of(ServiciosPremiumHome.CARD_MENSAJE_PROMO_SERVICIO.waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> precioCard() {
        return actor -> Text.of(ServiciosPremiumHome.CARD_PRECIO_PROMO_SERVICIO.waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> CaracteristicasDispositivo(String caracteristica) {
        return actor -> Text.of(ServiciosUI.CARACTERISTICAS_DISPOSITIVO.of(caracteristica).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> NOMBREPLAN(String plan) {
        return actor -> Text.of(ServiciosUI.NOMBRE_PLAN.of(plan).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> INTERNETPLAN(String internet) {
        return actor -> Text.of(ServiciosUI.INTERNET_PLAN.of(internet).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> MINUTOSPLAN(String min) {
        return actor -> Text.of(ServiciosUI.MINUTOS_PLAN.of(min).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> MENSAJESPLAN(String men) {
        return actor -> Text.of(ServiciosUI.MENSAJES_PLAN.of(men).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> PAGOPLAN(String pago) {
        return actor -> Text.of(ServiciosUI.PAGO_PLAN.of(pago).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> CARGOPLAN() {
        return actor -> Text.of(ServiciosUI.CARGO_PLAN.waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<Boolean> botonBloqueoHabilitadoDispositivo() {
        return actor -> Visibility.of(ServiciosUI.BOTON_BLOQUEO_DISPOSITIVO.waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }


    public static Question<String> tituloPagoNequi() {
        return actor -> Text.of(PaquetesUI.TITULO_PAGO_NEQUI.waitingForNoMoreThan(ofSeconds(15))).answeredBy(actor);
    }

    public static Question<String> tituloTienda(String msg) {
        return actor -> Text.of(TiendaUI.TITULO_TIENDA.of(msg).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }
    public static Question<Boolean> botonIrAlChat() {
        return actor -> Visibility.of(ServiciosUI.VALIDACION_CAMBIO_DOMICILIO.waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> trasladarMisServicios(String mensaje) {
        return actor -> Text.of(ServiciosUI.TRANSLADAR_MIS_SERVICIOS.of(mensaje).waitingForNoMoreThan(ofSeconds(10))).answeredBy(actor);
    }
    public static Question<String> historialTransacciones() {
        return actor -> Text.of(SaldosUI.TITLE_HISTORIAL.waitingForNoMoreThan(ofSeconds(10))).answeredBy(actor);
    }

    public static Question<String> infoCards(String texto) {
        return actor -> Text.of(ServiciosUI.INFO_CARDS.of(texto).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    public static Question<String> llenarCards(String texto) {
        return actor -> Text.of(ServiciosUI.LLENAR.of(texto).waitingForNoMoreThan(ofSeconds(30))).answeredBy(actor);
    }

    }


