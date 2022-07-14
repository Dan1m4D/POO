package Treino.E2020;

import java.util.HashSet;
import java.util.Objects;

public class Telemovel extends Produto{
    private String marca;
    private String modelo;
    private HashSet<String> notas = new HashSet<>();

    public Telemovel(String marca, String modelo, double precobase) {
        super(precobase);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public HashSet<String> getNotas() {
        return notas;
    }

    public void addNota(String s){
        notas.add(s);
    }

    @Override
    public String getDescricao(){
        return String.format("%s/%s",marca.toUpperCase(), modelo);
    }

    @Override
    public String toString() {
        return "Telemovel{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", notas=" + notas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telemovel telemovel = (Telemovel) o;
        return Objects.equals(marca, telemovel.marca) && Objects.equals(modelo, telemovel.modelo) && Objects.equals(notas, telemovel.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, notas);
    }
}
