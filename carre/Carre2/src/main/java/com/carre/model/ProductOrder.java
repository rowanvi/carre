package com.carre.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Evert
 *
 */
@Entity
@Table(name="PRODUCTORDER")
public class ProductOrder {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

        private int winkelwagenId;
        
        private int productId;
        
        private int aantal;
        
        private double prijs;

    public int getWinkelwagenId() {
        return winkelwagenId;
    }

    public void setWinkelwagenId(int winkelwagenId) {
        this.winkelwagenId = winkelwagenId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return "ProductOrder{" + "winkelwagenId=" + winkelwagenId + ", productId=" + productId + ", aantal=" + aantal + ", prijs=" + prijs + '}';
    }
        
        
        



}