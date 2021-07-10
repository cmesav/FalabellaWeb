package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MetodoDePago {

    private MetodoDePago() {
    }

    public static final Target TITULO = Target.the("Titulo pagina")
            .located(By.className("fbra_paymentOptionsTitle__heading__payment"));

    public static final Target MONTO_PAGAR = Target.the("Direccion")
            .located(By.className("fbra_text fbra_test_orderSummary__totalCostPrice fbra_orderSummary__totalCostPrice"));


}
