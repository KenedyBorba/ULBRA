function descobrir() {
    var energia = document.getElementById("resultado");
    var quant = parseInt(document.getElementById("quant").value);
    var uni = parseInt(document.getElementById("uni").value);

    var valor = quant * uni;
    if (quant <= 100) {
        energia.value = valor;
        return;
    }

    if (quant > 100 && quant < 200) {
        energia.value = valor + (valor * 0.25);
        return;
    }
    if (quant > 200) {
        energia.value = valor + (valor * 0.5);
        return;
    }
}