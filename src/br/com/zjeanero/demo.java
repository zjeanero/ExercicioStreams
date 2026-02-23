package br.com.zjeanero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        List<Pessoa> listaF = lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .collect(Collectors.toList());

        listaF.forEach(System.out::println);

    }
}
