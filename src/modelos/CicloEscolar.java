package modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Andrei Helo Guereca
 */
public class CicloEscolar {
    
    private Integer clave;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFinal;

    private List<Curso> cursos;


    public CicloEscolar(Integer clave, String descripcion, Date fechaInicio, Date fechaFinal) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cursos = new ArrayList<>();
    }

    public CicloEscolar(Integer clave, String descripcion, Date fechaInicio, Date fechaFinal, List<Curso> cursos) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
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
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFinal
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
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
