import br.com.alura.screenmatch.modelos.Filme;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Até o último homem");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Média de avaliações do filme: " +meuFilme.pegaMedia());

    }
}