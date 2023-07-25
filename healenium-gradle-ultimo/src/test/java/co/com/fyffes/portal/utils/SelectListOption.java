package co.com.fyffes.portal.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SelectListOption {
    public static String randomOption(Actor actor, Target optionsListTarget) {
        List<WebElementFacade> optionElements = optionsListTarget.resolveAllFor(actor);
        List<String> options = optionElements.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
        int numOfOptions = options.size();

        if (numOfOptions > 0) {
            Random random = new Random();
            int randomIndex = random.nextInt(numOfOptions);
            return options.get(randomIndex);
        } else {
            // Maneja adecuadamente si la lista está vacía
            return null;
        }
    }
}

