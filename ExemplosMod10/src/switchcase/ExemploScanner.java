package switchcase;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
        // Crie um objeto Scanner usando System.in como InputStream
        Scanner scanner = new Scanner(System.in);

        // Agora você pode usar o objeto scanner para ler entrada do usuário, por exemplo:
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        System.out.println("Você digitou: " + numero);

        // Lembre-se de fechar o Scanner quando não precisar mais dele
        scanner.close();
    }
}