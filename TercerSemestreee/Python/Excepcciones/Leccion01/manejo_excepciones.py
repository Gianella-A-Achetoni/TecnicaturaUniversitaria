from numerosIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input("Digite el primer número: "))
    b = int(input("Digite el segundo número: "))
    if a == b:
        raise NumerosIgualesException("Los números son iguales")
    
    resultado = a / b
except TypeError as e:
    print(f'TypeError - Ocurrio un error: {type(e)}' )
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrio un error: {type(e)}' )
except Exception as e:
    print(f'Exception - Ocurrio un error: {type(e)}' )
else:
    print('No se arrojo ningun error')
finally:
    print("Ejecucion del bloque finally")

print(f'El resultado es: {resultado}')
print("Seguimos...")