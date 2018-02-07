package br.com.darisson.noticias.view.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import br.com.darisson.noticias.R;
import br.com.darisson.noticias.adapter.NoticiasAdapter;
import br.com.darisson.noticias.event.RequestNoticiaFinishedEvent;
import br.com.darisson.noticias.service.NoticiaService;
import br.com.darisson.noticias.utils.EndlessRecyclerOnScrollListener;

@EFragment(R.layout.noticias_fragment)
public class NoticiasFragment extends BaseFragment {

    @FragmentArg
    protected String categoria;

    @ViewById(R.id.recycler_view)
    protected RecyclerView recyclerView;

    @Bean
    protected NoticiasAdapter noticiasAdapter;

    @Bean
    protected NoticiaService noticiaService;

    @AfterViews
    public void afterViews() {
        recyclerView.setAdapter(noticiasAdapter);
        recyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener((LinearLayoutManager) recyclerView.getLayoutManager()) {
            @Override
            public void onLoadMore(int currentPage) {
                Log.d("TESTE", "onLoadMore() called with: current_page = [" + currentPage + "]");
            }
        });
        noticiasAdapter.refreshNoticias(categoria);
        noticiaService.requestNoticia(categoria, 1, 11);

    }

    @Subscribe
    public void onEvent(RequestNoticiaFinishedEvent event) {
        noticiasAdapter.refreshNoticias(categoria);
    }
}