package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Despacho {

    private Despacho() {
    }

    public static final Target DIRECCION = Target.the("DireccionEnvio")
            .located(By.id("address"));

        public static final Target DIRECCION_ADICIONAL = Target.the("Campo complementario")
            .located(By.id("departmentNumber"));

        public static final Target BOTON_INGRESAR_DIRECCION = Target.the("Boton ingresar")
            .locatedBy("//*[@class='fbra_button fbra_test_button fbra_formItem__useAddress']");

        public static final Target CAMPO_DESPLEGABLE = Target.the("Informacion adicional despacho")
            .locatedBy("//*[@class='fbra_deliveryInstructions__collapsibleBody_label']");

        public static final Target INSTRUCCIONES = Target.the("instrucciones de entrega")
            .located(By.id("deliveryInstructions"));

    public static final Target BOTON_CONTINUAR = Target.the("Informacion adicional despacho")
            .locatedBy("//*[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']");

}
