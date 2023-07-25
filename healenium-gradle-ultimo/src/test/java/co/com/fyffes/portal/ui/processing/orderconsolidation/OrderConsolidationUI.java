package co.com.fyffes.portal.ui.processing.orderconsolidation;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class OrderConsolidationUI {
    public static final Target BTN_SUPPLY_CHAIN_MENU =Target.the ("Supply Chain Menu Options").located(By.xpath("//*[@id=\"Supply Chain\"]"));
    public static final Target BTN_SUPPLY_CHAIN_PROCESSING =Target.the ("Processing sub menu").located(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/ul[6]/div/ul/ul[2]/a/span"));
    public static final Target BTN_SUPPLY_CHAIN_PROCESSING_ORDER_CONSOLIDATION =Target.the ("Order Consolidation sub menu").located(By.xpath("//*[@id=\"Order Consolidation\"]"));
    public static final Target BTN_OPERATIONS_MENU_ARROW_LEFT =Target.the ("arrow closes menu to the left").located(By.xpath("//div/button[@id=\"kt_aside_toggler\"]"));

    public static final Target LIST_ORDER_CONSOLIDATION_WEEK =Target.the ("Week list in Order Consolidation").located(By.xpath("//*[@id=\"week\"]"));

    public static final Target OPTION_ORDER_CONSOLIDATION_WEEK = Target.the("Option Week list in Order Consolidation").located(By.xpath("//span[@class='mat-option-text'][normalize-space()='2']"));
    public static final Target LIST_ORDER_CONSOLIDATION_YEAR =Target.the ("Week list in Order Consolidation").located(By.xpath("//*[@id=\"year\"]"));
    public static final Target LIST_ORDER_CONSOLIDATION_LOADING_PORT =Target.the ("Loading Port in Order Consolidation").located(By.xpath("//*[@id=\"loading_port\"]"));
    public static final Target OPT_ORDER_CONSOLIDATION_LOADING_PORT =Target.the ("Select All Loading Port in Order Consolidation").located(By.xpath("//*[contains(text(),' Select All')]"));
    public static final Target LIST_ORDER_CONSOLIDATION_ARRIVAL_PORT =Target.the ("Arrival Port in Order Consolidation").located(By.xpath("//*[@id=\"arrival_port\"]"));
    public static final Target OPT_ORDER_CONSOLIDATION_ARRIVAL_PORT =Target.the ("Select All Arrival Port in Order Consolidation").located(By.xpath("//*[contains(text(),' Select All')]"));
    public static final Target LIST_ORDER_CONSOLIDATION_PRODUCT_CLASS =Target.the ("product Class in Order Consolidation").located(By.xpath("//*[@id=\"product_class\"]"));
    public static final Target OPT_ORDER_CONSOLIDATION_PRODUCT_CLASS =Target.the ("Select All Product Class in Order Consolidation").located(By.xpath("//*[contains(text(),' Select All')]"));
    public static final Target BTN_ORDER_CONSOLIDATION_VIEW_ORDER =Target.the ("View Order Button in Order Consolidation").located(By.xpath("//*[text()=\" View Order \"]"));

    public static final Target LINK_ORDER_CONSOLIDATION_CREATE_ORDER =Target.the ("Create Order Link").located(By.xpath("//*[@id=\"link_create_order\"]"));
    public static final Target LINK_ORDER_CONSOLIDATION_CREATE_ORDER_NEW_LINE =Target.the ("New Line in Create Order Link").located(By.xpath("//*[@id=\"link_add_new_line\"]/mat-icon/em"));
    public static final Target LIST_ORDER_CONSOLIDATION_CREATE_ORDER_PARTCODE =Target.the ("Partcode List in Create Order").located(By.xpath("//*[@id=\"partcode\"]"));
    public static final Target TXT_ORDER_CONSOLIDATION_CREATE_ORDER_QTY =Target.the ("QTY Input Field in Create Order").located(By.xpath("//*[@id=\"quantity\"]"));
    public static final Target LIST_ORDER_CONSOLIDATION_CREATE_ORDER_ARRIVAL_PORT =Target.the ("Arrival Port List in Create Order").located(By.xpath("/html/body/kt-base/div/div/div/div/div/kt-supply-chain/kt-processing/kt-order-consolidation/div[2]/div/add-order/div/div/div/div[2]/form/div[3]/mat-form-field/div/div[1]/div/mat-select/div"));
    public static final Target LIST_ORDER_CONSOLIDATION_CREATE_ORDER_LOADING_PORT =Target.the ("Loading Port List in Create Order").located(By.xpath("/html/body/kt-base/div/div/div/div/div/kt-supply-chain/kt-processing/kt-order-consolidation/div[2]/div/add-order/div/div/div/div[2]/form/div[4]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span"));
    public static final Target BTN_ORDER_CONSOLIDATION_CREATE_ORDER_SAVE =Target.the ("Save Button in Create Order").located(By.xpath("//*[text()='Save']"));

    public static final Target LINK_ORDER_CONSOLIDATION_EDIT_ORDER =Target.the ("Edit Order Link").located(By.xpath("//*[@id=\"link_edit_order\"]"));
    public static final Target TXT_ORDER_CONSOLIDATION_EDIT_ORDER_QTY =Target.the ("QTY Input Field in Edit Order").located(By.xpath("//*[@type=\"number\" and @min=\"0\"]"));
    public static final Target BTN_ORDER_CONSOLIDATION_EDIT_ORDER_SAVE =Target.the ("Save Button in Edit Order").located(By.xpath("//*[@id=\"link_save\"]"));

    public static final Target LINK_ORDER_CONSOLIDATION_DELETE_ORDER =Target.the ("Delete Order Link").located(By.xpath("/html/body/kt-base/div/div/div/div/div/kt-supply-chain/kt-processing/kt-order-consolidation/div[2]/div/div[2]/div/div/mat-table/mat-row[2]/mat-cell[10]/a[2]/mat-icon/em"));
    public static final Target LINK_ORDER_CONSOLIDATION_CONFIRM_DELETE =Target.the ("Confirm Delete Button").located(By.xpath("//*[@id=\"mat-dialog-1\"]/kt-confirm-dialog/div[3]/div/button[1]"));

    public static final Target ICON_SAVE_ORDER =Target.the ("Icon Save Order").located(By.xpath("//*[@id=\"link_save\"]/mat-icon"));

    public static final Target LINK_ORDER_CONSOLIDATION_CREATE_ORDER_CANCEL_ORDER =Target.the ("Cancel Order in Create Order Link").located(By.xpath("//*[@id=\"link_cancel_order\"]"));






}
