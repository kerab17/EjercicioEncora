Feature: Realizar un registro y login en la web

  Scenario: Registro en la web
    Given me encuentro en la web parabank
    When ingreso al formulario para registrarme
    And ingreso datos aleatorios al formulario
    Then Debería mostrar un mensaje de éxito

  Scenario: Login en la web
    Given me encuentro en la web parabank
    When ingreso mi usuario y contraseña registrado
    Then Debería mostrarme el resumen de cuenta
