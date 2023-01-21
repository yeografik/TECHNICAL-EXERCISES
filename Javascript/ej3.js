function printEtendo() {
    console.log("Etendo!!!");
}

const mostrar = (param)=> {
    param();
};

mostrar(printEtendo);