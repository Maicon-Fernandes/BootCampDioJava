import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //TODO: Conhecer e importar Scanner

        // exibir mensagens para o usuario
        System.out.println("Por favor, digite as informações solicitadas");
        System.out.println("Número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Número da Agência | exemplo (000-0):");
        String numeroAgencia = scanner.nextLine();
        System.out.println("Nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Saldo da Conta:");
        double saldoConta = scanner.nextDouble();
        //obter pelo scanner os valores digitador no terminal

        //exibir a mensagem conta criada
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é |"+numeroAgencia+"|, conta |"+numeroConta+"|, saldo| R$ "+saldoConta+"|, seu saldo já está disponivel para saque.");

    }
}
