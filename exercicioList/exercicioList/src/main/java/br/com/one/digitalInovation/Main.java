package br.com.one.digitalInovation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<MeseAno> mesesAnaMedia = new ArrayList<>(){{
            add(new MeseAno("Janeiro", 37));
            add(new MeseAno("Fevereiro", 30));
            add(new MeseAno("Março", 35));
            add(new MeseAno("Abril", 25));
            add(new MeseAno("Maio", 31));
            add(new MeseAno("Junho", 32));
        }};
        System.out.println(mesesAnaMedia);
        Iterator<MeseAno> iterator = mesesAnaMedia.iterator();
        int soma = 0;
        while (iterator.hasNext()){
            MeseAno next = iterator.next();
            soma += next.getTemperatura();
        }
        int media = soma / mesesAnaMedia.size();
        for (MeseAno mt: mesesAnaMedia){
            if (mt.getTemperatura() > media){
                System.out.println(mt.getMes() + " " + mt.getTemperatura());
            }
        }
        System.out.println("Soma das temperaturas: " + soma);
        //System.out.println("Soma das temperaturas: " + soma/mesesAnaMedia.size());
        System.out.println("Soma das temperaturas: " + media);

    }
}
