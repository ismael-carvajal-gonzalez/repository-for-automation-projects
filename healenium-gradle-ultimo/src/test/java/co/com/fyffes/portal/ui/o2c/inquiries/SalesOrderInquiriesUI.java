package co.com.fyffes.portal.ui.o2c.inquiries;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SalesOrderInquiriesUI {
    public static final Target BTN_O2C_MENU =Target.the ("O2c Menu Options Button").located(By.id("kt_aside_brand"));
    public static final Target BTN_O2C =Target.the ("O2c Options Button").located(By.id("O2C"));
    public static final Target BTN_O2C_INQUIRIES =Target.the ("Inquiries Sub Menu Options").located(By.id("Inquiries"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_SEARCH =Target.the ("Sales Order Search Sub Menu Options").located(By.id("Sales Order Search"));
    public static final Target BTN_O2C_MENU_ARROW_LEFT =Target.the ("arrow closes menu to the left").located(By.xpath("//div/button[@id=\"kt_aside_toggler\"]"));

    public static final Target LIST_O2C_PROC_SALES_ORDER_SEARCH_DIV =Target.the ("Select Division List in Sales Order Search").located(By.id("division"));
    public static final Target OPT_O2C_PROC_SALES_ORDER_SEARCH_DIV =Target.the ("Select 00-General Division ítem").located(By.xpath("//*[text()=\" 00 - GENERAL \"]"));
    public static final Target LIST_O2C_PROC_SALES_ORDER_SEARCH_WAREHOUSE =Target.the ("Select Warehouse List in Sales Order Search").located(By.id("warehouse"));
    public static final Target OPT_O2C_PROC_SALES_ORDER_SEARCH_WAREHOUSE =Target.the ("Select Warehouse ítem").located(By.xpath("//*[text()=\" 07 - PHILADELPHIA \"]"));
    public static final Target TXT_O2C_PROC_SALES_ORDER_SEARCH_DATE_FROM =Target.the ("Date From in Sales Order search").located(By.id("date_from"));
    public static final Target TXT_O2C_PROC_SALES_ORDER_SEARCH_DATE_TO =Target.the ("Date To in Sales Order search").located(By.id("date_to"));
    public static final Target RBT_O2C_PROC_SALES_ORDER_SEARCH_ORDER_DATE =Target.the ("Order Date Radio Button in Sales Order search").located(By.xpath("//*[text()=\" Order Date \"]"));
    public static final Target BTN_O2C_PROC_SALES_ORDER_SEARCH_BUTTON =Target.the ("Search Button in Sales Order search").located(By.xpath("//*[text()=\" Search \"]"));




}
