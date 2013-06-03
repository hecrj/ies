package esdeveniments.data;

import esdeveniments.Persona;
import esdeveniments.excepcions.PersonaNoExisteix;

/**
 *
 * @author hector
 */
public interface DataController
{
    public Persona getPersona(String nom) throws PersonaNoExisteix;
}
