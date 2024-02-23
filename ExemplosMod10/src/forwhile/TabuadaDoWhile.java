package forwhile;

import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.println("Digite um núimero para gerar a tabuada: ");
            int num = s.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + num * i);
            }
            System.out.println("Deseja gerar novamente a tabuada de algum número?");
            resposta = s.next();
        } while (resposta.equalsIgnoreCase("Sim"));
        System.out.println("Obrigado e até mais ;) ");
    }
}

//WHILE FAZ A VALIDAÇÃO PRIMEIRO, E SÓ DEPOIS DE EXECUTAR A REGRA DE NEGÓCIO
//JÁ O DO WHILE, PRIMEIRO EXECUTA O CODIGO E SO DEPOIS DE EXECUTAR ELE FAZ A VALIDAÇÃO