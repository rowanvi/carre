package com.carre.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 *
 * @author Evert
 *
 */
@Entity
@Table(name = "WINKELWAGEN")
public class Winkelwagen {

    @Id
    @Column(name = "winkelwagenid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int winkelwagenid;

    private String date;

    private int voorstellingid;

    private String voornaam;

    private String achternaam;

    private String email;

    private String sessieid;
    
    private int status;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
   
    public int getWinkelwagenid() {
        return winkelwagenid;
    }

    public void setWinkelwagenid(int winkelwagenid) {
        this.winkelwagenid = winkelwagenid;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getEmail() {
        return email;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public int getVoorstellingid() {
        return voorstellingid;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVoorstellingid(int voorstellingid) {
        this.voorstellingid = voorstellingid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSessieid() {
        return sessieid;
    }

    public void setSessieid(String sessieid) {
        this.sessieid = sessieid;
    }

}
