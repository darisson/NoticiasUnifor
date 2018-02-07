package br.com.darisson.noticias.adapter;

import android.support.annotation.Nullable;

import br.com.darisson.noticias.view.fragment.NoticiasFragment_;

public class ScreenSlidePagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter {

    public ScreenSlidePagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return NoticiasFragment_.builder().categoria(getCategory(position)).build();
//        switch (position){
//            case 0:
//                return NoticiasFragment_.builder().categoria(Noticia.TIPO_GERAL).build();
//            case 1:
//                return NoticiasFragment_.builder().categoria(Noticia.TIPO_EVENTOS).build();
//            case 2:
//                return NoticiasFragment_.builder().categoria(Noticia.TIPO_ESPORTES).build();
//        }
//        return null;
    }

    @Nullable
    private String getCategory(int position) {
        switch (position) {
            case 0:
                return "NOTICIA";
            case 1:
                return "EVENTO";
            case 2:
                return "ESPORTIVO";
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "GERAL";
            case 1:
                return "EVENTOS";
            case 2:
                return "ESPORTES";
        }
        return null;
    }
}
