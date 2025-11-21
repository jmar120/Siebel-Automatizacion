package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import testing.ui.ProductoDatosPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductoDatos implements Task {

    private final String link;

    public ProductoDatos (String enlace){this.link = enlace;}

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
         //       Enter.theValue(this.link).into(ProductoDatosPage.ENLACENUMEROPRODUCTO)
                Click.on(ProductoDatosPage.ENLACENUMEROPRODUCTO)

        );
    }

    public static ProductoDatos darclickenlace(String enlace)
    {
        return instrumented(ProductoDatos.class, enlace);
    }
}
