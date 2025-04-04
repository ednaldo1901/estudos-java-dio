package br.com.one.digitalInovation;

public class MeseAno {
    String mes;
    int temperatura;

    public MeseAno(String mes, int temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }


    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}
