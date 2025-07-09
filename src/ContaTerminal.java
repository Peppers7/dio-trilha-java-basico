import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente!");
        System.out.print(">> ");
        String nome = leitura.nextLine();

        System.out.println("Por favor, informe o número da Agência!");
        System.out.print(">> ");
        String agencia = leitura.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        System.out.print(">> ");
        int num = leitura.nextInt();

        System.out.println("Por favor, informe o saldo da conta!");
        System.out.print(">> ");
        double saldo = leitura.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f, já está disponível para saque", nome, agencia, num, saldo);

    }
}
