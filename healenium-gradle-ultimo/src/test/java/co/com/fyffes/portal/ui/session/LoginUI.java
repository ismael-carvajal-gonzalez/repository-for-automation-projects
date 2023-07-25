package co.com.fyffes.portal.ui.session;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

        public static final Target USERNAME_FIELD = Target.the("username field").located(By.id("mat-input-0"));
        public static final Target PASSWORD_FIELD = Target.the("password field").located(By.id("mat-input-1"));
        public static final Target SIGN_IN_BUTTON = Target.the("sign in button").located(By.id("kt_login_signin_submit"));
        public static final Target REMEMBER_ME_CHECKBOX = Target.the("remember me checkbox").located(By.id("mat-checkbox-1"));
        public static final Target FORGOT_PASSWORD_LINK = Target.the("forgot password link").located(By.xpath("//a[contains(@href,'/fyffesna/auth/forgot-password')]"));

        //*** Question ***
        public static final Target TXT_WELCOME_MESSAGE = Target.the("Welcome David").located(By.className("kt-header__topbar-username"));
        // Aquí podríamos agregar otros objetivos (Targets) si son necesarios para las otras pruebas.


}
