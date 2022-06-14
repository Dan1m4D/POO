package MinitesteTP06.RandomTicketTester;

import Aula_6.Ex1.Date;

public class Pessoa {
    public String nome;
    public int cc;
    public Date dataNasc;

    //Construtor
    public Pessoa(String nome, int cc, DateND dataNasc){
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }
    
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCC(int cc){
        this.cc = cc;
    }

    public void setDataNasc(Date dataNasc){
        this.dataNasc = dataNasc;
    }

    //Getters

    public String getNome(){return this.nome;}

    public int getCC(){return this.cc;}
    
    public Date getDataNasc(){return this.dataNasc;}

    @Override
    public String toString(){
        return "Nome: " + this.nome +", CC" + this.cc + ", DataNasc:" + this.dataNasc; 
    }
}
