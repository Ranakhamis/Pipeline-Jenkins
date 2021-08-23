Feature: Login

  Scenario Outline: User trying to login with registered number
    Given App opened in English and we need to run it in "<lang>"
    When User login using "<msisdn>" and "<password>"
    Examples:
      | msisdn              | password           | lang |
      | INNBSPPrePaidNumber | password           | en   |

