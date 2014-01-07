package modelos;

import java.util.Date;
import modelos.enumeraciones.GradoAcademico;

/**
 *
 * @author Luis Antonio Ramirez Martinez
 */
public class Alumno extends Persona {

    private Integer matricula;
    private GradoAcademico grado;

    public Alumno(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento);
        this.grado = GradoAcademico.PRIMARIA;
    }

    public Alumno(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer matricula, GradoAcademico grado) {
        this(nombre, primerApellido, segundoApellido, fechaNacimiento);
        this.matricula = matricula;
        this.grado = grado;
    }

    /**
     * @return the matricula
     */
    public Integer getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
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

    @Override
    public String toString() {
        return String.format("%s %s", this.matricula, super.toString());
    }
    
    

}
