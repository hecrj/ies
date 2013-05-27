package facultat.data;

import facultat.Alumne;
import facultat.Assignatura;
import facultat.Quadrimestre;
import facultat.excepcions.NoExisteixAlumne;
import facultat.excepcions.NoExisteixAssignatura;
import facultat.excepcions.NoExisteixQuadrimestre;

/**
 *
 * @author hector
 */
public interface DataController
{
    public boolean existeixMatricula(String dni, int codiAssignaruta, int numeroQuadrimestre);
    
    public Quadrimestre obtenirQuadrimestre(int numeroQuadrimestre)
            throws NoExisteixQuadrimestre;
    
    public Assignatura obtenirAssignatura(int codiAssignatura)
            throws NoExisteixAssignatura;
    
    public Alumne obtenirAlumne(String dni)
            throws NoExisteixAlumne;
}
