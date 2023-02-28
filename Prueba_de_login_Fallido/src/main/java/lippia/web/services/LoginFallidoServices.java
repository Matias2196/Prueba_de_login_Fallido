package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginFallidoConstants;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginFallidoServices extends ActionManager {

    public static void mainpage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void redireccion() {
        click(LoginFallidoConstants.REDIRECCION);
    }
    public static void logueo(String text){
        setInput(LoginFallidoConstants.LOGUEO, text + Keys.ENTER);
    }
    public static void resultados(){
        Assert.assertTrue(WebActionManager.getElement(LoginFallidoConstants.RESULTADO).isDisplayed());
    }

}
