package academia.inscripcions;

import academia.Inscripcio;
import academia.Persona;
import academia.Projecte;
import academia.excepcions.InscripcioNoOient;
import academia.excepcions.MassaOficialsCurs;
import academia.excepcions.MassaOficialsProjecte;
import academia.excepcions.OficialOient;
import academia.excepcions.PocsOients;

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
    
    public void ferOficial(Inscripcio i, Persona persona, Projecte nouProj)
            throws InscripcioNoOient, PocsOients, OficialOient, MassaOficialsCurs, MassaOficialsProjecte
    {
        throw new InscripcioNoOient();
    }
    
    public boolean tePersona(Persona persona)
    {
        return inscripcio.tePersona(persona);
    }
}
