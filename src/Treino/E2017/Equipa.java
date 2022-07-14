package Treino.E2017;

import java.util.TreeSet;

public class Equipa{
    public String nome;
    private String nresponsavel;
    private int golosmarcados;
    private  int golossofridos;
    private TreeSet <Robo> robos = new TreeSet<>();

    public Equipa(String nome, String nresponsavel) {
        this.nome = nome;
        this.nresponsavel = nresponsavel;
    }

    public void add(Robo r){
            this.robos.add(r);
    }

    public void remove(Robo r){
        if (!robos.contains(r))
            System.out.println("Robo não existente na equipa");
        else
            this.robos.remove(r);
    }

    public String getNome() {
        return nome;
    }

    public String getNResponsavel() {
        return nresponsavel;
    }

    public int getGolosMarcados() {
        for( Robo r : robos)
            golosmarcados += r.Golos;
        return golosmarcados;
    }

    public int getGolosSofridos() {
        return golossofridos;
    }

    public Robo [] getRobos() {
        Robo [] rb = new Robo[robos.size()];

        robos.toArray(rb);

        return rb;
    }

    @Override
    public String toString(){
        String str = String.format("""
                Equipa %s, treinada por %s (%d jogadores)
                Robos:""", this.nome, this.nresponsavel, this.robos.size());
        for (Robo r : robos){
            str += r.toString();
        }
        str += String.format("""
                    golosMarcados=%s""", this.golosmarcados);

        return str;
    }
}
