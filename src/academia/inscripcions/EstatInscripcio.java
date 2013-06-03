package academia.inscripcions;

import academia.Inscripcio;
import academia.Persona;
import academia.Projecte;
import academia.excepcions.InscripcioNoOient;

/**
 *
 * @author hector
 */
abstract public class EstatInscripcio
{
    private Inscripcio inscripcio;
    
    public EstatInscripcio(Inscripcio inscripcio)
    {
        this.inscripcio = inscripcio;
    }
    
    public void ferOficial(Inscripcio i, Persona persona, Projecte nouProj) throws InscripcioNoOient
    {
        throw new InscripcioNoOient();
    }
}
