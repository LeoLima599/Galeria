package br.com.projeto.galeria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.RequiresApi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TelaTexto(View view) {
        setContentView(R.layout.activity_main);
    }

    public void TelaPhotos(View view) {
        setContentView(R.layout.telafotos);
    }

    public void Telafotofull(View view) {
        setContentView(R.layout.telafotofull);
    }

}
