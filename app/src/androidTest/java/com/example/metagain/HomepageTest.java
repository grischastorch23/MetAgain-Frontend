package com.example.metagain;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class HomepageTest {

    @Rule
    public ActivityScenarioRule<Homepage> activityScenarioRule = new ActivityScenarioRule<>(Homepage.class);

    @Test
    public void testAlertsButton() {
        onView(withId(R.id.homeToAlerts)).perform(click());

        onView(withId(R.id.alertsLayout)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    @Test
    public void testMeetingsButton() {
        onView(withId(R.id.homeToMeetings)).perform(click());

        onView(withId(R.id.alertsLayout)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    @Test
    public void testProfileButton() {
        onView(withId(R.id.homeToProfile)).perform(click());

        onView(withId(R.id.userprofileLayout)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}