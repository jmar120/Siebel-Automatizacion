package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import testing.ui.ProductosYServiciosPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductosYServicios implements Task {

    private final String product;

    public ProductosYServicios(String product){
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Enter.theValue(this.product).into(ProductosYServiciosPage.PRODUCTONUMERO),
                Click.on(ProductosYServiciosPage.SEARCH_BUTTON)
        );
    }

    public static ProductosYServicios producto(String product) {
        return instrumented(ProductosYServicios.class, product);
    }

}
