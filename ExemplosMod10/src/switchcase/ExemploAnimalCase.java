package switchcase;

import java.util.Scanner;

public class ExemploAnimalCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String texto = s.next();

        String animal = exampleOfSwitch(texto);
        System.out.println(animal);
    }

    public static String exampleOfSwitch(String animal){
        String result;
        switch (animal){
            case "DOG":
            case "CAT":
                result = "Domestic animal";
                break;
            case "TIGER" :
                result = "Wild Animal";
                break;
            default:
                result = "Unknown animal";
                break;
        }
        return result;
    }
}
