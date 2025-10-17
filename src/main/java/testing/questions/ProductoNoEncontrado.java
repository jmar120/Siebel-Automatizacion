package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import testing.ui.ProductoPage;

public class ProductoNoEncontrado implements Question <Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(ProductoPage.NOPRODUCTO).isDisplayed(),
                Ensure.that(ProductoPage.NOPRODUCTO).text().contains("")
        );
        return true;
    }

    public static ProductoNoEncontrado campoVacio() {return new ProductoNoEncontrado();}
}
