package co.com.fyffes.portal.webdriver;

import com.epam.healenium.SelfHealingDriver;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.NoSuchElementException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HealeniumWebDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
        WebDriver delegate = null;

        try {
            delegate = new ChromeDriver();
            // Aquí debe ir el código que podría arrojar una excepción NoSuchElementException
            // Por ejemplo, una operación de búsqueda de un elemento.
        } catch (NoSuchElementException e) {
            // Si se produce una excepción NoSuchElementException, toma una captura de pantalla
            File scrFile = ((TakesScreenshot) delegate).getScreenshotAs(OutputType.FILE);
            Path destination = Paths.get("/healenium-gradle-ultimo/screenshot");
            try {
                Files.copy(scrFile.toPath(), destination);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            throw e; // Vuelve a lanzar la excepción para que pueda ser manejada en otros lugares
        }

        return SelfHealingDriver.create(delegate);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}

