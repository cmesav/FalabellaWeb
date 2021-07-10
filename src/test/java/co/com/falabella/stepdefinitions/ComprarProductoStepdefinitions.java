package co.com.falabella.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class ComprarProductoStepdefinitions {

    @Dado("^que el cliente se encuentra en el sitio web$")
    public void queElClienteSeEncuentraEnElSitioWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(""));
    }


    @Cuando("^agrega el producto a la canasta de compra$")
    public void agregaElProductoALaCanastaDeCompra() {

    }

    @Entonces("^se encontrara en la pagina de pagos \"([^\"]*)\"$")
    public void seEncontraraEnLaPaginaDePagos(String url) {

    }

    @Entonces("^vera el mensaje \"([^\"]*)\"$")
    public void veraElMensaje(String mensaje) {

    }



}
