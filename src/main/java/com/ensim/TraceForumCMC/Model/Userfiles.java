package com.ensim.TraceForumCMC.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userfiles {

    @Id
    private String iD;
    private String user;
    private String iDForum;
    private String iDMsg;
    private String filenameo;
    private String filenamer;
    private String filetype;
    private String filesize;
    private String dateupload;
    private String timeupload;
    private String dateLa;
    private String timeLa;
    private String nbdownload;
    private String filestatus;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIDForum() {
        return iDForum;
    }

    public void setIDForum(String iDForum) {
        this.iDForum = iDForum;
    }

    public String getIDMsg() {
        return iDMsg;
    }

    public void setIDMsg(String iDMsg) {
        this.iDMsg = iDMsg;
    }

    public String getFilenameo() {
        return filenameo;
    }

    public void setFilenameo(String filenameo) {
        this.filenameo = filenameo;
    }

    public String getFilenamer() {
        return filenamer;
    }

    public void setFilenamer(String filenamer) {
        this.filenamer = filenamer;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getDateupload() {
        return dateupload;
    }

    public void setDateupload(String dateupload) {
        this.dateupload = dateupload;
    }

    public String getTimeupload() {
        return timeupload;
    }

    public void setTimeupload(String timeupload) {
        this.timeupload = timeupload;
    }

    public String getDateLa() {
        return dateLa;
    }

    public void setDateLa(String dateLa) {
        this.dateLa = dateLa;
    }

    public String getTimeLa() {
        return timeLa;
    }

    public void setTimeLa(String timeLa) {
        this.timeLa = timeLa;
    }

    public String getNbdownload() {
        return nbdownload;
    }

    public void setNbdownload(String nbdownload) {
        this.nbdownload = nbdownload;
    }

    public String getFilestatus() {
        return filestatus;
    }

    public void setFilestatus(String filestatus) {
        this.filestatus = filestatus;
    }
}
