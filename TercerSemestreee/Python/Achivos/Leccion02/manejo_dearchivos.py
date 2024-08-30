try:
    archivo = open('prueba.txt', 'w', encoding='utf8') # *W*rite
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt. \n')
    archivo.write('Los acentos son importantes para las palabras. \n')
    archivo.write('Como por ejemplo: acción, ejecucción y producción. \n')
    archivo.write('Las letras son: \nw write, \nr read, \na append, \nx crea un archivo')
    archivo.write('\nt esta es para text, \nb para archivos binarios, \nw+ para escribir y leer es igual a r+ \n')
    archivo.write('Saludos \n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally:
    archivo.close()
