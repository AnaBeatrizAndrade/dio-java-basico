import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
