package co.com.falabella.tasks;

import co.com.falabella.models.DireccionEnvio;
import co.com.falabella.ui.CheckOut;
import co.com.falabella.ui.Despacho;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Ingresar implements Task {

    private final DireccionEnvio direccionEnvio;

    public Ingresar(DireccionEnvio direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(direccionEnvio.getDepartamento()).from(CheckOut.DEPARTAMENTO),
                SelectFromOptions.byVisibleText(direccionEnvio.getCiudad()).from(CheckOut.CIUDAD),
                SelectFromOptions.byVisibleText(direccionEnvio.getCiudad()).from(CheckOut.BARRIO),
                WaitUntil.the(CheckOut.CONTINUAR, WebElementStateMatchers.isClickable())
                        .then(Click.on(CheckOut.CONTINUAR))
        );
        System.out.println("pasamos departamento");
        actor.attemptsTo(
                Enter.theValue(direccionEnvio.getDireccion()).into(Despacho.DIRECCION),
                Enter.theValue(direccionEnvio.getComplementoDireccion()).into(Despacho.DIRECCION_ADICIONAL),
                Click.on(Despacho.BOTON_INGRESAR_DIRECCION),
                WaitUntil.the(Despacho.BOTON_CONTINUAR, WebElementStateMatchers.isClickable())
                        .then(Click.on(Despacho.BOTON_CONTINUAR))
        );
        System.out.println("pantalla pagos");

    }

    public static Ingresar direccion(DireccionEnvio direccionEnvio) {
        return Tasks.instrumented(Ingresar.class, direccionEnvio);
    }
}
