# MobileAppAutomationTest

Hi FREENOW🎈

Implemented the below given scenario for Android UI Tests using **Espresso**.

✏️ **Task**:

1. Login case, the up-to-date credential (`username` & `password`) [here](https://randomuser.me/api/?seed=a1f30d446f820665)).
2. Search for "***sa***", select the 2nd result (via the name, not the index) from the list, then click the call button.
3. Test cases with invalid user credential , Validate the message with 'Login Failed' - Added an extra sceanrio.

🎈 **To Run any of the Testcases**: 
Select File and hit on 'Run' Button.

✏️ **Below are scenario can cover as part of Automation**:

1. Enter an invalid password & click the login button. Verify if the user will get the correct 'Login failed' message.
2. Enter an invalid Username and  invalid password & click the login button. Verify if the user will get the correct 'Login failed' message 
3. Click on 'Login' button without Username and password. Verify if the user will get the correct 'Login failed' message.
4. Search for an Driver name , then logout from app. Verify for the searched driver name once after re-login.
5. Verify the functionality if can logout from app from the Driver profile.
6. Verify if a user cannot log in with an invalid username or password. Check permutation and combinations of this.
7. Search and select the driver’s name, press back from keyboard, Searched result should not be retained.
8. Verify the name in Driver profile is expected from what selected.
9. Navigate to search bar from Driver profile screen to search for other Driver's.
10. Search for Driver name and logout from application, Verify the searched result after re-login as per the business requirement.
11. Can verify Date as expected from the Driver profile screen.
12. Can verify Driver location as expected from the Driver profile screen.
13. Can verify response on Ui when double on call button from Driver profile screen.

🎈 **Suggestions on UI**:

1. Login button should look like Enable, currently looks like disabled form.
2. Looks like there is more spaces is available in - Home screen(After search bar), Driver profile(After Driver details),
   After Logout button wnen click on Menu, After login button in login screen.



