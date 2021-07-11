package co.com.falabella.tasks;

import co.com.falabella.models.Producto;
import co.com.falabella.ui.BolsaDeCompras;
import co.com.falabella.ui.Televisores;
import co.com.falabella.utils.Tamano;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Elegir implements Task {

    private final Producto producto;

    public Elegir(Producto producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionaCategoria.y(producto),
                Click.on(Televisores.TAMANO_TV.of(Tamano.devolver(producto.getTamano()))),
                Click.on(Televisores.MENU_MARCA),
                Enter.theValue(producto.getMarca()).into(Televisores.BUSCAR_MARCA),
                Click.on(Televisores.CHECK_MARCA.of("1")),
                WaitUntil.the(Televisores.AGREGAR_BOLSA.of("1"), WebElementStateMatchers.isVisible())
        );

        for (int i = 1; i <= Televisores.RESULTADOS.resolveAllFor(actor).size(); i++) {
            if (Televisores.TITULO_PRODUCTO.of(String.valueOf(i)).resolveFor(actor).getText()
                    .contains(producto.getMarca() + " " + producto.getTamano())) {
                 System.out.println(Televisores.TITULO_PRODUCTO.of(String.valueOf(i)).resolveFor(actor).getText());
                actor.attemptsTo(
                        Click.on(Televisores.AGREGAR_BOLSA.of(String.valueOf(i))),
                        WaitUntil.the(Televisores.BOTON_VER_BOLSA, WebElementStateMatchers.isVisible()),
                        Click.on(Televisores.BOTON_VER_BOLSA),
                        WaitUntil.the(BolsaDeCompras.VALOR_COMPRA, WebElementStateMatchers.isVisible()),
                        Click.on(BolsaDeCompras.BOTON_COMPRAR)
                );
                System.out.println("indice "+ i);
                break;
            }
        }
        System.out.println("se supone que agrego a la bolsa");
    }

    public static Elegir televisor(Producto producto) {
        return Tasks.instrumented(Elegir.class, producto);
    }
}
