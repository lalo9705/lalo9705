package com.example.viewmodel.iu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.viewmodel.R;
import com.example.viewmodel.model.SumarViewModel;
import com.example.viewmodel.util.Sumar;

public class ViewModelActivity extends AppCompatActivity {
    private TextView tvSumar;
    private TextView tvSumarViewModel;
    private Button btSumar;
    private int resultado;
    private SumarViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);
        setupView();
    }

    private void setupView(){
        viewModel= ViewModelProviders.of(this).get(SumarViewModel.class);

        tvSumar=findViewById(R.id.tvSumar);
        tvSumarViewModel=findViewById(R.id.tvSumarViewModel);
        btSumar=findViewById(R.id.btSumar);
        btSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado= Sumar.sumar(resultado);
                tvSumar.setText(" "+resultado);
                viewModel.setSuma(Sumar.sumar(viewModel.getSuma()));
                tvSumarViewModel.setText(""+viewModel.getSuma());
            }

        });
    }

}
