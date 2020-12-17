package com.ensim.TraceForumCMC.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activite {

    @Id
    private String iDAct;
    private String titre;
    @Column(name="TYPEACT")
    private String typeAct;
    private String iDCat;

    public String getIDAct() {
        return iDAct;
    }

    public void setIDAct(String iDAct) {
        this.iDAct = iDAct;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTypeAct() {
        return typeAct;
    }

    public void setTypeAct(String typeAct) {
        this.typeAct = typeAct;
    }

    public String getIDCat() {
        return iDCat;
    }

    public void setIDCat(String iDCat) {
        this.iDCat = iDCat;
    }
}
