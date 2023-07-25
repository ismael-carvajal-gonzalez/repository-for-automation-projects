package co.com.fyffes.portal.ui.processing.prebooksplans;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PrebooksPlansUI {
    public static final Target BTN_SUPPLY_CHAIN_MENU =Target.the ("Supply Chain Menu Options").located(By.xpath("//*[@id=\"Supply Chain\"]"));
    public static final Target BTN_SUPPLY_CHAIN_PROCESSING =Target.the ("Processing sub menu").located(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/ul[6]/div/ul/ul[2]/a/span"));
    public static final Target BTN_SUPPLY_CHAIN_PROCESSING_PREBOOKS_PLANS =Target.the ("Prebooks Plans sub menu").located(By.xpath("//*[@id=\"Prebooks / Plans\"]"));
    public static final Target BTN_OPERATIONS_MENU_ARROW_LEFT =Target.the ("arrow closes menu to the left").located(By.xpath("//div/button[@id=\"kt_aside_toggler\"]"));

    public static final Target LIST_SUPPLY_CHAIN_ARRIVAL_WEEK =Target.the ("Arrival Week Drop Down").located(By.xpath("//*[@id=\"arrival_week\"]"));
    public static final Target LIST_SUPPLY_CHAIN_SALES_PERSON =Target.the ("Sales Person Drop Down").located(By.xpath("//*[@id=\"sales_person\"]"));
    public static final Target BTN_SUPPLY_CHAIN_VIEW_PREBOOKS =Target.the ("View Prebooks Button").located(By.xpath("//*[text()=\" View Prebooks \"]"));

    public static final Target BTN_WARNING_CLOSE_SUPPLY_CHAIN_VIEW_PREBOOKS = Target.the("Btn warning close").located(By.xpath("//span[normalize-space()='Close']"));

    public static final Target BTN_CANCEL_SUPPLY_CHAIN_VIEW_PREBOOKS = Target.the("Btn cancel").located(By.xpath("//span[normalize-space()='Cancel']"));
    public static final Target BTN_SUPPLY_CHAIN_ADD_NEW_LINE =Target.the ("Add New Line in Prebooks").located(By.xpath("(//*[@id=\"add_new_line\"]/mat-icon/em)[1]"));
    public static final Target TXT_SUPPLY_CHAIN_ADD_NEW_LINE_QUANTITY =Target.the ("Quantity Input Field in Add New Line").located(By.xpath("//*[@id=\"quantity\"]"));
    public static final Target LIST_SUPPLY_CHAIN_ADD_NEW_LINE_CUSTOMERS =Target.the ("Customers List in Add New Line").located(By.xpath("//*[@id=\"customer\"]"));

    public static final Target OPTION_LIST_SUPPLY_CHAIN_ADD_NEW_LINE_CUSTOMERS = Target.the("Option Customer list in Add New Line").located(By.xpath("//span[@class='mat-option-text'][normalize-space()='WALMAR']"));

    public static final Target OPTION_LIST_SUPPLY_CHAIN_ADD_NEW_LINE_CUSTOMERS2 = Target.the("Option Customer list in Add New Line").located(By.xpath("//span[@class='mat-option-text'][normalize-space()='TOPCOA']"));
    public static final Target TXT_SUPPLY_CHAIN_ADD_NEW_LINE_PARTCODE =Target.the ("Part Code List in Add New Line").located(By.xpath("//*[@id=\"partcode\"]"));
    public static final Target BTN_SUPPLY_CHAIN_ADD_NEW_LINE_SAVE =Target.the ("Save Button in Add New Line").located(By.xpath("//span[normalize-space()='Save']"));

    public static final Target BTN_SUPPLY_CHAIN_ADD_NEW_LINE_CANCEL = Target.the("Cancel Button in Add New Line").located(By.xpath("//*[@id=\"btn_cancel\"]"));
    public static final Target BTN_SUPPLY_CHAIN_ADD_NEW_LINE_CLOSE = Target.the("Close button in Add new Line").located(By.xpath("//span[normalize-space()='Close']"));
    public static final Target BTN_SUPPLY_CHAIN_EDIT_LINE =Target.the ("Edit Line Button").located(By.xpath("//*[@id=\"edit_prebook\"]"));
    public static final Target TXT_SUPPLY_CHAIN_EDIT_LINE_QTY =Target.the ("QTY input Field in Edit Line").located(By.xpath("//div/input[@type=\"number\"]"));
    public static final Target BTN_SUPPLY_CHAIN_EDIT_LINE_DISK =Target.the ("Save Disk Button in Edit Line").located(By.xpath("//*[@id=\"save_prebook\"]"));

    public static final Target BTN_SUPPLY_CHAIN_DELETE_LINE =Target.the ("Delete Line Button").located(By.xpath("//*[@class=\"fas fa-times\"]"));
    public static final Target BTN_SUPPLY_CHAIN_CONFIRM_DELETE =Target.the ("Confirm Delete Line Button").located(By.xpath("//*[text()=\"Accept\"]"));

    public static final Target BTN_SUPPLY_CHAIN_SEND_PREBOOK =Target.the ("Send Prebook Button").located(By.xpath("//*[@id=\"send_prebook\"]"));
    public static final Target BTN_SUPPLY_CHAIN_CONFIRM_SEND_PREBOOK =Target.the ("Confirm Send Prebook Button").located(By.xpath("//*[text()=\"Accept\"]"));
}

