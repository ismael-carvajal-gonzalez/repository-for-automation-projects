package co.com.fyffes.portal.tasks;

import co.com.fyffes.portal.ui.o2c.inquiries.SalesOrderInquiriesUI;
import co.com.fyffes.portal.utils.CalculateDate;
import co.com.fyffes.portal.utils.Wait;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class FormsTask {

    public static Performable fillInquiriesForm(){
        String date_from = CalculateDate.addSubtractDays(-30);
        String date_to = CalculateDate.addSubtractDays(0);
        return Task.where("{0} is filling the inquiries form",
                Click.on(SalesOrderInquiriesUI.LIST_O2C_PROC_SALES_ORDER_SEARCH_DIV),
                Click.on(SalesOrderInquiriesUI.OPT_O2C_PROC_SALES_ORDER_SEARCH_DIV),
                Click.on(SalesOrderInquiriesUI.LIST_O2C_PROC_SALES_ORDER_SEARCH_WAREHOUSE),
                Click.on(SalesOrderInquiriesUI.OPT_O2C_PROC_SALES_ORDER_SEARCH_WAREHOUSE),
                SendKeys.of(date_from).into(SalesOrderInquiriesUI.TXT_O2C_PROC_SALES_ORDER_SEARCH_DATE_FROM),
                SendKeys.of(date_to).into(SalesOrderInquiriesUI.TXT_O2C_PROC_SALES_ORDER_SEARCH_DATE_TO),
                Click.on(SalesOrderInquiriesUI.RBT_O2C_PROC_SALES_ORDER_SEARCH_ORDER_DATE),
                Click.on(SalesOrderInquiriesUI.BTN_O2C_PROC_SALES_ORDER_SEARCH_BUTTON),

                Wait.oneTime(8000)
                );
    }
}
