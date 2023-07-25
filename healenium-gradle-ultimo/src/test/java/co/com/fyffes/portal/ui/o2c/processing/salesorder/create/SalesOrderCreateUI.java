package co.com.fyffes.portal.ui.o2c.processing.salesorder.create;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SalesOrderCreateUI {
    public static final Target BTN_O2C_MENU =Target.the ("O2c menu Options Button").located(By.xpath("//a/span[text()='O2C']"));
    public static final Target BTN_O2C_PROCESSING =Target.the ("Processing sub menu Options Button").located(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/ul[4]/div/ul/ul[2]/a/span"));
    public static final Target BTN_O2C_PROC_SALES_ORDER =Target.the ("Sales Order sub menu Options").located(By.xpath("//*[text()= 'Sales Order']"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CREATE =Target.the ("Sales Order Create Apply Change Options").located(By.xpath("//span[@id='Create/Apply Change from PO']"));
    public static final Target BTN_O2C_MENU_ARROW_LEFT =Target.the ("arrow closes menu to the left").located(By.xpath("//div/button[@id=\"kt_aside_toggler\"]"));

    public static final Target LIST_O2C_PROC_SALES_ORDER_CUSTOMER =Target.the ("Select Customer List in Sales Order").located(By.xpath("//*[@id=\"customerNumber\"]/div"));

    //public static final Target OPT_O2C_PROC_SALES_ORDER_CUSTOMER2 = Target.the("Customer Name Selected in Sales Order 2").located(By.cssSelector("//*[@id=\"mat-option-14\"]"));
    public static final Target OPT_O2C_PROC_SALES_ORDER_CUSTOMER =Target.the ("Customer Name Selected in Sales Order").located(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option[16]/span[1]"));

    public static final Target OPT_O2C_PROC_SALES_ORDER_CUSTOMER_CREATE =Target.the ("Customer Name Selected in Create Sales Order").located(By.xpath("//*[@id=\"mat-option-17\"]"));
    public static final Target TXT_O2C_PROC_SALES_ORDER_START_DATE =Target.the ("Start Date in Sales Order List").located(By.xpath("//*[@id=\"startDate\"]"));
    public static final Target TXT_O2C_PROC_SALES_ORDER_END_DATE =Target.the ("End Date in Sales Order List").located(By.xpath("//*[@id=\"endDate\"]"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_RECEIVED =Target.the ("Received Radio Button in Sales Order List").located(By.xpath("//*[@id=\"Received\"]/label/span[1]"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_SEARCH =Target.the ("Search Button in Sales Order List").located(By.xpath("//*[text()= ' Search ']"));

    public static final Target BTN_O2C_PROC_SALES_ORDER_CLOSE = Target.the("Close Button in Sales Order List").located(By.xpath("//span[normalize-space()='Close']"));
    public static final Target TXT_O2C_PROC_SALES_ORDER_FILTER =Target.the ("Filter Input text in Sales Order List").located(By.xpath("//*[@type=\"search\"]"));

    public static final Target LBL_O2C_PROC_SALES_ORDER_CREATE_SORT =Target.the ("Sort record by column ORDER NUMBER").located(By.xpath("//*[text()=\"ORDER NUMBER\"]"));
    public static final Target OPT_O2C_PROC_SALES_ORDER_CREATE =Target.the ("Create Order Button in Sales Order").located(By.xpath("//*[@class=\"send-orders\"]"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CREATE_CONTINUE =Target.the ("Continue Button in purchase Orders").located(By.xpath("//*[text()= 'Continue']"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CREATE_BACK =Target.the ("Back Button in purchase Orders").located(By.id("btn_back"));
    public static final Target TXT_O2C_PROC_SALES_ORDER_CREATE_SHIPPINGDATE =Target.the ("Shippping Date in purchase Orders").located(By.id("shipping_date"));
    public static final Target LIST_O2C_PROC_SALES_ORDER_CREATE_WAREHOUSE =Target.the ("Warehouse List in purchase Orders").located(By.xpath("//*[@formcontrolname=\"warehouse\"]"));
    public static final Target LIST_O2C_PROC_SALES_ORDER_CREATE_SHIPTOADDRESS =Target.the ("Ship To Address List in purchase Orders").located(By.xpath("//*[@formcontrolname=\"shipToAddress\"]"));

    public static final Target OPTION_O2C_PROC_SALES_ORDER_CREATE_SPECIAL_INTRUCTIONS = Target.the("Special instructions").located(By.xpath("//*[@id=\"special_instructions\"]"));
    public static final Target TXT_O2C_PROC_SALES_ORDER_CREATE_DELIVERYDATE =Target.the ("Delivery Date in purchase Orders").located(By.id("delivery_date"));
    public static final Target LIST_O2C_PROC_SALES_ORDER_CREATE_DELIV_PRICE =Target.the ("Delivery Price in Create Order").located(By.id("delivered_price"));
    public static final Target OPT_O2C_PROC_SALES_ORDER_CREATE_DELIV_PRICE =Target.the ("Select N in Delivery Price in Create Order").located(By.xpath("//*[@value=\"N\"]"));
    public static final Target LIST_O2C_PROC_SALES_ORDER_CREATE_FREIGHT =Target.the ("Freight in Create Order").located(By.xpath("//*[@id=\"freight\"]"));
    public static final Target OPT_O2C_PROC_SALES_ORDER_CREATE_FREIGHT =Target.the ("Select Y in Freight in Create Order").located(By.xpath("//*[@value=\"Y\"]"));

    public static final Target LIST_O2C_PROC_SALES_ORDER_CREATE_ASSIGN_TEMP = Target.the("Temp in Create order").located(By.xpath("//*[@id=\"temp\"]/div"));
    public static final Target OPT_O2C_PROC_SALES_ORDER_CREATE_ASSIGN_TEMP = Target.the("Select Y in Temp in Create order").located(By.xpath("//span[@class='mat-option-text'][normalize-space()='Y']"));

    public static final Target TXT_O2C_PROC_SALES_ORDER_CREATE_TEMP_VALUE = Target.the("Temperature value").located(By.xpath("//*[@id=\"temp_value\"]"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CREATE_ADD_LINE =Target.the ("Add Line Button in Create Order").located(By.xpath("//*[@id=\"btn_add_line\"]"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CREATE_REMOVE_LINE =Target.the ("Remove Line in Create Sales Order").located(By.xpath("//*[@id=\"icon_remove_line\"]/mat-icon/em "));

    public static final Target BTN_O2C_PROC_SALES_ORDER_CREATE_BUTTON =Target.the ("Create Order Button in Create Sales Order").located(By.xpath("//*[text()=\" Create Order(s) \"]"));

    public static final Target OPT_O2C_PROC_SALES_ORDER_CANCEL =Target.the ("Cancel Order Button in Sales Order").located(By.xpath("//*[@class=\"cancel-orders\"]"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CANCEL_CONFIRM =Target.the ("Confirmation Cancel Order in Sales Order").located(By.xpath("//*[text()= ' Ok ']"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_CANCEL_CONFIRM_CLOSE =Target.the ("Close Window Confirmation Cancel Order").located(By.xpath("//*[text()= ' Close ']"));

    public static final Target LBL_O2C_PROC_SALES_ORDER_CREATE_PART_CODE =Target.the ("Part Code TEMP Label").located(By.xpath("//*[@id=\"partcode00\"]"));

    public static final Target LBL_O2C_PROC_SALES_ORDER_CREATE_PART_CODE3 =Target.the ("Part Code TEMP Label 3").located(By.xpath("//div[@id='mat-select-value-49']"));

    public static final Target LBL_O2C_PROC_SALES_ORDER_CREATE_PART_CODE2 =Target.the ("Part Code TEMP Label 2").located(By.xpath("//*[@id=\"partcode01\"]"));
    public static final Target  SELEC_O2C_PROC_SALES_ORDER_103_Fyffes_Premium = Target.the("103-Fyffes-Premium").located(By.xpath("//span[@class='mat-option-text'][normalize-space()='103 - FYFFES PREMIUM COLOMBIA']"));

    public static final Target  SELEC_O2C_PROC_SALES_ORDER_322_FYFFES_BANDED = Target.the("103-Fyffes-Premium").located(By.xpath("//span[@class='mat-option-text'][normalize-space()='103 - FYFFES PREMIUM COLOMBIA']"));
    public static final Target BTN_CLOSE_O2C_PROC_SALES_ORDER_103_Fyffes = Target.the("Btn close in 103-fyffes").located(By.xpath("//span[normalize-space()='Close']"));
    public static final Target  SELEC_O2C_PROC_SALES_ORDER_103_Fyffes_Premium2 = Target.the("103-Fyffes-Premium 2").located(By.xpath("//*[@id=\"lines-table\"]/table/tr[3]/td[3]"));

    public static final Target OPTION_O2C_PROC_SALES_ORDER_103_Fyffes_Premium3 = Target.the("Option 103-Fyffes-Premium 2").located(By.xpath("//span[normalize-space()='141 - PLANTAIN 50LB COLOMBIA']"));

    public static final Target OPTION_O2C_PROC_SALES_ORDER_322_FYFFES_BANDED_ORG_PERU = Target.the("Option 322-FYFFES BANDED ORG PERU").located(By.xpath("//span[normalize-space()='322 - FYFFES BANDED ORG PERU']"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_103_Fyffes_Premiun_Close = Target.the("Btn-Close-103-Fyffes-Premium").located(By.xpath("//span[normalize-space()='Close']"));

    public static final Target BTN_O2C_PROC_SALES_ORDER_103_Fyffes_Premiun_Close2 = Target.the("Btn-Close-103-Fyffes-Premium2").located(By.xpath("//*[@id=\"mat-dialog-15\"]/kt-modal-alert/div[3]/button"));

    public static final Target LBL_O2C_PROC_SALES_ORDER_CREATE_PART_CODE4 = Target.the("Part Code TEMP Label 3").located(By.xpath("//div[@id='mat-select-value-29']"));

    public static final Target OPTION_O2C_PROC_SALES_ORDER_103_Fyffes_Premium2 = Target.the("Option 103_Fyffes_Premium2").located(By.xpath("//span[normalize-space()='141 - PLANTAIN 50LB COLOMBIA']"));
    public static final Target INPUT_SALES_PRICE_SALES_ORDER = Target.the("Input sales price").located(By.id("sales_order_price"));
    public static final Target SELEC_O2C_PROC_SALES_ORDER_QTY = Target.the("Order Qty").located(By.xpath("//*[@id=\"quantity\"]"));
    public static final Target SELEC_O2C_PROC_SALES_ORDER_CLOSE = Target.the("Btn close in 103-fyffes 2").located(By.cssSelector("//span[normalize-space()='Close']"));  //*[@id="mat-dialog-1"]/kt-modal-alert/div[3]/button/span[1]

    public static final Target SELEC_O2C_PROC_SALES_ORDER_CLOSE2 = Target.the("Close select").located(By.cssSelector("//*[@id=\"mat-dialog-4\"]/kt-modal-alert/div[3]/button/span[1]"));

    //button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-btnprimary ng-star-inserted cdk-focused cdk-mouse-focused']//span[@class='mat-button-wrapper'][normalize-space()='Close']
    public static final Target SELEC_O2C_PROC_SALES_ORDER_BACK = Target.the("Back select").located(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/kt-po-orders-selection/div[2]/mat-horizontal-stepper/div[2]/div[2]/form/mat-dialog-actions/button[1]"));

    public static final Target SELEC_ORDER_NUMBERS = Target.the("How many orders").located(By.xpath("//div[@id='mat-select-value-11']"));

    public static final Target SELEC_ORDER_NUMBERS_CONTINUE = Target.the("Select order numbers continue").located(By.xpath("//span[normalize-space()='Continue']"));
    public static final Target OPTION_ORDER_NUMBERS = Target.the("Option orders numbers").located(By.xpath("//span[@class='mat-option-text'][normalize-space()='1']"));
    public static final Target O2C_PROC_SALES_ORDER_CREATE_ORDER = Target.the("Btn Create order").located(By.xpath("//*[@id=\"btn_process_order\"]"));

    public static final Target BTN_CONTINUE_SALES_ORDER_CREATE_ORDER = Target.the("Button continue").located(By.xpath("//*[@id=\"warningCheckWeight\"]/kt-modal-alert/div[3]/button[2]"));
}
