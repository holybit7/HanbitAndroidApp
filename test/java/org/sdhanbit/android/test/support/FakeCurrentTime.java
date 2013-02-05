package org.sdhanbit.android.test.support;

import org.sdhanbit.android.util.CurrentTime;

public class FakeCurrentTime extends CurrentTime {
    private long fakeTime;

    @Override
    public long currentTimeMillis() {
        return fakeTime;
    }

    public void setCurrentTime(long time) {
        fakeTime = time;
    }
}
