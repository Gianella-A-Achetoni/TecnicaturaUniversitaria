from Cuadrado import Cuadrado 
from Rectangulo import Rectangulo
from TercerSemestreee.Python.Leccion1.FiguraGeometrica import FiguraGeometrica

print("Cración de objeto de clase cuadrado".center(50,"_"))
cuadrado1 = Cuadrado(5, "Violeta")
cuadrado1.alto = 7
#print(cuadrado1.ancho)
#print(cuadrado1.alto)
print(f'El area del cuadrado es: {cuadrado1.calcular_area()}')

#MRO
print(Cuadrado.mro())

print(cuadrado1)

print("Cracion de objeto de clase rectangulo".center(50, "_"))
rectangulo1 = Rectangulo(5,7,"Azul")
rectangulo1.alto = 8
print(f'El area del rectangulo es: {rectangulo1.calcula_elarea()}')
#MRO
print(Rectangulo.mro())
print(rectangulo1)

#Figura1 = FiguraGeometrica().... No se instancia porque es abstracta