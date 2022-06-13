package Aula_6.Ex1;

public class Bolseiro extends Aluno {
    int bolsa;

    public Bolseiro(int bolsa, String nome, int cc, Date DataNasc, Date DataInsc){
        super(nome, cc, DataNasc, DataInsc);
        this.bolsa = bolsa;
    }
    //Getters
    public int getBolsa(){return this.bolsa;}

    //Setters
    public void setBolsa(int bolsa){
        this.bolsa = bolsa;
    }
}
