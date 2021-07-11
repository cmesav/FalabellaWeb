package co.com.falabella.tasks;

import co.com.falabella.models.Producto;
import co.com.falabella.ui.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class SeleccionaCategoria implements Task {

    private final Producto producto;

    public SeleccionaCategoria(Producto producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaInicial.CERRAR_POP),
                Click.on(PaginaInicial.CATEGORIAS),
                MoveMouse.to(PaginaInicial.CATEGORIA.of(producto.getCategoria())),
                Click.on(PaginaInicial.TIPO_PRODUCTO.of(producto.getTipoProducto())));
    }

    public static SeleccionaCategoria y(Producto producto) {
        return Tasks.instrumented(SeleccionaCategoria.class, producto);
    }
}
