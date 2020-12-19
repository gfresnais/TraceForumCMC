package com.ensim.TraceForumCMC.Controller;

import com.ensim.TraceForumCMC.Model.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    /*
    Connexion : 0 point
    Afficher une structure : 1 point
    Répondre à un message : 2 points
    Afficher le fil de discussion : 1 point
    Poster un nouveau message : 2 points
    Afficher le contenu d’un message : 1 point
    Bouger la scrollbar : 0 point
    Citer un message : 2 points
    Upload un fichier : 3 points
    Download un fichier : 2 points
    Afficher une structure de cours : 1 point
     */

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/utilisateurs")
    public String etudiants(Model model) {
        model.addAttribute("allUsers", transitionRepository.getUtilisateurs());
        return "utilisateurs";
    }

    @GetMapping("/utilisateursDetails")
    public String etudiantsDetails(@RequestParam String user, Model model) {
        model.addAttribute("utilisateur", user);
        model.addAttribute("allActions", transitionRepository.getTitreAttribut(user));
        return "utilisateursDetails";
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
