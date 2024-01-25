//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Até o último homem";
        meuFilme.anoDeLancamento = 2017;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(9);

        System.out.println("Soma de avaliações: " + meuFilme.somaDasAvaliacoes + " Avaliações totais: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Média: " + meuFilme.pegaMedia());
    }
}