class Fecha:
    def __init__(self, dd=1, mm=1, aa=2000):
        self._dd = dd
        self._mm = mm
        self._aa = aa

    def set_dia(self, dd):
        self._dd = dd

    def set_mes(self, mm):
        self._mm = mm

    def set_a(self, aa):
        self._aa = aa

    def get_dia(self):
        return self._dd

    def get_mes(self):
        return self._mm

    def get_a(self):
        return self._aa

    def __str__(self):
        return f"{self._dd:02d} - {self._mm:02d} - {self._aa}"
