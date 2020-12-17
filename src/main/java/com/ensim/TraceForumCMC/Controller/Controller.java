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

    /*
    // Extraire l'id du forum pour chaque Utilisateur
    SELECT DISTINCT `Utilisateur`, `Attribut` FROM `transition` WHERE `Attribut` NOT LIKE '%,%' AND `Attribut` LIKE '%IDForum=%' ORDER BY `transition`.`Attribut` ASC

    // Extraire l'id du forum et l'id msg
    SELECT DISTINCT `Utilisateur`, `Attribut` FROM `transition` WHERE `Attribut`LIKE '%IDMsg=%' ORDER BY `transition`.`Attribut` ASC


    // Retrouver la correspondance entre l'upload d'un fichier et un message (obsolète)
    SELECT DISTINCT UF.IDMsg, UF.IDForum FROM `transition` AS T, `userfiles` AS UF WHERE T.Attribut LIKE CONCAT('%IDForum=',UF.IDForum)
     */

    @GetMapping("/")
    public String home() {
        return "home";
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
