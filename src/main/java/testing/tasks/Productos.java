package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.ui.ProductosYServiciosPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Productos implements Task {


    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Click.on(ProductosYServiciosPage.SEARCH_BUTTON)
        );
    }

    public static Performable buscar() {
        return instrumented(Productos.class);
    }

}
