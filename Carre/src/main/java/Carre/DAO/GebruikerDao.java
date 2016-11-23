
package Carre.DAO;

import java.util.List;
import Carre.model.Gebruiker;

/**
 *
 * @author Evert
 */

public interface GebruikerDao {
    public void persist(Gebruiker obj);
    
    public Gebruiker getALL();
}
