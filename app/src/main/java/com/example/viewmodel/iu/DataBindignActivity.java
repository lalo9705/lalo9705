package com.example.viewmodel.iu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.example.viewmodel.R;
import com.example.viewmodel.databinding.ActivityDataBindignBinding;
import com.example.viewmodel.util.User;

public class DataBindignActivity extends AppCompatActivity {
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBindignBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_data_bindign);
        user=new User("Eduardo","22");
        binding.setUser(user);
    }
}
