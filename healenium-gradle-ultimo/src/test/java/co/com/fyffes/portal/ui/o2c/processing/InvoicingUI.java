package co.com.fyffes.portal.ui.o2c.processing;

import co.com.fyffes.portal.utils.o2c.processing.invoicing.InvoiceNumEdi;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.sql.SQLException;


public class InvoicingUI {
    public static final Target BTN_O2C_MENU =Target.the ("O2c menu Options Button").located(By.xpath("//a/span[text()='O2C']"));
    public static final Target BTN_O2C_PROCESSING =Target.the ("Processing sub menu Options Button").located(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/ul[4]/div/ul/ul[2]/a/span"));
    public static final Target BTN_O2C_PROC_INVOICING =Target.the ("Invoicing sub menu Options Button").located(By.xpath("//a/span[contains(text(),'Invoicing')]"));
    public static final Target BTN_O2C_MENU_ARROW_LEFT =Target.the ("arrow closes menu to the left").located(By.xpath("//div/button[@id=\"kt_aside_toggler\"]"));
    public static final Target INP_O2C_PROC_INV_FILTER =Target.the ("Invoicing filter input field").located(By.xpath("//input[@data-placeholder='Filter']"));
    public static final Target BTN_O2C_PROC_FILTER_CLOSE =Target.the ("Filter input field close").located(By.xpath("//mat-icon[contains(text(),'close')]"));
    public static final Target BTN_O2C_PROC_INV_EMAIL =Target.the ("Email Button Option").located(By.xpath("//div[contains(text(),'EMAIL')]"));
    public static final Target BTN_O2C_PROC_INV_EMAIL_RADIO_BUT =Target.the ("Radio Button Select record in EMAIL tab").located(By.xpath("//*[@class=\"mat-cell cdk-cell checkbox-cell cdk-column-select mat-column-select ng-star-inserted\"]"));
    public static final Target BTN_O2C_PROC_INV_EMAIL_REVIEW =Target.the ("EMAIL tab Review Invoice Button").located(By.xpath("//*[text()=' Review Invoice ']"));
    public static final Target BTN_O2C_PROC_INV_EMAIL_SEND_INV =Target.the ("EMAIL tab Send Invoice Button").located(By.xpath("//*[text()=' Send Invoice ']"));
    public static final Target BTN_O2C_PROC_INV_EMAIL_SEND_INV_CLOSE =Target.the ("EMAIL tab Close Message Button").located(By.xpath("//*[text()=' Close ']"));

    public static final Target BTN_O2C_PROC_INV_MAIL_PRINTER =Target.the ("Printer Button in MAIL Tab").located(By.xpath("//*[@class=\"fas fa-print fa-2x\"]"));
    public static final Target BTN_O2C_PROC_INV_MAIL_PRINTER_CLOSE =Target.the ("Close Printer PDF in MAIL Tab").located(By.xpath("//*[@class=\"close\"]"));

    public static final Target BTN_O2C_PROC_INV_EMAIL_ROW =Target.the ("Select record in EMAIL tab").located(By.xpath("//mat-row/mat-cell[@class='mat-cell cdk-cell checkbox-cell cdk-column-select mat-column-select ng-star-inserted']"));
    public static final Target BTN_O2C_PROC_INV_EMAIL_SEND =Target.the ("EMAIL tab send email button").located(By.xpath("//button[@id='send_email']"));
    public static final Target BTN_O2C_PROC_INV_ERROR_CLOSE =Target.the ("EMAIL tab close Message button").located(By.xpath("//span[contains(text(),'Close')]"));
    public static final Target BTN_O2C_PROC_INV_EMAIL_MARK_AS_PROC =Target.the ("Mark as processed Button in EMAIL Tab").located(By.xpath("//button[@safeclass~'\\bmargin-buttons-form-field\\b.*\\bmat-btnprimary\\b.*\\bmat-button-base\\b.*\\bmat-raised-button\\b']/span[@innertext=' Review Invoice ']"));
    public static final Target BTN_O2C_PROC_INV_EMAIL_HOLD =Target.the ("Hold Button in EMAIL Tab").located(By.xpath("//*[text()= ' Hold ']"));

    public static final Target BTN_O2C_PROC_INV_MAIL =Target.the ("Mail Button Option").located(By.xpath("//*[text()= 'MAIL']"));
    public static final Target CHB_O2C_PROC_INV_MAIL_ROW =Target.the ("Select record in MAIL tab").located(By.xpath("//mat-row/mat-cell[@class='mat-cell cdk-cell checkbox-cell cdk-column-select mat-column-select ng-star-inserted']"));
    public static final Target BTN_O2C_PROC_INV_MAIL_MARK_AS_PROC =Target.the ("Mark as processed Button in MAIL Tab").located(By.xpath("//button[@id='mark_as_processed_mail_tab']"));
    public static final Target BTN_O2C_PROC_INV_MAIL_HOLD =Target.the ("Hold Button in MAIL Tab").located(By.xpath("//*[text()=\" Hold \"]"));
    public static final Target BTN_O2C_PROC_INV_MAIL_CLOSE_CONFIRM =Target.the ("MAIL Tab Close Confirmation Window").located(By.xpath("//span[contains(text(),'Close')]"));

    public static final Target BTN_O2C_PROC_INV_OTHERS =Target.the ("OTHERS Button Option").located(By.xpath("//*[text()= 'OTHERS']"));
    public static final Target CHB_O2C_PROC_INV_OTHERS_ROW =Target.the ("Select record in OTHERS tab").located(By.xpath("//mat-row/mat-cell[@class='mat-cell cdk-cell checkbox-cell cdk-column-select mat-column-select ng-star-inserted']"));
    public static final Target BTN_O2C_PROC_INV_OTHERS_MARK_AS_PROC =Target.the ("Mark as processed Button in OTHERS Tab").located(By.xpath("//button[@id='mark_as_processed_others_tab']"));
    public static final Target BTN_O2C_PROC_INV_OTHERS_CLOSE_CONFIRM =Target.the ("OTHERS Tab Close Confirmation Window").located(By.xpath("//span[contains(text(),'Close')]"));
    public static final Target BTN_O2C_PROC_INV_OTHERS_HOLD =Target.the ("Hold Button in OTHERS Tab").located(By.xpath("//*[text()= ' Hold ']"));

    public static final Target CHB_O2C_PROC_INV_ONHOLD_ROW =Target.the ("Select record in ON HOLD tab").located(By.xpath("//*[@class=\"mat-radio-label\"]"));
    public static final Target CHB_O2C_PROC_INV_ONHOLD_RELEASE =Target.the ("Review Invoice Button").located(By.xpath("//*[text()= ' Review Invoice ']"));
    public static final Target BTN_O2C_PROC_INV_PDF_REPORT_SEND_MAIL =Target.the ("PDF Report Send mail Button").located(By.xpath("//*[text()= ' Mark as Processed ']"));
    public static final Target BTN_O2C_PROC_INV_ONHOLD_CLOSE_CONFIRM =Target.the ("ON HOLD Tab Close Confirmation Window").located(By.xpath("//span[contains(text(),'Close')]"));

    public static final Target BTN_O2C_PROC_INV_EDI =Target.the ("EDI Button Option").located(By.xpath("//div[text()=\"EDI\"]"));
    public static final Target INP_O2C_PROC_INV_EDI_FILTER =Target.the ("Filter input field").located(By.xpath("//input[@ng-reflect-placeholder='Filter']"));
    public static final Target BTN_O2C_PROC_INV_EDI_INV_NUMBER =Target.the ("Invoice Number Column Name").located(By.xpath("//*[text()=\" INVOICE NUMBER \"]"));
    public static final Target BTN_O2C_PROC_INV_EDI_CUS_NUMBER =Target.the ("Customer Number Column Name").located(By.xpath("//*[text()=\" CUSTOMER NUMBER \"]"));
    public static final Target CHB_O2C_PROC_INV_EDI_ROW =Target.the ("Select record in EDI tab").located(By.xpath("//mat-row/mat-cell[@class='mat-cell cdk-cell checkbox-cell cdk-column-select mat-column-select ng-star-inserted']"));
    public static final Target BTN_O2C_PROC_INV_EDI_PRINT =Target.the ("Select record in EDI tab and Print Icon").located(By.xpath("//div/a[@mattooltip='Print']"));
    public static final Target BTN_O2C_PROC_INV_EDI_PRINT_CLOSE =Target.the ("Close Pdf Screen Button").located(By.xpath("//button[@class=\"close\"]"));
    public static final Target BTN_O2C_PROC_INV_EDI_SENDMAIL =Target.the ("Send Mail Button").located(By.xpath("//*[text()=\" Send EDI \"]"));
    public static final Target BTN_O2C_PROC_INV_EDI_WARNING_CLOSE =Target.the ("Select record in EDI tab and Print Icon").located(By.xpath("//*[text()=\" Close \"]"));

    public static final Target BTN_O2C_PROC_INV_EDI_HOLD =Target.the ("HOLD Button").located(By.xpath("//*[text()=\" Hold \"]"));
    public static final Target BTN_O2C_PROC_INV_EDI_HOLD_CLOSE_CONFIRM =Target.the ("HOLD Button Close Confirmation Window").located(By.xpath("//*[text()=\" Close \"]"));

    public static  Target OPT_O2C_PROC_INV_EDI_PRINT_INVOICE_NUMBER = null;
    static {
        try {
            OPT_O2C_PROC_INV_EDI_PRINT_INVOICE_NUMBER = Target.the ("Click in to Invoice Number to Print in PDF").located(By.xpath(new InvoiceNumEdi().getInvoice()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}
