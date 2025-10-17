package testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    private LoginPage() { }

//    public static final Target SUBMIT_BUTTON = Target.the("Boton login")
//            .locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    public static final Target ERROR_MESSAGE = Target.the("Mensaje de error")
            .locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
    public static final Target MISSING_USERNAME = Target.the("Mensaje de error por usuario faltante")
            .locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
/*    public static final Target USERNAME = Target.the("Campo de usuario")
            .located(By.name("username"));
    public static final Target PASSWORD = Target.the("Campo de contraseña")
            .located(By.name("password"));

 */
    public static final Target MISSING_PASSWORD = Target.the("Mensaje de error por contraseña faltante")
            .locatedBy("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");

    public static final Target USERNAME = Target.the("Campo de usuario")
            .locatedBy("//*[@id='s_swepi_1']");
    public static final Target PASSWORD = Target.the("Campo de contraseña")
            .locatedBy("//*[@id='s_swepi_2']");
    public static final Target SUBMIT_BUTTON = Target.the("Boton login")
            .locatedBy("//*[@id='s_swepi_22']");



}
