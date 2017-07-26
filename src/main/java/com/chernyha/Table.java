package com.chernyha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ігор on 26.07.2017.
 */
public class Table {
    public Table(){}

    private int id = 0;
    private List<Profile> profiles = new ArrayList<Profile>();

    public Profile getProfileById(int id) {
        return profiles.get(id);
    }

    public Profile getProfileByPhone(int phone) {
        for (Profile profile: profiles) {
            if(phone==profile.getPhone()){
                return profile;
            }
        }
        return new Profile("","Find users: ",0,"","");
    }

    public void setNewProfile(String name, String surname, int phone, String email, String skype){
        profiles.add(id, new Profile(name, surname, phone, email, skype));
        id++;
    }


}
