package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial {

    private PaginaInicial() {
    }

    public static final Target CERRAR_POP = Target.the("Cerrar PopUp")
            .located(By.id("lightbox-close"));

    public static final Target BUSCAR = Target.the("Barra de busqueda")
            .located(By.id("testId-SearchBar-Input"));

    public static final Target CATEGORIAS = Target.the("Menu categorias")
            .located(By.id("testId-HamburgerBtn-toggle"));

    public static final Target CATEGORIA = Target.the("Selecciona categoria {0}")
            .locatedBy("//p[contains(text(),'{0}')]");

    public static final Target TIPO_PRODUCTO = Target.the("Selecciona producto {0}")
            .locatedBy("//*[@id='testId-ThirdLevelMenu-link'][contains(text(),'{0}')]");


}
