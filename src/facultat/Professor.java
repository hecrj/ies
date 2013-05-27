package facultat;

/**
 *
 * @author hector
 */
public class Professor
{
    private String nom;
    private TipusTitol titol;
    
    public boolean esTecnic()
    {
        return titol == TipusTitol.SUPERIOR;
    }
}
