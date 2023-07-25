package co.com.fyffes.portal.ui.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashbO2cUI {

    public static final Target BTN_DASHBOARD_O2C_DETAIL =Target.the ("Detail O2c dashboard").located(By.xpath("//h3/span[text()='O2C']"));

    //*** Question ***
    public static final Target TXT_FOUND_O2C =Target.the ("Text found O2c dashboard detail").located(By.xpath("//*[text()='O2C - Invoices']"));


}
