package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Curso {
    
    private Materia materia;
    private Maestro maestro;
    private CicloEscolar cicloEscolar;
    private Integer cupo;
    private Integer salon;
    
    
    private List<Inscripcion> inscritos;

    public Curso() {
    }

    public Curso(Materia materia, Maestro maestro, CicloEscolar cicloEscolar, Integer salon) {
        this.materia = materia;
        this.maestro = maestro;
        this.cicloEscolar = cicloEscolar;
        this.cupo = 40;
        this.salon = salon;
        this.inscritos = new ArrayList<>();
    }
    
    

    /**
     * @return the materia
     */
    public Materia getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    /**
     * @return the maestro
     */
    public Maestro getMaestro() {
        return maestro;
    }

    /**
     * @param maestro the maestro to set
     */
    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    /**
     * @return the cicloEscolar
     */
    public CicloEscolar getCicloEscolar() {
        return cicloEscolar;
    }

    /**
     * @param cicloEscolar the cicloEscolar to set
     */
    public void setCicloEscolar(CicloEscolar cicloEscolar) {
        this.cicloEscolar = cicloEscolar;
    }

    /**
     * @return the cupo
     */
    public Integer getCupo() {
        return cupo;
    }

    /**
     * @param cupo the cupo to set
     */
    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    /**
     * @return the salon
     */
    public Integer getSalon() {
        return salon;
    }

    /**
     * @param salon the salon to set
     */
    public void setSalon(Integer salon) {
        this.salon = salon;
    }

    /**
     * @return the inscritos
     */
    public List<Inscripcion> getInscritos() {
        return inscritos;
    }

    /**
     * @param inscritos the inscritos to set
     */
    public void setInscritos(List<Inscripcion> inscritos) {
        this.inscritos = inscritos;
    }
    
}
