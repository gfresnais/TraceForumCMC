package com.ensim.TraceForumCMC.Controller;

import com.ensim.TraceForumCMC.Model.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    ActiviteRepository activiteRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    TransitionRepository transitionRepository;
    @Autowired
    TypeuRepository typeuRepository;
    @Autowired
    UserfilesRepository userfilesRepository;
    @Autowired
    UsertoolParamRepository usertoolParamRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/etudiants")
    public String etudiants(Model model) {
        model.addAttribute("allUsers", transitionRepository.getUtilisateurTitreAttribut());
        return "etudiants";
    }

    @GetMapping("/activite")
    public String activite(Model model) {
        model.addAttribute("allActivite", activiteRepository.findAll());
        return "activite";
    }

    @GetMapping("/categorie")
    public String categorie(Model model) {
        model.addAttribute("allCategorie", categorieRepository.findAll());
        return "categorie";
    }

    @GetMapping("/transition")
    public String transition(Model model) {
        model.addAttribute("allTransition", transitionRepository.findAll());
        return "transition";
    }

    @GetMapping("/typeu")
    public String typeu(Model model) {
        model.addAttribute("allTypeu", typeuRepository.findAll());
        return "typeu";
    }

    @GetMapping("/userfiles")
    public String userfiles(Model model) {
        model.addAttribute("allUserfiles", userfilesRepository.findAll());
        return "userfiles";
    }

    @GetMapping("/usertoolparam")
    public String usertoolparam(Model model) {
        model.addAttribute("allUsertoolparam", usertoolParamRepository.findAll());
        return "usertoolparam";
    }
}
