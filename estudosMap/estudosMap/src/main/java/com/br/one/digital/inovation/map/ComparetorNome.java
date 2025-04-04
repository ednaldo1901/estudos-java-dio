package com.br.one.digital.inovation.map;

import java.util.Comparator;
import java.util.Map;

public class ComparetorNome implements Comparator<Map.Entry<String, Livros>> {
    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
