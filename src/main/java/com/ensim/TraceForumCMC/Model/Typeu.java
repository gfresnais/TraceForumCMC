package com.ensim.TraceForumCMC.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Typeu {
    @Id
    private String iDTypeU;
    private String titre;

    public String getIDTypeU() {
        return iDTypeU;
    }

    public void setIDTypeU(String iDTypeU) {
        this.iDTypeU = iDTypeU;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
