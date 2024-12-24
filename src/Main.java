public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a Codefilm");
        System.out.println("Filme: Interestelar");

        int anoDeLancamento = 2014;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double mediaDaNota = (9.0 + 7.2 + 7.7) / 3;
        System.out.println("A média de nota desse filme é de: " + mediaDaNota);

        String sinopse;
        sinopse = """
                As reservas naturais da Terra estão chegando ao fim
                e um grupo de astronautas recebe a missão de verificar
                possíveis planetas para receberem a população mundial,
                possibilitando a continuação da espécie. Cooper é chamado
                para liderar o grupo e aceita a missão sabendo que pode
                nunca mais ver os filhos. Ao lado de Brand, Jenkins e Doyle,
                ele seguirá em busca de um novo lar."
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (mediaDaNota /2); //usamos int para indicar que queremos numero inteiro e não double
        System.out.println(classificacao);

    }
}
