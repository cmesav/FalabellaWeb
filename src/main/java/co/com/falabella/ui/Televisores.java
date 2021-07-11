package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Televisores {

    private Televisores() {
    }

    public static final Target TAMANO_TV = Target.the("Selecciona tamaño")
            .locatedBy("//*[@class=’uxc-huincha-item uxc-huincha-circle-opacity9 uxc-huincha-circle-fondo’][5]");

    public static final Target MENU_MARCA = Target.the("Desplegar Marcas")
            .located(By.id("testId-Accordion-Marca"));

    public static final Target BUSCAR_MARCA = Target.the("Campo buscar marca")
            .located(By.id("testId-Multiselect-Marca"));

    public static final Target CHECK_MARCA = Target.the("Check marca")
            .locatedBy("//li[@class='jsx-53718149']//input[contains(@id,'LG-')]");

    public static final Target RESULTADOS = Target.the("Resultados")
            .locatedBy("//*[@data-pod='catalyst-pod']");

    public static final Target TITULO_PRODUCTO = Target.the("Titulo Producto")
            .locatedBy("//*[@data-pod='catalyst-pod']//b[contains(@id,'displaySubTitle')]");

    public static final Target AGREGAR_BOLSA= Target.the("Boton agregar a la bolsa")
            .locatedBy("(//*[@data-pod='catalyst-pod']//button[contains(@id,'action')])[1]");

    public static final Target BOTON_VER_BOLSA= Target.the("Ver Bolsa")
            .located(By.id("linkButton"));


}
