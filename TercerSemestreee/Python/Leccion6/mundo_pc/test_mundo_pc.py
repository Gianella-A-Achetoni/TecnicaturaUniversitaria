from orden import Orden
from computadora import Computadora
from raton import Raton
from monitor import Monitor
from teclado import Teclado


teclado1 = Teclado("Noga", "USB")
monitor1 = Monitor("Lenovo", "24 pulgadas")
raton1 = Raton("Gamer","Bluetooth")
Computadora1 = Computadora("Gamer", monitor1, teclado1, raton1)

teclado2 = Teclado("Lenovo", "USB")
monitor2 = Monitor("Lenovo", "24 pulgadas")
raton2 = Raton("Lenovo","USB")
Computadora2 = Computadora("Lenovo", monitor2, teclado2, raton2)

teclado3 = Teclado("Asus", "USB")
monitor3 = Monitor("Asus", "24 pulgadas")
raton3 = Raton("Asus","Bluetooth")
Computadora3 = Computadora("Asus", monitor3, teclado3, raton3)

teclado4 = Teclado("Gamer", "Bluetooth")
monitor4 = Monitor("Gamer", "34 pulgadas")
raton4 = Raton("Gamer","Bluetooth")
Computadora4 = Computadora("Gamer", monitor4, teclado4, raton4)

teclado5 = Teclado("Samsung", "Bluetooth")
monitor5 = Monitor("Samsung", "34 pulgadas")
raton5 = Raton("Samsung","Bluetooth")
Computadora5 = Computadora("Samsung", monitor5, teclado5, raton5)

Computadora6 = Computadora("Gamer", monitor2, teclado4, raton5)
Computadora7 = Computadora("Gamer", monitor1, teclado3, raton2)

computadoras1 = [Computadora1, Computadora2, Computadora7, Computadora4]
orden1 = Orden(computadoras1)
orden1.agregar_computadoras(Computadora3)
print(orden1)

computadoras2 = [Computadora3, Computadora5, Computadora6]
orden2 = Orden(computadoras2)
orden2.agregar_computadoras(Computadora1)
print(orden2)