package co.com.fyffes.portal.ui.processing.warehouseprocessing.inoutplanning;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InboundUI {

    public static final Target TAB = Target.the("Tab").locatedBy("//div[contains(@class, 'mat-tab-label-content')][text()='{0}']");
    public static final Target SELECTED_TAB = Target.the("Selected tab").locatedBy("//div[contains(@class, 'mat-tab-label-content')][text()='{0}']/ancestor::div[contains(@class, 'mat-tab-label')][contains(@class, 'mat-tab-label-active')]");
    public static final Target DROPDOWN_DIVISION = Target.the("Division dropdown").located(By.id("division"));

    public static final Target GENERAL_DIVISION = Target.the("General division").located(By.xpath("//span[@class='mat-option-text'][normalize-space()='00 - GENERAL']"));

    public static final Target FROM_WH = Target.the("From WH").located(By.xpath("/html[1]/body[1]/kt-base[1]/div[1]/div[1]/div[1]/div[1]/div[1]/kt-operations[1]/kt-processing[1]/kt-assign-wh-location[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/kt-assign-wh-location-transfer[1]/div[1]/div[2]/form[1]/mat-form-field[2]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]"));

    public static final Target PHILADELPHIA = Target.the("Philadelphia").located(By.xpath("//span[normalize-space()='07 - PHILADELPHIA']"));

    public static final Target DESTINATION = Target.the("Destination Wh").located(By.xpath("/html[1]/body[1]/kt-base[1]/div[1]/div[1]/div[1]/div[1]/div[1]/kt-operations[1]/kt-processing[1]/kt-assign-wh-location[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/kt-assign-wh-location-transfer[1]/div[1]/div[2]/form[1]/mat-form-field[3]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]"));
    public static final Target BTN_WAREHOUSE_PROCESSING = Target.the("Btn_warehouse_processing").located(By.xpath("//*[@id=\"Warehouse Processing\"]"));

    public static final Target RIPENER_OHIO = Target.the("Ripener Ohio").located(By.xpath("//span[normalize-space()='03 - RIPENER OHIO']"));
    public static final Target BTN_IN_OUT_PROCESSING = Target.the("Btn_in_out_planning_processing").located(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/ul[5]/div/ul/ul[2]/div/ul/ul[3]/div/ul/ul[1]/a"));
    public static final Target DROPDOWN_FROM_WH = Target.the("From WH dropdown").located(By.id("fromWH"));
    public static final Target DROPDOWN_DESTINATION_WH = Target.the("Destination WH dropdown").located(By.id("destinationWH"));
    public static final Target INPUT_DELIVERY_DATE = Target.the("Delivery Date input").located(By.xpath("//input[@id='delivery_date']"));
    public static final Target CHECKBOX_ONLY_TU_ORDERS = Target.the("Only TU Orders checkbox").located(By.id("onlyTUOrdersCheckbox"));
    public static final Target BUTTON_SEARCH = Target.the("Search button").located(By.xpath("/html[1]/body[1]/kt-base[1]/div[1]/div[1]/div[1]/div[1]/div[1]/kt-operations[1]/kt-processing[1]/kt-assign-wh-location[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/kt-assign-wh-location-transfer[1]/div[1]/div[3]/button[1]/span[1]"));

    public static final Target Trd_PARTY = Target.the("3rd Party").located(By.xpath("//div[contains(text(),'3rd PARTY')]"));

    public static final Target MANIFEST = Target.the("Manifest").located(By.xpath("//div[contains(text(),'MANIFEST')]"));

    public static final Target OUTBOUND = Target.the("Outbound").located(By.xpath("//div[contains(text(),'OUTBOUND')]"));
}

