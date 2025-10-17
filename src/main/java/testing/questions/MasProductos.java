package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import testing.ui.ProductoPage;

public class MasProductos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ProductoPage.MASPRODUCTOS).isDisplayed(),
                Ensure.that(ProductoPage.MASPRODUCTOS).text().contains("1 - 10 de más de 10+")
        );
        return true;
    }

    public static MasProductos hayMas() {
        return new MasProductos();
    }

}
