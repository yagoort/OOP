from usuario import Usuario
from agenda import Agenda

if __name__ == "__main__":
    capacidad = int(input("¿Cuántos usuarios desea poder almacenar? "))
    agenda = Agenda(capacidad)

    while True:
        print("\n=== Menú ===")
        print("1. Agregar usuario")
        print("2. Mostrar todos los usuarios")
        print("3. Mostrar un usuario por ID")
        print("4. Eliminar un usuario por ID")
        print("5. Salir")
        opcion = input("Seleccione una opción: ")

        if opcion == "1":
            if agenda._no_reg >= capacidad:
                print("La agenda está llena. No se pueden agregar más usuarios.")
                continue
            nombre = input("Ingrese el nombre del usuario: ")
            id = int(input("Ingrese el ID del usuario: "))
            nuevo_usuario = Usuario(nombre, id)
            if agenda.agregar(nuevo_usuario):
                print("Usuario agregado exitosamente.")
            else:
                print("No se pudo agregar: el ID ya existe o la agenda está llena.")

        elif opcion == "2":
            agenda.mostrar()

        elif opcion == "3":
            id = int(input("Ingrese el ID del usuario a mostrar: "))
            agenda.mostrar_usuario(id)

        elif opcion == "4":
            id = int(input("Ingrese el ID del usuario a eliminar: "))
            if agenda.eliminar(id):
                print("Usuario eliminado correctamente.")
            else:
                print("Usuario no encontrado.")

        elif opcion == "5":
            print("Saliendo del programa...")
            break

        else:
            print("Opción no válida. Intente de nuevo.")
