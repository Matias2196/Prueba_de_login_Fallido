package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.GoogleConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class CommonServices extends ActionManager {
    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void interactPages() {
        String url = DriverManager.getDriverInstance().getCurrentUrl();
        if (url.contains("google_vignette")){
            click(GoogleConstants.CERRAR);
        }
        click(GoogleConstants.SHOP_ID);
        click(GoogleConstants.HOME_ID);

    }

}
