package forwhile;

import java.util.Scanner;

public class TabuadaWhile {

    public static void main (String [] args){
//        Para fazer a iteração no debug com o usuário, este codigo permite que o usuario responda
        Scanner s = new Scanner(System.in);

//        Esta pergunta aparece no console,
        System.out.println("Deseja gerar a tabuada de algum número?");

//        esta variavel armazena a resposta do usuario
        String resposta = s.next();

//      Equanto a resposta do usuario for sim...EXECUTE O CODIGO
        while (resposta.equalsIgnoreCase("sim")){

//            Este é o codigo a ser executado, neste caso fazendo uma pergunta para o usuario
            System.out.println("Digite um núimero para gerar a tabuada: ");

//            mais uma vez, um outra variavel armazenando uma resposta do usuario, desta vez numero inteiros
            int num = s.nextInt();

//          Para o contado i até 10 execute o código
            for (int i = 0; i <= 10; i++){

//                codigo a ser executado
                System.out.println(num + " X " + i + " = " + num*i);
            }

            System.out.println("Deseja gerar novamente a tabuada de algum número?");
            resposta = s.next();
        }

        System.out.println("Obrigado e até mais ;) ");

    }
}
