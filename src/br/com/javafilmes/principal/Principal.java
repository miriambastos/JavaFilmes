package br.com.javafilmes.principal;

import br.com.javafilmes.calculos.CalculadoraDeTempo;
import br.com.javafilmes.calculos.FiltroRecomendacao;
import br.com.javafilmes.series.modelos.Episodio;
import br.com.javafilmes.series.modelos.Filme;
import br.com.javafilmes.series.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        //meuFilme.setNome("O poderoso chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        //System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(7);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2022);
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2022);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDaMiriam = new Filme("Interestelar", 2020);
        filmeDaMiriam.setDuracaoEmMinutos(200);
        //filmeDaMiriam.setNome("Interestelar");
        //filmeDaMiriam.setAnoDeLancamento(2020);
        filmeDaMiriam.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaMiriam);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);


    }
}
