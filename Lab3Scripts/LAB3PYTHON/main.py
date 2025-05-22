from usuario import Usuario
from agenda import Agenda


if __name__ == "__main__":
    agenda = Agenda(5)

    u1 = Usuario("Ana", 101)
    u2 = Usuario("Luis", 102)
    u3 = Usuario("Gihad", 103)
    u4 = Usuario("Yago", 104)
    u5 = Usuario("Posi", 105)

    agenda.agregar(u1)
    agenda.agregar(u2)
    agenda.agregar(u3)
    agenda.agregar(u4)
    agenda.agregar(u5)

    print("\nUsuarios en la agenda:")
    agenda.mostrar()

    print("\nMostrar usuario con ID 103:")
    agenda.mostrar_usuario(103)

    print("\nMostrar usuario con ID 105:")
    agenda.mostrar_usuario(105)

    print("\nMostrar usuario con ID 999:")
    agenda.mostrar_usuario(999)
