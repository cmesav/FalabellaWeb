package co.com.falabella.stepdefinitions;

import co.com.falabella.models.Producto;
import co.com.falabella.tasks.Agregar;
import co.com.falabella.tasks.SeleccionaCategoria;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ComprarProductoStepdefinitions {

    @Dado("^que el cliente se encuentra en el sitio web$")
    public void queElClienteSeEncuentraEnElSitioWeb() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.falabella.com.co/falabella-co"));
    }


    @Cuando("^agrega el producto a la canasta de compra$")
    public void agregaElProductoALaCanastaDeCompra(Producto producto) {
        theActorInTheSpotlight().attemptsTo(Agregar.televisor(producto));
    }

    @Entonces("^se encontrara en la pagina de pagos \"([^\"]*)\"$")
    public void seEncontraraEnLaPaginaDePagos(String url) {

    }

    @Entonces("^vera el mensaje \"([^\"]*)\"$")
    public void veraElMensaje(String mensaje) {

    }



}
