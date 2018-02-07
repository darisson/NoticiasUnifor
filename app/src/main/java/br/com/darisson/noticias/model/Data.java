package br.com.darisson.noticias.model;


import java.io.Serializable;

import io.realm.RealmList;
import io.realm.RealmObject;

public class Data extends RealmObject implements Serializable {

    private boolean success;
    private String message;
    private RealmList<Noticia> data;

    public Data() {
    }

    public Data(boolean success, String message, RealmList<Noticia> data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RealmList<Noticia> getData() {
        return data;
    }

    public void setData(RealmList<Noticia> data) {
        this.data = data;
    }
}
