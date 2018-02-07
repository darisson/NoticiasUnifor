package br.com.darisson.noticias.view.activity;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;

import br.com.darisson.noticias.R;
import br.com.darisson.noticias.adapter.ScreenSlidePagerAdapter;
import br.com.darisson.noticias.event.NoticiaClickEvent;
import br.com.darisson.noticias.event.RequestFailedEvent;

@EActivity(R.layout.activity_main)
public class MainActivity extends BaseNoticiaActivity {

    @ViewById(R.id.tabs)
    TabLayout tabLayout;

    @ViewById(R.id.scroll_View)
    ViewPager viewPager;

    @AfterViews
    protected void afterViews() {
        ScreenSlidePagerAdapter adapter = new ScreenSlidePagerAdapter(this.getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Subscribe
    public void onEvent(NoticiaClickEvent event){
        DetalhesNoticiaActivity_.intent(this).idNoticia(event.getId()).start();
    }

    @Subscribe
    public void onEvent(RequestFailedEvent event) {
        if (event.getMessage() != null) {
            Snackbar.make(tabLayout, event.getMessage(), Snackbar.LENGTH_SHORT).show();
        }
    }

}
