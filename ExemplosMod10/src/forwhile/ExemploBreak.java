package forwhile;

public class ExemploBreak {

    public static void main(String [] args){
        for (int contador = 1; contador <= 1000; contador++){
            System.out.println("Esta é a repetição Nr: " + contador);
            if (contador==600) {
                break;
            }
        }
    }
}
