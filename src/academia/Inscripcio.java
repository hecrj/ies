package academia;

import academia.excepcions.CursPle;
import academia.excepcions.InscripcioNoOient;
import academia.excepcions.MassaOficialsCurs;
import academia.excepcions.MassaOficialsProjecte;
import academia.excepcions.OficialNoEnginyer;
import academia.excepcions.OficialOient;
import academia.excepcions.PocsOients;
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
            throws CursPle, OficialOient, OficialNoEnginyer, InscripcioNoOient, PocsOients,
            MassaOficialsProjecte, MassaOficialsCurs
    {
        if(!persona.estaQualificada(projecte))
            throw new OficialNoEnginyer();
        
        estat.ferOficial(this, projecte);
        
        if(persona.esParticipant(projecte))
            throw new OficialOient();
        
        curs.incrementarOficials();
    }
    
    public void modificarEstat(EstatInscripcio estat)
    {
        this.estat = estat;
    }
    
    public boolean tePersona(Persona persona)
    {
        return this.persona.equals(persona);
    }
    
    public Persona getPersona()
    {
        return persona;
    }
}
