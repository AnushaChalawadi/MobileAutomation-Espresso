package com.freenow.android_demo;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.freenow.android_demo.activities.Matchers.childAtPosition;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.matcher.RootMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.freenow.android_demo.activities.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class loginSuccessScenario extends loginToFreeNow {
    private static final String searchText = "Sa";
    private static final String driverName = "Same Martin";

    @Before
    public void loginBefore() {
        loginTest();
    }
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
    /*
          Steps:
          1. 'Login' is called in before test
          2. Check for 'FREE NOW demo' is displayed on toolbar
          3. Search for with 'Sa'
          4. Try by Click on Driver by name "Same Martin"
          5. Then verify Driver profile is displayed with text 'Driver Profile' on toolbar.
          6. Check for Driver name on UI by Id.
          7. Verify the call button and click on it.
          8. If try block gets failed , then logout from application from catch block.
       */
    @Test
    public void searchDriverAndCall() throws InterruptedException {
        Thread.sleep(5000);
        onView(withText("FREE NOW demo")).check(matches(isDisplayed()));
        try {
            onView (withId (R.id.textSearch))
                    .check (matches(isDisplayed()))
                    .perform (typeText(searchText));
            onView(withText(driverName))
                    .inRoot(RootMatchers.isPlatformPopup()).perform(click());
            // View is displayed
            System.out.println("Driver Search is Successful");
            onView(withText("Driver Profile"))
                    .check(matches(isDisplayed()));

            onView(withId(R.id.textViewDriverName))
                    .check(matches(withText("Same Martin")));
            //Verifying an call button and click on it.
            onView(withId(R.id.fab)).check(matches(isDisplayed())).perform(click());


        } catch (NoMatchingViewException e) {
            onView(withId(R.id.toolbar)).check(matches(isDisplayed()));
            ViewInteraction appCompatImageButton = onView(
                    allOf(withContentDescription("Open navigation drawer"),
                            childAtPosition(
                                    allOf(withId(R.id.toolbar),
                                            childAtPosition(
                                                    withClassName(is("android.support.design.widget.AppBarLayout")),
                                                    0)),
                                    1),
                            isDisplayed()));
            appCompatImageButton.perform(click());

            ViewInteraction navigationMenuItemView = onView(
                    allOf(childAtPosition(
                                    allOf(withId(R.id.design_navigation_view),
                                            childAtPosition(
                                                    withId(R.id.nav_view),
                                                    0)),
                                    1),
                            isDisplayed()));
            navigationMenuItemView.perform(click());
        }
    }
}