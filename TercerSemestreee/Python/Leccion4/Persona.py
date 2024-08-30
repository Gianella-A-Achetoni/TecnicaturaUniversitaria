class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        
    def __add__(self, other):
        return f'Persona: {self.nombre} {other.nombre}' 
    
    def __sub__(self, otro):
        return self.edad - otro.edad
    
Persona1 = Persona("Ariel", 40 )
Persona2 = Persona("Bentacud", 5)

print(Persona1 + Persona2)
print(Persona1 - Persona2)