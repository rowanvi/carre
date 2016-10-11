
package Carre.DAO;

import java.util.List;

/**
 *
 * @author Evert
 */

public interface BaseDao {
    public void persist(Object obj);
    
    public <T> List<T> getALL(Class<T> clazz);
}
