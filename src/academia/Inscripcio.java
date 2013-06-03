package academia;

import academia.excepcions.CursPle;
import academia.excepcions.InscripcioNoOient;
import academia.excepcions.OficialNoEnginyer;
import academia.excepcions.OficialOient;
import academia.inscripcions.EstatInscripcio;
import java.util.Date;

/**
 *
 * @author hector
 */
public class Inscripcio
{
    private Date data;
    private int preu;
    
    private Curs curs;
    private Persona persona;
    private EstatInscripcio estat;
    
    public void ferOficial(Projecte projecte)
            throws CursPle, OficialOient, OficialNoEnginyer, InscripcioNoOient
    {
        if(!persona.estaQualificada(projecte))
            throw new OficialNoEnginyer();
        
        estat.ferOficial(this, persona, projecte);
        
        // We check this here because a Person can be Listener of the Project that is going to lead.
        // If this returns true it means that the Person is Leader and Listener of the Project, which is
        // not possible.
        if(persona.esParticipant(projecte))
            throw new OficialOient();
        
        curs.incrementarOficials();
    }
    
    public void modificarEstat(EstatInscripcio estat)
    {
        this.estat = estat;
    }
}
