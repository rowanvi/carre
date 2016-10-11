package model;

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
    int productID;
    String naam;
    double prijs;
    String omschrijving;
    Image afbeelding;
    int voorraad;
    int categorieID;

    public Product() {

    }

    public Product(int productID, String naam, double prijs, String omschrijving, Image afbeelding, int voorraad, int categorieID) {
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

    public Image getAfbeelding() {
        return afbeelding;
    }

    public void setAfbeelding(Image afbeelding) {
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

}
