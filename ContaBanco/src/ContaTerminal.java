import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String numeroConta;
        String agencia;
        String nome;
        double saldo;

        while (true) { 
            System.out.println("Digite o número de sua conta bancária.");
            numeroConta = scan.nextLine();

            if (numeroConta.matches("\\d{4}")) {
                break;
            } else {
                System.out.println("O número da conta deve ser composto por quatro números. Tente novamente.");
            }
        }

        while (true) { 
            System.out.println("Digite o número de sua agência (ex. 123-4).");
            agencia = scan.nextLine();

            if (agencia.matches("\\d{3}-\\d{1}")) {
                break;
            } else {
                System.out.println("O número da agência deve ser composto por três números seguidos de hífen e um dígito.");
            }          
        }
        
        System.out.println("Digite seu nome completo.");
        nome = scan.nextLine();

        System.out.println("Qual o seu saldo atual?");
        saldo = scan.nextDouble();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        
        scan.close();
    }
}
