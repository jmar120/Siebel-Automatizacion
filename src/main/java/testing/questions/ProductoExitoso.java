package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import testing.ui.ProductoPage;

public class ProductoExitoso implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ProductoPage.NUMEROPRODUCTO).isDisplayed(),
                Ensure.that(ProductoPage.NUMEROPRODUCTO).text().contains("0049202724")
        );
        return true;
    }

    public static ProductoExitoso productoEncontrado() {return new ProductoExitoso();}
}
