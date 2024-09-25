package co.com.tigo.qa.tasks;

import co.com.tigo.qa.interactions.Espera;
import co.com.tigo.qa.userinterfaces.MiPerfilUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class MiPerfil {

    public static Performable digitarAntiguaContraseña(){
        return Task.where("Cambiar Contraseña",

                Enter.theValue("2800861d@#D").into(MiPerfilUI.DIGITAR_ANTIGUA_CONTRASEÑA),
                Espera.esperaSeg(3),
                Enter.theValue("2800861d@#D").into(MiPerfilUI.DIGITAR_NUEVA_CONTRASEÑA),
                Espera.esperaSeg(3)
        );

    }
}
