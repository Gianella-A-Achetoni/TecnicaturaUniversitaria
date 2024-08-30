
from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalle(Objeto):
    #print(Objeto)
    print(type(Objeto))
    print(Objeto.mostrar_detalle())
    if isinstance(Objeto, Gerente):
        print(Objeto.departamento)
    
empleado = Empleado("Ariel", 5000)
imprimir_detalle(empleado)

gerente = Gerente("Natalia", 8000, "Sistemas")
imprimir_detalle(gerente)