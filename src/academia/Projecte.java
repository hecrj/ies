package academia;

import academia.excepcions.MassaOficialsProjecte;
import academia.excepcions.PocsOients;
import academia.inscripcions.Oficial;
import academia.inscripcions.Oient;
import java.util.List;

/**
 *
 * @author hector
 */
public class Projecte
{
    private String codiProj;
    private boolean esArriscat;
    
    private List<Persona> participants;
    private List<Oient> oients;
    private List<Oficial> oficials;
    
    public boolean esArriscat()
    {
        return esArriscat;
    }
    
    public boolean esOient(Persona persona)
    {
        for(Oient oient : oients)
            if(oient.tePersona(persona))
                return true;
        
        return false;
    }
    
    public void eliminarOient(Oient oient) throws PocsOients
    {
        if(oients.size() <= 3)
            throw new PocsOients();
        
        oients.remove(oient);
        
        Persona persona = oient.getPersona();
        
        if(!esOient(persona))
            eliminarParticipant(persona);
    }
    
    public void afegirOficial(Oficial oficial) throws MassaOficialsProjecte
    {
        if(oficials.size() >= 3)
            throw new MassaOficialsProjecte();
        
        oficials.add(oficial);
    }
    
    public void eliminarParticipant(Persona persona)
    {
        persona.eliminarProjecte(this);
        participants.remove(persona);
    }
}
