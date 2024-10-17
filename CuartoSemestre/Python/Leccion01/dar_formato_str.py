# dar formato a un string
nombre='Gianella'
edad=19
mensaje_con_formato ='Mi nombre es %s y mi edad es %d' %(nombre,edad)
print(mensaje_con_formato)

#pasamos directamente una tupla
persona=('Carla','Gomez', 50000)
mensaje_con_formato = 'Hola %s %s. Tu sueldo es %d'
print(mensaje_con_formato %persona)

# usamos format 
nombre='Carla'
edad=45
sueldo=65555
mensaje_con_formato = 'Nombre: {0}, Edad: {1}, Sueldo: {2:.2f}'.format(nombre,edad,sueldo)
print(mensaje_con_formato)

mensaje_con_formato = 'Nombre: {n}, Edad: {e}, Sueldo: {s}'.format(n=nombre,e=edad,s=sueldo)
print(mensaje_con_formato)

diccionario= {'nombre':'ivan', 'Edad':38, 'sueldo':235534 }
mensaje_con_formato = 'Nombre: {persona[nombre]}, Edad: {persona[Edad]}, Sueldo: {persona[sueldo]}'.format(persona=diccionario)
print(mensaje_con_formato)