
from dispositivo_entrado import dispositivoEntrada


class Raton(dispositivoEntrada):
    contador_ratones = 0
    
    def __init__(self, _marca, _tipo_entrada):
        Raton.contador_ratones += 1
        self._id_raton = Raton.contador_ratones
        super().__init__(_marca, _tipo_entrada)
        
    def __str__(self):
        return f'ID: {self._id_raton}, Marca: {self._marca}, Tipo de entrada: {self._tipo_entrada} '
    
    
if __name__ == "__main__":
    raton1 = Raton("HP", "USB")
    print(raton1)
    raton2 = Raton("Acer", "Bluetooth")
    print(raton2)