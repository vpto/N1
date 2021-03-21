import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){

        Scanner Exercicio2 = new Scanner(System.in);

        String nome;
        double valor;
        double soma;
        double caucularResusltado;

        System.out.println("Digite Seu nome: ");
        nome = Exercicio2.next();

        System.out.println("Digite o valor do produto para receber 2,5% de desconto: ");
        valor = Exercicio2.nextDouble();

        soma = valor*0.25;
        caucularResusltado = valor-soma;

        System.out.println("Nome: "+nome);
        System.out.println("Valor Final com o desconto aplicado : "+caucularResusltado);
    }
}
