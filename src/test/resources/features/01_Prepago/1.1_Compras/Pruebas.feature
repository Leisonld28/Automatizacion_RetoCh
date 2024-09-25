#Author: Leison Perilla
#Keywords Summary :
@issue:HU001 @PruebasElements
Feature: Web Tables

  YO como usuario de
  Quiero
  Para grantizar el correcto funcionamiento de


  Background: Pagina principal
    Given estoy en la pagina principal
    When ingreso los campos del formulario sign in


@article
  Scenario: Recruitment
    Given Selecciono la opcion Recruitment
    When Ingreso los campos del formulario del candidato
    Then Realizo la validacion del candidato creado
