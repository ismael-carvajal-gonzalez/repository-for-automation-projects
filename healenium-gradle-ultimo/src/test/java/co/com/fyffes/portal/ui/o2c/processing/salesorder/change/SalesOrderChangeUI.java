package co.com.fyffes.portal.ui.o2c.processing.salesorder.change;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SalesOrderChangeUI {

    public static final Target BTN_O2C_MENU =Target.the ("O2c menu Options Button").located(By.xpath("//a/span[text()='O2C']"));
    public static final Target BTN_O2C_PROCESSING =Target.the ("Processing sub menu Options Button").located(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/ul[4]/div/ul/ul[2]/a/span"));
    public static final Target BTN_O2C_PROC_SALES_ORDER =Target.the ("Sales Order sub menu Options").located(By.xpath("//*[text()= 'Sales Order']"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CHANGE =Target.the ("Sales Order Change Assign PO Number Options").located(By.xpath("//*[@id=\"Change/Assign PO Number\"]"));
    public static final Target BTN_O2C_MENU_ARROW_LEFT =Target.the ("arrow closes menu to the left").located(By.xpath("//div/button[@id=\"kt_aside_toggler\"]"));

    public static final Target LIST_O2C_PROC_SALES_ORDER_CHANGE_DIV =Target.the ("Select Division List in Sales Order Change").located(By.xpath("/html[1]/body[1]/kt-base[1]/div[1]/div[1]/div[1]/div[1]/div[1]/kt-o2c[1]/kt-processing[1]/kt-change-sales-order[1]/div[1]/div[2]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]"));

    public static final Target LIST_O2C_PROC_SALES_ORDER_CHANGE_DIV2 = Target.the("Select Division List in Sales Order Change2").located(By.xpath("//input[@id='division']"));
    public static final Target OPT_O2C_PROC_SALES_ORDER_CHANGE_DIV =Target.the ("Select 00-General Division ítem").located(By.xpath("//span[@class='mat-option-text'][normalize-space()='00 - GENERAL']"));
    public static final Target TXT_O2C_PROC_SALES_ORDER_CHANGE_NUMBER =Target.the ("Sales Order Number input Field").located(By.id("sales_order_number"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CHANGE_SEARCH =Target.the ("Search Button in Sales Order Change").located(By.xpath("/html/body/kt-base/div/div/div/div/div/kt-o2c/kt-processing/kt-change-sales-order/div/div[3]/button"));

    public static final Target BTN_O2C_PROC_SALES_ORDER_CHANGE_CLOSE = Target.the("Close button in Sales Order Change").located(By.xpath("//span[normalize-space()='Close']"));
    public static final Target LIST_O2C_PROC_SALES_ORDER_CHANGE_ASSIGN_PO = Target.the("Assign PO Number Drop Down List").located(By.xpath("//*[@id=\"po_numbers\"]"));

    public static final Target OPTION_PO_NUMBER = Target.the("Option Po Number").located(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]"));
    //public static final Target OPTION_PO_NUMBER = Target.the("Select PO NUmber Drop Down List").located(By.xpath("//*[@id=\"mat-option-9\"]"));

    public static final Target BUTTOM_LETTER = Target.the("Buttom letter").located(By.xpath("//*[@id=\"btn_mark_as_processed\"]"));

    public static Target OPT_O2C_PROC_SALES_ORDER_CHANGE_ASSIGN_PO2 = Target.the("PO Number Item 2").located(By.xpath("//span[normalize-space()='211378']"));

    public static Target OPT_O2C_PROC_SALES_ORDER_CHANGE_ASSIGN_PO = Target.the("PO Number Item New").located(By.xpath("//span[normalize-space()='0560382278']"));
    //public static Target OPT_O2C_PROC_SALES_ORDER_CHANGE_ASSIGN_PO = Target.the ("PO Number Item").located(By.xpath("//span[normalize-space()='4273276429']"));
    //{
        //try {
            //OPT_O2C_PROC_SALES_ORDER_CHANGE_ASSIGN_PO = Target.the ("PO Number Item").located(By.xpath("//span[normalize-space()='4273277218']")); //OPT_O2C_PROC_SALES_ORDER_CHANGE_ASSIGN_PO = Target.the ("PO Number Item").located(By.xpath(new GetPONumber().getPoNum()));
        //} catch (SQLException throwables) {
            //throwables.printStackTrace();
        //}
    //}
    /*public static  Target OPT_O2C_PROC_SALES_ORDER_CHANGE_ASSIGN_PO_NEW = null;
    static {
        try {
            OPT_O2C_PROC_SALES_ORDER_CHANGE_ASSIGN_PO_NEW =Target.the ("New PO Number Item for Change").located(By.xpath(new GetPONumber().getNewPoNum()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }*/
    public static final Target BTN_O2C_PROC_SALES_ORDER_CHANGE_ASSIGN_PO =Target.the ("Assign PO Number Continue Button").located(By.id("continue_btn"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CHANGE_UPDATE_ORDER =Target.the ("Update Order Button").located(By.xpath("//*[text()=\" Update Order(s) \"]"));

    public static final Target BTN_O2C_PROC_SALES_ORDER_CHANGE_UPDATE_ORDER2 =Target.the ("Update Order Button").located(By.xpath("//*[text()=\" Mark as proccessed \"]"));

    public static final Target BTN_O2C_PROC_SALES_ORDER_CHANGE_CONFIRMATION = Target.the("Btn Close Confirmation Update Order").located(By.xpath(""));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CHANGE_UPDATE_ORDER_CLOSE_MESS =Target.the ("Close Message Confirmation Update Order").located(By.xpath("//*[@id=\"mat-dialog-5\"]/kt-modal-alert/div[3]/button"));

}
