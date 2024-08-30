
from dispositivo_entrado import dispositivoEntrada


class Teclado(dispositivoEntrada):
    contador_teclado = 0
    
    def __init__(self, _marca, _tipo_entrada):
        
        Teclado.contador_teclado +=1
        self._id_teclados = Teclado.contador_teclado
        
        super().__init__(_marca, _tipo_entrada)
        
    def __str__(self):
        return f'ID: {self._id_teclados}, Marca: {self._marca}, Tipo entrada: {self._tipo_entrada}'
    
if __name__ == "__main__":
    raton1 = Teclado("HP", "USB")
    print(raton1)
    raton2 = Teclado("Gamer", "Bluetooth")
    print(raton2)