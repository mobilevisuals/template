package pac;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful(name = "ProducBeanEJB")
public class ProducBeanBean implements ProducBeanBeanLocal{

    @PersistenceContext(unitName = "ManyToManyEJB-ejbPU")
    private EntityManager em;

    public ProducBeanBean() {
    }

    @Override
    public void fillDB() {
        int i = 0;
        i++;


    }
}
