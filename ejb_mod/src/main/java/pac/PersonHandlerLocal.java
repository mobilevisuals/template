package pac;

import javax.ejb.Local;

@Local
public interface PersonHandlerLocal {

    void fillDB();
}
