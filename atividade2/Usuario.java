package atividade2;

public class Usuario extends Pessoa {
    private Integer matricula;

    public Usuario(String nome, String email, int matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    @Override

    public void exibirInfo() {
        System.out.println("Usuário: " + getNome() + " | Email: " + getEmail() + " | Matrícula: " + matricula);
    }
}
