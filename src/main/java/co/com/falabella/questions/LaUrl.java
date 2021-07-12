package co.com.falabella.questions;

import co.com.falabella.ui.MetodoDePago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LaUrl implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver = getDriver();

        actor.attemptsTo(
                WaitUntil.the(MetodoDePago.TITULO, WebElementStateMatchers.isVisible())
        );
        return driver.getCurrentUrl();
    }

    public static LaUrl es() {
        return new LaUrl();
    }
}
