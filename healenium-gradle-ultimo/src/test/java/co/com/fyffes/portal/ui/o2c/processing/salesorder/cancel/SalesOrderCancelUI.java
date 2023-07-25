package co.com.fyffes.portal.ui.o2c.processing.salesorder.cancel;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SalesOrderCancelUI {
    public static final Target BTN_O2C_MENU =Target.the ("O2c menu Options Button").located(By.xpath("//a/span[text()='O2C']"));
    public static final Target BTN_O2C_PROCESSING =Target.the ("Processing sub menu Options Button").located(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/ul[4]/div/ul/ul[2]/a/span"));
    public static final Target BTN_O2C_PROC_SALES_ORDER =Target.the ("Sales Order sub menu Options").located(By.xpath("//*[text()= 'Sales Order']"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CANCEL =Target.the ("Cancel Sales Order Options").located(By.xpath("//*[@id=\"Cancel Sales Order\"]"));
    public static final Target BTN_O2C_MENU_ARROW_LEFT =Target.the ("arrow closes menu to the left").located(By.xpath("//div/button[@id=\"kt_aside_toggler\"]"));

    public static final Target LIST_O2C_PROC_SALES_ORDER_CANCEL_DIV =Target.the ("Select Division List in Sales Order Cancel").located(By.xpath("//*[@id=\"division\"]"));
    public static final Target OPT_O2C_PROC_SALES_ORDER_CANCEL_DIV =Target.the ("Select 00-General Division ítem").located(By.xpath("//*[text()=\" 00 - GENERAL \"]"));
    public static final Target TXT_O2C_PROC_SALES_ORDER_CANCEL_NUMBER =Target.the ("Sales Order Number input Field").located(By.xpath("//*[@id=\"sales_order_number\"]"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CANCEL_SEARCH =Target.the ("Search Button in Sales Order Cancel").located(By.xpath("//*[@id=\"search_btn\"]"));

    public static final Target BTN_O2C_PROC_SALES_ORDER_CANCEL_YES =Target.the ("Yes Button in Sales Order Cancel").located(By.xpath("//*[@id=\"confirm_btn\"]"));

    public static final Target BTN_O2C_PROC_SALES_ORDER_CANCEL_CLOSE = Target.the("Close button in Sales Order Cancel").located(By.xpath("//*[@id=\"mat-dialog-9\"]/kt-modal-alert/div[3]/button"));

    public static final Target BTN_O2C_PROC_SALES_ORDER_CANCEL_CLOSE2 = Target.the("Close button in Sales Order Cancel 2").located(By.xpath("//span[normalize-space()='Close']"));
}
