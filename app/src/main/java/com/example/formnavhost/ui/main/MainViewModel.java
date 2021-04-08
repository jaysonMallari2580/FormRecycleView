package com.example.formnavhost.ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainViewModel extends ViewModel {

    private String name ;
    private String email ;
    private String schoolName ;


    ArrayList<UserProfile> usersList = new ArrayList<UserProfile>();

    public void createUser(@NonNull String name, @NonNull String email, @NonNull String schoolName){
        UserProfile userProfile = new UserProfile();
        userProfile.setName(name);
        userProfile.setEmail(email);
        userProfile.setSchoolName(schoolName);

        usersList.add(userProfile);

    }

    public ArrayList<UserProfile> getUsersList(){
        return usersList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
