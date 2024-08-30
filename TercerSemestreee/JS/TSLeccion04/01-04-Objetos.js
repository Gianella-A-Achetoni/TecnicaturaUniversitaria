let x = 10;
console.log(x.length);
console.log("Ejecutando tipo primitivo");


//objeto
let persona = {
    nombre: "Carlos",
    apellido: "Gil",
    email: "cgil@gmail.com",
    edad: 28,
    idiomas: "ES",
    get lang(){
        return this.idiomas.toUpperCase()
    },
    set lang(lang){
        this.idiomas = lang.toUpperCase();
    },
    nombreCompleto: function(){
        return this.nombre + " " + this.apellido;
    },
    get nombreEdad(){
        return "El nombre es: "+this.nombre + ", Edad: " + this.edad;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log("Ejecutando con un objeto");

let persona2 = new Object();
persona2.nombre = "Juan";
persona2.direccion = "Salada 24"
persona2.numTelefonico = "57654476465";
console.log(persona2.numTelefonico);
console.log("Creamos un nuevo objeto");

console.log(persona['apellido']);

console.log("Usamos ciclo for in ");

for (propiedad in persona) {
    console.log(propiedad);
    console.log(persona[propiedad]);
}

console.log("Cambiamos y eliminamos un error");

persona.apellida = "Bentancud";//cambio dinamico
delete persona.apellida; //Borramos el error
console.log(persona);

//Distintas formas de imprimir un objeto
console.log("Distintas formas de imprimir un objeto: forma 1");

console.log(persona.nombre + ", " + persona.apellido);

console.log("Distintas formas de imprimir un objeto: forma 2");

for (nomPropiedad in persona) {
    console.log(persona[nomPropiedad]);
}

console.log("Distintas formas de imprimir un objeto: forma 3");

let personaArrays = Object.values(persona);
console.log(personaArrays);

console.log("Distintas formas de imprimir un objeto: forma 4");

let personaString = JSON.stringify(persona);
console.log(personaString);

console.log("Comenzamos a utilizar el metodo get");
console.log(persona.nombreEdad);

console.log("Comenzamos con el metodo get y set para idiomas");
persona.lang = "en";
console.log(persona.lang);

function Persona3(nombre, apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre + " " + this.apellido;
    };
}

let padre = new Persona3("Lio","Messi","campeondelmundo@gmail.com");
padre.nombre = "Lionel";
padre.telefono = "53423422242";
console.log(padre.nombreCompleto());
console.log(padre);

let madre = new Persona3("Antonella", "Rocusso", "antor@gmail.com");
console.log(madre.nombreCompleto());
console.log(madre.telefono);
console.log(madre);

//Diferentes formas de formar objetos
let miObjeto = new Object();
let miObjeto1 = {};//recomendada
//String
let miObjeto2 = new String(" ");
let miObjeto3 = "";//recomendada
//numeros
let miObjeto4 = new Number(8);
let miObjeto5 = 5;//recomendada
//booleanos
let miObjeto6 = new Boolean(false)
let miObjeto7 = false;//recomendada
//arreglos
let arreglos = new Array();
let arreglos1 = [];//recomendada
//funciones
let funciones = new function(){};
let funciones1 = function(){};//recomendada

//uso prototype
Persona3.prototype.telefono = "8737357357";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "5544665635434";
console.log(madre.telefono);

//uso de call
let persona4 = {
    nombre: "Luis",
    apellido: "Perez",
    nombreCompleto1: function(titulo,telefono){
       return titulo + " " + this.nombre + " " + this.apellido + " " + telefono;
       //return this.nombre + " " + this.apellido;
    } 
}

let persona5 = {
    nombre: "Carlosa",
    apellido: "Lara"
}

console.log(persona4.nombreCompleto1("Lic.","656465465876"));
console.log(persona4.nombreCompleto1.call(persona5, "Ing.", "54546575675"));

//metodo apply
let arreglo = ["Lic.","4532554545455"]
console.log(persona4.nombreCompleto1.apply(persona5, arreglo));