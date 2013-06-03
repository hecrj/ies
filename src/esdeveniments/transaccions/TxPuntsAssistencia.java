package esdeveniments.transaccions;

import esdeveniments.Persona;
import esdeveniments.data.DataController;
import esdeveniments.excepcions.PersonaNoExisteix;
import ies.utils.Tuple;
import java.util.Set;

/**
 *
 * @author hector
 */
public class TxPuntsAssistencia
{
    private DataController dades;
    private Tuple<Set<String>, Float> result;
    
    private String nomP;
    
    public void executar() throws PersonaNoExisteix
    {
        Persona persona = dades.getPersona(nomP);
        
        result = persona.getPuntsAssistencia();
    }
    
    public Tuple<Set<String>, Float> getResult()
    {
        return result;
    }
}
