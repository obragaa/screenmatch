// Modificadores de acesso em Java: public, protected, private e default.
// Todo atributo precisa ser privado!
package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
