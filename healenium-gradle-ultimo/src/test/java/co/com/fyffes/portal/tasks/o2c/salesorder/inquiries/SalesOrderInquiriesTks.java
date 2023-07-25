package co.com.fyffes.portal.tasks.o2c.salesorder.inquiries;

import co.com.fyffes.portal.ui.o2c.inquiries.SalesOrderInquiriesUI;
import co.com.fyffes.portal.utils.CalculateDate;
import co.com.fyffes.portal.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SalesOrderInquiriesTks implements Performable{
    String date_from  = null;
    String date_to  = null;

    @Override
    @Step("{0} enter in inquiries")
    public <T extends Actor> void performAs(T actor) {
        this.date_from = CalculateDate.addSubtractDays(-30);
        this.date_to = CalculateDate.addSubtractDays(0);
        actor.attemptsTo(
                /* Enter in menu O2C Inquiries Sales Order Search*/
                Click.on(SalesOrderInquiriesUI.BTN_O2C_MENU),
                Click.on(SalesOrderInquiriesUI.BTN_O2C_INQUIRIES),
                Click.on(SalesOrderInquiriesUI.BTN_O2C_PROC_SALES_ORDER_SEARCH),
                Wait.oneTime(20000),
                Click.on(SalesOrderInquiriesUI.BTN_O2C_MENU_ARROW_LEFT),

                /* Select the fields for the query */
                Click.on(SalesOrderInquiriesUI.LIST_O2C_PROC_SALES_ORDER_SEARCH_DIV),
                Click.on(SalesOrderInquiriesUI.OPT_O2C_PROC_SALES_ORDER_SEARCH_DIV),
                Click.on(SalesOrderInquiriesUI.LIST_O2C_PROC_SALES_ORDER_SEARCH_WAREHOUSE),
                Click.on(SalesOrderInquiriesUI.OPT_O2C_PROC_SALES_ORDER_SEARCH_WAREHOUSE),
                Enter.theValue(this.date_from).into(SalesOrderInquiriesUI.TXT_O2C_PROC_SALES_ORDER_SEARCH_DATE_FROM),
                Enter.theValue(this.date_to).into(SalesOrderInquiriesUI.TXT_O2C_PROC_SALES_ORDER_SEARCH_DATE_TO),
                Click.on(SalesOrderInquiriesUI.RBT_O2C_PROC_SALES_ORDER_SEARCH_ORDER_DATE),
                Click.on(SalesOrderInquiriesUI.BTN_O2C_PROC_SALES_ORDER_SEARCH_BUTTON),

                Wait.oneTime(8000)

        );
    }

    public static SalesOrderInquiriesTks called() {
        return new SalesOrderInquiriesTks();
    }

}
