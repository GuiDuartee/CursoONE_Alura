import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Guilherme Duarte";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        double transferencia = 0;
        int opcao = 0;
        String mensagemInicial = """
                ***************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo: R$%.2f
                ***************************
                """.formatted(nome, tipoConta, saldo);
        String mensagemOpcao = """
                
                Operações
                
                1 - Consultar saldo
                2 - Depositar
                3 - Sacar
                4 - Sair
                
                Digite a opção desejada:
                """;
        System.out.println(mensagemInicial);

        while(opcao != 4) {
            System.out.println(mensagemOpcao);
            opcao = leitura.nextInt();

            if (opcao > 0 && opcao < 5) {
                switch (opcao) {
                    case 1:
                        System.out.println("Saldo atual: R$" + saldo);
                        break;
                    case 2:
                        System.out.println("Digite a quantia a ser depositada: ");
                        transferencia = leitura.nextDouble();
                        if (transferencia > 0) {
                            saldo += transferencia;
                            System.out.println("Saldo atualizado: R$" + saldo);
                        } else {
                            System.out.println("Impossível realizar um depósito menor que R$00,01");
                        }
                        break;
                    case 3:
                        System.out.println("Digite a quantia a ser sacada: ");
                        transferencia = leitura.nextDouble();
                        if (transferencia < saldo) {
                            saldo -= transferencia;
                            System.out.println("Saldo atualizado: R$" + saldo);
                        } else {
                            System.out.println("Impossível realizar um saque maior que o saldo disponível.");
                        }
                        break;
                    case 4:
                        System.out.println("Obrigado, volte sempre!");
                        break;
                }
            } else {
                    System.out.println("Opção inválida.");
            }
        }
    }
}

