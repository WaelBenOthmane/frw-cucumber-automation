Feature: je verifie la page de register
  			En tant que utilisateur je souhaite m inscrire au site Mercury

  @register
  Scenario: je verifie la page de register 											
   	Given je me connecte sur le site Mercury
   	When je clique sur le lien REGISTER
   	Then je me redirige vers la page REGISTER
   	When je saisi le First Name "Wael"
   	When je saisi le Last Name "Ben Othmane"
   	And je saisi le Phone "51073073"
   	And je saisi l Email "Waelbenothmane.qa@gmail.com"
   	And je clique sur le bouton Envoyer
   	Then je me redirige vers la page register success "Dear Wael Ben Othmane,"