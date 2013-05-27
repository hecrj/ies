package facultat;

/**
 *
 * @author hector
 */
public class PlaEstudis
{
    private String nom;
    private TipusTitol estudis;
    
    public boolean esTecnic()
    {
        return estudis == TipusTitol.SUPERIOR;
    }
}
