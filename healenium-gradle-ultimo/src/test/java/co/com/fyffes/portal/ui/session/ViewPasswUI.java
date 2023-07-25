package co.com.fyffes.portal.ui.session;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ViewPasswUI {
    public static final Target INP_USERNAME =Target.the ("User name input field").located(By.xpath("//input[@type='username']"));
    public static final Target INP_PASSWORD =Target.the ("Password input field").located(By.xpath("//input[@type='password']"));
    public static final Target BTN_VIEW_PASSW_ON =Target.the ("View Password on Button").located(By.xpath("//div/mat-icon[contains(text(),'visibility')]"));
    public static final Target BTN_VIEW_PASSW_OFF =Target.the ("View Password Off Button").located(By.xpath("//mat-icon[contains(text(),'visibility_off')]"));

    //*** Question ***


}
