package br.com.nickdev;
/**
 *
 * @author nicolas.santos
 */

public class App {

    public static void main(String args[]){

        CalculadoraDeMedia calcular = new CalculadoraDeMedia(48, 91, 99, 100);
        System.out.print("A média das notas é: ");
        calcular.calcularMedia();

    }
}
