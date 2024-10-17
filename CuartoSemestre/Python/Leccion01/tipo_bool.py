
#bool es para true y false
valor = 0
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

valor = 12
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

#Lo mismo pero con String
valor = ''
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

valor = 'Hola Mundo'
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

#Lista 
valor = []
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

valor = [1,2,3]
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

#tupla
valor = ()
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

valor = (5,)
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

#Diccionario
valor = {}
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

valor = {'Nombre':'Juan','Apellido':'Perez'}
resultado = bool(valor)
print(f'Valor: {valor}, Resultado: {resultado}')

#Sentencias de control
if '':
    print('El verdadero')
else:
    print("es falso")
    
#Ciclos
variable=17
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')