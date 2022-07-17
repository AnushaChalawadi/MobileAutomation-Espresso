package com.freenow.android_demo;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import android.support.test.espresso.Espresso;

public class loginToFreeNow {
    private static final String username = "crazydog335";
    private static final String password = "verona";
    private static final String loginText = "LOGIN";
      /*
          Steps:
          1. Enter with valid username
          2. Enter with valid password
          3. Check 'Login' button is displayed on UI
          4. Perform click on 'Login' button
       */
    static void loginTest() {
        Espresso.onView(withId(R.id.edt_username))
                .perform(typeText(username));
        Espresso.onView(withId(R.id.edt_password))
                .perform(typeText(password));
        //Check if 'Login' button is exit
        Espresso.onView(withId(R.id.btn_login))
                .check(matches(withText(loginText)));
        Espresso.onView(withText(loginText)).perform(click());
    }
}
