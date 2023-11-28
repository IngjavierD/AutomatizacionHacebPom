package com.haceb.Steps;

import com.haceb.PageObject.PaginaPefilPO;
import net.thucydides.core.annotations.Step;


public class PaginaPerfilStep {
    PaginaPefilPO paginaPerfil;
    @Step("Tomar Texto Perfil para verificar el registro exitoso")
    public void Tomartextoperfil(){
        String Validacion= paginaPerfil.getDriver().findElement(paginaPerfil.getTextoperfil()).getText();
        if ("Perfil".equals(Validacion)){
            System.out.println("La Creacion del Usuario fue Exitosa, La verificacion se realizo con el campo "+Validacion);
        }

    }
}
