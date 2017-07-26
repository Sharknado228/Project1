package com.chernyha;

/**
 * Created by Ігор on 26.07.2017.
 */
public class Profile {
    public Profile(){}

    public Profile(String name,String surname,int phone,String email,String skype){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.skype = skype;
    }

    private String name;
    private String surname;
    private int phone;
    private String email;
    private String skype;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }
}
