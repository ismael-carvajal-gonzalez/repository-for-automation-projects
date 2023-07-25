package co.com.fyffes.portal.utils.o2c.processing.salesorder;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickIfExists implements Interaction {
    private final Target target;

    public ClickIfExists(Target target) {
        this.target = target;
    }

    @Override
    @Step("{0} clicks on element if it exists")
    public <T extends Actor> void performAs(T user) {
        if (target.resolveAllFor(user).size() > 0) {
            user.attemptsTo(Click.on(target));
        }
    }

    public static Interaction on(Target target) {
        return instrumented(ClickIfExists.class, target);
    }
}
