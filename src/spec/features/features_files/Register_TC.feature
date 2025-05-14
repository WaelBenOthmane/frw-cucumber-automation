Feature: je verifie la page de register
En tant que utilisateur je souhaite m inscrire au site Mercury

   @registred
  Scenario Outline: je verifie la page de register
    Given je me connecte sur lapplication Mercury
    When je clique sur le lien REGISTER
    When je saisi le First Name "<FirstName>"
		When je saisi le Last Name "<LastName>"
		
    Examples:
      | FirstName  | LastName |
      | Wael |     Ben Othmane |
      | Ghada |     Trabelsi |
