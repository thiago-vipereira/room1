package br.com.opet.tds.roomproject_modelo1.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;

import br.com.opet.tds.roomproject_modelo1.R;
import br.com.opet.tds.roomproject_modelo1.model.Filme;
import br.com.opet.tds.roomproject_modelo1.repository.FilmeRepository;

public class NovoFilmeActivity extends Activity {

    private EditText editTitulo,editAutor, editPaginas;
    private Spinner spinnerGenero, spinnerStatus;
    private CheckBox checkBox;
    private FilmeRepository repository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_filme);

        editTitulo = findViewById(R.id.editTitulo);
        editAutor = findViewById(R.id.editAutor);
        editPaginas = findViewById(R.id.editPaginas);
        spinnerGenero = findViewById(R.id.spinnerGenero);
        spinnerStatus = findViewById(R.id.spinnerStatus);
        checkBox = findViewById(R.id.checkBox);
        repository = new FilmeRepository(getApplicationContext());
    }

    public void salvarFilme(View view){
        Filme filme = new Filme();
        filme.setTitulo(editTitulo.getText().toString());
        filme.setAutor(editAutor.getText().toString());
        filme.setPaginas(Integer.parseInt(editPaginas.getText().toString()));
        filme.setGenero(spinnerGenero.getSelectedItem().toString());
        filme.setStatus(spinnerStatus.getSelectedItem().toString());
        filme.setFavorito(checkBox.isChecked());

        repository.insert(filme);
        callMainActivity();
    }

    private void callMainActivity() {
        Intent mainActivity = new Intent(NovoFilmeActivity.this,MainActivity.class);
        startActivity(mainActivity);
        finish();
    }
}
