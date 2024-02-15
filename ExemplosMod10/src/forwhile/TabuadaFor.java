package forwhile;

import java.util.Scanner;

public class TabuadaFor {

    public static void main(String [] args){
        //Usuário digita no console
        Scanner s = new  Scanner(System.in);
        //Imprimo a mensagem no console
        System.out.println("Digite um número para gerar a tabuada: ");
        //recebo oque foi digitado pelo usuario
        int num = s.nextInt();
        //Regra de negócio
        for (int i = 0; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + num*i); //numero multiplicado pelo contador
        }
    }
}
