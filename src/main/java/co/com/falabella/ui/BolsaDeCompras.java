package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BolsaDeCompras {

    private BolsaDeCompras() {
    }

    public static final Target TITULO_PRODUCTO= Target.the("Titulo Producto {0}")
            .locatedBy("//*[@class='fb_product-form']//*[contains(text(),'{0}')]");


    public static final Target VALOR_COMPRA= Target.the("Valor compra")
            .locatedBy("(//*[@class='fb-order-status__sub-totals__value notranslate undefined'])[1]");

    public static final Target BOTON_COMPRAR= Target.the("Boton ir a comprar")
            .locatedBy("//*[@class='fb-order-status__cta']");



}
