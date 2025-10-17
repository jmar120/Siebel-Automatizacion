package testing.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoPage {

    public static final Target NUMEROPRODUCTO = Target.the("Número de producto").locatedBy("//*[@id='a_3']/div/table/tbody/tr[3]/td[12]/div/input");

    public static final Target NOPRODUCTO = Target.the("Producto no encontrado").locatedBy("//*[@id='a_1']/div/table/tbody/tr[3]/td[12]/div/input");

    public static final Target MASPRODUCTOS = Target.the("1 - 10 de más de 10+").locatedBy("");


//*[@id='a_3']/div/table/tbody/tr[3]/td[12]/div/input
    //*[@id='a_1']/div/table/tbody/tr[3]/td[12]/div/input
    //*[@id='s_2_rc']
}
