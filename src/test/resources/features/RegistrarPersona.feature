# language: en

Feature: Validar el registro de una persona en la plataforma de a2censo
	Yo como usuario de a2censo
	deseo realizar el registro de la pagina
	para poder acceder a sus funcionalidades
  @registro
  Scenario Outline: Validar el registro de una persona en la plataforma de a2censo
    Given ingreso a la url de la pagina adoscenso 
    When ingreso a la opcion crear cuenta
    And selecciono la opcion quiero invertir
    And selecciono la opcion persona natural
    And diligencio el formulario de registro <nombre> <p_apellido> <s_apellido> <t_identificacion> <n_identificacion> <correo> <n_celular> <contrasena>
    Then puedo finalizar el registro

   Examples:  
      | nombre         | p_apellido | s_apellido | t_identificacion | n_identificacion | correo                        | n_celular     | contrasena |
      | "paula andrea" | "velasco"  | "arevalo"  | "CE"             | "12355939978"    | "paulavelasco.3096@gmail.com" | "32125986996" | "12345698" |


     
