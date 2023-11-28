package com.haceb.PageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaPefilPO extends PageObject {
    private final By textoperfil = By.xpath("/html/body/div[5]/section/div/div/div/div/section/header/div[2]/div/div/div[1]");
    public By getTextoperfil() {
        return textoperfil;
    }
}
