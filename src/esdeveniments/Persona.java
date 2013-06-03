package esdeveniments;

import ies.utils.Tuple;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author hector
 */
public class Persona
{
    private String nom;
    private List<Inscripcio> inscripcions;
    
    public Tuple<Set<String>, Float> getPuntsAssistencia()
    {
        Tuple<Set<String>, Float> punts = new Tuple(new TreeSet(), 0);
        
        for(Inscripcio inscripcio : inscripcions)
        {
            if(inscripcio.esCancelada())
                punts.first.add(inscripcio.getNomOrganitzadorEsdeveniment());
            
            punts.second += inscripcio.getPuntuacio();
        }
        
        return punts;
    }
}
