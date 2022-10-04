import Calculadora.Calculadora;
import Mensagem.Mensagem;

public class Main {
    public static void main(String[] args){

        //Calculadora
        System.out.println("Exercício Calculadora:");
        Calculadora.soma(3, 6.2);
        Calculadora.subtracao(2, 1.8);
        Calculadora.multiplicacao(3, 3.5);
        Calculadora.divisao(6.6, 3);


        //Mensagem
        System.out.println("Exercício Mensagem:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(20);
    }
}