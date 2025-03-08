import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da sua agencia: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Ola, " + nomeCliente);
        System.out
                .println("Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + numero);
        System.out.println("Seu saldo " + saldo + " já está disponível para saque!");

    }
}
