package testing.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosYServiciosPage {

    public static final Target PRODUCTONUMERO = Target.the("Botón Productos y Servicios")
            .locatedBy("//*[@id='s_S_A1_div']/div[1]/form/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/input");
    public static final Target SEARCH_BUTTON = Target.the("Botón Buscar").locatedBy("//*[@id='s_1_1_8_0_Ctrl']");

}

//*[@id='s_S_A1_div']/div[1]/form/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/input
//*[@id='s_1_1_8_0_Ctrl']