package com.ensim.TraceForumCMC.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transition {

    @Id
    private String iDTran;
    private String utilisateur;
    private String titre;
    private String attribut;
    private String date;
    private String heure;
    private String delai;
    @Column(name="REFTRAN")
    private String refTran;
    private String commentaire;
    private String utilisateur2;

    public String getIDTran() {
        return iDTran;
    }

    public void setIDTran(String iDTran) {
        this.iDTran = iDTran;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAttribut() {
        return attribut;
    }

    public void setAttribut(String attribut) {
        this.attribut = attribut;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getDelai() {
        return delai;
    }

    public void setDelai(String delai) {
        this.delai = delai;
    }

    public String getRefTran() {
        return refTran;
    }

    public void setRefTran(String refTran) {
        this.refTran = refTran;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getUtilisateur2() {
        return utilisateur2;
    }

    public void setUtilisateur2(String utilisateur2) {
        this.utilisateur2 = utilisateur2;
    }

}
