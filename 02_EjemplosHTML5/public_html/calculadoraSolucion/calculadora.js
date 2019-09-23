class Calculadora {
    constructor() {
        this.result = document.getElementById("resultado");
        this.anterior = document.getElementById("anterior");
        this.mem = 0;
        this.operador;
        this.nuevoNum = false;
    }
    numeroPulsado(eventObj) {
        if (this.nuevoNum) {
            this.result.value = "0";
            this.nuevoNum = false;
        }

        let valor = eventObj.currentTarget.innerHTML;
        if (valor === "+/-") {
            this.result.value = "" + (-(parseFloat(this.result.value)));
        } else if (valor === ".") {
            if (!this.result.includes(".")) {
                this.result.value += valor;
            }
        } else {
            this.result.value += valor;
        }
    }

    operadorPulsado(evObj) {
        let operadorActual = evObj.currentTarget.innerHTML;

        if (this.operador !== "" && this.operador !== "=") {
            let valActual = parseFloat(this.result.value);
            let resultado = eval(this.mem.toString() + this.operador + valActual);
            this.result.value = resultado;
        }
        this.mem = parseFloat(this.result.value);
        this.anterior.value = `${this.mem} ${operadorActual}`;
        this.operador = operadorActual;
        this.nuevoNum = true;
    }
}
let calculadora = null;

window.onload = function () {
    calculadora = new Calculadora();

    let botones = document.getElementsByClassName("num"); // array de botones
    for (let boton of botones) {
        boton.addEventListener("click", (evtObj) => {
            calculadora.numeroPulsado(evtObj);
        });
    }

    let operadores = document.getElementsByClassName("oper"); // array de operadores
    for (let oper of operadores) {
        oper.onclick = (evObj) => {
            calculadora.operadorPulsado(evObj);
        };
    }
};