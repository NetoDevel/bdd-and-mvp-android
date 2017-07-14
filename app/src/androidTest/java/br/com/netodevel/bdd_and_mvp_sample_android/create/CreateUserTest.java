package br.com.netodevel.bdd_and_mvp_sample_android.create;


import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.io.IOException;

import br.com.netodevel.bdd_and_mvp_sample_android.R;
import br.com.netodevel.bdd_and_mvp_sample_android.data.Enviroments;
import br.com.netodevel.bdd_and_mvp_sample_android.user.UserActivity;
import okhttp3.mockwebserver.MockWebServer;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(Enclosed.class)
public class CreateUserTest {

    public abstract static class describe_create_user {

        @Rule
        public ActivityTestRule<UserActivity> userActivity = new ActivityTestRule<UserActivity>(UserActivity.class, false, false);

        protected MockWebServer mockWebServer;

        @Before
        public void setUp() throws IOException {
            this.mockWebServer = new MockWebServer();
            this.mockWebServer.start();
            setupMockServer();
        }

        private void setupMockServer() {
            String url = this.mockWebServer.url("/").toString();
            Enviroments.baseURL = url;
        }

        @After
        public void after() throws IOException {
            this.mockWebServer.shutdown();
        }
    }

    public static class context_when_email_blank extends describe_create_user {

        @Test
        public void it_should_show_msg_all_fields_required() {
            userActivity.launchActivity(new Intent());

            onView(withId(R.id.edit_text_email)).perform(click()).perform(typeText(""));
            onView(withId(R.id.edit_text_password)).perform(click()).perform(typeText("1234567"));
        }

    }

}
