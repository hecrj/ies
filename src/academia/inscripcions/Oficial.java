package academia.inscripcions;

import academia.Inscripcio;
import academia.Projecte;

/**
 *
 * @author hector
 */
public class Oficial extends EstatInscripcio
{
    private Projecte projecte;
    
    public Oficial(Inscripcio inscripcio, Projecte projecte)
    {
        super(inscripcio);
        this.projecte = projecte;
    }
    
}
