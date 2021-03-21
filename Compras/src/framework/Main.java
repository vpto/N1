package framework;
import model.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Carrinho i1  = new Carrinho();

        int menu;
        do{
            System.out.println(
                    "\n-----------------------------------------"+
                    "\n|           |MENU DE COMPRAS|           |"+
                    "\n-----------------------------------------");
            System.out.println(
                    "[1] Cadastrar Produto\n"+
                    "[2] Consultar Produtos\n"+
                    "[0] Sair");

            menu = input.nextInt();

            switch (menu)
            {
                case 1:
                    System.out.println("------------CADASTRAR PRODUTO------------");
                    Produto p1 = new Produto();
                    input.nextLine();


                    System.out.println("Digite o Codigo do Produto: ");
                    p1.setCodigo(input.nextInt());


                    System.out.println("Digite a Descrição do Produto: ");
                    p1.setDescProduto(input.next());


                    System.out.println("Digite o Preco do Produto: ");
                    p1.setPreco(input.nextFloat());


                    System.out.println("Digite a Quantidade do Produto: ");
                    p1.setQuantidade(input.nextInt());


                    i1.cadastrarProduto(p1);
                    System.out.println("Produto Cadastrado com Sucesso!");


                    break;
                case 2:
                    System.out.println("------------CONSULTAR PRODUTOS-----------");
                    if(i1.getCadastro().isEmpty())
                    {
                        System.out.println("Não hà Produtos Cadastrados!");
                    }else{
                        System.out.println(i1);
                    }


                    break;
                case 0:
                    System.out.println("OBRIGADO POR USAR O PROGRAMA :)");
                    break;


                default:
                    System.out.println("---------------------------------------");
                    System.out.println("         Erro Opção invalalida: ");
                    System.out.println("---------------------------------------");
                    break;


            }

        }while(menu!=0);

    }

}
