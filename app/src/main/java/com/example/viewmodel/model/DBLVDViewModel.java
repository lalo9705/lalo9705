package com.example.viewmodel.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.viewmodel.util.User;

public class DBLVDViewModel extends ViewModel {
        private MutableLiveData<User> user;
        private MutableLiveData<Boolean> visibilidad;

        public DBLVDViewModel(){
            user=new MutableLiveData<>();
            visibilidad=new MutableLiveData<>();
            visibilidad.setValue(true);
        }

        public void changeVisibility(){
            if(visibilidad.getValue()==true){
                visibilidad.setValue(false);
            }
            else{
                visibilidad.setValue(true);
            }
        }
    public LiveData<Boolean> getVisibilidad(){
            return visibilidad;
    }
    public void setVisibilidad(boolean visibilidad){
            this.visibilidad.setValue(visibilidad);
    }
    public LiveData<User> getUser() {
        return user;
    }

    public void setUser(User u) {
        this.user.setValue(u);
    }
    public void updateUser()
    {
        User user=new User("Marint","22");
        this.user.setValue(user);

    }
}
