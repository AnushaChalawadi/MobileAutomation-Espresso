# MobileAppAutomationTest

Hi FREENOW🎈

Implemented the below given scenario for Android UI Tests using **Espresso**.

✏️ **Task**:

- Login case, the up-to-date credential (`username` & `password`) [here](https://randomuser.me/api/?seed=a--d-----)).
- Search for "***sa***", select the -d result (via the name, not the index) from the list, then click the call button.
- Test cases with invalid user credential , Validate the message with 'Login Failed' - Added an extra sceanrio.
- Deployed the tests on CircleCI, link to the builds [here](https://app.circleci.com/pipelines/github/AnushaChalawadi/MobileAutomation-Espresso)

✏️ **Below are the possible scenarios Automation**:

- Validate the Error message for an invalid password and click on login button.
- Validate the Error message for an invalid Username and password.
- Validate the Error message without user credentials when click on login button.
- Verify for the searched driver name once after re-login.
- Verify the functionality if can logout from app from the driver profile.
- Verify if a user cannot log in with an invalid username or password. Check permutation and combinations of this.
- Search and select the driver’s name, press back from keyboard, Verify the search results as per the business requirement.
- Verify the driver name in driver profile is expected from what selected.
- Navigate to search bar from driver profile screen to search for other drivers.
- Search for driver name and logout from application, Verify the searched result after re-login as per the business requirement.
- Verify Date as expected from the driver profile screen.
- Verify driver location as expected from the driver profile screen.
- Verify response on UI when double click on call button from driver profile screen.

🎈 **Suggestions on UI**:

- Currently Login button looks like an disable, Can make changes on it.
- All empty spaces can adjust in the application. Ex: After Logout button.
- Provide an Mandatory message for Username and password field.
- Doesn't perform any action when click on 'fab' icon

 **Scenarios should be tested if the app has various kinds of users**

- Verify the navigation between the modules is expected.
- Validate the data does not goes off when user navidates from modules to modules.
- Validate the performance of the application when more load is applied.
- Verify the compatibity test on the application.
- Verify the application in case of any interupt condition.
- Verify the application is as expected in case of application upgrade.
- Verify the session timeout scenarios.




