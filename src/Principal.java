//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Até o último homem";
        meuFilme.anoDeLancamento = 2017;
        meuFilme.duracaoEmMinutos = 180;

        //Print
        System.out.println("Nome do filme: " + meuFilme.nome +
                ", Ano de lançamento: " + meuFilme.anoDeLancamento +
                ", Duração em minutos: " + meuFilme.duracaoEmMinutos);
    }
}