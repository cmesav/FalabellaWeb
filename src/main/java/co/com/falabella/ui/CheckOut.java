package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOut {

    private CheckOut() {
    }

    public static final Target EMAIL= Target.the("Campo email")
            .located(By.id("'emailAddress'"));

    public static final Target BOTON_CONTINUAR = Target.the("Boton continuar")
            .locatedBy("//button[contains(@class,'submitButton')]");

    public static final Target REGION = Target.the("Departamento")
            .located(By.id("region"));

    public static final Target CIUDAD = Target.the("Ciudad")
            .located(By.id("ciudad"));

    public static final Target BARRIO = Target.the("Barrio")
            .located(By.id("comuna"));

    public static final Target CONTINUAR = Target.the("Boton Continuar")
            .located(By.className("fbra_button fbra_test_button fbra_formItem__field04"));


}
