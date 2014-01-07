package modelos;

import java.util.ArrayList;
import java.util.List;
import modelos.enumeraciones.GradoAcademico;

/**
 *
 * @author Andrei Helo Guereca
 */
public class Materia {
   
    private Integer clave;
    private String descripcion;
    private GradoAcademico grado;

    private List<Curso> cursos;

    public Materia(Integer clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.grado = GradoAcademico.PRIMARIA;
        this.cursos = new ArrayList<>();
    }

    public Materia(Integer clave, String descripcion, List<Curso> cursos) {
        this(clave, descripcion);
        this.cursos = cursos;
    }
    

    public Materia(Integer clave, String descripcion, GradoAcademico grado, List<Curso> cursos) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.grado = grado;
        this.cursos = cursos;
    }
    
    

    /**
     * @return the clave
     */
    public Integer getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(Integer clave) {
        this.clave = clave;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the grado
     */
    public GradoAcademico getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(GradoAcademico grado) {
        this.grado = grado;
    }

    /**
     * @return the cursos
     */
    public List<Curso> getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
}
