package br.com.darisson.noticias.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

import br.com.darisson.noticias.R;
import br.com.darisson.noticias.model.Noticia;
import br.com.darisson.noticias.service.NoticiaService;
import br.com.darisson.noticias.view.holder.ItemViewHolder;


@EBean
public class NoticiasAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    @Bean
    protected NoticiaService noticiaService;

    private List<Noticia> noticias = new ArrayList<>();

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_noticia, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.bind(noticias.get(position), position);

    }

    @Override
    public int getItemCount() {
        return noticias.size();
    }

    public void refreshNoticias(String tipoNoticia) {
        noticias = noticiaService.getNoticias(tipoNoticia);
        notifyDataSetChanged();
    }

}
