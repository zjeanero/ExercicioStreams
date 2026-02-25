package br.com.zjeanero;

import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        List<Pessoa> ListaF = lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .collect(Collectors.toList());

        ListaF.forEach(System.out::println);

    }

}
