package com.br.one.digital.inovation.set;

import java.util.*;

public class Main {
    public static void main(String[] args){

    Set<Serie> minhaSerie = new LinkedHashSet<>(){{
        add(new Serie("game of thrones", "fantasia", 65));
        add(new Serie("dark", "terror", 40));
        add(new Serie("prision break", "suspense", 53));
    }};
    for (Serie serie: minhaSerie){
        System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempo());
    }

    }
}
