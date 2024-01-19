package br.com.nicolas;

public class TarefaWraper {

    private int numero = 10;

    public int getNumero() {
        return numero;
    }

    public void mostrarInteiro(){
        //convertendo para o tipo Wraper (integer e imprimento
       Integer numeroWrapper = Integer.valueOf(numero);
       System.out.println("Valor como Wrapper: " + numeroWrapper);
    }
}
