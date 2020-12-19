package com.ensim.TraceForumCMC.Model.Repository;

import com.ensim.TraceForumCMC.Model.Interfaces.TitreAttribut;
import com.ensim.TraceForumCMC.Model.Transition;
import com.ensim.TraceForumCMC.Model.Interfaces.UtilisateurTitreAttribut;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransitionRepository extends CrudRepository<Transition, String> {

    /*
    // Extraire l'id du forum pour chaque Utilisateur
    SELECT DISTINCT `Utilisateur`, `Attribut` FROM `transition` WHERE `Attribut` NOT LIKE '%,%' AND `Attribut` LIKE '%IDForum=%' ORDER BY `transition`.`Attribut` ASC

    // Extraire l'id du forum et l'id msg
    SELECT DISTINCT `Utilisateur`, `Attribut` FROM `transition` WHERE `Attribut` LIKE '%IDMsg=%' ORDER BY `transition`.`Attribut` ASC


    // Retrouver la correspondance entre l'upload d'un fichier et un message (obsolète)
    SELECT DISTINCT UF.IDMsg, UF.IDForum FROM `transition` AS T, `userfiles` AS UF WHERE T.Attribut LIKE CONCAT('%IDForum=',UF.IDForum)
     */

    @Query(value = "SELECT DISTINCT Utilisateur FROM transition",
            nativeQuery = true)
    List<String> getUtilisateurs();

    @Query(value = "SELECT DISTINCT Utilisateur, Titre, Attribut FROM transition WHERE Attribut NOT LIKE '%,%' AND Attribut LIKE '%IDForum=%' ORDER BY transition.Attribut ASC",
            nativeQuery = true)
    List<UtilisateurTitreAttribut> getUtilisateurTitreAttribut();

    @Query(value = "SELECT DISTINCT Titre, Attribut FROM transition WHERE Utilisateur = :utilisateur ORDER BY transition.Attribut ASC",
            nativeQuery = true)
    List<TitreAttribut> getTitreAttribut(String utilisateur);
}
