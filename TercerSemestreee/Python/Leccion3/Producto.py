class Producto:
    contador_producto = 0
    def __init__(self, nombre, precio):
        Producto.contador_producto +=1
        self._id_producto = Producto.contador_producto
        self._nombre = nombre
        self._precio = precio
        
    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre
        
    @property
    def precio(self):
        return self._precio
    
    @precio.setter
    def precio(self, precio):
        self._precio = precio
        
    def __str__(self):
        return f'Producto[ID= {self._id_producto}, Nombre = {self._nombre}, Precio = {self._precio} ]'
   
   
 
if __name__ == '__main__' :
    Producto1 = Producto("camisa", 100)
    Producto2 = Producto("Pantalon", 150)
    