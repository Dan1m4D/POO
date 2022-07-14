package Treino.E2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;


public class Livro extends Produto{
    private String titulo;
    private HashSet<Autor> autores = new HashSet<>();

    protected double IVA = 0.06;
    public Livro(String titulo, double precobase) {
        super(precobase);
        this.titulo = titulo;
    }

    public Livro(String titulo, double precobase, List<Autor> autores) {
        super(precobase);
        this.titulo = titulo;
        this.autores.addAll(autores);
    }

    public String getTitulo() {
        return titulo;
    }

    public HashSet<Autor> getAutores() {
        return autores;
    }

    @Override
    public String getDescricao(){
        return titulo;
    }

    public void add(Autor a){
        this.autores.add(a);
    }

    public String autores(){
        StringBuilder s = new StringBuilder();
        for (Autor a : autores)
            s.append(String.format("%s (%s-),", a.getNome(), a.getAnonasc()));
        return s.toString();
    }
    public ArrayList<Autor> getLista(){
        ArrayList<Autor> lista = new ArrayList<>();
        lista.addAll(autores);
        return lista;
    }
    public int numeroAutores(){
        return autores.size();
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autores=" + autores +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(autores, livro.autores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), titulo, autores);
    }
}
