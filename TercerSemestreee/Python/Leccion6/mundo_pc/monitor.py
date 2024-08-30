
class Monitor:
    
    contador_monitores = 0
    
    def __init__(self, marca, tamano):
        Monitor.contador_monitores += 1
        self._id_monitores = Monitor.contador_monitores
        
        self._marca = marca
        self._tamano = tamano
        
    def __str__(self):
        return f'ID: {self._id_monitores}, Marca: {self._marca}, Tamaño: {self._tamano} '
    
if __name__ == "__main__":
    monito1 = Monitor("Asus", "24 pulgadas")
    print(monito1)
    monito2 = Monitor("HP","22 pulgadas") 
    print(monito2)