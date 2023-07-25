package co.com.fyffes.portal.stepdefinitions.o2c.inquiries;

import co.com.fyffes.portal.actors.User;
import co.com.fyffes.portal.tasks.FormsTask;
import co.com.fyffes.portal.tasks.NavagateTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.fyffes.portal.questions.DashboardQuestion.TITLE_GRAPH_O2C;

public class SalesOrderInquiriesStep {

    @Given("{actor} is in the portal and he want to view sales order reports")
    public void memberIsInThePortalAndHeWantToViewReports(Actor actor) {
        actor.attemptsTo(
                NavagateTask.toLoginPage()
        );
    }

    @When("{actor} logs on with your username and password and wants to navigate to reports")
    public void logsOnWithYourUsernameAndPasswordAndWantToNavigate(Actor actor) {
        actor.attemptsTo(
                NavagateTask.usingCredencials("david", "Abc+1234"),
                NavagateTask.toMenuInquiries()
        );
    }

    @Then("{actor} can view the reports in sales order")
    public void canViewTheReportsInSalesOrder(Actor actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsTask.fillInquiriesForm(), Ensure.that(TITLE_GRAPH_O2C).asAString().isEqualTo("O2C"));
    }
}
