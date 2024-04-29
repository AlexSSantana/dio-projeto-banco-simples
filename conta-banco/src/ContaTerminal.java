import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner((System.in));

        System.out.print("Digite o seu nome e sobrenome: ");
        String name = input.nextLine();

        System.out.print("Numero da conta: ");
        int accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Agência: ");
        String agency = input.nextLine();

        Account conta = new Account(name, accountNumber, agency); //Instancia um objeto do tipo conta para referenciar 3 atributos

        System.out.print("Digite um valor que deseja depositar: ");
        double amount = input.nextDouble();

        System.out.println();

        conta.deposit(amount); // função que valor em deposito e realiza a operação de depositar

        System.out.println(conta.toString());


        input.close();;
        
    }
}
