package calculadora;

public class Calculadora {

    public Double numeroA;
    public Double numeroB;

    public void somar(){
        double resultadoSoma = numeroA + numeroB;
        System.out.println(numeroA + "+" + numeroB + "=" + resultadoSoma);
    }

    public void subtrair(){
        double resultadosub = numeroA - numeroB;
        System.out.println(numeroA + "-" + numeroB + "=" + resultadosub);
    }

    public void multiplicar(){
        double resultadomult = numeroA * numeroB;
        System.out.println(numeroA + "x" + numeroB + "=" + resultadomult);
    }

    public void dividir(){
        double resultadodiv = numeroA / numeroB;
        System.out.println(numeroA + "/" + numeroB + "=" + resultadodiv);
    }
}

