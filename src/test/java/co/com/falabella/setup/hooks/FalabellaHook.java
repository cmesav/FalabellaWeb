package co.com.falabella.setup.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class FalabellaHook {

    @Managed
    private static WebDriver suNavegador;

    @Before
    public void setUpOneStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(suNavegador)));
        OnStage.theActorCalled("Cristian");
    }

    @After
    public void cerrarElEscenario() {
        OnStage.drawTheCurtain();
    }
}
