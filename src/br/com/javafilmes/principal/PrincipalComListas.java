package br.com.javafilmes.principal;

import br.com.javafilmes.series.modelos.Filme;
import br.com.javafilmes.series.modelos.Serie;
import br.com.javafilmes.series.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Avatar", 2022);
        outroFilme.avalia(10);
        var filmeDaMiriam = new Filme("Interestelar", 2020);
        filmeDaMiriam.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDaMiriam);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Rodrigo Santoro");
        buscaPorArtista.add("Miriam");
        buscaPorArtista.add("Gaby");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);



    }
}
