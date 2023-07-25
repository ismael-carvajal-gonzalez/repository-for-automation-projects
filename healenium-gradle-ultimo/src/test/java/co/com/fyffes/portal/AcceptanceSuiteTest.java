package co.com.fyffes.portal;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features",
        glue ="co.com.fyffes.portal",
        tags= "@SalesOrder-Inquiries")
public final class AcceptanceSuiteTest {}

