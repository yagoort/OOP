public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(5);

        Usuario u1 = new Usuario("Ana", 101);
        Usuario u2 = new Usuario("Luis", 102);
        Usuario u3 = new Usuario("Gihad", 103);
        Usuario u4 = new Usuario("Yago", 104);
        Usuario u5 = new Usuario("Posi", 105);

        agenda.agregar(u1);
        agenda.agregar(u2);
        agenda.agregar(u3);
        agenda.agregar(u4);
        agenda.agregar(u5);

        System.out.println("\nUsuarios en la agenda:");
        agenda.mostrar();

        System.out.println("\nMostrar usuario con ID 103:");
        agenda.mostrarUsuario(103);

        System.out.println("\nMostrar usuario con ID 102:");
        agenda.mostrarUsuario(102);
        
        System.out.println("\nMostrar usuario con ID 999:");
        agenda.mostrarUsuario(999);
    }
}
