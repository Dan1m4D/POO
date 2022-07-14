package Treino.E2020;

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeMap;

public class Loja {
    private String nome;
    private String site;
    private TreeMap<String, Produto> stock = new TreeMap<>();

    public Loja(String nome, String site) {
        this.nome = nome;
        this.site = site;
    }



    public String getNome() {
        return nome;
    }

    public String getSite() {
        return site;
    }

    public TreeMap<String, Produto> getStock() {
        return stock;
    }

    public void add (Produto p){
        String code = p.getCodigo();
        stock.put(code, p);
    }

    public int totalItems(){
        int q = 0;
        for (Produto p: stock.values())
            q += p.getStock();
        return q;
    }

    public Produto getProdutoPelaDescricao(String s){
        for ( Produto p : stock.values()){
            if (Objects.equals(s, p.getDescricao()))
                return p;
        }
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loja loja = (Loja) o;
        return Objects.equals(nome, loja.nome) && Objects.equals(site, loja.site) && Objects.equals(stock, loja.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, site, stock);
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder(String.format("""
                Loja %s
                %-25s %-50s %-10s %-15s
                """, nome, "Código", "Produto", "Em Stock", "PVP"));
        for( Produto p : stock.values()){
            s.append(String.format("%-25s %-50s %-10s %-15s\n", p.getCodigo(), p.getDescricao(), p.getStock(), p.precoVendaAoPublico()));
        }

        return s.toString();
    }
}
