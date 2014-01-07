package modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelos.enumeraciones.FormaPago;
import modelos.enumeraciones.GradoAcademico;

/**
 *
 * @author Andrei Helo Guereca
 */
public class Maestro extends Persona{
    
    private Integer numeroEmpleado;
    private Double salarioMensual;
    private GradoAcademico grado;
    private FormaPago formaPago;
    
    private List<Curso> cursos;

    public Maestro(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Double salarioMensual, GradoAcademico grado, FormaPago formaPago) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento);
        this.salarioMensual = salarioMensual;
        this.grado = grado;
        this.formaPago = formaPago;
        this.cursos = new ArrayList<>();
    }
    
    

    /**
     * @return the numeroEmpleado
     */
    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * @param numeroEmpleado the numeroEmpleado to set
     */
    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    /**
     * @return the salarioMensual
     */
    public Double getSalarioMensual() {
        return salarioMensual;
    }

    /**
     * @param salarioMensual the salarioMensual to set
     */
    public void setSalarioMensual(Double salarioMensual) {
        this.salarioMensual = salarioMensual;
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
     * @return the formaPago
     */
    public FormaPago getFormaPago() {
        return formaPago;
    }

    /**
     * @param formaPago the formaPago to set
     */
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
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
    
    @Override
    public String toString() {
        return String.format("%s %s",this.numeroEmpleado, super.toString());
    }
    
}
