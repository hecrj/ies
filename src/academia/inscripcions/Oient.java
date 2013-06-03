package academia.inscripcions;

import academia.Inscripcio;
import academia.Persona;
import academia.Projecte;
import academia.excepcions.MassaOficialsProjecte;
import academia.excepcions.OficialOient;
import academia.excepcions.PocsOients;

/**
 *
 * @author hector
 */
public class Oient extends EstatInscripcio
{
    private Projecte projecte;
    
    public Oient(Inscripcio inscripcio, Projecte projecte)
    {
        super(inscripcio);
        this.projecte = projecte;
    }
    
    @Override
    public void ferOficial(Inscripcio inscripcio, Persona persona, Projecte nouProj)
            throws PocsOients, OficialOient, MassaOficialsProjecte
    {
        projecte.eliminarOient(this, persona);
        
        if(persona.esParticipant(nouProj))
            throw new OficialOient();
        
        Oficial oficial = new Oficial(inscripcio);
        oficial.setProjecte(nouProj);
        
        inscripcio.modificarEstat(oficial);
    }
}
