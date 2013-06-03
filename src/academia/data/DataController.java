package academia.data;

import academia.Inscripcio;
import academia.Projecte;
import academia.excepcions.NoExisteixInscripcio;
import academia.excepcions.NoExisteixProjecte;

/**
 *
 * @author hector
 */
public interface DataController
{
    public Projecte getProjecte(String codiProjecte) throws NoExisteixProjecte;
    public Inscripcio getInscripcio(String dniP, String nomCurs) throws NoExisteixInscripcio;
}
