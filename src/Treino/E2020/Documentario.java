package Treino.E2020;

import java.util.Objects;

public class Documentario extends Produto{
    private String titulo;
    private int duracao;

    public Documentario(String titulo, int duracao, double precobase) {
        super(precobase);
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Documentario{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Documentario that = (Documentario) o;
        return duracao == that.duracao && Double.compare(that.precobase, precobase) == 0 && Objects.equals(titulo, that.titulo) && Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, duracao, codigo, precobase);
    }
}
