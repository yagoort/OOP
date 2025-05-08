import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos para Fecha de nacimiento
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Día: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        Fecha fechaNacimiento = new Fecha(dia, mes, anio);
        scanner.nextLine(); // limpiar buffer

        // Solicitar datos para Dirección
        Direccion direccion = new Direccion();
        System.out.println("\nIngrese su dirección:");
        System.out.print("Calle: ");
        direccion.setCalle(scanner.nextLine());
        System.out.print("Nomenclatura: ");
        direccion.setNomenclatura(scanner.nextLine());
        System.out.print("Barrio: ");
        direccion.setBarrio(scanner.nextLine());
        System.out.print("Ciudad: ");
        direccion.setCiudad(scanner.nextLine());
        System.out.print("Edificio: ");
        direccion.setEdificio(scanner.nextLine());
        System.out.print("Apartamento: ");
        direccion.setApto(scanner.nextLine());

        // Solicitar datos para Usuario
        Usuario usuario = new Usuario();
        System.out.println("\nIngrese su información personal:");
        System.out.print("Nombre: ");
        usuario.setNombre(scanner.nextLine());
        System.out.print("ID: ");
        usuario.setId(scanner.nextLong());
        scanner.nextLine(); // limpiar buffer
        usuario.setFecha_nacimiento(fechaNacimiento);
        System.out.print("Ciudad de nacimiento: ");
        usuario.setCiudad_nacimiento(scanner.nextLine());
        System.out.print("Teléfono: ");
        usuario.setTel(scanner.nextLong());
        scanner.nextLine(); // limpiar buffer
        System.out.print("Email: ");
        usuario.setEmail(scanner.nextLine());
        usuario.setDir(direccion);

        // Mostrar datos
        System.out.println("\n===== INFORMACIÓN REGISTRADA =====");
        System.out.println(usuario);
    }
}
