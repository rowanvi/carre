
package Carre.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 *
 * @author Evert
 */
@Entity (name = "Order")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    int orderID;
    @Column(name = "PRODUCT_ID")
    int ProductID;
    @Column(name = "TOTAALPRIJS")
    double totaalPrijs;
    @Column(name = "GEBRUIKER_ID")
    int gebruikerID;
    @Column(name = "DATUM")
    Date datum;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public double getTotaalPrijs() {
        return totaalPrijs;
    }

    public void setTotaalPrijs(double totaalPrijs) {
        this.totaalPrijs = totaalPrijs;
    }

    public int getGebruikerID() {
        return gebruikerID;
    }

    public void setGebruikerID(int gebruikerID) {
        this.gebruikerID = gebruikerID;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Order{" + orderID + ", ProductID=" + ProductID + ", totaalPrijs=" + totaalPrijs + ", gebruikerID=" + gebruikerID + ", datum=" + datum + '}';
    }
    
    
}
