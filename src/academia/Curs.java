package academia;

import academia.excepcions.CursPle;

/**
 *
 * @author hector
 */
public class Curs
{
    private String nom;
    private String tematica;
    private int capacitat;
    private int numOficials;
    
    public void incrementarOficials() throws CursPle
    {
        if(capacitat == numOficials)
            throw new CursPle();
        
        numOficials++;
    }
}
