package org.sdhanbit.android;

import android.widget.TextView;
import org.sdhanbit.android.test.support.FakeCurrentTime;
import org.sdhanbit.android.test.support.RobolectricTestRunnerWithInjection;
import org.sdhanbit.android.util.CurrentTime;
import com.google.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunnerWithInjection.class)
public class StarterActivityWithRoboguiceTest {
    @Inject
    CurrentTime currentTime;

    @Test
    public void testCurrentTimeIsInjected() throws Exception {
        ((FakeCurrentTime) currentTime).setCurrentTime(12345L);
        final StarterActivity activity = new StarterActivity();
        activity.onCreate(null);
        TextView title = (TextView) activity.findViewById(R.id.current_time);
        assertEquals("12345", title.getText());
    }
}
