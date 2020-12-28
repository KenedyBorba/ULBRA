function calcular(operacao) {
   var primeiroValor = document.getElementById("primeiroValor").value;
   var segundoValor = document.getElementById("segundoValor").value;

   if (operacao == "somar") {
      var resultado = parseInt(primeiroValor) + parseInt(segundoValor);
   } else {
      if (operacao == "subtrair") {
         var resultado = primeiroValor-segundoValor;
      } else {
         if (operacao == "multiplicar") {
            var resultado = primeiroValor*segundoValor;
         } else {
            var resultado = primeiroValor/segundoValor;
         }
      }
   }

   document.calculadora.resultado.value = resultado;
}