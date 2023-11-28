package com.haceb.Core;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Core extends PageObject {

    //Se envia la instancias seguida del getdriver()
    public static String cambioVentana(WebDriver driver) {
        // Obtener manijas de ventanas
        Set<String> handles = driver.getWindowHandles();
        // Variable para almacenar el identificador de la ventana activa después del cambio
        String nuevaVentana = null;
        for (String handle : handles) {
            driver.switchTo().window(handle);
            nuevaVentana = handle; // Actualizar el identificador de la ventana activa
        }
        // Maximizar la nueva ventana
        driver.manage().window().maximize();
        // Devolver el identificador de la ventana activa después del cambio
        return nuevaVentana;
    }

    // Se envia los parametros Instancia.getdriver(), el localizador y el texto
    public static void seleccionarElementoPorTexto(WebDriver driver, By localizador, String texto) {
        WebElement elemento = driver.findElement(localizador);
        Select dropdown = new Select(elemento);
        dropdown.selectByVisibleText(texto);
    }

    // Recibe intancia con getdriver , el script a ejecutar en tipo texto y el localizador mediante un get
    public static void ejecutarScript(WebDriver driver, String script, By locator) {
        WebElement elemento = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript(script, elemento);
    }

    // instancia con .getdriver() y el elemnto By
    public static void hover(WebDriver driver, By by) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(by);
        actions.moveToElement(element).perform();
    }

}
