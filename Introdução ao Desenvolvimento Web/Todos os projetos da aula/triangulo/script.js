function descobrir() {
    var a = document.getElementById("a").value;
    var b = document.getElementById("b").value;
    var c = document.getElementById("c").value;
 
    if (parseInt(a) + parseInt(b) >= parseInt(c) && a + c >= b && b + c >= a)
    {
    if (a == b && b == c && c == a){
        var resultado = ("Triângulo Equilatero");
        }
    else if (a == b || b == c || c == a){
        var resultado = ("Triângulo Isosceles");
        }
    else if (a != b && b != c && c != a){
        var resultado = ("Triângulo Escaleno");
        }
    }
    else {
        var resultado = ("Valores inválidos");
        }
    
    document.triangulo.resultado.value = resultado;
 }
