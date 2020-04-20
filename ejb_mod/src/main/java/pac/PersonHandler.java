package pac;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "PersonHandlerEJB")
public class PersonHandler implements PersonHandlerLocal {

    @PersistenceContext(unitName = "ManyToManyEJB-ejbPU")
    private EntityManager em;


    public PersonHandler() {
    }

    @Override
    public void fillDB() {
        int i = 0;
        i++;

    }
}
