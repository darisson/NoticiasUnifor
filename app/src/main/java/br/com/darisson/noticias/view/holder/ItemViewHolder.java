package br.com.darisson.noticias.view.holder;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import org.greenrobot.eventbus.EventBus;
import br.com.darisson.noticias.R;
import br.com.darisson.noticias.event.NoticiaClickEvent;
import br.com.darisson.noticias.model.Noticia;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;
    private TextView textData;

    public ItemViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image);
        textView = itemView.findViewById(R.id.info_titulo);
        textData = itemView.findViewById(R.id.info_data);
    }

    public void bind(final Noticia noticia, final int position) {
        Picasso.with(imageView.getContext()).load(noticia.getUrlImg()).into(imageView);
        textView.setText(noticia.getTitulo());
        textData.setText(noticia.getDataPublicacao());
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TITULO DA NOTICIA", noticia.getTitulo());
                EventBus.getDefault().post(new NoticiaClickEvent(noticia.getId()));

            }
        });
    }
}
