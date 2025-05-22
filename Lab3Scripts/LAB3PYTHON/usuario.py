class Usuario:
    def __init__(self, nombre, id):
        self._nombre = nombre
        self._id = id

    def get_id(self):
        return self._id

    def get_nombre(self):
        return self._nombre

    def mostrar_informacion(self):
        print(f"Nombre: {self._nombre}, ID: {self._id}")
