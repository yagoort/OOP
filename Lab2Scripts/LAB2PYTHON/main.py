from fecha import Fecha
from direccion import Direccion
from usuario import Usuario

def parte_a():
    print("=== PARTE A ===")

    # Crear objeto tipo Fecha (nacimiento)
    fecha_nac = Fecha(15, 5, 2000)
    print("Fecha de nacimiento:", fecha_nac)

    # Crear objeto tipo Direccion
    direccion = Direccion()
    direccion.set_calle("Calle 45")
    direccion.set_nomenclatura("#12-34")
    direccion.set_barrio("Laureles")
    direccion.set_ciudad("Medellín")
    direccion.set_edificio("Torre Pinares")
    direccion.set_apto("302")
    print("Dirección de residencia:", direccion)

    # Crear objeto tipo Usuario
    usuario = Usuario("Santiago Ludia", 1234567890)
    usuario.set_fecha_nacimiento(fecha_nac)
    usuario.set_ciudad_nacimiento("Medellín")
    usuario.set_tel(3001234567)
    usuario.set_email("santiago@example.com")
    usuario.set_dir(direccion)

    print("Datos del Usuario:")
    print(usuario)

def parte_b():
    print("\n=== PARTE B ===")

    # Solicitar datos por consola
    nombre = input("Nombre: ")
    id_num = int(input("ID: "))
    dd = int(input("Día de nacimiento: "))
    mm = int(input("Mes de nacimiento: "))
    aa = int(input("Año de nacimiento: "))
    ciudad_nacimiento = input("Ciudad de nacimiento: ")
    tel = int(input("Teléfono: "))
    email = input("Email: ")

    print("\nDirección:")
    calle = input("Calle: ")
    nomenclatura = input("Nomenclatura: ")
    barrio = input("Barrio: ")
    ciudad = input("Ciudad: ")
    edificio = input("Edificio: ")
    apto = input("Apto: ")

    # Crear objetos
    fecha = Fecha(dd, mm, aa)

    direccion = Direccion()
    direccion.set_calle(calle)
    direccion.set_nomenclatura(nomenclatura)
    direccion.set_barrio(barrio)
    direccion.set_ciudad(ciudad)
    direccion.set_edificio(edificio)
    direccion.set_apto(apto)

    usuario = Usuario(nombre, id_num)
    usuario.set_fecha_nacimiento(fecha)
    usuario.set_ciudad_nacimiento(ciudad_nacimiento)
    usuario.set_tel(tel)
    usuario.set_email(email)
    usuario.set_dir(direccion)

    # Imprimir datos
    print("\nUsuario creado:")
    print(usuario)

# Ejecutar ambas partes
if __name__ == "__main__":
    parte_a()
    parte_b()
