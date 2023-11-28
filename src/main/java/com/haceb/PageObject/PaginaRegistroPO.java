package com.haceb.PageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistroPO extends PageObject {
    private final By txtcorreo =By.xpath("(//input[@name='email' and @class='gigya-input-text'])[4]");
    private final By txtnombre =By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div[5]/input");
    private final By txtapellido =By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div[6]/input");
    private final By textcontrasena =By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div[7]/input");
    private final By textcontrasenaV =By.xpath("//*[@id=\"gigya-password-142670944012194750\"]");
    private final By btncheckbox =By.xpath("//*[@id=\"gigya-checkbox-70031539084410860\"]");
    private final By btncheckbox1 =By.xpath("//*[@id=\"gigya-multiChoice-0-98366419479004930\"]");
    private final By btnRegistrarse =By.xpath("//*[@id=\"gigya-register-form\"]/div[2]/div[11]/input");
    private final By textcedula = By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[3]/input");
    private final By Selectsexo = By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[4]/select");
    private final By SelectCodigopais =By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[6]/fieldset/select");
    private final By selectDepartamento=By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[7]/select");
    private final By selectMunicipio=By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[8]/select");
    private final By btnenviarregistro =By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div[8]/font/font/input");
    private final By txtfechanacimiento =By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[5]/input");
    private final By txtNumero =By.xpath("/html/body/div[5]/div[2]/div/form/div[1]/div[6]/fieldset/input");
    public By getTxtcorreo() {
        return txtcorreo;
    }
    public By getTxtnombre() {
        return txtnombre;
    }
    public By getTxtapellido() {
        return txtapellido;
    }
    public By getTextcontrasena() {
        return textcontrasena;
    }
    public By getTextcontrasenaV() {
        return textcontrasenaV;
    }
    public By getBtncheckbox() {
        return btncheckbox;
    }
    public By getBtncheckbox1() {
        return btncheckbox1;
    }
    public By getBtnRegistrarse() {
        return btnRegistrarse;
    }
    public By getTextcedula() {
        return textcedula;
    }
    public By getSelectsexo() {
        return Selectsexo;
    }
    public By getSelectCodigopais() {
        return SelectCodigopais;
    }
    public By getSelectDepartamento() {
        return selectDepartamento;
    }
    public By getSelectMunicipio() {
        return selectMunicipio;
    }
    public By getBtnenviarregistro() {
        return btnenviarregistro;
    }
    public By getTxtfechanacimiento() {
        return txtfechanacimiento;
    }

    public By getTxtNumero() {
        return txtNumero;
    }
}
