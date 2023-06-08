import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("informe o nome do cliente: ");
        String nome = input.nextLine();
        System.out.print("Informe o tipo de conta do cliente: ");
        String tipoConta = input.next();
        input.nextLine();
        System.out.print("Informe o saldo atual do cliente: ");
        double saldo = input.nextDouble();


        System.out.println("\n***********************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.printf("Saldo Atual: R$ %.2f", saldo);
        System.out.println("\n***********************");

        String menu = """
                \n** Digite sua opção **
                                
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                                
                """;


        while (opcao != 4) {
            System.out.println(menu);
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo é: R$ %.2f\n", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser transferido:");
                    double valorTransferencia = input.nextDouble();

                    if (valorTransferencia <= saldo) {
                        // subtrai o valor do saldo atual
                        saldo -= valorTransferencia;

                        // adiciona o valor ao saldo atual
                        System.out.printf("R$ %.2f foram transferidos com sucesso!\n",
                                valorTransferencia);

                        System.out.printf("Seu novo saldo é: R$ %.2f\n", saldo);

                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor a ser recebido:");
                    double valorRecebido = input.nextDouble();

                    if (valorRecebido > 0) {
                        // adiciona o valor recebido no saldo atual
                        saldo += valorRecebido;

                        System.out.printf("R$ %.2f foram adicionados com sucesso em seu saldo!\n",
                                valorRecebido);

                        System.out.printf("Seu novo saldo é: R$ %.2f\n", saldo);

                    } else {
                        System.out.println("Valor inválido!");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        }


    }
}
