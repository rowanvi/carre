package com.carre.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 *
 * @author pankaj
 *
 */
@Entity
@Table(name = "CATEGORIE")
public class Categorie {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String naam;

    private int catalogusid;

    private String naam_engels;

    public void setNaam_engels(String naam_engels) {
        this.naam_engels = naam_engels;
    }

    public String getNaam_engels() {
        return naam_engels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setCatalogusid(int catalogusid) {
        this.catalogusid = catalogusid;
    }

    public int getCatalogusid() {
        return catalogusid;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", naam=" + naam + ", soort=" + '}';
    }

}
