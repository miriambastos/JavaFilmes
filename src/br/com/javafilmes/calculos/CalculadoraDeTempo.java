package br.com.javafilmes.calculos;

import br.com.javafilmes.series.modelos.Filme;
import br.com.javafilmes.series.modelos.Serie;
import br.com.javafilmes.series.modelos.Titulo;

public class CalculadoraDeTempo {
    private  int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        this.tempoTotal +=titulo.getDuracaoEmMinutos();
    }
}
