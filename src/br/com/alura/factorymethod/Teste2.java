package br.com.alura.factorymethod;

import java.util.Arrays;
import java.util.List;

public class Teste2 {

    //Java 9
    public static void main(String[] args) {
        //Arrays.asList -> Imatavel para adição, mas permite modificação
        List<String> asList = Arrays.asList("nome1", "nome2");
        asList.add("nome3"); // java.lang.UnsupportedOperationException
        asList.set(1, "nome3"); // Ok
        System.out.println(asList);
        //List.of -> Imutavel para adição e modificação
        List<String> ofList = List.of("nome1", "nome2");
        ofList.add("nome3"); // java.lang.UnsupportedOperationException
        ofList.set(3, "nome3"); // java.lang.UnsupportedOperationException
        System.out.println(ofList);
    }
}
