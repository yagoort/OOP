import java.util.Scanner;

public class MainSecundario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos usuarios desea poder almacenar? ");
        int capacidad = sc.nextInt();
        sc.nextLine(); // Limpiar buffer (Truquito de la monitora :v)

        Agenda agenda = new Agenda(capacidad);

        while (true) {
            System.out.println("\n=== Menú ===");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Mostrar todos los usuarios");
            System.out.println("3. Mostrar un usuario por ID");
            System.out.println("4. Eliminar un usuario por ID");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    if (agenda.getNoReg() >= capacidad) {
                        System.out.println("La agenda está llena. No se pueden agregar más usuarios.");
                        break;
                    }
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el ID del usuario: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer

                    Usuario nuevoUsuario = new Usuario(nombre, id);
                    if (agenda.agregar(nuevoUsuario)) {
                        System.out.println("Usuario agregado exitosamente.");
                    } else {
                        System.out.println("No se pudo agregar: el ID ya existe o la agenda está llena.");
                    }
                    break;

                case "2":
                    agenda.mostrar();
                    break;

                case "3":
                    System.out.print("Ingrese el ID del usuario a mostrar: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    agenda.mostrarUsuario(idBuscar);
                    break;

                case "4":
                    System.out.print("Ingrese el ID del usuario a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    if (agenda.eliminar(idEliminar)) {
                        System.out.println("Usuario eliminado correctamente.");
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case "5":
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
