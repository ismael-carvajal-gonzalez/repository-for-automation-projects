package co.com.fyffes.portal.stepdefinitions.dashboard;

import co.com.fyffes.portal.tasks.NavagateTask;
import co.com.fyffes.portal.utils.Wait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.fyffes.portal.questions.DashboardQuestion.TITLE_GRAPH_SUPPLY_CHAIN;

public class DashboardSupplyChainStepDefinition {

    @Given("{actor} is in the portal and he want to enter in dashboard in supply chain")
    public void memberIsInThePortalAndHeWantToEnter(Actor actor) {
        actor.attemptsTo(NavagateTask.toLoginPage());
    }

    @When("{actor} logs on with your username and password and want to navigate")
    public void logsOnWithYourUsernameAndPasswordAndWantToNavigate(Actor actor) {
        actor.attemptsTo(
                NavagateTask.usingCredencials("david", "Abc+1234")
        );
    }

    @Then("{actor} can see the dashboar of supply chain")
    public void CanSeeTheDashboarOfSupplyChain(Actor actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(TITLE_GRAPH_SUPPLY_CHAIN).asAString().isEqualTo("Supply Chain"));
    }
}
