//let autos = new Array(); sintaxis vieja
const autos = ["Ferrari","Chevrolet","BMW"]; 
console.log(autos);

//Recorremos con un ciclo for
console.log(autos[0]);
console.log(autos[2]);

for (let index = 0; index < autos.length; index++) {
    
    console.log(index+" : "+autos[index])

}

//Modificamos los elementos del arreglo
autos[1] = "Fiat";
console.log(autos)

//Agregamos nuevos valores al arreglo
autos.push("Chevrolet");
console.log(autos);

autos[autos.length] = "Porche";
console.log(autos);

autos[5] = "Audi";
console.log(autos);

//Como preguntar si lo que hay es un Array o Areglo
console.log(Array.isArray(autos));

console.log(autos instanceof Array);
//Ambas formas e preguntar devuelven un booleano
