package com.example.viewmodel.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.viewmodel.util.User;

import java.util.ArrayList;
import java.util.List;

public class LiveDataViewModel extends ViewModel {
    private MutableLiveData<List<User>> userListLiveData;
    private List<User> userList;

    public LiveData<List<User>> getUserList(){
        if(userListLiveData==null){
            userListLiveData=new MutableLiveData<>();
            userList=new  ArrayList<>();
        }
        return userListLiveData;
    }

    public void addUser(User user){
        userList.add(user);
        userListLiveData.setValue(userList);

    }

}
