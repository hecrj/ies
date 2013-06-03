package esdeveniments.inscripcions;

/**
 *
 * @author hector
 */
public class Confirmada extends EstatInscripcio
{
    public boolean acompanyat;
    
    @Override
    public float getPuntuacio()
    {
        if(acompanyat)
            return 1.5f;
        
        return 1;
    }
}
