package esdeveniments.inscripcions;

/**
 *
 * @author hector
 */
public class Cancelada extends EstatInscripcio
{
    private String motiu;
    
    @Override
    public float getPuntuacio()
    {
        if(motiu == null)
            return -2;
        
        return -1;
    }
    
    @Override
    public boolean esCancelada()
    {
        return true;
    }
}
