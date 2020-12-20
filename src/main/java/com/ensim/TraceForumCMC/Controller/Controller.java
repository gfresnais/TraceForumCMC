package com.ensim.TraceForumCMC.Controller;

import com.ensim.TraceForumCMC.Model.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

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

    @GetMapping("/utilisateurs")
    public String utilisateurs(Model model) {
        model.addAttribute("allUsers", transitionRepository.getUtilisateurs());
        return "utilisateurs";
    }

    @GetMapping("/utilisateursDetails")
    public String utilisateursDetails(@RequestParam String user, Model model) {
        model.addAttribute("utilisateur", user);

        // Forums
        List<String> forums = transitionRepository.getIDForum(user);
        model.addAttribute("forums", forums);

        // Activites
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

        // Actions
        Map<String, Integer> nbActionsByForum = new HashMap<>();
        for (String forum:
                forums) {
            List<String> actions = transitionRepository.getActionsByIDForum(user, '%'+forum+'%');
            int somme = 0;
            for (String act:
                 actions) {
                int coeff = 0;

                if( act.equals("Afficher une structure") || act.equals("Afficher le fil de discussion") || act.equals("Afficher le contenu d’un message") || act.equals("Afficher une structure de cours") )
                    coeff = 1;
                if( act.equals("Répondre à un message") || act.equals("Poster un nouveau message") || act.equals("Citer un message") || act.equals("Download un fichier") )
                    coeff = 2;
                if( act.equals("Upload un fichier") )
                    coeff = 3;

                somme += coeff;
            }
            nbActionsByForum.put(forum, somme);
        }
        model.addAttribute("nbActions", nbActionsByForum.values());

        return "utilisateursDetails";
    }

    @GetMapping("/forums")
    public String forums(Model model) {
        model.addAttribute("allForums", transitionRepository.getIDForums());
        return "forums";
    }

    @GetMapping("/forumsDetails")
    public String forumsDetails(@RequestParam String forum, Model model) {
        model.addAttribute("forum", forum);

        // Utilisateurs
        List<String> utilisateurs = transitionRepository.getUtilisateursByIDForum('%'+forum+'%');
        model.addAttribute("utilisateurs", utilisateurs);

        // Actions
        Map<String, Integer> nbActionsByUtilisateur = new HashMap<>();
        for (String utilisateur:
                utilisateurs) {
            List<String> actions = transitionRepository.getActionsByIDForum(utilisateur, '%'+forum+'%');
            int somme = 0;
            for (String act:
                    actions) {
                int coeff = 0;

                if( act.equals("Afficher une structure") || act.equals("Afficher le fil de discussion") || act.equals("Afficher le contenu d’un message") || act.equals("Afficher une structure de cours") )
                    coeff = 1;
                if( act.equals("Répondre à un message") || act.equals("Poster un nouveau message") || act.equals("Citer un message") || act.equals("Download un fichier") )
                    coeff = 2;
                if( act.equals("Upload un fichier") )
                    coeff = 3;

                somme += coeff;
            }
            nbActionsByUtilisateur.put(utilisateur, somme);
        }
        model.addAttribute("nbActions", nbActionsByUtilisateur.values());
        return "forumsDetails";
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
