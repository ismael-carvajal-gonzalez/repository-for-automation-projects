package co.com.fyffes.portal.ui.o2c.processing;


import co.com.fyffes.portal.utils.o2c.processing.supportcreditdocument.SupportCreditData;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.sql.SQLException;


public class SupportCreditDocumentUI {
    public static final Target BTN_O2C_MENU =Target.the ("O2c menu Options Button").located(By.xpath("//a/span[text()='O2C']"));
    public static final Target BTN_O2C_PROCESSING =Target.the ("Processing sub menu Options Button").located(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/ul[4]/div/ul/ul[2]/a/span"));
    public static final Target BTN_O2C_SUPPORT_CREDIT_DOCUMENT =Target.the ("Support Credit Document Menu Options").located(By.id("Support Credit Documents"));
    public static final Target BTN_O2C_MENU_ARROW_LEFT =Target.the ("arrow closes menu to the left").located(By.xpath("//div/button[@id=\"kt_aside_toggler\"]"));

    public static final Target TEXT_REQUIRED = Target.the("Text required").located(By.xpath("//*[@id=\"mat-error-0\"]/strong"));

    public static final Target ERROR_TEXT = Target.the("Error text").located(By.xpath("//*[@id=\"mat-dialog-0\"]/kt-modal-alert/div[2]/p"));
    public static final Target LIST_O2C_SUPPORT_CREDIT_DIVISION =Target.the ("Division List in Support Credit Doc").located(By.id("division"));
    public static final Target OPT_O2C_SUPPORT_CREDIT_DIVISION =Target.the ("Select Division Option").located(By.xpath("//*[text()=\" 00 - GENERAL \"]"));

    public static final Target TXT_O2C_SUPPORT_CREDIT_NUMBER =Target.the ("Credit Number Input Field").located(By.id("credit_number"));
    public static final Target TXT_O2C_SUPPORT_CREDIT_INVOICE_NUMBER =Target.the ("Invoice Number Input Field").located(By.id("invoice_number"));
    public static final Target TXT_O2C_SUPPORT_CREDIT_ORDER_NUMBER =Target.the ("Order Number Input Field").located(By.id("order_number"));
    public static Target OPT_O2C_SUPPORT_CREDIT_NUMBER = null;
    static {
        try {
            OPT_O2C_SUPPORT_CREDIT_NUMBER = Target.the ("Credit Number Item").located(By.xpath(new SupportCreditData().getCreditNumber()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static final Target BTN_O2C_SUPPORT_CREDIT_SEARCH =Target.the ("Search Button in Support Credit Doc.").located(By.id("btn_search"));

}
