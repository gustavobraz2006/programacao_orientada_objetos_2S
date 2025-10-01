package atividade2;

public class Revista extends Material{
    private String autor;

    public Revista(String titulo, Integer anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override

    public void descricao(){
            System.out.println("Revista: " + getTitulo() + " | Ano: " + getAnoPublicacao() + " | Autor: " + autor);
        }

}

