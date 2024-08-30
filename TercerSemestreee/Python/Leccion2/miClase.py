class miClase:
    variable_clase = "Esta es una varieble de clase"
    
    def __init__(self, variable_intancia):
        self.variable_intancia = variable_intancia
        
    @staticmethod
    def metodo_etatico():
        print(miClase.variable_clase)
        
    @classmethod
    def metodo_de_clase(cls):
        print(cls.variable_clase)
        
    def metodo_instancia(self):
        self.metodo_de_clase()
        self.metodo_etatico()
        print(self.variable_clase)
        print(self.variable_intancia)
        
                
    
print(miClase.variable_clase)

miClase1 = miClase("Esta es una variable de instancia")
print(miClase1.variable_intancia)
print(miClase1.variable_clase)

miClase2 = miClase("Esta es otra prueba de variable de instancia")
print(miClase2.variable_intancia)
print(miClase2.variable_clase)

miClase.variable_clase2 = "Esta es una variable de clase 2"
print(miClase.variable_clase2)
print(miClase1.variable_clase2)
print(miClase2.variable_clase2)

miClase.metodo_etatico()
miClase.metodo_de_clase()

miObjeto1 = miClase("Esto es un valor de instancia")
miObjeto1.metodo_de_clase()
miObjeto1.metodo_instancia()
