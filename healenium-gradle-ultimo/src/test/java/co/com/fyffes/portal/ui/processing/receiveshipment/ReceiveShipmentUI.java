package co.com.fyffes.portal.ui.processing.receiveshipment;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ReceiveShipmentUI {
    public static final Target BTN_OPERATIONS_MENU =Target.the ("Operations Menu Options").located(By.xpath("//*[@id=\"Operations\"]"));
    public static final Target BTN_OPERATIONS_PROCESSING =Target.the ("Processing sub menu Options").located(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/ul[5]/div/ul/ul[2]/a/span"));
    public static final Target BTN_OPERATIONS_MENU_ARROW_LEFT =Target.the ("arrow closes menu to the left").located(By.xpath("//div/button[@id=\"kt_aside_toggler\"]"));

    public static final Target BTN_OPERATIONS_PROCESSING_WAREHOUSE = Target.the("Operations processing warehouse").located(By.xpath("//span[@id='Warehouse Processing']"));
    public static final Target BTN_OPERATIONS_PROCESSING_RECEIVESHIPMENT =Target.the ("Receive Shipment menu Options").located(By.xpath("//*[text()='Receive Shipment']"));

    public static final Target BTN_OPERATIONS_PROC_REC_SHIP_BY_PALLET =Target.the ("By Pallet menu Options").located(By.xpath("//span[@id='Receive Shipment']"));

    public static final Target BTN_OPERATIONS_PROC_RECERIVESHIPMENT_PALLET = Target.the("Select Pallet").located(By.xpath("/html/body/kt-base/div/div/div/div/div/kt-operations/kt-processing/kt-receive-shipment/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]"));
    public static final Target LIST_OPERATIONS_PROCESSING_RECEIVESHIPMENT_WAREHOUSE =Target.the ("Warehouse List").located(By.xpath("/html/body/kt-base/div/div/div/div/div/kt-operations/kt-processing/kt-receive-shipment/div/mat-tab-group/div/mat-tab-body[2]/div/kt-by-pallet/div[1]/div[2]/form/mat-form-field[1]/div/div[1]/div/mat-select/div"));
    public static final Target LIST_OPERATIONS_PROCESSING_RECEIVESHIPMENT_WAREHOUSE_LOCATION =Target.the ("Warehouse Locations List").located(By.xpath("//input[@id='mat-input-4']"));

    public static final Target OPTION_LIST_OPERATIONS_PROCESSING_RECEIVESHIPMENT_WAREHOUSE_LOCATION = Target.the("Option Warehouse Locations List").located(By.xpath("//span[normalize-space()='01 - DIRECT TO CUSTOMER']"));
    public static final Target TXT_OPERATIONS_PROCESSING_RECEIVESHIPMENT_PALLET_NUM =Target.the ("Pallet Number Input").located(By.xpath("//*[@id=\"palletNumber\"]"));
    public static final Target BTN_OPERATIONS_PROCESSING_RECEIVESHIPMENT_RESET =Target.the ("Reset Button").located(By.id("btn_reset"));

    public static final Target INPUT_ORDER_NUMBER = Target.the("Input in order number").located(By.xpath("//input[@id='mat-input-4']"));
    public static final Target BTN_OPERATIONS_PROCESSING_RECEIVESHIPMENT_SEND =Target.the ("Send Button").located(By.xpath("//*[@id=\"btn_send\"]"));

    public static final Target BTN_OPERATIONS_PROCESSING_RECEIVESHIPMENT_SEND2 =Target.the ("Send Button 2").located(By.xpath("/html/body/kt-base/div/div/div/div/div/kt-operations/kt-processing/kt-receive-shipment/div/mat-tab-group/div/mat-tab-body[1]/div/kt-by-order/div[2]/div[1]/div[3]/button[1]"));

    public static final Target BTN_OPERATIONS_PROC_RECERIVESHIPMENT_ORDERS = Target.the("Order Button").located(By.xpath("/html/body/kt-base/div/div/div/div/div/kt-operations/kt-processing/kt-receive-shipment/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]"));

    public static final Target LIST_WAREHOUSE_BY_ORDER = Target.the("Warehouse in By Order").located(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c108-21 ng-star-inserted']"));

}
