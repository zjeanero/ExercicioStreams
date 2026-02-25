package br.com.zjeanero.teste;

import br.com.zjeanero.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class TesteListTest {

    @Test
    public void testeClasseLista() {
         List<Pessoa> lista = new Pessoa().populaPessoas();


        List<Pessoa> listaTeste = lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino")).toList();

        Assert.assertEquals("A lista deve ter apenas 2 mulheres", 2, listaTeste.size());
        listaTeste.forEach(System.out::println);







    }

}