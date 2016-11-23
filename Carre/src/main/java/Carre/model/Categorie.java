package Carre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Evert
 */

@Entity (name = "CATEGORIE")
public class Categorie {
@Id
@GeneratedValue
@Column(name = "CATEGORIE_ID")
int categorieID;
@Column(name = "OMSCHRIJVING")
String omschrijving;

    public int getCategorieID() {
        return categorieID;
    }

    public void setCategorieID(int categorieID) {
        this.categorieID = categorieID;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return "Categorie{" + "categorieID=" + categorieID + ", omschrijving=" + omschrijving + '}';
    }


}
