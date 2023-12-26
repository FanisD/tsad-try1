package gr.hua.dit.ds.demo.controller;

import gr.hua.dit.ds.demo.entity.Donor;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DonorController {

    private List<Donor> donors = new ArrayList<Donor>();

    @PostConstruct
    public void setup(){
        Donor d1 = new Donor("ee", "ee", "ee", "ee", "ee", "ee");
        Donor d2 = new Donor("e1e", "ee", "ee", "ee", "ee", "ee");
        Donor d3 = new Donor("e1e", "ee", "ee", "ee", "ee", "ee");
        donors.add(d1);
        donors.add(d2);
        donors.add(d3);
    }

    @GetMapping("")
    public String showStudents(Model model){
        model.addAttribute("donors", donors);
        return "donors";
    }

    @GetMapping("/{id}")
    public String showStudent(@PathVariable Integer id, Model model){
        Donor donor = donors.get(id);
        model.addAttribute("donors", donors);
        return "donors";
    }

    @GetMapping("/new")
    public String addDonor(Model model){
        Donor donor = new Donor();
        model.addAttribute("donors", donors);

        return "add_student";

    }

    @PostMapping("/new")
    public String saveDonor(@ModelAttribute("donor") Donor donor, Model model){
        System.out.println(donor);
        System.out.println(donors);
        donors.add(donor);
        model.addAttribute("donors", donors);
        return "donors";
    }

}
