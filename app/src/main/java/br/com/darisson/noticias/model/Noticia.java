package br.com.darisson.noticias.model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Noticia extends RealmObject implements Serializable {

    public static final String TIPO_GERAL = "NOTICIA";
    public static final String TIPO_EVENTOS = "EVENTO";
    public static final String TIPO_ESPORTES = "ESPORTIVO";


    @PrimaryKey
    private Integer id;
    private String dataPublicacao;
    private String urlImg;
    private String titulo;
    private String corpo;
    private String resumo;
    private String tipo;
    private Integer registro;
    private Integer totalRegistro;

    public Noticia() {

    }

    public Noticia(Integer id, String dataPublicacao, String urlImg, String titulo, String corpo, String resumo, String tipo, Integer registro, Integer totalRegistro) {
        this.id = id;
        this.dataPublicacao = dataPublicacao;
        this.urlImg = urlImg;
        this.titulo = titulo;
        this.corpo = corpo;
        this.resumo = resumo;
        this.tipo = tipo;
        this.registro = registro;
        this.totalRegistro = totalRegistro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getRegistro() {
        return registro;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public Integer getTotalRegistro() {
        return totalRegistro;
    }

    public void setTotalRegistro(Integer totalRegistro) {
        this.totalRegistro = totalRegistro;
    }
}
