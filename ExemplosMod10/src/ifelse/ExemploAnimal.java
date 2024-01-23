package ifelse;

import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = examppleOfIF(texto);
        System.out.println(animal);
        s.close();
    }

    public static String examppleOfIF(String animal){
      String result;

      if (animal.equals("Dog") || animal.equals("Cat")){
          result = "Domestic animal";
      } else if (animal.equals("Tiger")) {
          result = "Wild animal";
      } else {
          result = "unknown animal";
      }
      return result;
    }
}
