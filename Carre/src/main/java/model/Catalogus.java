
package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 *
 * @author Evert
 */
@Entity(name = "CATALOGUS")
public class Catalogus {
    @Id
    @GeneratedValue
    @Column(name = "PRODUCTID")
    int productID;
    @Column(name = "OMSCHRIJVING")
    String omschrijving;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return "Catalogus{" + "productID=" + productID + ", omschrijving=" + omschrijving + '}';
    }
    
    
}
