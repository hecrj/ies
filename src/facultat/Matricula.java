package facultat;

import java.util.Date;

/**
 *
 * @author hector
 */
public class Matricula
{
    private Date data;
    private Quadrimestre q;
    private Assignatura a;
    
    public Matricula(Quadrimestre q, Assignatura a, Date data)
    {
        this.q = q;
        this.a = a;
        this.data = data;
    }
    
    public boolean teQuadrimestre(Quadrimestre quadrimestre)
    {
        return q.equals(quadrimestre);
    }
    
    public boolean teAssignatura(Assignatura assignatura)
    {
        return a.equals(assignatura);
    }
    
    public int getCredits()
    {
        return a.getCredits();
    }
}
