from manejoArchivos import ManejoArchivo
#with open('prueba.txt','r', encoding='utf8') as archivo:
    #print(archivo.read())   
#Utiliza diferentes metodos:
#__enter__ abre el archivo
#__exit__ lo cierra
with ManejoArchivo('prueba.txt') as archivo:
    print(archivo.read())