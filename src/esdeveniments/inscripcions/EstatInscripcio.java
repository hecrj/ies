package esdeveniments.inscripcions;

/**
 *
 * @author hector
 */
abstract public class EstatInscripcio
{
    abstract public float getPuntuacio();
    
    public boolean esCancelada()
    {
        return false;
    }
}
