package co.com.fyffes.portal.ui.processing.confirmationofsales;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ConfirmationOfSalesUI {
    public static final Target BTN_OPERATIONS_MENU =Target.the ("Operations Menu Options").located(By.xpath("//*[@id=\"Operations\"]"));
    public static final Target BTN_OPERATIONS_PROCESSING =Target.the ("Processing sub menu Options").located(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/ul[5]/div/ul/ul[2]/a/span"));
    public static final Target BTN_OPERATIONS_PROCESSING_CONFIRMATION_OF_SALES =Target.the ("Confirmation Of Sales sub menu Options").located(By.xpath("//*[@id=\"Confirmation Of Sales\"]"));
    public static final Target BTN_OPERATIONS_MENU_ARROW_LEFT =Target.the ("arrow closes menu to the left").located(By.xpath("//div/button[@id=\"kt_aside_toggler\"]"));

    public static final Target LIST_OPERATIONS_PROC_CONFIRMATION_DIVISION =Target.the ("Division List in Operation Processing").located(By.xpath("//*[@id=\"division\"]"));

    public static final Target OPTION_LIST_OPERATIONS_PROC_CONFIRMATION_DIVISION = Target.the("Option division list in Operation Processing").located(By.xpath("//span[@class='mat-option-text'][normalize-space()='00 - GENERAL']"));
    public static final Target LIST_OPERATIONS_PROC_CONFIRMATION_WAREHOUSE =Target.the ("Warehouse List in Operation Processing").located(By.xpath("//*[@id=\"warehouse\"]"));

    public static final Target LIST_OPERATIONS_PROC_CONFIRMATION_WAREHOUSE2 =Target.the ("Warehouse List in Operation Processing2").located(By.xpath("//*[@id=\"mat-option-9\"]"));

    public static final Target OPERATIONS_PROC_CONFIRMATION_CLOSE = Target.the("Warehouse in Operation Processing close").located(By.xpath("//span[normalize-space()='Close']"));
    public static final Target TXT_OPERATIONS_PROC_CONFIRMATION_ORDER_NUMBER = Target.the("Order Number in Operation Processing").located(By.xpath("//*[@id=\"order_number\"]"));
    public static final Target TXT_OPERATIONS_PROC_CONFIRMATION_SHIP_DATE =Target.the ("Ship Date in Operation Processing").located(By.xpath("//*[@id=\"ship_date\"]"));
    public static final Target BTN_OPERATIONS_PROC_CONFIRMATION_SEARCH =Target.the ("Search Button in Operation Processing").located(By.xpath("//*[@id=\"btn_search\"]"));

    public static final Target BTN_OPERATIONS_PROC_CONFIRMATION_SEND_EMAIL =Target.the ("Send Email Button in Bill Lading").located(By.xpath("//*[@id=\"btn_send_email\"]"));
    public static final Target TXT_OPERATIONS_PROC_CONFIRMATION_OTHER_EMAIL =Target.the ("Other Email Input Field in Bill Lading").located(By.xpath("//*[@ng-reflect-placeholder=\"Email addresses separated by c\"]"));
    public static final Target BTN_OPERATIONS_PROC_CONFIRMATION_SEND =Target.the ("Send Button in Bill Lading").located(By.xpath("//*[@id=\"btn_send\"]"));

    public static final Target BTN_OPERATIONS_PROC_CONFIRMATION_CLOSE = Target.the("Close Button").located(By.xpath("//span[normalize-space()='Close']"));
}
