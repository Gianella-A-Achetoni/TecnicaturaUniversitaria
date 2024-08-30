
from raton import Raton
from monitor import Monitor
from teclado import Teclado


class Computadora:
    contador_computadoras = 0
    
    def __init__(self, nombre, monitor, teclado, raton ):
        Computadora.contador_computadoras +=1
        self._id_computadoras = Computadora.contador_computadoras
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton
        
    def __str__(self) -> str:
        return f'''
            {self._nombre} : {self._id_computadoras}
            Monitor: {self._monitor}
            Teclado: {self._teclado}
            Raton: {self._raton}
            '''
            
            
if __name__ == "__main__":
    teclado1 = Teclado("Noga", "USB")
    monitor1 = Monitor("Lenovo", "24 pulgadas")
    raton1 = Raton("Gamer","Bluetooth")
    Computadora1 = Computadora("Gamer", monitor1, teclado1, raton1)
    print(Computadora1)
    teclado2 = Teclado("Lenovo", "USB")
    monitor2 = Monitor("Lenovo", "24 pulgadas")
    raton2 = Raton("Lenovo","USB")
    Computadora2 = Computadora("Lenovo", monitor2, teclado2, raton2)
    print(Computadora2)
    
    
    