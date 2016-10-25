package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Evert
 */

@Entity (name = "GEBRUIKER")
public class Gebruiker {
@Id
@GeneratedValue
@Column(name = "GEBRUIKER_ID")
int gebruikerID;
@Column(name = "NAAM")
String name;
@Column(name = "LEEFTIJD")
int leeftijd;
@Column(name = "ROL_ID")
int rolID;

    public int getGebruikerID() {
        return gebruikerID;
    }

    public void setGebruikerID(int gebruikerID) {
        this.gebruikerID = gebruikerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    @Override
    public String toString() {
        return "Gebruiker{" + "gebruikerID=" + gebruikerID + ", name=" + name + ", leeftijd=" + leeftijd + ", rolID=" + rolID + '}';
    }


}
