class Usuario:
    def __init__(self, nombre="", id=0):
        self._nombre = nombre
        self._id = id
        self._fecha_nacimiento = None
        self._ciudad_nacimiento = ""
        self._tel = 0
        self._email = ""
        self._dir = None

    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_id(self, id):
        self._id = id

    def set_fecha_nacimiento(self, fecha):
        self._fecha_nacimiento = fecha

    def set_ciudad_nacimiento(self, ciudad):
        self._ciudad_nacimiento = ciudad

    def set_tel(self, tel):
        self._tel = tel

    def set_email(self, email):
        self._email = email

    def set_dir(self, dir):
        self._dir = dir

    def get_nombre(self):
        return self._nombre

    def get_id(self):
        return self._id

    def get_fecha_nacimiento(self):
        return self._fecha_nacimiento

    def get_ciudad_nacimiento(self):
        return self._ciudad_nacimiento

    def get_tel(self):
        return self._tel

    def get_email(self):
        return self._email

    def get_dir(self):
        return self._dir

    def __str__(self):
        return (f"Nombre: {self._nombre}\n"
                f"ID: {self._id}\n"
                f"Fecha de Nacimiento: {self._fecha_nacimiento}\n"
                f"Ciudad de Nacimiento: {self._ciudad_nacimiento}\n"
                f"Teléfono: {self._tel}\n"
                f"Email: {self._email}\n"
                f"Dirección: {self._dir}")
