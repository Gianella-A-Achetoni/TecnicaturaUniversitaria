
print("Inserte la calificacion (del 1 al 10)")
a = input ("")
a = int(a)

if a >= 9 and a <=10 :
    print("A")
elif  a >= 8 and a <9:
    print("B")
elif  a >= 7 and a < 8:
    print("C")
elif  a >= 6 and a <7:
    print("D")
elif  a >= 0 and a <6:
    print("F") 
else:
    print("ERROR")
    