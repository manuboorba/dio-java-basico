import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + ". Obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ",conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
       
        
    }
}
