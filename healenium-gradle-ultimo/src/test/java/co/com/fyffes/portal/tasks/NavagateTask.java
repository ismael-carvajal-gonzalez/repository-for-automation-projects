package co.com.fyffes.portal.tasks;

import co.com.fyffes.portal.ui.o2c.inquiries.SalesOrderInquiriesUI;
import co.com.fyffes.portal.utils.Wait;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavagateTask {

    private static final Target INP_USERNAME =Target.the ("User name input field").located(By.xpath("//input[@type='username']"));
    private static final Target INP_PASSWORD =Target.the ("Password input field").located(By.xpath("//input[@type='password']"));
    private static final Target BTN_SIGN_IN =Target.the ("Sign In Button").located(By.id("kt_login_signin_submit"));
    private static final String URL_LOGIN = "https://tur-ap1.turbana.com/fyffesna/auth/login";

    public static Performable toLoginPage(){
        return Task.where("{0} Go to Login Page", Open.url(URL_LOGIN));
    }

    public static Performable usingCredencials (String username, String password){
        return Task.where("{0} Login as " + username, Wait.oneTime(18000), SendKeys.of(username).into(INP_USERNAME),
                SendKeys.of(password).into(INP_PASSWORD), Click.on(BTN_SIGN_IN), Wait.oneTime(28000));
    }

    public static Performable toMenuInquiries (){
        return Task.where("{0} Go to the menu inquiries ",
                Wait.oneTime(28000),
                Click.on(SalesOrderInquiriesUI.BTN_O2C_MENU),
                Click.on(SalesOrderInquiriesUI.BTN_O2C),
                Click.on(SalesOrderInquiriesUI.BTN_O2C_INQUIRIES),
                Click.on(SalesOrderInquiriesUI.BTN_O2C_PROC_SALES_ORDER_SEARCH),
                Wait.oneTime(20000),
                Click.on(SalesOrderInquiriesUI.BTN_O2C_MENU_ARROW_LEFT),
                Wait.oneTime(20000)
                );
    }

}
