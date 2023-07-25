package co.com.fyffes.portal.questions;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardQuestion {

    private static final Target BTN_DASHBOARD_O2C_DETAIL =Target.the ("Detail O2c dashboard").located(By.xpath("//h3/span[text()='O2C']"));
    public static final String TXT_FOUND_O2C ="//span[@class='card-label font-weight-bolder'][normalize-space()='O2C']";

    public static final String TXT_FOUND_SUPPLY_CHAIN = "//span[@class='card-label font-weight-bolder'][normalize-space()='Supply Chain']";
    public static Question<String> TITLE_GRAPH_O2C = Text.of(TXT_FOUND_O2C);

    public static Question<String> TITLE_GRAPH_SUPPLY_CHAIN = Text.of(TXT_FOUND_SUPPLY_CHAIN);

}
