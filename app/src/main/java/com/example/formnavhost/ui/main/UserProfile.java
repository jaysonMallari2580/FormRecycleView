package com.example.formnavhost.ui.main;

public class UserProfile {

    private String name;
    private String email;
    private String schoolName;

    public UserProfile() {
        setName(name);
        setEmail(email);
        setSchoolName(schoolName);
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
