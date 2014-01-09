package app;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Alumno;
import modelos.enumeraciones.OpcionMenu;

/**
 *
 * @author luis-Imac
 */
public class Application {
    
    private HashMap<Integer, Alumno> alumnos;

    public Application() {
        alumnos = new HashMap<>();
    }
    
    

    
    public static void main(String[] args) {
        try {
            Application app = new Application();
            app.run();
        } catch (IOException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }

    public void run() throws IOException {
        Boolean salir = Boolean.FALSE;
        Scanner sc = new Scanner(System.in);
        while (!salir) {
            System.out.println(new Menu().getMenu());
            Integer read = Integer.parseInt(sc.nextLine());
            salir = getOpcion(OpcionMenu.valorDe(read));
        }
    }

    public Boolean getOpcion(OpcionMenu op) throws IOException {
        //Runtime.getRuntime().exec("clear");
        Boolean salir = Boolean.FALSE;
        Scanner sc = new Scanner(System.in);
        
        switch (op) {
            case ALUMNOS:
                while (!salir) {
                    opcionSubMenuCrud(op);
                    Integer read = Integer.parseInt(sc.nextLine());
                    switch (read) {
                        case 1:
                            System.out.println("-----> Alta de Alumno");
                            System.out.println("Ingrese Nombre----->");
                            String nombre = sc.nextLine();
                            
                            System.out.println("Ingrese Primer Apellido----->");
                            String primerApellido = sc.nextLine();
                            
                            System.out.println("Ingrese Segundo Apellido----->");
                            String segundoApellido = sc.nextLine();
                            
                            System.out.println("Ingrese Fecha Nacimiento (AAAA-MM-DD).----->");
                            String fechaNac = sc.nextLine();

                            Alumno alumno = new Alumno(nombre, primerApellido, segundoApellido, Date.valueOf(fechaNac));
                            alumno.setMatricula(Alumno.getMatricula(alumnos));
                            alumnos.put(alumno.getMatricula(), alumno);
                            System.out.println("Alumno Agregado Correctamente!");
                            break;
                        case 2:
                            System.out.println("-----> Eliminar Alumno");
                            System.out.println("Ingrese La matricula ----->");
                            String matricula = sc.nextLine();
                            Alumno alumnoBorrar = alumnos.get(Integer.parseInt(matricula));
                            if(alumnoBorrar != null){
                               System.out.println(String.format("¿Estas seguro de Eliminar a %s? (Y,N)", alumnoBorrar));
                               Boolean respuesta = sc.nextLine().equals("Y");
                               if(respuesta) alumnos.remove(Integer.parseInt(matricula));
                               
                                System.out.println(respuesta? "Alumno Removido" : "Alumno no Eliminado");
                               
                                
                            }else{
                                System.out.println("Alumno no Existente o no Registrado.");
                            }
                            break;
                        case 4:
                            System.out.println("-----> Lista de Alumnos");
                            Iterator iterador = alumnos.entrySet().iterator();
                            while(iterador.hasNext()){
                                Map.Entry e = (Map.Entry)iterador.next();
                                Alumno alumnoElement = (Alumno)  e.getValue();
                                System.out.println(alumnoElement.toString());
                            }
                            break;
                            
                    }
                    salir = read == 5;
                }

                break;

            case CICLOS_ESCOLARES:

                while (!salir) {
                    Integer read = Integer.parseInt(sc.nextLine());
                    salir = read == 4;
                }

                break;

            case CURSOS:

                while (!salir) {
                    Integer read = Integer.parseInt(sc.nextLine());
                    salir = read == 4;
                }

                break;

            case INSCRIPCIONES:
                while (!salir) {
                    Integer read = Integer.parseInt(sc.nextLine());
                    salir = read == 4;
                }

                break;

            case MAESTROS:
                while (!salir) {
                    Integer read = Integer.parseInt(sc.nextLine());
                    salir = read == 4;
                }

                break;

            case MATERIAS:

                while (!salir) {
                    Integer read = Integer.parseInt(sc.nextLine());
                    salir = read == 4;
                }

                break;

            case SALIR:
                break;

            default:
                throw new AssertionError();
        }

        return op.equals(OpcionMenu.SALIR);

    }

    private void opcionSubMenuCrud(OpcionMenu op) {
        System.out.println(String.format("==== %s ====\n1) Alta\n2) Eliminar \n3) Editar \n4) Listar\n5) Regresar", op));
    }

    private class Menu {

        public Menu() {
        }

        public String getMenu() {
            String menu = "==== Control Escolar ==== \n";
            List<OpcionMenu> opciones = Arrays.asList(OpcionMenu.values());
            for (OpcionMenu opcionMenu : opciones) {
                menu += String.format("%s\n", opcionMenu.getDescripcion());
            }
            return menu;
        }

    }

}
