package com.haceb.stepsdefinitions;

import com.haceb.Steps.PaginaPerfilStep;
import com.haceb.Steps.PaginaPrincipalStep;
import com.haceb.Steps.PaginaRegistroStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class registrarusuariostepsdefinitions {

    @Steps
    PaginaPrincipalStep paginaPrincipal;
    @Steps
    PaginaRegistroStep paginaRegistro;
    @Steps
    PaginaPerfilStep paginaPerfil;
    @Dado("que el usuario se encuentra en la página de registro de Haceb.com")
    public void queElUsuarioSeEncuentraEnLaPáginaDeRegistroDeHacebCom() {
        paginaPrincipal.abrirnavegador();
        paginaPrincipal.CerrarPopud();
        paginaPrincipal.posicionarsebtnregistro();
        paginaPrincipal.Clickbtnregistrar();
        paginaPrincipal.Clickbtnregistrarpopud();
        paginaPrincipal.Cambioventana();
    }
    @Cuando("el usuario completa el formulario de registro con un nombre de usuario, correo electrónico, contraseña y confirmación de contraseña válidos")
    public void elUsuarioCompletaElFormularioDeRegistroConUnNombreDeUsuarioCorreoElectrónicoContraseñaYConfirmaciónDeContraseñaVálidos() {
        paginaRegistro.ingresoinformacionformulario();
    }
    @Cuando("hace clic en el botón de Registrar")
    public void haceClicEnElBotónDeRegistrar() {
        paginaRegistro.clickbtnregistrar();
        paginaRegistro.ingresoinformacionformulario2();
        paginaRegistro.Cambioventana();
    }
    @Entonces("el usuario debería poder visualizar su perfil en Haceb.com")
    public void elUsuarioDeberíaPoderVisualizarSuPerfilEnHacebCom() {
        paginaPerfil.Tomartextoperfil();
    }
}
