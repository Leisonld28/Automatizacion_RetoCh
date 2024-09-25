package co.com.tigo.qa.tasks;

import co.com.tigo.qa.userinterfaces.MenuMasUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static java.time.Duration.ofSeconds;


public class SeleccionarMenuMas {


        public static Performable menumas(String opcion) {
           return Task.where("{0} Selecciona la opcion " + opcion,
                    Click.on(MenuMasUI.OPCION_MENU_MAS_ONEAPP.of(opcion).waitingForNoMoreThan(ofSeconds(30)))
             );
    }

}
