package com.haceb.PageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaPrincipalPO extends PageObject {
    private final By btnRegistrolista =By.xpath("/html/body/header/div[2]/div[6]/div[2]");
    private final By btnRegistro =By.xpath("/html/body/header/div[2]/div[6]/div[2]/div/a[2]");
    private final By btnRegistromodal =By.xpath("//*[@id=\"vtexIdUI-custom-oauth\"]");
    private final By btnCerrarmodal =By.xpath("//a[@aria-label='close window']\n");
    public By getBtnRegistrolista() {
        return btnRegistrolista;
    }

    public By getBtnRegistro() {
        return btnRegistro;
    }

    public By getBtnRegistromodal() {
        return btnRegistromodal;
    }

    public By getBtnCerrarmodal() {
        return btnCerrarmodal;
    }
}
