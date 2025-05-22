from usuario import Usuario

class Agenda:
    def __init__(self, capacity):
        self._registro = [None] * capacity
        self._no_reg = 0

    def agregar(self, usuario):
        if self.buscar(usuario.get_id()) != -1 or self._no_reg >= len(self._registro):
            return False
        self._registro[self._no_reg] = usuario
        self._no_reg += 1
        return True

    def buscar(self, id):
        for i in range(self._no_reg):
            if self._registro[i].get_id() == id:
                return i
        return -1

    def eliminar(self, id):
        pos = self.buscar(id)
        if pos == -1:
            return False
        for i in range(pos, self._no_reg - 1):
            self._registro[i] = self._registro[i + 1]
        self._registro[self._no_reg - 1] = None
        self._no_reg -= 1
        return True

    def mostrar(self):
        for i in range(self._no_reg):
            print(f"Nombre: {self._registro[i].get_nombre()}, ID: {self._registro[i].get_id()}")

    def mostrar_usuario(self, id):
        pos = self.buscar(id)
        if pos != -1:
            self._registro[pos].mostrar_informacion()
        else:
            print("Usuario no encontrado.")
