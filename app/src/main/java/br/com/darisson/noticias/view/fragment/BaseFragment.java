package br.com.darisson.noticias.view.fragment;

import org.androidannotations.annotations.EFragment;
import org.greenrobot.eventbus.EventBus;

@EFragment
public class BaseFragment extends android.support.v4.app.Fragment {

    @Override
    public void onStart() {
        super.onStart();
        EventBus eventBus = EventBus.getDefault();
        if (!eventBus.isRegistered(this)) {
            eventBus.register(this);
        }
    }

    @Override
    public void onStop() {
        super.onStop();

        EventBus eventBus = EventBus.getDefault();
        if (eventBus.isRegistered(this)) {
            eventBus.unregister(this);
        }
    }
}
