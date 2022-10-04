package Calculadora;

public class Calculadora {

    //soma
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;

        System.out.println("a soma de " + numero1 + " + " + numero2 + " é igual a " + resultado);
    }

    //subtraçao
    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;

        System.out.println("a subtração de " + numero1 + " - " + numero2 + " é igual a " + resultado);
    }

    //multiplicação
    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;

        System.out.println("a multiplicação de " + numero1 + " por " + numero2 + " é igual a " + resultado);
    }

    //divisão
    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;

        System.out.println("a divisão de " + numero1 + " por " + numero2 + " é igual a " + resultado);
    }
}
