package Carre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Evert
 */
@Entity (name = "Product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID")
    int productID;
    @Column(name = "NAAM")
    String naam;
    @Column(name = "PRIJS")
    double prijs;
    @Column(name = "OMSCHRIJVING")
    String omschrijving;
    @Column(name = "AFBEELDING")
    String afbeelding;
    @Column(name = "VOORRAAD")
    int voorraad;
    @Column(name = "CATEGORIE_ID")
    int categorieID;

    public Product() {

    }

    public Product(int productID, String naam, double prijs, String omschrijving, String afbeelding, int voorraad, int categorieID) {
        this.productID = productID;
        this.naam = naam;
        this.prijs = prijs;
        this.omschrijving = omschrijving;
        this.afbeelding = afbeelding;
        this.voorraad = voorraad;
        this.categorieID = categorieID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getAfbeelding() {
        return afbeelding;
    }

    public void setAfbeelding(String afbeelding) {
        this.afbeelding = afbeelding;
    }

    public int getVoorraad() {
        return voorraad;
    }

    public void setVoorraad(int voorraad) {
        this.voorraad = voorraad;
    }

    public int getCategorieID() {
        return categorieID;
    }

    public void setCategorieID(int categorieID) {
        this.categorieID = categorieID;
    }

    @Override
    public String toString() {
        return productID + naam + prijs + omschrijving + afbeelding + voorraad + categorieID;
    }

}
