package esdeveniments.data;

import esdeveniments.Inscripcio;
import esdeveniments.Persona;
import esdeveniments.excepcions.InscripcioNoExisteix;
import esdeveniments.excepcions.PersonaNoExisteix;

/**
 *
 * @author hector
 */
public interface DataController
{
    public Persona getPersona(String nom) throws PersonaNoExisteix;
    public Inscripcio getInscripcio(String nomE, String nomP) throws InscripcioNoExisteix;
}
