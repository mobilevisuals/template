package pac;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class Controller implements Serializable {
@EJB
    private PersonHandlerLocal personHandlerLocal;

    public void test()
    {
        personHandlerLocal.fillDB();}

}
