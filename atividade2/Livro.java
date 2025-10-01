package atividade2;

public class Livro extends Material{
    private String edicao;

    public Livro(String titulo, Integer anoPublicacao, String edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Livro: " + getTitulo() + " | Ano: " + getAnoPublicacao() + " | Edição: " + edicao);
    }
}
