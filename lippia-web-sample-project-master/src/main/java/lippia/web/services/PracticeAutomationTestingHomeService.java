package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeAutomationTestingConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class PracticeAutomationTestingHomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterShop() {
        click(PracticeAutomationTestingConstants.SHOP_ID);
    }

    public static void enterHome() {
        click(PracticeAutomationTestingConstants.HOME_ID);
    }


    public static void scrollSliders() {
        Assert.assertTrue(WebActionManager.isVisible(PracticeAutomationTestingConstants.FIRSTLIDERS));
        Assert.assertTrue(WebActionManager.isVisible(PracticeAutomationTestingConstants.SECONDLIDERS));
        Assert.assertTrue(WebActionManager.isVisible(PracticeAutomationTestingConstants.THREESLIDERS));
    }
}
