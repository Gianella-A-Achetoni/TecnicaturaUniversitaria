archivo = open('prueba.txt','r', encoding='utf8') #Las letras son: w write, r read, a append, x crea un archivo
#print(archivo.read())
#print(archivo.read(16))
#print(archivo.read(10))
#print(archivo.readline())
#print(archivo.readline())

#vamos a iterar el archivo
#for linea in archivo:
    #print(linea) iteramos
#print(archivo.readlines()[1]) accedemos al archivo como si fuera una lista

#agregamos informacion y copiamos en otro archivo
archivo2 = open('copia.txt', 'w', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()#cerramos el primer archivo
archivo2.close()#cerramos el segundo archivo
print('Ha terminado el proceso')
