package atividade01;

public class SistemaOperacional {
    
    Computador pc1 = new Computador(16, 512, 8, 3.5f);
    Programa p1 = new Programa(1, 20, 2, 2);

    Computador pc2 = new Computador(6, 512, 8, 3.5f);
    Programa p2 = new Programa(8, 25, 3, 2);

    Computador pc3 = new Computador(8, 140, 3, 3.5f);
    Programa p3 = new Programa(2, 250, 4, 2);

    public void executarPrograma(Computador pc, Programa p) {
        if(pc.getMemoriaRAM() < p.getMemoriaRAMlocada()) {
            System.out.println("Erro: RAM insuficiente.");
        }

        else if(p.getSSDOcupado() > pc.getSSD()) {
            System.out.println("Erro: SSD insuficiente.");
        } 
        
        else {
            Float tempoExecucao = p.getQuantidadeOperacoes() / (pc.getOperacoesPSegundo() * pc.getNucleos());
            System.out.println("Programa rodou com sucesso.");
            System.out.println("Tempo de execução: "+ tempoExecucao);
        }
    }

    public void executarTodos(){
        executarPrograma(pc1, p1);
        executarPrograma(pc2, p2);
        executarPrograma(pc3, p3);
    }

    
    
}
