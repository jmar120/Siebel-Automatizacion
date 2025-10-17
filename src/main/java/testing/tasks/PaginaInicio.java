package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.ui.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaInicio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.PRODUCTOSYSERVICIOS)
        );
    }

    public static PaginaInicio darClick() {
        return instrumented(PaginaInicio.class);
    }

}
