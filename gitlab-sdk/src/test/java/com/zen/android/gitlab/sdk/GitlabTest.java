package com.zen.android.gitlab.sdk;

import com.zen.android.gitlab.sdk.model.Calendar;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * @author zen
 * @version 2016/4/26
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = IConfig.SDK_LEVEL,
        manifest = IConfig.MANIFEST_PATH)
public class GitlabTest {

    static final String TEST_USERNAME = "JobV";

    @Test
    public void testCalender() throws Exception {
        String response = Gitlab.getApi().getCalendar(TEST_USERNAME);
        System.out.println(response);
        Assert.assertNotNull(response);

        Calendar calendar = Calendar.parseCalendar(response);
        Assert.assertNotNull(calendar);
        Assert.assertTrue(calendar.getTotalCount() > 0);
    }

}
