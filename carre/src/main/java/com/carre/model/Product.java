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
@Table(name = "PRODUCTEN")
public class Product implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productid;

    private String productnaam;

    private Double prijs;

    private String omschrijving;

    private String image;

    private int voorraad;

    private int categorieid;

    private int status;

    public int getId() {
        return productid;
    }

    public void setId(int id) {
        this.productid = id;
    }

    public String getProductnaam() {
        return productnaam;
    }

    public void setProductnaam(String productnaam) {
        this.productnaam = productnaam;
    }
    

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getVoorraad() {
        return voorraad;
    }

    public void setVoorraad(int voorraad) {
        this.voorraad = voorraad;
    }

    public int getCategorieid() {
        return categorieid;
    }

    public void setCategorieid(int categorieid) {
        this.categorieid = categorieid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + productid + ", productName=" + productnaam + ", prijs=" + prijs + ", omschrijving=" + omschrijving + ", image=" + image + ", voorraad=" + voorraad + ", categorieId=" + categorieid + ", status=" + status + '}';
    }

}