package br.com.opet.tds.roomproject_modelo1.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by Diego on 24/09/2018.
 */
@Entity(tableName = "filme_table")
public class Filme {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    private String titulo;
    private String autor;
    private String genero;
    private int paginas;
    private String status;
    private boolean favorito;

    public Filme() {
    }

    public Filme(long id, String titulo, String autor, String genero, int paginas, String status, boolean favorito) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
        this.status = status;
        this.favorito = favorito;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public boolean getFavorito() { return favorito; }

    public void setFavorito(boolean favorito) { this.favorito = favorito; }

}
