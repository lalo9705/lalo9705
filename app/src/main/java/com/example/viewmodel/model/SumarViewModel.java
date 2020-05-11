package com.example.viewmodel.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.viewmodel.util.Sumar;

public class SumarViewModel extends ViewModel {
    private int suma;

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
}
