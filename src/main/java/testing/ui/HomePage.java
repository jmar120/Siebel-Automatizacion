package testing.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    private HomePage() { }

//    public static final Target DASHBOARD_TEXT = Target.the("Mensaje de bienvenida")
//            .locatedBy(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");

    public static final Target DASHBOARD_TEXT = Target.the("Mensaje de bienvenida")
            .locatedBy("//*[@id='_sweappmenu']/div/div[2]");


    public static final Target PRODUCTOSYSERVICIOS = Target.the("Botón Productos y Servicios")
            .locatedBy("//span[@class='siebui-icon-fincorp_portfolio_icon siebui-icon-screentab_icon home']");

//*[@id='ui-id-1400']/span
//*[@id='ui-id-1490']
    //*[@id='ui-id-143']/text()
    //*[@id='ui-id-230']/span
    //span[@class='siebui-icon-fincorp_portfolio_icon siebui-icon-screentab_icon home']
}

