package br.com.darisson.noticias.event;

public class NoticiaClickEvent {

    private int id;

    public NoticiaClickEvent(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
