Feature: añadir un botón de salida en añadir notificación
Como usuario quiero poder volver al menu principal desde las pantallas de añadir notificación
Scenario: añadir un botón de salida
	Given la pantalla de añadir notificación
    When se pulse el botón de salida
    Then se volverá a la pantalla "dashboard"