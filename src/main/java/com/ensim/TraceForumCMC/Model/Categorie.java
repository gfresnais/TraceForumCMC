package com.ensim.TraceForumCMC.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categorie {

    @Id
    private String iDCat;
    private String titre;

    public String getIDCat() {
        return iDCat;
    }

    public void setIDCat(String iDCat) {
        this.iDCat = iDCat;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
