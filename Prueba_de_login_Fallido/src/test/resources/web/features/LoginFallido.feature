Feature: Navegación por sitio Web

  @Smoke
  Scenario Outline: Inicio de sesion fallida
    Given Como usuario estoy en la main page de gmail
    When Como usuaro me dirijo a la secccion de logueo
    And Como usuario intento loguear poniendo mi <correo>
    Then El usuario no pudo loguear

   Examples:
    |correo|
    |roberto505rocas@gmail.com|

