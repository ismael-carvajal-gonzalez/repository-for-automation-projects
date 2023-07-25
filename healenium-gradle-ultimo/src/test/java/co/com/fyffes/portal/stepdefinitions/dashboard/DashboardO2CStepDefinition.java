package co.com.fyffes.portal.stepdefinitions.dashboard;

import co.com.fyffes.portal.tasks.NavagateTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.fyffes.portal.questions.DashboardQuestion.TITLE_GRAPH_O2C;


public class DashboardO2CStepDefinition {

    @Given("{actor} is in the portal")
    public void memberIsInThePortal(Actor actor) {
        actor.attemptsTo(
                NavagateTask.toLoginPage()
        );
    }

    @When("{actor} logs on with your username and password")
    public void logsOnWithYourUsernameAndPassword(Actor actor) {
        actor.attemptsTo(
                NavagateTask.usingCredencials("david", "Abc+1234")
                );
    }

    @Then("{actor} can see the dashboar of o2c")
    public void youCanSeeTheDashboarO2C(Actor actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(TITLE_GRAPH_O2C).asAString().isEqualTo("O2C"));
    }
}
