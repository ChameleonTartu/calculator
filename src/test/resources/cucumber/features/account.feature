Feature: Receive personal API token

  # TODO: Continue with this tomorrow, consider different scenarios
  Scenario: The Customer sends personal API token
    When the Customer sends personal API token
    Then personal API token is stored and OK response returned