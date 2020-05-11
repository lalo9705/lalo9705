package com.example.viewmodel.iu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.viewmodel.R;
import com.example.viewmodel.databinding.ActivityDataBindignBinding;
import com.example.viewmodel.databinding.ActivityDataBindingLiveDataBinding;
import com.example.viewmodel.model.DBLVDViewModel;
import com.example.viewmodel.util.User;

public class DataBindingLiveDataActivity extends AppCompatActivity {
    private DBLVDViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(com.example.viewmodel.R.layout.activity_data_binding_live_data);
        ActivityDataBindingLiveDataBinding binding=  DataBindingUtil.setContentView(this,R.layout.activity_data_binding_live_data);
        binding.setLifecycleOwner(this);
        viewModel= ViewModelProviders.of(this).get(DBLVDViewModel.class);
        binding.setViewModel(viewModel);

        User user=new User("Eduardo","22");
        viewModel.setUser(user);
    }
}
