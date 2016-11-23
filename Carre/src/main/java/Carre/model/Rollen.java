package Carre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Evert
 */
@Entity (name = "Rollen")
public class Rollen {
    @Id
    @GeneratedValue
    @Column(name = "ROL_ID")
    int rolID;
    @Column(name = "ROLOMSCHRIJVING")
    String rolOmschrijving;

    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    public String getRolOmschrijving() {
        return rolOmschrijving;
    }

    public void setRolOmschrijving(String rolOmschrijving) {
        this.rolOmschrijving = rolOmschrijving;
    }

    @Override
    public String toString() {
        return "Rollen{" + "rolID=" + rolID + ", rolOmschrijving=" + rolOmschrijving + '}';
    }
    
    

}
