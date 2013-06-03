package academia;

import academia.excepcions.MassaOficials;
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
    
    public void eliminarOient(Oient oient, Persona persona) throws PocsOients
    {
        if(oients.size() <= 3)
            throw new PocsOients();
        
        oients.remove(oient);
        
        if(!esOient(persona))
            eliminarParticipant(persona);
    }
    
    public void afegirOficial(Oficial oficial) throws MassaOficials
    {
        if(oficials.size() >= 3)
            throw new MassaOficials();
        
        oficials.add(oficial);
    }
    
    public void eliminarParticipant(Persona persona)
    {
        persona.eliminarProjecte(this);
        participants.remove(persona);
    }
}
