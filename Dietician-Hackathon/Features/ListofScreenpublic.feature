Feature: List of Screens

Background:
Given User is on browser
When User opens dietician website
Then User should see a 3 horizontal line


Scenario: Validating the functionality of List of Screens Link
When User selects the link of 3 horizontal lines
Then User should see the list of links is displayed

Scenario: Validating the public section on List of Screen
When User selects the link of 3 horizontal lines
Then User should see the links to "public" pages under Public

Scenario: Validating the functionality of links in public
Given User is on the menu list in homepage
When User selects the link menu as "<MENU>" 
Then User should  re-directed to Url as "<URL>"

|MENU|URL|
|UserSignIn|UserSignIn|
|Register|Register|
|Testimonials|Testimonials|
|ForgotPassword |Sign In|
|Product Features|Product|
|Contact|Contact Us|
|Blogs|Blogs|
|Featured Content|Featured Content|
|Home|Home|

Scenario: Validating the Dietician section on List of Screens
Then User should see the links to "Dietician" pages under Dietician

Scenario: Validating the functionality of Dietician link when user is not signed in
Given User is on the menu list in homepage
When User selects the link of menu as "<MENU>" before signing in 
Then User should direct to Url as "<Url>"  page

|MENU|Url|
|ViewRecentDiets | SIGNIn|
|ViewRecentTestReports | SIGNIn|
|AddNewPatients | SIGNIn|
|DieticianHome | SIGNIn|
|ConfirmConditionsandCreatePlan | SIGNIn|


Scenario: Validating the functionality of Dietician link when user signed in
Given User is on the menu list in homepage
When User selects the link of menu as "<MENU>" after signing in 
Then User should direct to Url as "<Url>" page

|MENU|Url|
|ViewRecentDiets | ViewRecentDiets |
|ViewRecentTestReports | ViewRecentTestReports|
|AddNewPatients | AddNewPatients|
|DieticianHome | DieticianHome|
|ConfirmConditionsandCreate Plan | ConfirmConditionsandCreate Plan|
