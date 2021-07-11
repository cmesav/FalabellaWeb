package co.com.falabella.tasks;

import co.com.falabella.models.Producto;
import co.com.falabella.ui.Televisores;
import co.com.falabella.utils.Tamano;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Agregar implements Task {

    private final Producto producto;

    public Agregar(Producto producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionaCategoria.y(producto),
                Click.on(Televisores.TAMANO_TV.of(Tamano.devolver(producto.getTamano()))),
                Click.on(Televisores.MENU_MARCA),
                Enter.theValue(producto.getMarca()).into(Televisores.BUSCAR_MARCA),
                Click.on(Televisores.CHECK_MARCA.of("1"))
        );

        for(int i=0; i < Televisores.RESULTADOS.resolveAllFor(actor).size(); i++){
//Ajustar para comparar los titulos de los resultados con la busqueda y asi seleccionar el producto correcto
        }
    }

    public static Agregar televisor(Producto producto) {
        return Tasks.instrumented(Agregar.class, producto);
    }
}
