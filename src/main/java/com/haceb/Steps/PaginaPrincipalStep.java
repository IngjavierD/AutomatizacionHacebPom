package com.haceb.Steps;

import com.haceb.Core.Core;
import com.haceb.PageObject.PaginaPrincipalPO;
import net.thucydides.core.annotations.Step;

public class PaginaPrincipalStep extends Core {
    PaginaPrincipalPO paginaPrincipal;

    @Step("Abrir Navegador")
    public void abrirnavegador() {
        try {
            paginaPrincipal.openUrl("https://www.haceb.com/");
            // Espera durante 10 segundos antes de cerrar la página
            Thread.sleep(10000); // 5000 milisegundos = 5 segundos
        } catch (InterruptedException e) {
            // Manejo de excepciones si hay interrupción durante el sleep
            e.printStackTrace();
        }
    }
    @Step("Cerrar Popud")
    public void CerrarPopud() {
       paginaPrincipal.getDriver().findElement(paginaPrincipal.getBtnCerrarmodal()).click();

    }
    @Step("Posicionarse sobre el boton Registro")
    public void posicionarsebtnregistro(){
        Core.hover(paginaPrincipal.getDriver(), paginaPrincipal.getBtnRegistrolista());
    }
    @Step("Click en Boton registrar")
    public void Clickbtnregistrar(){
        paginaPrincipal.getDriver().findElement(paginaPrincipal.getBtnRegistro()).click();
    }
    @Step("Click en Boton registrar de popud")
    public void Clickbtnregistrarpopud(){
        try {
            paginaPrincipal.getDriver().findElement(paginaPrincipal.getBtnRegistromodal()).click();
            // Espera durante 10 segundos antes de cerrar la página
            Thread.sleep(5000); // 5000 milisegundos = 5 segundos
        } catch (InterruptedException e) {
            // Manejo de excepciones si hay interrupción durante el sleep
            e.printStackTrace();
        }
    }
    @Step("Cambio De Ventana")
    public void Cambioventana(){
        Core.cambioVentana(paginaPrincipal.getDriver());
    }
}
