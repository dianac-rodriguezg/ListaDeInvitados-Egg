import java.util.*;

public class RegistroDeInvitados {
    private static HashSet<String> invitados = new HashSet<>();

    public static boolean agregarInvitado(String nombre) {
        return invitados.add(nombre.toLowerCase());
    }

    public static boolean eliminarInvitado(String nombre) {
        return invitados.remove(nombre.toLowerCase());
    }

    public static void mostrarInvitados() {
        System.out.println(invitados);
    }
}
