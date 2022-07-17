package com.freenow.android_demo;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.not;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.freenow.android_demo.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class loginFailedScenario {

    private static final String invalid_username = "crazyDog35";
    private static final String password = "verona";
    private static final String textHeader = "FREE NOW demo";
    private static final String loginText = "LOGIN";

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
    /*
        Steps:
        1. Enter with invalid username
        2. Enter with valid password
        3. Check 'Login' button is displayed on UI
        4. Perform click on 'Login' button
        5. Check for the content at bottom 'Login failed' message is displayed.
        6. Then verify textHeader - FREE NOW demo should be present in the toolbar.
     */
    @Test
    public void loginFailure() throws InterruptedException {
        onView(withId(R.id.edt_username))
                .perform(typeText(invalid_username));

        onView(withId(R.id.edt_password))
                .perform(typeText(password));

        onView(withText(loginText))
                .check(matches(isDisplayed()));

        onView(withId(R.id.btn_login)).
                perform(click());
        closeSoftKeyboard();
        //Check for the 'Login failed' message is displayed at bottom
        onView(withId(android.R.id.content))
                .check(matches(isDisplayed()));

        //check that login button is still displayed with invalid user credentials.
        onView(withId(R.id.btn_login)).check(matches(withText(loginText)));
        //Assertion - textHeader - FREE NOW demo should be present in the toolbar.
        onView(allOf(withId(R.id.toolbar), not(withText(textHeader))));
    }

}