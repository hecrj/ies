package esdeveniments.inscripcions;

import esdeveniments.Inscripcio;

/**
 *
 * @author hector
 */
public class Confirmada extends EstatInscripcio
{
    public boolean acompanyat;
    
    public Confirmada(Inscripcio inscripcio, boolean acompanyat)
    {
        super(inscripcio);
        this.acompanyat = acompanyat;
    }
    
    @Override
    public float getPuntuacio()
    {
        if(acompanyat)
            return 1.5f;
        
        return 1;
    }
}
