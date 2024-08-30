#Profundizando el tipo float
a = 3.0

#constructor de tipo float -> Puede recibir int y str
a = float(10)
a = float('10')
print(f'a = {a:.2f}')

#Notacion exponencial(Positivos o negativos)
a = 3e5
print(f'a = {a:.2f}')

a = 3e-5
print(f'a = {a:.5f}')

#Cualquier calculo con un float va a cambiar a un float
a = 4.0 + 5
print(f'a = {a}')
print(type(a))