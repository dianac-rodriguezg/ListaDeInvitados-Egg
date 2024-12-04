import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner pepe = new Scanner(System.in);
        int opcion;
        String nombre;
        do {
            System.out.println("""
                        Menu
                        1: Agregar Invitado
                        2: Eliminar Invitado
                        3: Mostrar Invitados
                        0: Salir
                    """);
            opcion = pepe.nextInt();
            pepe.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre");
                    nombre = pepe.nextLine();
                    RegistroDeInvitados.agregarInvitado(nombre);
                    break;
                case 2:
                    System.out.println("Ingresa el nombre");
                    nombre = pepe.nextLine();
                    RegistroDeInvitados.eliminarInvitado(nombre);
                    break;
                case 3:
                    RegistroDeInvitados.mostrarInvitados();
                    break;
                case 0:
                    System.out.println("Adios :)");
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
        pepe.close();
    }
}
