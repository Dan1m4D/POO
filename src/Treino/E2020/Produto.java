package Treino.E2020;

import java.util.Objects;

public class Produto implements PVP, Comparable {
    protected String codigo;
    protected int qtd = 0;
    protected double precobase;
    protected static int codenum = 1000;

    protected double IVA = 0.23;

    public Produto(double precobase){
        this.precobase = precobase;
        char code = this.getClass().getSimpleName().charAt(0);
        this.codigo = (String) (code + String.valueOf(codenum));
        codenum += 2;

    }

    public String getCodigo() {
        return codigo;
    }

    public int getStock() {
        return qtd;
    }

    public void setStock(int i) {
        qtd = i;
    }

    public double getPrecobase() {
        return precobase;
    }

    public String getDescricao(){
        return codigo;
    }

    public void addStock(int i){
        qtd += i;
    }

    public boolean vender(int i){
        if (i<qtd){
            qtd -= i;
            return true;
        }
        else{
            System.out.printf("Unidades insuficientes! Só tem %s em stock", qtd);
            return false;
        }

    }

    @Override
    public double precoVendaAoPublico() {
        return precobase * (1+this.IVA);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", qtd=" + qtd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return qtd == produto.qtd && Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int compareTo(Object o){
        Produto p = (Produto) o;
        return codigo.compareTo(p.codigo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(codigo, qtd);
    }
}
