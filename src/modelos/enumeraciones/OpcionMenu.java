/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.enumeraciones;

/**
 *
 * @author luis-Imac
 */
public enum OpcionMenu {

    ALUMNOS(1, "1) Alumnos"),
    MAESTROS(2, "2) Maestros"),
    MATERIAS(3, "3) Materias"),
    CURSOS(4, "4) Cursos"),
    CICLOS_ESCOLARES(5, "5) Ciclos Escolares"),
    INSCRIPCIONES(6, "6) Inscripciones"),
    SALIR(7, "7) Salir");

    private Integer clave;
    private String descripcion;

    OpcionMenu() {
    }

    OpcionMenu(Integer clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }

    public static OpcionMenu valorDe(Integer codigo) {
        OpcionMenu result = OpcionMenu.ALUMNOS;// Default
        for (OpcionMenu ft : OpcionMenu.values()) {
            if (codigo.equals(ft.getClave())) {
                result = ft;
                break;
            }
        }
        return result;
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

    
    

}
