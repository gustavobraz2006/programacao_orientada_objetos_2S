package atividade2;

public class Emprestimo {
    private Pessoa pessoa;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolucao) {
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("===== Detalhes do Empréstimo =====");
        System.out.println("Data Empréstimo: " + dataEmprestimo);
        System.out.println("Data Devolução: " + dataDevolucao);
        pessoa.exibirInfo();
        material.descricao();
        System.out.println("==================================");
    }
}