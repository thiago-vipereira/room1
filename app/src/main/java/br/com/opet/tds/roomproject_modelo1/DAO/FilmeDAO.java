package br.com.opet.tds.roomproject_modelo1.DAO;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import br.com.opet.tds.roomproject_modelo1.model.Filme;

/**
 * Created by Diego on 24/09/2018.
 */

@Dao
public interface FilmeDAO {

    @Insert
    void insert(Filme filme);

    @Query("DELETE FROM filme_table where filme_table.ID == :id")
    void delete(long id);

    @Query("SELECT * from filme_table")
    List<Filme> loadFilmes();
}
