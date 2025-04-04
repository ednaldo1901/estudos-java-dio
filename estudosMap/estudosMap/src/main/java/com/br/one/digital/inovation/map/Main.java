package com.br.one.digital.inovation.map;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.5);
            put("Fiat", 16.1);
            put("crevrolet", 13.15);
            put("honda", 17.2);
        }};
        System.out.println(carrosPopulares);
        System.out.println("substitua a o consumo do gol por 15.6");
        carrosPopulares.put("Gol", 15.6);
        System.out.println(carrosPopulares);
        System.out.println("confira se o modelo toyta foi adicionado: " + carrosPopulares.containsKey("toyta"));
        System.out.println("exiba o consumo do uno:" + carrosPopulares.get("Fiat"));
        System.out.println("exiba os modelos dos carro: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("exiba o consumo dos carros");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);
        System.out.println("exiba o modelo mais eficiente");
        
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        System.out.println("exiba o modelo mais Economico");

        Double consumoMaisEconomico = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        String modeloMaisEconomico = "";
        for (Map.Entry<String, Double> entry : entries2){
            if (entry.getValue().equals(consumoMaisEconomico)){
                modeloMaisEconomico = entry.getKey();
                System.out.println(modeloMaisEconomico + " - " + consumoMaisEconomico);
            }
        }
        System.out.println("exiba a soma de todos os consumos");
        Iterator<Double> iterador = carrosPopulares.values().iterator();
        Double soma = 0.0;

        while (iterador.hasNext()){
            Double proximo = iterador.next();
            soma += proximo;
        }
        System.out.println(soma);
        System.out.println("exiba a media de todos os carros: " + soma/carrosPopulares.size());
        Iterator<Double> iterador1 = carrosPopulares.values().iterator();
        while (iterador1.hasNext()){
            if (iterador1.next() < 16.1) iterador1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("exiba os carros na ordem em que foram adicionado");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.5);
            put("Fiat", 16.1);
            put("Chevrolet", 13.15);
            put("Honda", 17.2);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("exiba os pela ordem do modelo alfabrtica");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);
        System.out.println("Apague um dicionario");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        System.out.println("confira se ele esta vazio: " + carrosPopulares.isEmpty());

        System.out.println("crie um dicionario de livros e improma");

        Map<String, Livros> meusLivro = new HashMap<>(){{
            put("Pdro Kevyn Cunha", new Livros("Um Soberan", 254));
            put("Ednaldo Ribeiro", new Livros("Um dia Estrlado", 315));
            put("Robert Delirios", new Livros("Tres por Quatro", 654));
            put("Kevyn Cunha", new Livros("Todo sabor", 454));
        }};
        for (Map.Entry<String, Livros> livro :meusLivro.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Exiba na ordem de inseção");

        Map<String, Livros> meusLivro1 = new LinkedHashMap<>(){{
            put("Pdro Kevyn Cunha", new Livros("Um Soberan", 254));
            put("Ednaldo Ribeiro", new Livros("Um dia Estrlado", 315));
            put("Robert Delirios", new Livros("Tres por Quatro", 654));
            put("Kevyn Cunha", new Livros("Todo sabor", 454));
        }};
        for (Map.Entry<String, Livros> livro :meusLivro1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--- Imprima na ordem alfabetica pelos autores");
        Map<String, Livros> meusLivro2 = new TreeMap<>(meusLivro1);
        for (Map.Entry<String, Livros> livro :meusLivro2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--- Imprima na ordem alfabetica pelos Livros");

        Set<Map.Entry<String, Livros>> meusLivros3 = new  TreeSet(new ComparetorNome());
        meusLivros3.addAll(meusLivro2.entrySet());
        for (Map.Entry<String, Livros> livro :meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


    }

}
