package com.haceb.Steps;

import com.haceb.Core.Core;
import com.haceb.PageObject.PaginaRegistroPO;
import com.haceb.Utils.Data;
import net.thucydides.core.annotations.Step;

public class PaginaRegistroStep {
    PaginaRegistroPO paginaRegistro;
    @Step("ingresar informacion formulario registro")
    public void ingresoinformacionformulario(){
        paginaRegistro.getDriver().findElement(paginaRegistro.getTxtcorreo()).sendKeys(Data.extractTo().get(0).get("Correo"));
        paginaRegistro.getDriver().findElement(paginaRegistro.getTxtnombre()).sendKeys(Data.extractTo().get(0).get("Nombre"));
        paginaRegistro.getDriver().findElement(paginaRegistro.getTxtapellido()).sendKeys(Data.extractTo().get(0).get("Apellido"));
        paginaRegistro.getDriver().findElement(paginaRegistro.getTextcontrasena()).sendKeys(Data.extractTo().get(0).get("Contraseña"));
        paginaRegistro.getDriver().findElement(paginaRegistro.getTextcontrasenaV()).sendKeys(Data.extractTo().get(0).get("RepetirContraseña"));
        Core.ejecutarScript(paginaRegistro.getDriver(), "arguments[0].checked = true;", paginaRegistro.getBtncheckbox());
        Core.ejecutarScript(paginaRegistro.getDriver(), "arguments[0].checked = true;", paginaRegistro.getBtncheckbox1());

    }
    @Step("click boton registrar")
    public void clickbtnregistrar(){
        paginaRegistro.getDriver().findElement(paginaRegistro.getBtnRegistrarse()).click();
    }
    @Step("Segundo Formulario")
    public void ingresoinformacionformulario2(){

        paginaRegistro.getDriver().findElement(paginaRegistro.getTextcedula()).sendKeys(Data.extractTo().get(0).get("Cedula"));
        Core.seleccionarElementoPorTexto(paginaRegistro.getDriver(), paginaRegistro.getSelectsexo(),Data.extractTo().get(0).get("Genero"));
        paginaRegistro.getDriver().findElement(paginaRegistro.getTxtfechanacimiento()).sendKeys(Data.extractTo().get(0).get("FechaNacimiento"));
        Core.seleccionarElementoPorTexto(paginaRegistro.getDriver(),paginaRegistro.getSelectCodigopais(),Data.extractTo().get(0).get("IndicadorPais"));
        paginaRegistro.getDriver().findElement(paginaRegistro.getTxtNumero()).sendKeys(Data.extractTo().get(0).get("Numero"));
        Core.seleccionarElementoPorTexto(paginaRegistro.getDriver(), paginaRegistro.getSelectDepartamento(),Data.extractTo().get(0).get("Departamento"));
        Core.seleccionarElementoPorTexto(paginaRegistro.getDriver(), paginaRegistro.getSelectMunicipio(),Data.extractTo().get(0).get("Municipio"));
        try {
            paginaRegistro.getDriver().findElement(paginaRegistro.getBtnenviarregistro()).click();
            // Espera durante 10 segundos antes de cerrar la página
            Thread.sleep(15000); // 5000 milisegundos = 5 segundos
        } catch (InterruptedException e) {
            // Manejo de excepciones si hay interrupción durante el sleep
            e.printStackTrace();
        }
    }
    @Step("Cambio De Ventana")
    public void Cambioventana(){
        Core.cambioVentana(paginaRegistro.getDriver());
    }
}
