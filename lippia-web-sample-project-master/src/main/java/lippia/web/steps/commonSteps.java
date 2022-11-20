package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lippia.web.services.CommonServices;

public class commonSteps extends PageSteps {
    @Given("The client is in the main page")
    public void homepage() { CommonServices.navegarWeb();
    }

    @And("The client interact with the page to add a book")
    public void interact_Page() {
        CommonServices.interactPages();
    }


}
