package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginFallidoServices;

public class LoginFallidoSteps extends PageSteps {

    @Given("Como usuario estoy en la main page de gmail")
    public void mainpage() {
        LoginFallidoServices.mainpage();
    }
    @When("Como usuaro me dirijo a la secccion de logueo")
    public void redireccion() {
        LoginFallidoServices.redireccion();
    }
    @And("Como usuario intento loguear poniendo mi(.*)$")
    public void logueo(String correo){
        LoginFallidoServices.logueo(correo);
    }
    @Then("El usuario no pudo loguear")
    public void resultado() {
        LoginFallidoServices.resultados();
    }

}
