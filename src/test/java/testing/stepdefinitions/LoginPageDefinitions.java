package testing.stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.questions.*;
import testing.tasks.*;
import testing.utils.AceptarAlertaProductoCaracteresEspeciales;
import testing.utils.AceptarAlertaSiExiste;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginPageDefinitions {

    @Then("Debe iniciar sesión correctamente")
    public void debeIniciarSesiónCorrectamente() {
        theActorInTheSpotlight().should(seeThat(SuccessLogin.loginExitoso()));
    }

    @Then("Debe ver el mensaje de error {string}")
    public void debeVerElMensajeDeError(String expectedErrorMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorLogin.porCredencialesInvalidas(expectedErrorMessage)));
    }

    @Then("Debe ver el mensaje de error {string} debajo del nombre de usuario")
    public void debeVerElMensajeDeErrorDebajoDelNombreDeUsuario(String expectedErrorMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorLogin.porNombreDeUsuarioFaltante(expectedErrorMessage)));
    }

    @When("Inicia sesión con las credenciales {string} y {string}")
    public void iniciaSesiónConLasCredencialesY(String username, String password) {
        OnStage.withCurrentActor(Login.conCredenciales(username, password),
                AceptarAlertaSiExiste.ahora());
        //OnStage.withCurrentActor(PaginaInicio.darClick());
    }

    @Then("Debe ver el mensaje de error {string} debajo de la contrasena")
    public void debeVerElMensajeDeErrorDebajoDeLaContrasena(String expectedErrorMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorLogin.porFaltaDeContrasena(expectedErrorMessage)));
    }

    @When("Ingresa al modulo de producto")
    public void ingresa_al_modulo_de_producto() {
        OnStage.withCurrentActor(PaginaInicio.darClick());
    }

    @When("Busca el producto {string}")
    public void busca_el_producto(String productnumber) {
        OnStage.withCurrentActor(ProductosYServicios.producto(productnumber));
    }

    @Then("Debe mostrar el producto {string}")
    public void debe_mostrar_el_producto(String string) {
        theActorInTheSpotlight().should(seeThat(ProductoExitoso.productoEncontrado()));
    }

    @Then("No debe mostrar el producto {string}")
    public void noDebeMostrarElProducto(String string) {
        theActorInTheSpotlight().should(seeThat(ProductoNoEncontrado.campoVacio()));
    }

    @Then("Muestra mensaje indicando caracteres invalidos")
    public void muestraMensajeIndicandoCaracteresInvalidos() {
        AceptarAlertaProductoCaracteresEspeciales.alertaCaracteres();
    }

    @When("Se da click en Buscar el producto")
    public void seDaClickEnBuscarElProducto() {
        //OnStage.withCurrentActor(ProductosYServicios.producto(productnumber));
        OnStage.withCurrentActor(Productos.buscar());
    }
    @Then("Muestra todos los productos")
    public void muestraTodosLosProductos() {
        // theActorInTheSpotlight().should(seeThat(ProductoNoEncontrado.campoVacio()));
        theActorInTheSpotlight().should(seeThat(MasProductos.hayMas()));
        //probando los commit en git
    }

    @When("Da click en el producto {string}")
    public void daClickEnElProducto(String enlace) {
        // Write code here that turns the phrase above into concrete actions
       OnStage.withCurrentActor(ProductoDatos.darclickenlace(enlace));
    }
    @Then("Muestra el cliente con numero {string}")
    public void muestraElClienteConNumero(String string) {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(RelacionadoExitoso.relacionadoEncontrado()));
    }

}
