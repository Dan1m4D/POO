package MinitesteTP06.MT;

import Aula_6.Ex1.Date;

public class Pessoa {
    public String nome;
    public int cc;
    public DateND dataNasc;

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

    public void setDataNasc(DateND dataNasc){
        this.dataNasc = dataNasc;
    }

    //Getters

    public String getNome(){return this.nome;}

    public int getCC(){return this.cc;}
    
    public DateND getDataNasc(){return this.dataNasc;}

    @Override
    public String toString(){
        return "Nome: " + this.nome +", CC" + this.cc + ", DataNasc:" + this.dataNasc; 
    }
}
