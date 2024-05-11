import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String nomeCliente;
        String Agencia;
        int numeroConta;
        double saldoConta;

    Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o seu nome!");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência!");
        Agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da sua conta!");
        numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o saldo da sua conta!");
        saldoConta = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua é Agência é "
         + Agencia + " e a conta é " + numeroConta + ", seu saldo de R$" + saldoConta + " já está disponível para saque.");
     

         scanner.close();
   
    }
   
}
