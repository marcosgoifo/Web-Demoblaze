

Feature:  Agregar una laptop al carrito
  Como usuario quiero agregar una laptop al carrito para despues comprarla

 
  Scenario:  Dar de alta un usuario
    Given El usuario se encuentra en la pagina Home de demoblaze
    When Hace click en el boton Sign up
    And Completa el campo Username y Password y clickea en el boton Sign up
    Then Se debe dar de alta correctamente al usuario
    
  Scenario:  Login y Logout con el usuario dado de alta.
    Given El usuario se encuentra en la pagina Homepage  
    When hace click en el boton Log in
    And Completa el campo Username y Password y clickea en el boton Log in
    Then Se debe logear correctamente al usuario
    And El usuario clikea en el boton logout
    Then Se realizar el Logout correctamente al usuario
 
 Scenario:   Agregar una laptop al carrito de compras.
    Given El usuario se encuentra en la pagina Homepage  
    When hace click en el boton de la categoria Laptops
    And Selecciona el primer item llamado Sony vaio i5
    Then Se abre la pagina principal de la laptop
    And El usuario clikea en el boton AddToCard
    Then Se debe agregar correctamente al carrito de compras
 
