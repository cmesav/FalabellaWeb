package co.com.falabella.stepdefinitions;

import co.com.falabella.models.DireccionEnvio;
import co.com.falabella.models.Producto;
import co.com.falabella.questions.ElMensaje;
import co.com.falabella.questions.LaUrl;
import co.com.falabella.tasks.Elegir;
import co.com.falabella.tasks.Ingresar;
import co.com.falabella.ui.MetodoDePago;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ComprarProductoStepdefinitions {

    @Dado("^que el cliente se encuentra en el sitio web$")
    public void queElClienteSeEncuentraEnElSitioWeb() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.falabella.com.co/falabella-co"));
    }


    @Cuando("^agrega el producto a la canasta de compra$")
    public void agregaElProductoALaCanastaDeCompra(Producto producto) {
        theActorInTheSpotlight().attemptsTo(Elegir.televisor(producto));
    }

    @Y("ingresa los datos de envio")
    public void ingresaLosDatosDeEnvio(DireccionEnvio direccionEnvio) {
        theActorInTheSpotlight().attemptsTo(Ingresar.direccion(direccionEnvio));
    }

    @Entonces("^se encontrara en la pagina de pagos \"([^\"]*)\"$")
    public void seEncontraraEnLaPaginaDePagos(String url) {
        theActorInTheSpotlight().should(seeThat(LaUrl.es(), Matchers.equalTo(url)));
    }

    @Entonces("^vera el mensaje \"([^\"]*)\"$")
    public void veraElMensaje(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ElMensaje.enElCampo(MetodoDePago.TITULO),
                Matchers.equalTo(mensaje)));
    }

}
