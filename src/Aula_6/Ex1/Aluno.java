package Aula_6.Ex1;

public class Aluno extends Pessoa {
    private final int nmec;
    private Date DataInsc;
    int cont = 100;
    public Aluno(String nome, int cc, Date DataNasc, Date DataInsc) {
        super(nome, cc, DataNasc);
        this.nmec = cont ++;
    }

    //Getters
    public int getNmec(){return this.nmec;}

    public Date getDataInsc(){return this.DataInsc;}

    //Setters
    public void setDataInsc(Date date){
        this.DataInsc = date;
    }

    @Override
    public String toString(){
        return "ALUNO \nNome: " + this.nome +"\nCC" + this.cc + "\nDataNasc:" + this.dataNasc + "\nNº Mec: " + this.nmec + "\nData de Incrição: " + this.DataInsc; 
    }
}
