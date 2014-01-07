package modelos.enumeraciones;

/**
 *
 * @author Luis Antonio Ramirez Martinez
 */
public enum FormaPago {
    
    SEMANAL(1,"Semanal",7),
    QUINCENAL(2,"Quincenal",15),
    MENSUAL(3,"Mensual",30);
    
    private Integer clave;
    private String descripcion;
    private Integer diasLaborados;

    private FormaPago() {
        
    }

    private FormaPago(Integer clave, String descripcion, Integer diasLaborados) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.diasLaborados = diasLaborados;
    }

    

    /**
     * @return the clave
     */
    public Integer getClave() {
        return clave;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the diasLaborados
     */
    public Integer getDiasLaborados() {
        return diasLaborados;
    }
    
    
}
