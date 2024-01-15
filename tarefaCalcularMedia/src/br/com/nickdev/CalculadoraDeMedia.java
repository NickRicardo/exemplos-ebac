package br.com.nickdev;

public class CalculadoraDeMedia {

//ATRIBUTOS
    private int nota1 = 90;

    private int nota2 = 100;

    private int nota3 = 98;

    private int nota4 = 91;

    //CONSTRUTOR;


    public CalculadoraDeMedia(int nota1, int nota2, int nota3, int nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    // GET'S AND SET'S
    public double getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public void calcularMedia(){
        System.out.println((nota1 + nota2 + nota3 + nota4) / 4.0 );
    };



}


