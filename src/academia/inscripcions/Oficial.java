package academia.inscripcions;

import academia.Inscripcio;
import academia.Projecte;
import academia.excepcions.MassaOficialsProjecte;

/**
 *
 * @author hector
 */
public class Oficial extends EstatInscripcio
{
    public Oficial(Inscripcio inscripcio)
    {
        super(inscripcio);
    }
    
    public void setProjecte(Projecte projecte) throws MassaOficialsProjecte
    {
        projecte.afegirOficial(this);
    }
}
