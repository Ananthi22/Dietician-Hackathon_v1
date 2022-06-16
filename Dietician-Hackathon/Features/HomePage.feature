Feature: HomePage feature
Background:
Given User launch the browser
When User opens dietician Website
Then User should see the Homepage

Scenario: Validating the title of the Home page
Given User in  the Homepage
When User validate the title of the page
Then User should see the title of the page as "Home"

Scenario: Validating the logo of the Home page
Given  User in  the Homepage
When User validate the logo of the page
Then User should see the logo image

Scenario: Validating the tab PRODUCT on the Home page
Given User in the Homepage
Then User should see the tab "PRODUCT"

Scenario: Validating the tab CLIENTS on the Home page
Given User in the Homepage
Then User should see the tab "CLIENTS"

Scenario: Validating the tab TEAM on the Home page
Given User in the Homepage
Then User should see the tab "TEAM"

Scenario: Validating the tab REGISTER on the Home page
Given User in the Homepage
Then User should see the tab "REGISTER"

Scenario: Validating the tab About on the Home page
Given User in the Homepage
Then User should see the tab "About" 

Scenario: Validating the tab Featured on the Home page
Given User in the Homepage
Then User should see the tab "Featured" 

Scenario: Validating the tab Blogs on the Home page
Given User in the Homepage
Then User should see the tab "Blogs"





