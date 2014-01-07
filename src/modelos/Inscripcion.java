package modelos;

/**
 *
 * @author Andrei Helo Guereca
 */
public class Inscripcion {

    private Alumno alumno;
    private Curso curso;
    private Double primeraCalificacion;
    private Double segundaCalificacion;
    private Double terceraCalificacion;



    public Inscripcion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
        this.primeraCalificacion = 0.0d;
        this.segundaCalificacion = 0.0d;
        this.terceraCalificacion = 0.0d;
    }
    
    

    /**
     * @return the alumno
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the primeraCalificacion
     */
    public Double getPrimeraCalificacion() {
        return primeraCalificacion;
    }

    /**
     * @param primeraCalificacion the primeraCalificacion to set
     */
    public void setPrimeraCalificacion(Double primeraCalificacion) {
        this.primeraCalificacion = primeraCalificacion;
    }

    /**
     * @return the segundaCalificacion
     */
    public Double getSegundaCalificacion() {
        return segundaCalificacion;
    }

    /**
     * @param segundaCalificacion the segundaCalificacion to set
     */
    public void setSegundaCalificacion(Double segundaCalificacion) {
        this.segundaCalificacion = segundaCalificacion;
    }

    /**
     * @return the terceraCalificacion
     */
    public Double getTerceraCalificacion() {
        return terceraCalificacion;
    }

    /**
     * @param terceraCalificacion the terceraCalificacion to set
     */
    public void setTerceraCalificacion(Double terceraCalificacion) {
        this.terceraCalificacion = terceraCalificacion;
    }
    
}
