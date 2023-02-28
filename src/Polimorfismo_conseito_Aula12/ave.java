package Polimorfismo_conseito_Aula12;

public class ave extends Animal{

    private String corPena;


    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }



    @Override
    public void locomover() {

        System.out.println("Vonando....");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas....");
    }

    @Override
    public void emitirSom() {

        System.out.println("Som de ave.....");

    }


    public void fazerNinho(){

        System.out.println("Produzindo ninho....");

    }



}
