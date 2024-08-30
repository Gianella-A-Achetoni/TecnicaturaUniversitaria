from Producto import Producto

class Orden:
    contador_ordenes = 0
    
    def __init__(self, productos):
        Orden.contador_ordenes +=1
        self._id_ordenes = Orden.contador_ordenes
        self._productos = list(productos)
        
    def agregar_productos(self, producto):
        self._productos.append(producto) 
        
    def calcular_total(self):
        total = 0 #Variable temporal
        
        for Producto in self._productos:
            total += Producto.precio
        return total
    
    def __str__(self):
        productos_str = ""
        for producto in self._productos:
            productos_str += producto.__str__() + '/'
        return f'Orden: {self._id_ordenes}, \nProducto: {productos_str}'
    


            