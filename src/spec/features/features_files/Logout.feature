@TC
Feature: Je souhaite tester les boutons Logout et About de l app Swag Labs
  I want to use this template for my feature file
	Background:
	  Given je me connecte a lapplication Swag Labs
    When je clique sur le menu burger
  @logout
  Scenario: Je souhaite tester la page de deconnexion
    
    And je clique sur Logout
    Then je me redirige vers la page de connexion "Swag Labs"
    
    @about
  Scenario: Je souhaite tester le bouton about
  
    And je clique sur About
    Then je me redirige vers la page about