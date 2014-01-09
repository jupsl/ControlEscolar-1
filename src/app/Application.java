package app;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.enumeraciones.OpcionMenu;

/**
 *
 * @author luis-Imac
 */
public class Application {

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
        opcionSubMenuCrud(op);
        switch (op) {
            case ALUMNOS:
                while (!salir) {
                    Integer read = Integer.parseInt(sc.nextLine());
                    switch (read) {
                        case 1:
                            System.out.println("-----> Alta de Alumno");
                            System.out.println("Ingrese Nombre----->");
                            break;
                        default:
                            throw new AssertionError();
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
