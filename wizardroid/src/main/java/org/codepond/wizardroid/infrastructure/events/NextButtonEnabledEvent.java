package org.codepond.wizardroid.infrastructure.events;

/**
 * Created by brodd on 2016-02-23.
 */
public class NextButtonEnabledEvent {

    private boolean mEnabled;

    public NextButtonEnabledEvent(boolean enabled) {
        mEnabled = enabled;
    }

    public boolean getEnabled() {
        return mEnabled;
    }
}
