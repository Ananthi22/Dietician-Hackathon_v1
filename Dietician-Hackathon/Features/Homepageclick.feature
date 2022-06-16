Feature: Link on HomePage

Scenario: Validating the Product Link on the Home page
Given user in a HomePage
When user click on product link on homepage
Then user should direct to Product page

Scenario: Validating the Clients Link on the Home page
Given user in a HomePage
When user click on clients link on homepage
Then user should direct to Testimonial page

Scenario: Validating the Team Link on the Home page
Given user in a HomePage
When user click on Team link on homepage
Then user should direct to Team page
And user should see Doctor's name on Team page


Scenario: Validating the Register Link on the Home page
Given user in a HomePage
When user click on Register link on homepage
Then user should direct to Sign Up page 

Scenario: Validating the SignIn Link on the Home page
Given user in a HomePage
When user click on signin link on homepage
Then user should direct to SignIn page 

Scenario: Validating the Featured Link on the Home page
Given user in a HomePage
When user click on featured on homepage
Then user should direct to Featured Content page 

Scenario: Validating the Blogs Link on the Home page
Given user in a HomePage
When user click on blogs  on homepage
Then user should directed to blogs page 
