package esdeveniments.inscripcions;

import esdeveniments.Inscripcio;
import esdeveniments.Organitzador;

/**
 *
 * @author hector
 */
public class Prevista extends EstatInscripcio
{
    private Organitzador organitzador;
    
    public Prevista(Inscripcio inscripcio)
    {
        super(inscripcio);
    }
    
    @Override
    public float getPuntuacio()
    {
        return 0.5f;
    }
    
    @Override
    public void confirmarAssistencia(boolean acompanyada)
    {
        Confirmada confirmada = new Confirmada(inscripcio, acompanyada);
        inscripcio.modificarEstat(confirmada);
        
        organitzador.eliminarPrevista(this);
        
        // GARBAGE COLLECTOR, DESTROY ME PLEASE!
    }
}
