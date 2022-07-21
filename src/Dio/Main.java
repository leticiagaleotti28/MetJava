package Dio;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Cálculo");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Cumprimentar");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Empréstimo");
        Emprestimo.parcelar(1000, Emprestimo.getTaxaDuasParcelas());
        Emprestimo.parcelar(1000, Emprestimo.getTaxaTresParcelas());
        Emprestimo.parcelar(1000, 5);
    }
}
