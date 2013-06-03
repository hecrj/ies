package academia;

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
    
    public boolean esArriscat()
    {
        return esArriscat;
    }
    
    public void eliminarParticipant(Persona persona)
    {
        participants.remove(persona);
    }
}
