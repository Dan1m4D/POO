package Treino.E2020;

import java.util.Objects;

public class Autor {
    private String nome;
    private int anonasc;

    public Autor(String nome, int anonasc) {
        this.nome = nome;
        this.anonasc = anonasc;
    }

    public String getNome() {
        return nome;
    }

    public int getAnonasc() {
        return anonasc;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", anonasc=" + anonasc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nome, autor.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
