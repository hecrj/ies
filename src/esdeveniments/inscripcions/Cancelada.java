package esdeveniments.inscripcions;

import esdeveniments.Inscripcio;

/**
 *
 * @author hector
 */
public class Cancelada extends EstatInscripcio
{
    private String motiu;
    
    public Cancelada(Inscripcio inscripcio, String motiu)
    {
        super(inscripcio);
        
        this.motiu = motiu;
    }
    
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
