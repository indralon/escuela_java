var hola = "hola";
function otroHola(saludo) {
	console.log("saludo " + saludo);
}
otroHola("pute");

// Type Script:
let variableNum: number;
interface Tiempo {
	dia: number;
	mes: number;
	anio: number;
};
let miCumple: Tiempo = {dia:22, mes:3, anio : 2014};

function concatenar(texto1: string, texto2: any) {
	console.log("Concatenado: " + texto1 + texto2);
}
concatenar("salseo", 34);