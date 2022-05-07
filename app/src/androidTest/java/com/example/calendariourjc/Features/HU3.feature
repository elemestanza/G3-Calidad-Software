Feature: asegurar que la app se abre correctamente al pulsar el icono
Como usuario quiero poder asegurar que la aplicación se abre correctamente
Scenario: abrir la app correctamente
	Given el icono de la app
    When se pulse el icono de la app
    Then se abrirá correctamente