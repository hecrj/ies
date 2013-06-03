package esdeveniments.inscripcions;

import esdeveniments.Inscripcio;
import esdeveniments.excepcions.InscripcioNoPrevista;

/**
 *
 * @author hector
 */
abstract public class EstatInscripcio
{
    private Inscripcio inscripcio;
    
    abstract public float getPuntuacio();
    
    public EstatInscripcio(Inscripcio inscripcio)
    {
        this.inscripcio = inscripcio;
    }
    
    public boolean esCancelada()
    {
        return false;
    }
    
    public void confirmarAssistencia(Inscripcio inscripcio, boolean acompanyada) throws InscripcioNoPrevista
    {
        throw new InscripcioNoPrevista();
    }
}
