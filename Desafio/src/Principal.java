import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static final int opcao = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Jaqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao =0;

        System.out.println("***********************************");
        System.out.println("\nDados iniciais do cliente:");
        System.out.println("Nome:           "+nome);
        System.out.println("Tipo de conta:  "+tipoConta);
        System.out.println("Saldo inicial:  "+saldo);
        System.out.println("\n***********************************");

        String menu = """
                \nOperações
                
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                Digite a opção desejada: 
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("o saldo atual é R$"+saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = scanner.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar transferencia.");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado R$"+saldo);
                }
            } else if (opcao == 3){
                System.out.println("Digite o valor recebido: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado R$"+saldo);
            } else if (opcao != 4){
                System.out.println("Opção Invalida");
            }
        }
    }
}


