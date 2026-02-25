package br.com.zjeanero;

import java.util.List;
import java.util.Objects;


public class Pessoa {

    private String id;

    private String nome;

    private String genero;


    public Pessoa(String id, String nome, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public Pessoa() {

    }

    public String getGenero() {
        return genero;
    }


    public List<Pessoa> populaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1" , "Matheus Henrique", "Masculino");
        Pessoa pessoa2 = new Pessoa("p2" , "Hernandez Roja", "Masculino");
        Pessoa pessoa3 = new Pessoa("p3" , "Camila Castro","Feminino");
        Pessoa pessoa4 = new Pessoa("p4" , "Carla Lima ", "Feminino");
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}