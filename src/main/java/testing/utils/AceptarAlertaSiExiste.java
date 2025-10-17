package testing.utils;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AceptarAlertaSiExiste implements Interaction{

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            System.out.println("Alerta aceptada");
        } catch (NoAlertPresentException e) {
            System.out.println("No había alerta, se continúa normalmente");
        }
    }

    public static AceptarAlertaSiExiste ahora() {
        return Tasks.instrumented(AceptarAlertaSiExiste.class);
    }
}
