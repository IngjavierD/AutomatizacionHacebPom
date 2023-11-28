# language: es
@Agregarnuevousuario
Característica: Crear un usuario

  Escenario: Crear un nuevo usuario en Haceb.com
    Dado que el usuario se encuentra en la página de registro de Haceb.com
    Cuando el usuario completa el formulario de registro con un nombre de usuario, correo electrónico, contraseña y confirmación de contraseña válidos
    Y hace clic en el botón de Registrar
    Entonces el usuario debería poder visualizar su perfil en Haceb.com
