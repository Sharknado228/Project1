package com.chernyha.controllers;

import com.chernyha.Profile;
import com.chernyha.Table;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Ігор on 26.07.2017.
 */
@Controller
public class IndexController {
    Table table = new Table();
    Profile profile = new Profile("","",-1,"","");
    @RequestMapping("/home")
    public String index(Model model) {
        model.addAttribute("name", profile.getName());
        model.addAttribute("surname", profile.getSurname());
        if(profile.getPhone()!=-1) {
            model.addAttribute("phone", profile.getPhone());
        }
        model.addAttribute("email", profile.getEmail());
        model.addAttribute("skype", profile.getSkype());
        return "index";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String createProfile(@RequestParam("name") String name, @RequestParam("surname") String surname, @RequestParam("phone") int phone, @RequestParam("email") String email, @RequestParam("skype") String skype) {
       table.setNewProfile(name, surname, phone, email, skype);
        return "redirect:home";
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String findProfile(@RequestParam("phone") String phone) {
        profile = table.getProfileByPhone(Integer.parseInt(phone));
        return "redirect:home";
    }
}
