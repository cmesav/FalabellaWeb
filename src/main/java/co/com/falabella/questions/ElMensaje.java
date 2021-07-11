package co.com.falabella.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ElMensaje implements Question<String> {

    private final Target campo;

    public ElMensaje(Target campo) {
        this.campo = campo;
    }

    @Override
    public String answeredBy(Actor actor) {
        return campo.resolveFor(actor).getText();
    }

    public static ElMensaje enElCampo(Target campo) {
        return new ElMensaje(campo);
    }
}
