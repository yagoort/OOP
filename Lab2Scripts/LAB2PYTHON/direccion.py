class Direccion:
    def __init__(self):
        self._calle = ""
        self._nomenclatura = ""
        self._barrio = ""
        self._ciudad = ""
        self._edificio = ""
        self._apto = ""

    def set_calle(self, calle):
        self._calle = calle

    def set_nomenclatura(self, nomenclatura):
        self._nomenclatura = nomenclatura

    def set_barrio(self, barrio):
        self._barrio = barrio

    def set_ciudad(self, ciudad):
        self._ciudad = ciudad

    def set_edificio(self, edificio):
        self._edificio = edificio

    def set_apto(self, apto):
        self._apto = apto

    def get_calle(self):
        return self._calle

    def get_nomenclatura(self):
        return self._nomenclatura

    def get_barrio(self):
        return self._barrio

    def get_ciudad(self):
        return self._ciudad

    def get_edificio(self):
        return self._edificio

    def get_apto(self):
        return self._apto

    def __str__(self):
        return f"{self._calle} {self._nomenclatura}, {self._barrio}, {self._ciudad}, Edificio {self._edificio}, Apto {self._apto}"
