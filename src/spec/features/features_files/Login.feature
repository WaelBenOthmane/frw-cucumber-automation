@login
Feature: Je souhaite tester la page de connexion du site Swag Labs
  ETQ Utilisateur je veux tester la page de connexion du site Swag Labs

  @login_cas_passant
  Scenario: Je souhaite tester la page de connexion avec cas passant
    Given je me connecte a lapplication Swag Labs
    Then je me redirige vers la page d acceuil "Products"
   	
   	@login_cas_non_passant
  Scenario: Je souhaite tester la page de connexion avec cas non passant
    Given je me connecte sur lapplication Swag Labs avec des valeurs invalides
    Then le message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"