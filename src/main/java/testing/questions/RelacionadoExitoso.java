package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import testing.ui.RelacionadosProductoPage;

public class RelacionadoExitoso implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(RelacionadosProductoPage.NUMERODOCUMENTORELACIONADO).isDisplayed(),
                Ensure.that(RelacionadosProductoPage.NUMERODOCUMENTORELACIONADO).text().contains("19902736")
        );
        return true;
    }

    public static RelacionadoExitoso relacionadoEncontrado(){return new  RelacionadoExitoso();}
}
