package com.example.viewmodel.iu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.viewmodel.R;
import com.example.viewmodel.model.LiveDataViewModel;
import com.example.viewmodel.util.User;

import java.util.List;

public class LiveDataActivity extends AppCompatActivity {

    private TextView tvLiveData;
    private Button btSave;
    private int numero = 0;
    private LiveDataViewModel viewModel;
    private EditText etNombre;
    private EditText etEdad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);
        setUpView();
    }

    private void setUpView(){
        etEdad=findViewById(R.id.etEdad);
        etNombre=findViewById(R.id.etNombre);

        viewModel= ViewModelProviders.of(this).get(LiveDataViewModel.class);
        tvLiveData = findViewById(R.id.tvLiveData);
        btSave = findViewById(R.id.btSave);
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.addUser(new User(etEdad.getText().toString(), etNombre.getText().toString()));
            }
        });

        final Observer<List<User>> listObserver = new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {
                String texto = "";
                for(int i=0; i<users.size(); i++){
                    texto += users.get(i).getNombre() + " " + users.get(i).getEdad() + "\n";
                }
                tvLiveData.setText(texto);
            }
        };

        viewModel.getUserList().observe(this, listObserver);
    }

}
