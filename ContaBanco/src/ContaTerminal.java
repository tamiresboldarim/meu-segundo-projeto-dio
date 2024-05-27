/**
 * <h1>Conta Terminal</h1>
 * Criação de conta no banco, onde informa a agência, conta, nome, sobrenome e *saldo do usuário, conforme os dados fornecidos.
 * @author Tamires Boldarim
 * @version 1.0
 * @since 26/05/2024
 */

 //Importação da classe scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Inserção do Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Exibição de mensagens para o nosso usuário, Obtendo pelas scanners os valores digitados no terminal
        System.out.println("Por favor, digite o número da agência.");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta.");
        String conta = scanner.next();

        System.out.println("Por favor, digite seu nome.");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome.");
        String sobrenome = scanner.next();
               
        System.out.println("Por favor, digite o seu saldo.");
        double saldo = scanner.nextDouble();

        //Exibição da mensagem da conta criada, imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }       
}
